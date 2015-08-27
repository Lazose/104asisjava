import java . util .Random; 
import java . util .Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Work8 extends JFrame{


		
		
	    private JButton pa = new JButton("布");
	    private JButton se = new JButton("剪刀");
	    private JButton st = new JButton("石頭");
	    private JButton ex = new JButton("返回");
	    private JLabel jlb1 = new JLabel();
		private Container cp ;
	
		//------------------------------------------
		public  Work8 (){
			initComp();//設置work8視窗
		}
			private void initComp(){	
			cp = this.getContentPane();
			this.setBounds(150,100,400,600);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
			cp.setLayout(null);	//視窗 位置 
		
		
		
		//------------------------------------------
		pa.setBounds(75,100,80,25);//push 按鍵-布
		cp.add(pa);
		pa.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		
		
		}	
		});
		//-------------------------------------------
		se.setBounds(75,120,80,25);//push 按鍵-剪刀
		cp.add(se);
		se.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		
		
		}	
		});
		//-------------------------------------------
		st.setBounds(75,140,80,25);//push 按鍵-石頭
		cp.add(st);
		st.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		
		
		}	
		});
		
		
		//------------------------------------------
		ex.setBounds(75,100,80,25);//push 按鍵-返回
		cp.add(ex);
		ex.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			
			
		}	
		});
		}
	    
		
		
		
		//-----------------------------------------
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();	
		
		
		int w; int l;int t;//贏或輸或平手
		int[]data= new int[1];
		for( int z = 0 ; z<1 ; z++){
		data[z]=rnd.nextInt(3);
		
		
		int y ;int x ;//雙方出的
		
		int vi = 'x-y';
        
		switch(vi){
		
        	

		case (vi=1):
		System.out.println("Lose");
		z++;l++;
		break;	
		case (vi=2):
		System.out.println("win");	
		z++;w++;
		break;
		case (vi=-1):
		System.out.println("win"); 
		z++;w++;
		break;
		case (vi=-2):	
		System.out.println("Lose");
		z++;l++;
		break;	
		
		default :
		System.out.println("Tie");
		z++;t++;
		break;
		
		} 
		//---------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		}
		private String str1 = " 玩家 " ;
		private String str2 = " 電腦 " ;
	    private JLabel player = new JLabel();		
	    private JLabel com = new JLabel();
		private Container bp ;
		player.setBounds(75,60,250,250);	//設定 標籤
		player.setText(str1);
		cp.add(player);
		com.setBounds(75,60,250,250);	//設定 標籤
		com.setText(str2);
		cp.add(com);
		}
}
