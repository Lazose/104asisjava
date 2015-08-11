import java.util.Scanner;
import java.util.Random;
public class Javatest32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();	
	
        int[]data= new int[10];
		int i = 0 ;
		boolean flag = false ;
		while(i<10){
		data[i]=rnd.nextInt(100);
		flag= false;
		for (int j =0;j<i;j++){
		if(data[i]==data[j]){
			flag = true;
		}
		}
		if (flag==false){
			i++;
		}
		
		
		
		
}
        for(int o = 0; o<10 ; o++)
		System.out.println(data[o]);
}
}