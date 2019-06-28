package com.mbf.utils;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
	List list=new ArrayList();
	list.add("oviya");
	list.add("malar");
	list.add(30);
	String value=(String)list.get(0);
	String value2=(String)list.get(1);
	Integer value1=(Integer)list.get(2);
	System.out.println("0 th value :"+value);
	System.out.println("2 nd value "+value1);
	}
}
