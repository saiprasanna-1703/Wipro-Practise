package com.wipro.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
	public static void main(String[] args){
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "sai");
		hm.put(2, "prasanna");
		hm.put(3,"ram");
		hm.put(4, "sita");
		System.out.println(hm.get(4));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("sita"));
		System.out.println(hm.replace(2, "girl"));
		System.out.println(hm);
		for(Integer i:hm.keySet()){
			System.out.println(hm.get(i));
		}
		for(Map.Entry<Integer,String> j:hm.entrySet()){
			System.out.println(j);
			
		}
	}

}
