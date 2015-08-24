import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java.util.Scanner;
import java.util.Random;

public class Work1 extends JFrame{

	
    private JButton jbtnPush1 = new JButton("無限時間");
    private JButton jbtnPush2 = new JButton("競速時刻");
    private JButton jbtnPush3 = new JButton("多人遊戲");
	private JLabel jlb1 = new JLabel();
	private Container cp ;
	private String str = " 剪刀石頭布 " ;
	
	//----------------------------------------------
	public  Work1(){
	initComp();//設置work1視窗
}
	private void initComp(){	
	cp = this.getContentPane();
	this.setBounds(150,100,400,600);
		
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	cp.setLayout(null);	//視窗 位置 
	//-----------------------------------------	
	jlb1.setBounds(75,60,250,250);	//設定 標籤
	jlb1.setText(str);
	cp.add(jlb1);
	//------------------------------------------
	jbtnPush1.setBounds(75,100,80,25);//push 按鍵-無限
	cp.add(jbtnPush1);
	jbtnPush1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});
	//-------------------------------------------
	jbtnPush2.setBounds(75,120,80,25);//push 按鍵-限時
	cp.add(jbtnPush2);
	jbtnPush2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});
	//-------------------------------------------
	jbtnPush3.setBounds(75,140,80,25);//push 按鍵-網路
	cp.add(jbtnPush3);
	jbtnPush3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});
	
	//------------------------------------------
	
	
	
	
	}
	
}
