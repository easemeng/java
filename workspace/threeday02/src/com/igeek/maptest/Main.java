package com.igeek.maptest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		// 双列集合 。  Map	是由键值对 构成	Key-value
		// 在 map 集合中 。 key 的存储方式	是用 set 集合来存储的 。 （key 值不允许重复 ， 无序）
		
		// Map map = new HashMap();  // 编译时类型 ， 运行时类型。
		
		// 一般我们在使用map的时候 ， 都将 String 类型作为 map 的键
		HashMap<String,String> map = new HashMap<String,String>();
		
		// put(K key, V value)   将指定的值与此映射中的指定键相关联。
		map.put("玉麒麟", "卢俊义");
		map.put("入云龙", "公孙胜");
		map.put("双鞭", "呼延灼");
		map.put("小李广", "花荣");
		
		// System.out.println(map);
		
		// String str = map.get("玉麒麟");
		// System.out.println(str);
		
		// 如何遍历 map 集合
		// LinkedHashMap map2 = new LinkedHashMap();
		
		String str = map.get("九纹龙");
		System.out.println(str);
		// foreachMap(map);
		
		// map.remove("小李广");
		
		// 接口
		// Collection<String> collection = map.values();
		// System.out.println(collection);
		
		foreachMap2(map);
		// 所有键的集合 map.keySet();  Set
		// 所有值得集合 map.values();  Collection

	}
	
	// 遍历 map 的第一种方式
	@SuppressWarnings("rawtypes")
	public static void foreachMap(Map map){
		// 注意：遍历 map 集合 。 我们首先可以拿到所有的key
		// keySet 方法 ，  返回所有的 key 值 ， 所有的 key 使用 Set 集合来存储
		// keySet()   返回此地图中包含的键的Set视图。
		Set set = map.keySet();
		// 可以使用迭代器来遍历 key 的集合
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			// 通过迭代器拿到所有的 key 值
			String key = (String) ite.next();
			// System.out.println(key);
			// 根据 key 值 ，  获得 key 所对应的 value 值
			String value = (String) map.get(key);
			System.out.println(key + "\t" + value);
		}
	}
	
	// 遍历 map 的第二种方式
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void foreachMap2(Map map){
		
		// entrySet()   返回此地图中包含的映射的Set视图。
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> sa : set){
			String key = sa.getKey();
			String value = sa.getValue();
			System.out.println(key + "\t" + value);
		}
	}
	
	// Collection list = new ArrayList();

}
