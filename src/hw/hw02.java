package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float v1 = scn.nextFloat();
		System.out.println(fun0(n,v1));
		
	}
	public static double fun0(int n,float v1){
		double x = 0 ;
		switch(n){
		case 1:
			x =(double) (v1-170)*0.6+62;
			break;
		case 2:
			x =(double) (v1-158)*0.5+52;
			break;
		}
		
		return x;
	}

}
