package com.company.oomcase;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

// 本机内存OOM
public class DriectMemory {
    private static int mem = 1024*1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field field = Unsafe.class.getDeclaredFields()[0];
        field.setAccessible(true);
        Unsafe instance = (Unsafe) field.get(null);
        while(true){
            instance.allocateMemory(mem);
        }
    }
}
