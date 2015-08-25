import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java. util.Scanner;
import java. util.Random;
	
public class Work4 extends JFrame{

	
	private JLabel jlb2 = new JLabel();
    private JTextField jlb1 = new JTextField("名字");
    private JButton sure = new JButton("確定");
    private JLabel talk = new JLabel();
    private String name = " 請輸入名字" ;
    private Container cp ;
    //----------------------------------------------
    //設定視窗
    	public  Work4(){
    	initComp();
    }
    	private void initComp(){	
    	cp = this . getContentPane();
    	this.setBounds(150,100,600,400);	
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
    	cp.setLayout(null);
    	
    	//-----------------------------------------	
    	jlb2.setBounds(75,60,250,250);	//設定 標籤
    	jlb2.setText(name);
    	cp.add(jlb1);
    	
    	//-----------------------------------------
    	jlb1.setBounds(50,70,250,25);	//設定 -名字輸入
    	jlb1.setSize(200,100);
    	
    	cp.add(jlb1);
    	System.out.println(jlb1.getText());
    	

    	//-----------------------------------------
    	//確定鍵
    	sure.setBounds(50,70,250,30);//push 按鍵-確定
    	cp.add(sure);
    	sure.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent ae){
    	
    	
    	}	
    	});
    	
    	//----------------------------------------------
        //說明-規則
    	talk.setText("說明");
    	talk.setText("");
    	talk.setText("");
    	talk.setText("");


    
	
	
	
	
}
}
