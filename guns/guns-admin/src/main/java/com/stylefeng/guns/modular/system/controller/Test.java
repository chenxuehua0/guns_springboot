package com.stylefeng.guns.modular.system.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
        public static void main(String [] args){
            List<Map<String,Object>> retList =  new ArrayList<Map<String,Object>>();
            Map<String,Object> mp = new HashMap<String,Object>();
            mp.put("1","test");
            mp.put("2","test2");
            retList.add(mp);
            for(Map<String,Object> map :retList){
                addMap(map);
            }

            for(Map<String,Object> tempMap :retList){
                for (Object o : tempMap.keySet()) {

                    System.out.println("key=" + o + " value=" + tempMap.get(o));

                }
            }


        }

        public static  void addMap(Map<String,Object> map){
            map.put("3","test3");
            map.put("4","test4");
        }
}
