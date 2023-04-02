package edu.whu.hytra.core;

public interface StorageManager {
    void put(String key, String value) throws Exception;

    String get(String key) throws Exception;
}
