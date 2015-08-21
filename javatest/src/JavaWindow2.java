import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaWindow2 extends JFrame{

	private JButton jbtnExit = new JButton("Exit");
    private JButton jbtnPush = new JButton("Push");
	private JLabel jlb1 = new JLabel();
	private Container cp ;
	private String str = " " ;
	private int count = 0 ;

	public  JavaWindow2(){
	initComp();
}
	private void initComp(){	
	cp = this . getContentPane();
	this.setBounds(150.100,600.400);	
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	cp.setLayout(null);	
		
	jlb1.setBounds(50.70,250.25);	//³]©w
	jlb1.setText(str+count);
	cp.add(jlb1);
	
	jbtnPush.setBounds(50.100,80.25);//push
	cp.add(jbtnPush);
	jbtnPush.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent ae){
	count++;
	jlb1.setText(str+count);
	}	
	)}
	jbtnExit.setBounds(50.150,80.25);
	cp.add(jbtnExit);
	jbtnExit.AddActionListener(new ActionListener){
	public void actionPerformed(ActionEvent ae){
	System.exit(0);
	}
	}
	}
}

