import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*; 
import java.io.*;


class Test002 extends JFrame implements ActionListener{
	Test002(){
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("주문화면");
		
		JPanel p;
		JLabel l;
		JButton l3;
		JLabel l2;
		JButton btn;
		
		p = new JPanel();
		l = new JLabel("주문 확인");
		l2 = new JLabel("주문한 음료 및 가격");
		l3 = new JButton("가격");
		btn = new JButton("결제하기");
		
		p = new JPanel(new BorderLayout());
		
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setHorizontalAlignment(SwingConstants.CENTER);
		
		p.add(l,BorderLayout.NORTH);
		p.add(l2,BorderLayout.CENTER);
		p.add(l3,BorderLayout.SOUTH);
		p.add(btn, BorderLayout.SOUTH);
		this.add(p);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
public class Test02 {

	public static void main(String[] args) {
		new Test002();

	}

}

