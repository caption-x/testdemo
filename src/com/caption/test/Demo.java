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
			//ArrayList Ӧ�ó���
			List<String> list=new ArrayList<>();
			//�򼯺����������Ԫ��
			list.add("1");
			list.add("2");
			//˳�����
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			//����Ԫ��
			list.add(1, "3");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			//�ж�Ԫ��λֵ
			System.out.print(list.indexOf("2"));
			System.out.println();
			//�滻Ԫ��
			list.set(1, "4");
			for(int i=0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			//ȡ�Ӽ�
			list=list.subList(0, 1);
			for(int i = 0;i<list.size();i++) {
				System.out.print(list.get(i));
			}
			System.out.println();
			System.out.println("==========================");
			// TreeSet Ӧ�ó���
			Set<Integer> list1 = new TreeSet<>();
			list1.add(5);
			list1.add(10);
			list1.add(-6);
			list1.add(8);
			//�������Ԫ��,��Ԫ��˳��
			System.out.println(list);
			System.out.println("==========================");
				// LinkedHashSetӦ�ó���
			Set<String> list3=new LinkedHashSet<>();
			list3.add("first");
			list3.add("last");
			//��һ�����
			System.out.println(list3);
			//ɾ��first
			list3.remove("first");
			//���first
			list3.add("first");
			//�ڶ������
			System.out.println(list3);
			System.out.println("==========================");
			// HashMapӦ�ó���
			Map<String,String> map1=new HashMap<String,String>();
			//����null��Ϊkey
			map1.put(null, "��Ϊnull");
			System.out.println(map1.get(null));
			
			System.out.println("==========================");
			// LinkedHashMapӦ�ó���
			Map<String,String> map2 = new LinkedHashMap<>();
			map2.put("first", "first");
			map2.put("last", "last");
			//����ֵ��Ϊnull
			map2.put(null,"second");
			//��һ�����
			System.out.println("��һ��");
			for(String value:map2.keySet()) {
				System.out.println("key="+value);
			}
			map2.remove("first");
			map2.put("first", "first");
			//�ڶ������
			System.out.println("�ڶ���");
			for(String value:map2.keySet()) {
				System.out.println("key="+value);
			}
		}
	
}

