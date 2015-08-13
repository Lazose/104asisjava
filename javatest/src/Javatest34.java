import java.util.Scanner;

public class Javatest34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入英文");
		String str = scn.nextLine();	
		char[]data = str.toCharArray();
        int len = str.length();
        char[]data1 = new char[len];
		for(int i = 0;i <len;i++){
		data1[i]= data[len-i-1];
		}
		String newStr = new String(data1);
		System.out.println(data1);
		
		
		
		
		
		
		
		
		
	}	
		
		}	
	
	