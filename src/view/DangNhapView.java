package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class DangNhapView {

	private JFrame frame;
	private JTextField username;
	private JLabel lblNewLabel_2;
	private JPasswordField password;
	private JButton submit;

	public DangNhapView() {
//		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 358, 293);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0102NG NH\u1EACP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(24, 22, 284, 57);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp:");
		lblNewLabel_1.setBounds(22, 101, 122, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		username = new JTextField();
		username.setBackground(UIManager.getColor("TextField.disabledBackground"));
		username.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		username.setBounds(142, 102, 166, 21);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		lblNewLabel_2 = new JLabel("M\u1EADt kh\u1EA9u:");
		lblNewLabel_2.setBounds(22, 134, 122, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		password = new JPasswordField();
		password.setBackground(UIManager.getColor("TextField.disabledBackground"));
		password.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		password.setColumns(10);
		password.setBounds(142, 135, 166, 21);
		frame.getContentPane().add(password);
		
		submit = new JButton("Submit");
		submit.setContentAreaFilled(false);
		submit.setBounds(197, 192, 111, 32);
		frame.getContentPane().add(submit);
		
		frame.getRootPane().setDefaultButton(submit);
		frame.setVisible(true);
	}
	public String getUsername() {
		return username.getText();
	}
	@SuppressWarnings("deprecation")
	public String getPassword() {
		return password.getText();
	}
	public void setActionSubmitButton(ActionListener action) {
		submit.addActionListener(action);
	}
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(frame, message);
	}
	public void dispose() {
		frame.dispose();
	}
}
