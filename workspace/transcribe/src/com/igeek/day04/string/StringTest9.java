package com.igeek.day04.string;

public class StringTest9 {
	/**
	 * ������int[] arr = {1,2,3};	
	 * ��������[1, 2, 3]
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arrays = {12,43,345,456,423};
		String result = getStringByArrays(arrays);
		System.out.println(result);
	}
	
	public static String getStringByArrays(int [] arrays){
		String str = "";
		str +="[";  
		for(int i =0;i<arrays.length;i++){
			if(i==arrays.length-1){
				str+=arrays[i];
				str+="]";
			}else{
				str+=arrays[i];
				str+=",";
			}
			
		}
		return str;
	}
	
	
	
	
	public static String getStringByArrays2(int [] arrays){
		String str = "";
		str +="[";  
		for(int i =0;i<arrays.length;i++){
			if(i==arrays.length-1){
				str+=arrays[i];
				str+="]";
			}else{
				str+=arrays[i];
				str+=",";
			}
			
		}
		return str;
	}
	
	
	
	
	public static String getStringByArrays3(int [] arrays){
		String str = "";
		str +="[";  
		for(int i =0;i<arrays.length;i++){
			if(i==arrays.length-1){
				str+=arrays[i];
				str+="]";
			}else{
				str+=arrays[i];
				str+=",";
			}
			
		}
		return str;
	}
	
	
	
	
	public static String getStringByArrays4(int [] arrays){
		String str = "";
		str +="[";  
		for(int i =0;i<arrays.length;i++){
			if(i==arrays.length-1){
				str+=arrays[i];
				str+="]";
			}else{
				str+=arrays[i];
				str+=",";
			}
			
		}
		return str;
	}
	
	
	
	
	public static String getStringByArrays5(int [] arrays){
		String str = "";
		str +="[";  
		for(int i =0;i<arrays.length;i++){
			if(i==arrays.length-1){
				str+=arrays[i];
				str+="]";
			}else{
				str+=arrays[i];
				str+=",";
			}
			
		}
		return str;
	}

}
