package com.example.eventbus.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.example.eventbus.EventBusService;
import com.example.eventbus.Eventbus;
import com.example.eventbus.Request;
import com.example.eventbus.Responce;
import com.example.eventbus.core.Hermes;
import com.example.eventbus.responce.InstanceResponceMake;
import com.example.eventbus.responce.ObjectResponceMake;
import com.example.eventbus.responce.ResponceMake;

/**
 *
 */

public class HermesService  extends Service{
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    private EventBusService.Stub mBinder=new EventBusService.Stub() {
        @Override
        public Responce send(Request request) throws RemoteException {
//            对请求参数进行处理  生辰Responce结果返回
            ResponceMake responceMake = null;
            switch (request.getType()) {
                case Hermes.TYPE_GET://获取单例
                    responceMake = new InstanceResponceMake();
                    break;
                case Hermes.TYPE_NEW:
                    responceMake = new ObjectResponceMake();
                    break;
            }


            return responceMake.makeResponce(request);
        }
    };

    public static class HermesService0 extends HermesService {}

    public static class HermesService1 extends HermesService {}

    public static class HermesService2 extends HermesService {}

    public static class HermesService3 extends HermesService {}

    public static class HermesService4 extends HermesService {}

    public static class HermesService5 extends HermesService {}

    public static class HermesService6 extends HermesService {}

    public static class HermesService7 extends HermesService {}

    public static class HermesService8 extends HermesService {}

    public static class HermesService9 extends HermesService {}
}
