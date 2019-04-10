package com.example.eventbus;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.eventbus.core.Hermes;
import com.example.eventbus.service.HermesService;

public class SecondActivity extends Activity {
    com.example.eventbus.IUserManager userManager;
    com.example.eventbus.IDownManager downManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Hermes.getDefault().connect(this, HermesService.class);
    }

    public void userManager(View view) {
//         userManager  进程A的副本
        userManager = Hermes.getDefault().getInstance(IUserManager.class);
        downManager = Hermes.getDefault().getInstance(IDownManager.class);
    }

    public void getUser(View view) {
        if (userManager == null) {
            Toast.makeText(this, "请先创建对象。。。。", Toast.LENGTH_SHORT).show();
            return;
        }
        userManager.setPerson(new com.example.eventbus.Person("lance", "789"));
        Toast.makeText(this, "-----> " + downManager.getFileRecord(), Toast.LENGTH_SHORT).show();
    }
}
