package view.testcovid;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ViewDetailTestCovid {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetailTestCovid window = new ViewDetailTestCovid();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewDetailTestCovid() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ph\u1EA7n h\u00E0nh ch\u00EDnh:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 54, 148, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD & T\u00EAn:");
		lblNewLabel_1.setBounds(10, 85, 148, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBackground(SystemColor.menu);
		textField.setBounds(155, 85, 127, 20);
		frame.getContentPane().add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("S\u1ED1 h\u1ED9 chi\u1EBFu/CCCD:");
		lblNewLabel_1_1.setBounds(292, 85, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(SystemColor.menu);
		textField_1.setBounds(437, 85, 127, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_2.setBackground(SystemColor.menu);
		textField_2.setBounds(436, 148, 127, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M\u1EE9c \u0111\u1ED9 c\u00E1ch ly:");
		lblNewLabel_1_1_1.setBounds(292, 147, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_3.setBackground(SystemColor.menu);
		textField_3.setBounds(155, 147, 127, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ng\u00E0y b\u1EAFt \u0111\u1EA7u c\u00E1ch ly:");
		lblNewLabel_1_4.setBounds(10, 147, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Th\u00F4ng tin c\u00E1ch ly:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(10, 116, 148, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\u0110\u1ECBa ch\u1EC9 c\u00E1ch ly:");
		lblNewLabel_1_2_1.setBounds(10, 174, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField_4.setBackground(SystemColor.menu);
		textField_4.setBounds(155, 174, 408, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel lblThngTinCch = new JLabel("TH\u00D4NG TIN C\u00C1CH LY");
		lblThngTinCch.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngTinCch.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblThngTinCch.setBounds(107, 9, 338, 34);
		frame.getContentPane().add(lblThngTinCch);
		
		JButton btnClose = new JButton("Close");
		btnClose.setContentAreaFilled(false);
		btnClose.setBounds(454, 220, 109, 34);
		frame.getContentPane().add(btnClose);
	}

}
