import java . util .Random; 
import java . util .Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//-----------------------------------------
		int y ;int x ;
		int[]data= new int[3];
		for( y = 0 ; y<1 ; y++){
		data[y]=rnd.nextInt(3);
		
		
		int vi = x-y;
        
		switch(vi){
		
        	
		case (vi=0) :
		System.out.println("Tie");
		break;
		case (vi=1):
		System.out.println("Lose");	
		break;	
		case (vi=2):
		System.out.println("win");	
		break;
		case (vi=-1):
		System.out.println("win"); 
		break;
		case (vi=-2):	
		System.out.println("Lose");
		break;	
		System.out.println(data[y]);
		} 
		//---------------------------------------
		
		
		
		
		
		
		
		
		
		
		
	
		}
}
