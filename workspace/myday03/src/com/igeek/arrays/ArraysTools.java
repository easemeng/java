package com.igeek.arrays;

import java.util.Arrays;

//一般都会有各种工具类， 一般工具类中的方法都是静态的 。类名.  
//Math ...
public class ArraysTools {

	// 求数组的最大值
	public static int getMax(int[] arr) {
		int max = arr[0];// 假设第一个元素是最大值。
		for (int i = 1; i < arr.length; i++) {
			// 判断下一个数 是否比你假设第一个数大。
			if (arr[i] > max) {
				// max 或者两者之间的较大值。
				max = arr[i];
			}
		}
		return max;
	}

	// 求最小值
	public static int getMin(int[] arr) {
		int min = arr[0];// 假设第一个元素是最大值。
		for (int i = 1; i < arr.length; i++) {
			// 判断下一个数 是否比你假设第一个数大。
			if (arr[i] < min) {
				// max 或者两者之间的较大值。
				min = arr[i];
			}
		}
		return min;
	}

	// 数组的平均值 。 数组的总和 。
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 平均数
	public static int avg(int[] arr) {
		// 在静态方法中不能出现this 或者 super ...
		int avg = sum(arr) / arr.length;
		return avg;
	}

	// 数组的复制 ...
	public static int[] copyArray(int[] arr) {
		int[] newarr = new int[arr.length];//
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}

	// 反转。
	public static int[] reverseArray(int[] arr) {
		//
		/*
		 * for (int i = 0; i < arr.length/2; i++) { int temp = arr[i];
		 * arr[i]=arr[arr.length-1-i]; arr[arr.length-1-i]=temp; }
		 */
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	// 数组的截取。
	public static int [] subArray(int [] arr,int length){
		if(length<=arr.length){
			int [] newarr = new int [length];
			for (int i = 0; i < length; i++) {
				newarr[i]=arr[i];
			}
			return newarr;//
		}
		return null;
	}
	
	// 冒泡
	public static int [] sortMp(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	// 快速排序。
	public static int [] sortFast(int [] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j < arr.length; j++) {
				if(arr[i]<arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	// 使用工具类 。  JDK 封装号了一个工具类    Arrays   sort  . toString 
	public static void sort(int [] arr){
		Arrays.sort(arr);
	}
	
	
}
/**
 * /**
	Arrays.sort()
先来看看Arrays.sort();，一点进这个方法会看到是这样子的
public static void sort(int[] a) {
    DualPivotQuicksort.sort(a, 0, a.length - 1, null, 0, 0);
}123
果然没这么简单，DualPivotQuicksort翻译过来就是双轴快速排序，关于双轴排序可以去这里http://www.cnblogs.com/nullzx/p/5880191.html 看看。那再次点进去，可以发现有这么一段代码
if (right - left < QUICKSORT_THRESHOLD) {
    sort(a, left, right, true);
    return;
}1234
可以发现如果数组的长度小于QUICKSORT_THRESHOLD的话就会使用这个双轴快速排序，而这个值是286。
那如果大于286呢，它就会坚持数组的连续升序和连续降序性好不好，如果好的话就用归并排序，不好的话就用快速排序，看下面这段注释就可以看出
 * The array is not highly structured,
 * use Quicksort instead of merge sort.
123
那现在再回到上面的决定用双轴快速排序的方法上，再点进去，发现又会多一条判断
// Use insertion sort on tiny arrays
if (length < INSERTION_SORT_THRESHOLD)
123
即如果数组长度小于INSERTION_SORT_THRESHOLD(值为47)的话，那么就会用插入排序了，不然再用双轴快速排序。
所以总结一下Arrays.sort()方法，如果数组长度大于等于286且连续性好的话，就用归并排序，如果大于等于286且连续性不好的话就用双轴快速排序。如果长度小于286且大于等于47的话就用双轴快速排序，如果长度小于47的话就用插入排序。真是有够绕的~
	*/
