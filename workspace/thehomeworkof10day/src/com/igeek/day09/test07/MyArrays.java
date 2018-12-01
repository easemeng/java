package com.igeek.day09.test07;

import java.util.ArrayList;

public class MyArrays {
	
	public static void reverse(ArrayList<Integer> list){
		for(int i = 0,j = list.size() - 1;i < (list.size() / 2);i++,j--){
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
	
	public static Integer max(ArrayList<Integer> list){
		int maxIndex = 0;
		for(int i = 0;i < list.size()-1;i++){
			if(list.get(i) < list.get(i+1)){
				maxIndex = (i+1);
//			}else{
//				maxIndex = i;
			}
		}
		return list.get(maxIndex);
	}
	
	public static Integer min(ArrayList<Integer> list){
		int minIndex = 0;
		for(int i = 0;i > list.size()-1;i++){
			if(list.get(i) > list.get(i+1)){
				minIndex = (i+1);
//			}else{
//				minIndex = i;
			}
		}
		return list.get(minIndex);
	}
	
	public static int indexOf(ArrayList<Integer> list,Integer i){
		return list.indexOf(i);
	}
	
	public static void replaceAll(ArrayList<Integer> list,Integer oldValue,Integer newValue){
		for(int i = 0;i > list.size();i++){
			if(oldValue == list.get(i)){
				list.set(i, newValue);
			}
		}
	}

}
