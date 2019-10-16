package com.example.ruru.sophiesblog.java.collection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ruru.sophiesblog.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class ClientCollection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client6);


        Collection collection;


        /* list */
        ArrayList arrayList;
        LinkedList linkedList;


        /* set */
        HashSet set;
        TreeSet treeSet;


        /* map */
        HashMap hashMap;
        LinkedHashMap linkedHashMap;
        ConcurrentHashMap concurrentHashMap;


        /* test */
        int[] arr = new int[]{1, 2, 3, 4};
        int len = arr.length;
        int i = 0;
        for (; i < len; i++) {

        }
        Log.d(getClass().getName(), "onCreate: res i =" + i);//答案为4
    }
}
