package com.example.eventbus;


public class UserManager implements IUserManager {
    Person person;
    private static UserManager sInstance = null;

    private UserManager() {

    }

    //约定这个进程A  单例对象的     规则    getInstance()
    public static synchronized UserManager getInstance() {
        if (sInstance == null) {
            sInstance = new UserManager();
        }
        return sInstance;
    }

    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public void setPerson(Person person) {
        this.person = person;
    }
}
