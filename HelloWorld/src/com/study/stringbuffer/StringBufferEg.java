package com.study.stringbuffer;

import java.util.ArrayList;
import java.util.List;

public class StringBufferEg {

	public static void main(String[] args) {
		System.out.println("hello world");
		StringBuffer sb1 = new StringBuffer();
		System.out.println("initial capacity : " + sb1.capacity());
		sb1.append("abcdefghijklmno");
		System.out.println(mimicObjectToString(sb1));
		System.out.println("capacity after 16 : " + sb1.capacity());
		sb1.append("1");
		System.out.println(mimicObjectToString(sb1));
		System.out.println("capacity after 17 : " + sb1.capacity());
		
		System.out.println();
		System.out.println("############################################");
		System.out.println();
		
		List<String> list = new ArrayList<String>(20);
		for (int i = 0; i < 10; i++) {
			list.add("a");
		}
		System.out.println(list.size());
		System.out.println(mimicObjectToString(list));
		
		for (int i = 0; i < 10; i++) {
			list.add("b");
		}
		System.out.println("after adding 11");
		list.add("b");
		System.out.println(list.size());
		
		list.add("c");
		list.add("d");
		System.out.println(list.size());
		System.out.println(mimicObjectToString(list));
		
		
		
		/*System.out.println(mimicObjectToString(sb1));
		
		StringBuffer sb2 = new StringBuffer("java");
		System.out.println(sb2.capacity());
		System.out.println(mimicObjectToString(sb2));
		
		
		
		String str1 = "ipsoft";
		String str2 = "services";
		
		System.out.println(mimicObjectToString(str1));*/
		
	}
	
	public static String mimicObjectToString(Object o) {
        //prevent a NullPointerException by returning null if o is null
        String result = null;
        if (o !=null)
        {
            result = o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
        }
        return  result;
    }
}
