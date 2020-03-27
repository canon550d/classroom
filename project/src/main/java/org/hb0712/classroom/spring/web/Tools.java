package org.hb0712.classroom.spring.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Component;

@Component
public class Tools {

	
	public void hashMap() {
		Map map = new HashMap();
	}
	
	public void linkedhashMap() {
		Map map = new LinkedHashMap();
	}
	
	public void treeMap() {
		Map map = new TreeMap();
	}
	
	private void fillList(List<String> list) {
		list.add("hello");
		list.add("world");
		list.add("I'am OK");
		for(int i=0;i<20000;i++) {
			list.add(0,String.valueOf(i));
		}
	}
	
	/*
	 * a. 实现了可变的数组，允许保存所有元素，包括null,并可以根据索引位置对集合进行快速的随机访问；
	 * b. 缺点是向指定的索引位置插入对象或删除对象的速度较慢。
	 * 
	 * ArrayList基于数组来实现集合的功能，其内部维护了一个可变长的对象数组，
	 * 集合内所有对象存储于这个数组中，并实现该数组长度的动态伸缩
	 */
	public void arrayList(String pre) {
		List<String> list = new ArrayList<String>();
		fillList(list);
//		list.add(2, "See");//删除index为2的数据
//		list.remove("world");
		System.out.println(list.get(10));
	}
	
	/*
	 * a. 采用链表结构保存对象。
	 * b. 优点是便于向集合中插入和删除对象，需要向集合中插入、删除对象时，使用LinkedList类实现的List集合的效率较高
	 * c. 但对于随机访问集合中的对象，使用LinkedList类实现List集合的效率较低。
	 */
	public void linkedList(String pre) {
		List<String> list = new LinkedList<String>();
		fillList(list);
		System.out.println(list.get(10));
	}

	/*
	 * 练习内容看这里
	 * https://blog.csdn.net/sdgihshdv/article/details/72566485
	 */
	public static void main(String[] args) {
		Tools tools = new Tools();
		/*
		 * ArrayList vs LinkedList 
		 * https://blog.csdn.net/sdgihshdv/article/details/72566485
		 */
		
		
	}
}
