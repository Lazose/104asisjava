import java.util.Scanner;
import java.util.Random;

public class Javatest35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();	
		
	
		int[]data= new int[20];
		int c = 0;int n = 0;int o = 0;
		for(int i = 0 ; i<20 ; i++){

		data [i] = (rnd.nextInt(20)-10);
		
		
	    }
		for(int k = 0; k<20;k++){    
		

		    if(data[k]>0){
		    	c++;
		    	
		    }else{
		    	if(data[k]<0){
		    		n++;
		    		
		    	}else{
		    		o++;
		    	}
		    }
		    } 
		    for(int l = 0; l<20 ; l++)
			System.out.println(data[l]);
		    System.out.println("正值"+c+"個");
	        System.out.println("負值"+n+"個");
	        System.out.println("為0個數"+o+"個");
}
}