package com.igeek.practice;

public class StringTest9 {
	
	/**
	 * 举例：int[] arr = {1,2,3};
	 * 输出结果：[1,2,3]
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int [] arrays = {123,321,456,654,789,987};
		String result = getStringByArrays(arrays);
		System.out.println(result);
	}
	
	public static String getStringByArrays(int [] arrays){
		
		String str = "";
		str += "[";
		for(int i = 0;i < arrays.length;i++){
			if(i == arrays.length-1){    //判断是否最后一个元素
				str += arrays[i];
				str += "]";
			}else{
				str += arrays[i];
				str += ",";
			}
		}
		return str;
		
	}

}
