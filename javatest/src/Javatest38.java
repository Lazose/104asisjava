import java .util.Scanner;
public class Javatest38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A矩陣");
		int x = scn. nextInt();
		int y = scn. nextInt();
		System.out.println("請輸入B矩陣");
		int z = scn. nextInt();
		int s = scn. nextInt();
		
		
		int p = 0 ;
		int q = 0 ;		
		
		if (y != z){
		System.out.println("無此矩陣!!");
		//  例如:  3*4 4*5 = 3*5
		
		}
		
		int data1[][] = new int[x][y];
		int data2[][] = new int[z][s];
		int data3[][] = new int[x][s];
		
		System.out.println("輸入A矩陣數字");
		
		for (int u = 0 ; u < x ; u++ ){
		for (int m = 0 ; m < y ; m++ ){
		     data1[u][m] = scn . nextInt();
		
		}
		}
		
		System.out.println("輸入B矩陣數字");
		
		for (int m = 0 ; m < z ; m++){
		for (int n = 0 ; n < s ; n++){
		     data2[m][n] = scn . nextInt();
		
		}
		}
		
		
		
		
		
		
		
		

				for(int u = 0; u<x ; u++){
		            for(int m = 0; m<y ; m++){
		                for(int n = 0; n<s ; n++ ){
		                    data3[p][q]=data1[u][m]*data2[m][n];
		
		                }q++;
		                }p++;q=0;
		                }
				for (p = 0; p < x; p++) {
					for (q = 0; q < s; q++) {
						System.out.print(data3[p][q] + "\t");
					                        }
					System.out.println();
                                        }
}
}
