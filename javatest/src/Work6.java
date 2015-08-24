import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java. util.Scanner;
import java. util.Random;
	
public class Work6 extends JFrame{

	private JLabel name = new JLabel("請輸入姓名");
    private JTextField jlb1 = new JTextField("名字");
    private JButton sure = new JButton("確定");
    private JLabel talk = new JLabel();
    private Container cp ;
    //----------------------------------------------
    //設定視窗
    	public  Work6(){
    	initComp();
    }
    	private void initComp(){	
    	cp = this . getContentPane();
    	this.setBounds(150,100,600,400);	
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
    	cp.setLayout(null);
    	
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
