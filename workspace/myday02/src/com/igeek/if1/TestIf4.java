package com.igeek.if1;

public class TestIf4 {

	public static void main(String[] args) {
		// x��y�Ĺ�ϵ�������£�
		// x>=3 y = 2x + 1;
		// -1<=x<3 y = 2x;
		// x<=-1 y = 2x �C 1;
		// ���ݸ�����x��ֵ�������y��ֵ�������
		int y = getY(-1);
		System.out.println(y);//21
	}
	
	public static int getY(int x){
		int y=0;
		if(x>=3){
			y = 2*x+1;
		}else if(-1<=x&&x<3){
			y = 2*x;
		}else if(x<=-1){
			y = 2*x -1;//-2 -3
		}
		return y;
	}

}
