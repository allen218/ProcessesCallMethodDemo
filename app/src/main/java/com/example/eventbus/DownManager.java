package com.example.eventbus;

import com.example.eventbus.annotion.ClassId;

/**
 *
 */
@ClassId("com.example.eventbus.DownManager")
public class DownManager implements IDownManager {
    private FileRecord fileRecord;
    private static DownManager sInstance = null;

    private DownManager() {

    }
    //约定这个进程A  单例对象的     规则    getInstance()
    public static synchronized DownManager getInstance() {
        if (sInstance == null) {
            sInstance = new DownManager();
        }
        return sInstance;
    }

    @Override
    public FileRecord getFileRecord() {
        return fileRecord;
    }

    @Override
    public void setFileRecord(FileRecord fileRecord) {
        this.fileRecord = fileRecord;
    }
}
