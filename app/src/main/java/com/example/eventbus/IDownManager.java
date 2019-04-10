package com.example.eventbus;

import com.example.eventbus.annotion.ClassId;

/**
 *
 */
@ClassId("com.example.eventbus.DownManager")
public interface IDownManager  {
    public FileRecord getFileRecord();

    public void setFileRecord(FileRecord fileRecord);

}
