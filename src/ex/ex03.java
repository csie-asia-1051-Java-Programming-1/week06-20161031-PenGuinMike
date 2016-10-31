package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 104021074 楊永聖
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String x =scn.nextLine();
		decomp(x);
		
	}
	public static void decomp(String x){
		char arr[]=x.toCharArray();
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}
