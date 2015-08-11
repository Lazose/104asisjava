import java.util.Scanner;
import java.util.Random;
public class Javatest31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
Random rnd = new Random();	


int[]data= new int[10];
int c = 0;int n = 0;
for(int i = 0 ; i<10 ; i++){

data [i] = rnd.nextInt(100);

 if(data[i]%2==0){
	 c++;
}else{ 
	 n++;
}
}
	
int t = 0;

while (t<3){
System.out.println("½Ð²q");
int e = scn.nextInt();
if(e==c){
System.out.println("¥¿½T");
t=3	;
}
else{
System.out.println("¿ù»~");
t++;
}

}
System.out.println("GAME OVER");
for(int o = 0;o<10;o++)	
System.out.println(data[o]) ;
}



}

