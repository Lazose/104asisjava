import java.util.Scanner;
import java.util.Random;
public class Javatest33 {

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
		int j = 0;
		for(i=0;i<10;i++){
			for(j=i+1;j<10;j++){
				if(data[i]>data[j]){
					int v1 = data[i];
					data[i]=data[j];
					data[j]=v1;
}
}
}
		for(int o = 0; o<10 ; o++){
			System.out.println(data[o]);
}

	}
}
		
		
		
		
		
		
		
		
		
		
		
	


