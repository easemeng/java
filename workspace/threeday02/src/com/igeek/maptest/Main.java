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
		
		// ˫�м��� ��  Map	���ɼ�ֵ�� ����	Key-value
		// �� map ������ �� key �Ĵ洢��ʽ	���� set �������洢�� �� ��key ֵ�������ظ� �� ����
		
		// Map map = new HashMap();  // ����ʱ���� �� ����ʱ���͡�
		
		// һ��������ʹ��map��ʱ�� �� ���� String ������Ϊ map �ļ�
		HashMap<String,String> map = new HashMap<String,String>();
		
		// put(K key, V value)   ��ָ����ֵ���ӳ���е�ָ�����������
		map.put("������", "¬����");
		map.put("������", "����ʤ");
		map.put("˫��", "������");
		map.put("С���", "����");
		
		// System.out.println(map);
		
		// String str = map.get("������");
		// System.out.println(str);
		
		// ��α��� map ����
		// LinkedHashMap map2 = new LinkedHashMap();
		
		String str = map.get("������");
		System.out.println(str);
		// foreachMap(map);
		
		// map.remove("С���");
		
		// �ӿ�
		// Collection<String> collection = map.values();
		// System.out.println(collection);
		
		foreachMap2(map);
		// ���м��ļ��� map.keySet();  Set
		// ����ֵ�ü��� map.values();  Collection

	}
	
	// ���� map �ĵ�һ�ַ�ʽ
	@SuppressWarnings("rawtypes")
	public static void foreachMap(Map map){
		// ע�⣺���� map ���� �� �������ȿ����õ����е�key
		// keySet ���� ��  �������е� key ֵ �� ���е� key ʹ�� Set �������洢
		// keySet()   ���ش˵�ͼ�а����ļ���Set��ͼ��
		Set set = map.keySet();
		// ����ʹ�õ����������� key �ļ���
		Iterator ite = set.iterator();
		while(ite.hasNext()){
			// ͨ���������õ����е� key ֵ
			String key = (String) ite.next();
			// System.out.println(key);
			// ���� key ֵ ��  ��� key ����Ӧ�� value ֵ
			String value = (String) map.get(key);
			System.out.println(key + "\t" + value);
		}
	}
	
	// ���� map �ĵڶ��ַ�ʽ
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void foreachMap2(Map map){
		
		// entrySet()   ���ش˵�ͼ�а�����ӳ���Set��ͼ��
		Set<Entry<String,String>> set = map.entrySet();
		for(Entry<String,String> sa : set){
			String key = sa.getKey();
			String value = sa.getValue();
			System.out.println(key + "\t" + value);
		}
	}
	
	// Collection list = new ArrayList();

}