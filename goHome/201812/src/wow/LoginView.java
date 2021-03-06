package wow;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class LoginView extends JFrame{
	private MainProcess main;
	private TestFrm testFrm;
	
	private JButton Logbtn;
	private JButton Rsbtn;
	private JPasswordField passText;
	private JTextField userText;
	private boolean bLoginCheck;
	
	public static void main(String[] args) {
		new LoginView();
	}

	public LoginView() {
		// setting
		setTitle("로그인");
		setSize(280, 150);
		setResizable(false);
		setLocation(800, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// panel
		JPanel panel = new JPanel();
		placeLoginPanel(panel);
		
		
		// add
		add(panel);
		

		setVisible(true);
	}
	
	public void placeLoginPanel(JPanel panel){
		panel.setLayout(null);		
		JLabel userLabel = new JLabel("아이디");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);
		
		JLabel passLabel = new JLabel("비밀번호");
		passLabel.setBounds(10, 40, 80, 25);
		panel.add(passLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);
		
		passText = new JPasswordField(20);
		passText.setBounds(100, 40, 160, 25);
		panel.add(passText);
		passText.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();			
			}
		});
		
		Rsbtn = new JButton("Reset");
		Rsbtn.setBounds(10, 80, 100, 25);
		panel.add(Rsbtn);
		Rsbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userText.setText("");
				passText.setText("");
			}
		});
		
		Logbtn = new JButton("로그인");
		Logbtn.setBounds(160, 80, 100, 25);
		panel.add(Logbtn);
		Logbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userText.setForeground(Color.blue);
				passText.setForeground(Color.MAGENTA);
				isLoginCheck();
			}
		});
	}
	
	public void isLoginCheck(){
		if(userText.getText().equals("hi") && new String(passText.getPassword()).equals("0000")){
			JOptionPane.showMessageDialog(null, "로그인 하셨습니다.");
			bLoginCheck = true;
			
			// 로그인 성공이라면 매니져창 뛰우기
			if(isLogin()){
				main.showFrameTest(); // 메인창 메소드를 이용해 창뛰우기
			}					
		}else{
			JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 일치하지 않습니다.");
		}
	}

	public void setMain(MainProcess main) {
		this.main = main;
	}
	
	public boolean isLogin() {		
		return bLoginCheck;
	}

}

