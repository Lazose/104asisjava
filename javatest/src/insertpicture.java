import java . awt.*;
import java . awt . event.*;
import javax . swing.*; 
import java.util.Scanner;
import java.util.Random;
public class insertpicture extends JFrame{
	
	
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
	
	//---------------------------�ХܹϤ��b�q����m
	ImageIcon image0 = new ImageIcon("file://E:GitHub/pa .jpg");
	ImageIcon image1 = new ImageIcon("file://E:GitHub/se .jpg");
	ImageIcon image2 = new ImageIcon("file://E:Github/st .jpg");
	Container cp = null ;	
	//-------------------------�ХܪŶ�label
	
	JLabel JLb1  = new JLabel();
	JLabel JLb2  = new JLabel();
	JLabel JLb3  = new JLabel();


	//--------------------------�Х�label��m
	
	JLb1.setIcon(image0);
	JLb1.setBounds(0,10,80,60);
	JLb2.setIcon(image1);
	JLb2.setBounds(0,40,80,60);
	JLb3.setIcon(image2);
	JLb3.setBounds(0,70,80,60);
	
	//----------------------------------
	//--------------------------�[�J�Ϥ�

	cp.add(JLb1);
	cp.add(JLb2);
	cp.add(JLb3);
	
	
	
	}
	
}
