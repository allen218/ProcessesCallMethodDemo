package com.example.eventbus;


import com.example.eventbus.annotion.ClassId;
import com.example.eventbus.annotion.MethodId;

//接口的方式  描述 一个类
@ClassId("com.example.eventbus.UserManager")
public interface IUserManager {

    public Person getPerson();

    public void setPerson(Person person);
}
