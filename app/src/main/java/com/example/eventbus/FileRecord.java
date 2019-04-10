package com.example.eventbus;

/**
 *
 */

public class FileRecord {
    private String path;
    private long size;

    public FileRecord(String path, long size) {
        this.path = path;
        this.size = size;
    }

    public FileRecord( ) {


    }

    @Override
    public String toString() {
        return "FileRecord{" +
                "path='" + path + '\'' +
                ", size=" + size +
                '}';
    }
}
