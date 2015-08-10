import java . util .Scanner;
public class Javatest28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn");
		int n = scn.nextInt();
		
		double v1 = Math.ceil(n/2);
		double v2 = n-v1 ;
		
		for (int i=0;i<=v1;i++){
		for (int j=0;j<v1-i;j++){
			   System.out.print(" ");
	}
		for (int k=0;k<=2*i;k++){
		       System.out.print("*");
	}
		     System.out.println();
		}
		for (int I=1;I<=v2-1;I++){
		for (int J=0;J<I;J++){
			   System.out.print(" ");
	}
		for (int K=0;K<=(v2-I-1)*2;K++){
		       System.out.print("*");
	}
		       System.out.println();
    }
	}
	}