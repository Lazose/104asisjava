import java.util.Scanner;
public class Javatest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
		System.out.println("請輸入三角形三邊長(請由小排到大)");
		System.out.println("A");
		int A = scn.nextInt();
		System.out.println("B");
		int B = scn.nextInt();
		System.out.println("C");
		int C = scn.nextInt();
		if((A+B>C)&&(A-B<C)){
			System.out.println("這是一個合理的三角形");
	}
		else{ 
			System.out.println("這不行的吧");
		
		
		
		
		}
	}
}

