import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.MarginBorder;


class Coffeeeee extends JFrame implements ActionListener{
	
	JButton next,next2,next3,next4,next5,next6,next7,
	next8,sidenext1,sidenext2,sidenext3,sidenext4;
	JTextArea coffemoney1,coffemoney2,coffemoney3,coffemoney4,coffemoney5,coffemoney6,
	coffemoney7,coffemoney8,sidemoney1,sidemoney2,sidemoney3,sidemoney4;
	
	JLabel cof,cof2,cof3,cof4,cof5,cof6,cof7,cof8,side,side2,side3,side4;
	JPanel panel;
	
	
	
	public Coffeeeee() {
	
		
		setTitle("커피주문표");
		setSize(500, 800);
		next=new JButton("주문표로 가기");
		
		cof=new JLabel();
		cof2=new JLabel();
		cof3=new JLabel();
		cof4=new JLabel();
		cof5=new JLabel();
		cof6=new JLabel();
		cof7=new JLabel();
		cof8=new JLabel();
		side=new JLabel();
		side2=new JLabel();
		side3=new JLabel();
		side4=new JLabel();

		
		next=new JButton("주문하기");
		next2=new JButton("주문하기");
		next3=new JButton("주문하기");
		next4=new JButton("주문하기");
		next5=new JButton("주문하기");
		next6=new JButton("주문하기");
		next7=new JButton("주문하기");
		next8=new JButton("주문하기");
		sidenext1=new JButton("주문하기");
		sidenext2=new JButton("주문하기");
		sidenext3=new JButton("주문하기");
		sidenext4=new JButton("주문하기");
		
		
		coffemoney1=new JTextArea("가격:2000");
		coffemoney2=new JTextArea("가격:2000");
		coffemoney3=new JTextArea("가격:2000");
		coffemoney4=new JTextArea("가격:2000");
		coffemoney5=new JTextArea("가격:2000");
		coffemoney6=new JTextArea("가격:2000");
		coffemoney7=new JTextArea("가격:2000");
		coffemoney8=new JTextArea("가격:2000");
		sidemoney1=new JTextArea("가격:3000");
		sidemoney2=new JTextArea("가격:3000");
		sidemoney3=new JTextArea("가격:3500");
		sidemoney4=new JTextArea("가격:3500");
		
		
		
		
		ImageIcon coffee=new ImageIcon("coffe1.png");
		ImageIcon coffee2=new ImageIcon("coffe2.png");
		ImageIcon coffee3=new ImageIcon("coffe3.png");
		ImageIcon coffee4=new ImageIcon("coffe4.png");
		ImageIcon coffee5=new ImageIcon("coffe5.png");
		ImageIcon coffee6=new ImageIcon("coffe6.png");
		ImageIcon coffee7=new ImageIcon("coffe7.png");
		ImageIcon coffee8=new ImageIcon("coffe8.png");
		ImageIcon sidemenu=new ImageIcon("side.png");
		ImageIcon sidemenu2=new ImageIcon("side2.png");
		ImageIcon sidemenu3=new ImageIcon("side3.png");
		ImageIcon sidemenu4=new ImageIcon("side4.png");
		
		
		cof.setIcon(coffee);
		cof2.setIcon(coffee2);
		cof3.setIcon(coffee3);
		cof4.setIcon(coffee4);
		cof5.setIcon(coffee5);
		cof6.setIcon(coffee6);
		cof7.setIcon(coffee7);
		cof8.setIcon(coffee8);
		side.setIcon(sidemenu);
		side2.setIcon(sidemenu2);
		side3.setIcon(sidemenu3);
		side4.setIcon(sidemenu4);
		
	
		panel=new JPanel(new GridLayout(0, 3,4,4));
		
		
		panel.add(cof,BorderLayout.WEST);panel.add(coffemoney1);panel.add(next);
		panel.add(cof2,BorderLayout.WEST);panel.add(coffemoney2);panel.add(next2);
		panel.add(cof3,BorderLayout.WEST);panel.add(coffemoney3);panel.add(next3);
		panel.add(cof4,BorderLayout.WEST);panel.add(coffemoney4);panel.add(next4);
		panel.add(cof5,BorderLayout.WEST);panel.add(coffemoney5);panel.add(next5);
		panel.add(cof6,BorderLayout.WEST);panel.add(coffemoney6);panel.add(next6);
		panel.add(cof7,BorderLayout.WEST);panel.add(coffemoney7);panel.add(next7);
		panel.add(cof8,BorderLayout.WEST);panel.add(coffemoney8);panel.add(next8);
		panel.add(side,BorderLayout.WEST);panel.add(sidemoney1);panel.add(sidenext1);
		panel.add(side2,BorderLayout.WEST);panel.add(sidemoney2);panel.add(sidenext2);
		panel.add(side3,BorderLayout.WEST);panel.add(sidemoney3);panel.add(sidenext3);
		panel.add(side4,BorderLayout.WEST);panel.add(sidemoney4);panel.add(sidenext4);
		
		
		
		panel.setSize(50, 50);
		
		
		add(panel);
		
		
		
		setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}



public class Test01 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Coffeeeee();
	}

}

