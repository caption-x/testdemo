package com.caption.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
		public static void main(String[] args) {
			//ArrayList 应用场景
			List<String> list=new ArrayList<>();
			//向集合中添加两个元素
			list.add("1");
			list.add("2");
			//顺序输出
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			//插入元素
			list.add(1, "3");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			//判断元素位值
			System.out.print(list.indexOf("2"));
			System.out.println();
			//替换元素
			list.set(1, "4");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			//取子集
			list=list.subList(0, 1);
			for(int i = 0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			System.out.println("==========================");
			// TreeSet 应用场景
			Set<Integer> list1 = new TreeSet<>();
			list1.add(5);
			list1.add(10);
			list1.add(-6);
			list1.add(8);
			//输出集合元素,看元素顺序
			System.out.println(list);
			System.out.println("==========================");
				// LinkedHashSet应用场景
			Set<String> list3=new LinkedHashSet<>();
			list3.add("first");
			list3.add("last");
			//第一次输出
			System.out.println(list3);
			//删除first
			list3.remove("first");
			//添加first
			list3.add("first");
			//第二次输出
			System.out.println(list3);
			System.out.println("==========================");
			// HashMap应用场景
			Map<String,String> map1=new HashMap<String,String>();
			//允许null作为key
			map1.put(null, "键为null");
			System.out.println(map1.get(null));
			
			System.out.println("==========================");
			// LinkedHashMap应用场景
			Map<String,String> map2 = new LinkedHashMap<>();
			map2.put("first", "first");
			map2.put("last", "last");
			//允许值键为null
			map2.put(null,"second");
			//第一次输出
			System.out.println("第一次");
			for(String value:map2.keySet()) {
				System.out.println("key="+value);
			}
			map2.remove("first");
			map2.put("first", "first");
			//第二次输出
			System.out.println("第二次");
			for(String value:map2.keySet()) {
				System.out.println("key="+value);
			}
		}
	
}

