package com.wipro.collections.map;

import java.util.HashMap;

public class MapDemo {
public static void main(String[] args){
	HashMap<Integer, String> hm=new HashMap<>();
	hm.put(1, "sai");
	hm.put(2, "prasanna");
	hm.put(3,"ram");
	hm.put(3, "sita");
	System.out.println(hm);
	HashMap<String,String> hm1=new HashMap<>();
	hm1.put("virat", "batsman");
	hm1.put("dhoni", "wk");
	hm1.putIfAbsent("dhoni","batsman");
	hm1.putIfAbsent("ram","hero");
	System.out.println(hm1);
	
}
}
