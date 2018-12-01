package com.igeek.arrays;

import java.util.Arrays;

//һ�㶼���и��ֹ����࣬ һ�㹤�����еķ������Ǿ�̬�� ������.  
//Math ...
public class ArraysTools {

	// ����������ֵ
	public static int getMax(int[] arr) {
		int max = arr[0];// �����һ��Ԫ�������ֵ��
		for (int i = 1; i < arr.length; i++) {
			// �ж���һ���� �Ƿ��������һ������
			if (arr[i] > max) {
				// max ��������֮��Ľϴ�ֵ��
				max = arr[i];
			}
		}
		return max;
	}

	// ����Сֵ
	public static int getMin(int[] arr) {
		int min = arr[0];// �����һ��Ԫ�������ֵ��
		for (int i = 1; i < arr.length; i++) {
			// �ж���һ���� �Ƿ��������һ������
			if (arr[i] < min) {
				// max ��������֮��Ľϴ�ֵ��
				min = arr[i];
			}
		}
		return min;
	}

	// �����ƽ��ֵ �� ������ܺ� ��
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// ƽ����
	public static int avg(int[] arr) {
		// �ھ�̬�����в��ܳ���this ���� super ...
		int avg = sum(arr) / arr.length;
		return avg;
	}

	// ����ĸ��� ...
	public static int[] copyArray(int[] arr) {
		int[] newarr = new int[arr.length];//
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}

	// ��ת��
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

	// ����Ľ�ȡ��
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
	
	// ð��
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
	
	// ��������
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
	
	// ʹ�ù����� ��  JDK ��װ����һ��������    Arrays   sort  . toString 
	public static void sort(int [] arr){
		Arrays.sort(arr);
	}
	
	
}
/**
 * /**
	Arrays.sort()
��������Arrays.sort();��һ�����������ῴ���������ӵ�
public static void sort(int[] a) {
    DualPivotQuicksort.sort(a, 0, a.length - 1, null, 0, 0);
}123
��Ȼû��ô�򵥣�DualPivotQuicksort�����������˫��������򣬹���˫���������ȥ����http://www.cnblogs.com/nullzx/p/5880191.html ���������ٴε��ȥ�����Է�������ôһ�δ���
if (right - left < QUICKSORT_THRESHOLD) {
    sort(a, left, right, true);
    return;
}1234
���Է����������ĳ���С��QUICKSORT_THRESHOLD�Ļ��ͻ�ʹ�����˫��������򣬶����ֵ��286��
���������286�أ����ͻ��������������������������Ժò��ã�����õĻ����ù鲢���򣬲��õĻ����ÿ������򣬿��������ע�;Ϳ��Կ���
 * The array is not highly structured,
 * use Quicksort instead of merge sort.
123
�������ٻص�����ľ�����˫���������ķ����ϣ��ٵ��ȥ�������ֻ��һ���ж�
// Use insertion sort on tiny arrays
if (length < INSERTION_SORT_THRESHOLD)
123
��������鳤��С��INSERTION_SORT_THRESHOLD(ֵΪ47)�Ļ�����ô�ͻ��ò��������ˣ���Ȼ����˫���������
�����ܽ�һ��Arrays.sort()������������鳤�ȴ��ڵ���286�������ԺõĻ������ù鲢����������ڵ���286�������Բ��õĻ�����˫����������������С��286�Ҵ��ڵ���47�Ļ�����˫����������������С��47�Ļ����ò������������й��Ƶ�~
	*/
