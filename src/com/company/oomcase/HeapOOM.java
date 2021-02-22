package com.company.oomcase;

import java.util.ArrayList;
import java.util.List;

/**
 * 堆内存溢出
 */
public class HeapOOM {
    static class OOMObject {

    }
    public static void main(String[] args) {
        List<OOMObject> oomList = new ArrayList<>();
        while (true){
            oomList.add(new OOMObject());
        }
    }
}
