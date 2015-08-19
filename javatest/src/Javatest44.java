import java.util.Scanner;
public class Javatest44 {

	public static void main(String args[] ) {
		// TODO Auto-generated method stub
		int i ,j ,sum=0;
 		int sale[][]={{32,35,26,30},{34,30,33,31}};
		
 		for (i=0;i<sale.length;i++);
 		{
		System.out.println("業務員"+(i+1)+"的業績分別為");
		for(j=0;j<sale[i].length;j++){
		System.out.print(sale[i][j]+"");
		sum+=sale[i][j];
		}
		System.out.println();
 		}
 		System.out.println("\n總銷售量"+sum+"部車");
 		
		
		
 		
 		
 		
	}

}
