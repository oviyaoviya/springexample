package com.mbf.utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;


public class ListArrayExample {

	public static void main(String[] args) {
		int n=10;
		List<String> list=new ArrayList(n);
			list.add("oviya");
			list.add(0, "malar");
			list.add("oviya");
			list.add("tharani");
			list.add("veli");
			list.add("df");
			list.add("malar");
			System.out.println(list);
			System.out.println(list.get(0));
			System.out.println(list.contains("oviya"));
			list.add(1,"simbu");
			System.out.println(list);
			
			System.out.println(list.indexOf("yttj"));
			System.out.println(list.lastIndexOf("sgsargh"));
			System.out.println(list.remove(0));
			System.out.println(list);
			System.out.println(list.remove(2));
			System.out.println(list.remove("oviya"));
			System.out.println(list);
			
			
			String nums[] = {"one","two","three","four","five"};
			Queue<String> queue = new LinkedList<>();
//			Collections.addAll(queue, nums);
			System.out.println(queue);
			
			Map<Integer,String> value=new HashMap<>();
			value.put(0,"oviya");
			value.put(1,"malar");
			value.put(2,"simbu");
			value.put(3,"praba");
			value.put(4,"tharani");
			value.put(5,"gashf");
			value.put(5,"slkdksl");
			
			value.put(6,null);
			value.put(6,"yweu");
			value.put(null,"assd");
			value.put(null,"uio");
			System.out.println(value);
			System.out.println("get 3th index :"+value.get(3));
			
			System.out.println("default value is:"+value.getOrDefault(8, "defaultValue"));
			boolean keyExists = value.containsKey(null);
			boolean keyExists1 = value.containsValue("praba");
			System.out.println("contains value is "+keyExists);
			System.out.println("contains value is "+keyExists1);
			}
}
