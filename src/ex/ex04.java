package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr) 函數後，一維陣列arr 裡的每一個元素皆會被平方。例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入資料數: ");
		int n = scn.nextInt();
		int data[]=new int[n];
		int x =0;
		for(int i=0;i<data.length;i++){
			data[i]=scn.nextInt();
		}
		arr(data);
		for(int i=0;i<data.length;i++){
			
			System.out.print(data[i]+" ");
		}
		
	}
	public static void arr(int data []){
		for(int i=0;i<data.length;i++){
			data[i]=data[i]*data[i];
		}
	}

}
