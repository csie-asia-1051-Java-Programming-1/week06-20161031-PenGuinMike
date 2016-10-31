package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int x = fun1(m);
		int i = fun1(n);
		int j = fun1(m-n);
		System.out.println("m!/n!(m-n)!="+x/(i*j));
		
	}
	public static int fun1(int v1){
		int sum = 1;
		for(int i=v1;i>0;i--){
			sum*=i;
		}System.out.print("sum="+sum+"\t");
		
		return sum;
		
	}

}
