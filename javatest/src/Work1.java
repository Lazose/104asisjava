import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java.util.Scanner;
import java.util.Random;

public class Work1 extends JFrame{

	
    private JButton jbtnPush1 = new JButton("�L���ɶ�");
    private JButton jbtnPush2 = new JButton("�v�t�ɨ�");
    private JButton jbtnPush3 = new JButton("�h�H�C��");
	private JLabel jlb1 = new JLabel();
	private Container cp ;
	private String str = " �ŤM���Y�� " ;
	
	//----------------------------------------------
	public  Work1(){
	initComp();//�]�mwork1����
}
	private void initComp(){	
	cp = this.getContentPane();
	this.setBounds(150,100,400,600);
		
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);		
	cp.setLayout(null);	//���� ��m 
	//-----------------------------------------	
	jlb1.setBounds(75,60,250,250);	//�]�w ����
	jlb1.setText(str);
	cp.add(jlb1);
	//------------------------------------------
	jbtnPush1.setBounds(75,100,80,25);//push ����-�L��
	cp.add(jbtnPush1);
	jbtnPush1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});
	//-------------------------------------------
	jbtnPush2.setBounds(75,120,80,25);//push ����-����
	cp.add(jbtnPush2);
	jbtnPush2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});
	//-------------------------------------------
	jbtnPush3.setBounds(75,140,80,25);//push ����-����
	cp.add(jbtnPush3);
	jbtnPush3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	
	
	}	
	});
	
	//------------------------------------------
	
	
	
	
	}
	
}
