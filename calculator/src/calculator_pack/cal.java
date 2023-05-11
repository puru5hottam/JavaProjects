package calculator_pack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class cal implements ActionListener
{
	JTextField t1,t2,t3;
	void window()
	{
		JFrame jf = new JFrame (); 
		jf.setTitle("CALCULATOR");
		
		JButton b1 = new JButton("+");
		b1.setBounds(125,200,50,25);
		jf.add(b1);
		b1.addActionListener(this);
		
		JButton b2 = new JButton("-");
		b2.setBounds(225,200,50,25);
		jf.add(b2);
		b2.addActionListener(this);
		
		JButton b3 = new JButton("*");
		b3.setBounds(325,200,50,25);
		jf.add(b3);
		b3.addActionListener(this);
		
		JButton b4 = new JButton("/");
		b4.setBounds(425,200,50,25);
		jf.add(b4);
		b4.addActionListener(this);
		
		JButton b5 = new JButton("Clear");
		b5.setBounds(225,325,70,35);
		jf.add(b5);
		b5.addActionListener(this);
		
		JButton b6 = new JButton("Exit");
		b6.setBounds(325,325,70,35);
		jf.add(b6);
		b6.addActionListener(this);
		
		JButton b7 = new JButton("x");
		b7.setBounds(325,100,45,20);
		jf.add(b7);
		b7.addActionListener(this);
		
		JButton b8 = new JButton("X");
		b8.setBounds(325,150,45,20);
		jf.add(b8);
		b8.addActionListener(this);
		
		JLabel l1 = new JLabel("1st Number:");
		l1.setBounds(100,100, 100, 20);
		jf.add(l1);
		
		JLabel l2 = new JLabel("2nd Number:");
		l2.setBounds(100,150, 100, 20);
		jf.add(l2);
		
		JLabel l3 = new JLabel("Result:");
		l3.setBounds(100,250, 100, 20);
		jf.add(l3);
		
		 t1 = new JTextField();
		 t1.setBounds(225,100,80,20);
		 jf.add(t1);
		 
		 t2 = new JTextField();
		 t2.setBounds(225,150,80,20);
		 jf.add(t2);
		 
		 t3 = new JTextField();
		 t3.setBounds(220,250,80,20);
		 jf.add(t3);
		 jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
			
		 jf.setSize(600,400);
		 jf.setLayout(null);
		 jf.setVisible(true);
		 
	}
	
	public static void main(String[] args) {
		
		cal ob2 = new cal();
		ob2.window();
	}
	public void actionPerformed(ActionEvent e) {
		double a,b,c;
		if(e.getActionCommand().equals("+"))
		{
			a = Double.parseDouble(t1.getText()); //string to double convertion
			b = Double.parseDouble(t2.getText());
			c = a+b;
			t3.setText(String.valueOf(c)); 	//double to string convertion
		}
		else if(e.getActionCommand().equals("-"))
		{
			a = Double.parseDouble(t1.getText()); //string to double convertion
			b = Double.parseDouble(t2.getText());
			c = a-b;
			t3.setText(String.valueOf(c)); 	//double to string convertion
		}
		else if(e.getActionCommand().equals("*"))
		{
			a = Double.parseDouble(t1.getText()); //string to double convertion
			b = Double.parseDouble(t2.getText());
			c = a*b;
			t3.setText(String.valueOf(c)); 	//double to string convertion
		}
		else if(e.getActionCommand().equals("/"))
		{
			a = Double.parseDouble(t1.getText()); //string to double convertion
			b = Double.parseDouble(t2.getText());
			c = a/b;
			t3.setText(String.valueOf(c)); 	//double to string convertion
		}
		
		else if(e.getActionCommand().equals("Clear"))
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);	
		}
		
		else if(e.getActionCommand().equals("x"))
		{
			String s = t1.getText();
			StringBuffer sb = new StringBuffer(s);
			sb.deleteCharAt(sb.length()-1);
			t1.setText(String.valueOf(sb));
			
		}
		
		else if(e.getActionCommand().equals("X"))
		{
			String s = t2.getText();
			StringBuffer sb = new StringBuffer(s);
			sb.deleteCharAt(sb.length()-1);
			t2.setText(String.valueOf(sb));
		}
		
		else if(e.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
	}

}

