import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java. util.Scanner;
import java. util.Random;
	
public class Work6 extends JFrame{

	private JLabel name = new JLabel("�п�J�m�W");
    private JTextField jlb1 = new JTextField("�W�r");
    private JButton sure = new JButton("�T�w");
    private JLabel talk = new JLabel();
    private Container cp ;
    //----------------------------------------------
    //�]�w����
    	public  Work6(){
    	initComp();
    }
    	private void initComp(){	
    	cp = this . getContentPane();
    	this.setBounds(150,100,600,400);	
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
    	cp.setLayout(null);
    	
    	//-----------------------------------------
    	jlb1.setBounds(50,70,250,25);	//�]�w -�W�r��J
    	jlb1.setSize(200,100);
    	
    	cp.add(jlb1);
    	System.out.println(jlb1.getText());
    	

    	//-----------------------------------------
    	//�T�w��
    	sure.setBounds(50,70,250,30);//push ����-�T�w
    	cp.add(sure);
    	sure.addActionListener(new ActionListener(){
    	public void actionPerformed(ActionEvent ae){
    	
    	
    	}	
    	});
    	
    	//----------------------------------------------
        //����-�W�h
    	talk.setText("����");
    	talk.setText("");
    	talk.setText("");
    	talk.setText("");
    	
    	
    	
    	
    	
    	
    	}
}
