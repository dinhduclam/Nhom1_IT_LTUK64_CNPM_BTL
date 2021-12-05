package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class MainFrame_b {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame_b window = new MainFrame_b();
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
	public MainFrame_b() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 935, 604);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 0, 919, 60);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("QUẢN LÝ PHÒNG TRÁNH COVID-19");
		lblNewLabel_1.setBounds(129, 0, 653, 60);
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 549, 919, 16);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel userInfoLabel = new JLabel("user: lam");
		userInfoLabel.setHorizontalAlignment(SwingConstants.LEFT);
		userInfoLabel.setBounds(10, 0, 151, 14);
		panel_2.add(userInfoLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Ph\u1EA7n m\u1EC1m qu\u1EA3n l\u00FD th\u00F4ng tin t\u1ED5 d\u00E2n c\u01B0 | T\u1ED5 d\u00E2n ph\u1ED1 7 | Ph\u01B0\u1EDDng La Kh\u00EA");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(269, 0, 435, 16);
		panel_2.add(lblNewLabel_2);
		
		JLabel dateLable = new JLabel("25/11/2021");
		dateLable.setHorizontalAlignment(SwingConstants.RIGHT);
		dateLable.setBounds(805, 1, 104, 15);
		panel_2.add(dateLable);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(0, 60, 165, 493);
		frame.getContentPane().add(panel_1);
		
		JButton khaiBaoChooseBtn = new JButton("Quản lý khai báo");
		khaiBaoChooseBtn.setBorder(null);
		khaiBaoChooseBtn.setBackground(SystemColor.activeCaptionBorder);
		khaiBaoChooseBtn.setBounds(0, 96, 165, 55);
		panel_1.add(khaiBaoChooseBtn);
		
		JButton cachLyChooseBtn = new JButton("Quản lý cách ly");
		cachLyChooseBtn.setBorder(null);
		cachLyChooseBtn.setBackground(SystemColor.activeCaption);
		cachLyChooseBtn.setBounds(0, 212, 165, 55);
		panel_1.add(cachLyChooseBtn);
		
		JLabel lblNewLabel = new JLabel("WELCOME!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 25, 145, 24);
		panel_1.add(lblNewLabel);
		
		JButton qlSucKhoeChooseBtn = new JButton("QL sức khỏe bất thường");
		qlSucKhoeChooseBtn.setBorder(null);
		qlSucKhoeChooseBtn.setBackground(SystemColor.activeCaption);
		qlSucKhoeChooseBtn.setBounds(0, 153, 165, 55);
		panel_1.add(qlSucKhoeChooseBtn);
		
		JButton testCovidChooseBtn = new JButton("Quản lý test covid");
		testCovidChooseBtn.setBorder(null);
		testCovidChooseBtn.setBackground(SystemColor.activeCaption);
		testCovidChooseBtn.setBounds(0, 267, 165, 55);
		panel_1.add(testCovidChooseBtn);
		
		JButton tiemVaccineChooseBtn = new JButton("Quản lý tiêm vaccine");
		tiemVaccineChooseBtn.setBorder(null);
		tiemVaccineChooseBtn.setBackground(SystemColor.activeCaption);
		tiemVaccineChooseBtn.setBounds(0, 325, 165, 55);
		panel_1.add(tiemVaccineChooseBtn);
		
		JButton tiemVaccineChooseBtn_1 = new JButton("THỐNG KÊ");
		tiemVaccineChooseBtn_1.setBorder(null);
		tiemVaccineChooseBtn_1.setBackground(SystemColor.activeCaption);
		tiemVaccineChooseBtn_1.setBounds(0, 382, 165, 55);
		panel_1.add(tiemVaccineChooseBtn_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(167, 61, 752, 481);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton themKhaiBaoButton = new JButton("Thêm");
		themKhaiBaoButton.setContentAreaFilled(false);
		themKhaiBaoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		themKhaiBaoButton.setBounds(10, 11, 140, 35);
		panel_3.add(themKhaiBaoButton);
		
		JButton suaThongTinButton = new JButton("Sửa");
		suaThongTinButton.setContentAreaFilled(false);
		suaThongTinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		suaThongTinButton.setBounds(160, 11, 140, 35);
		panel_3.add(suaThongTinButton);
		
		JButton timKiemButton = new JButton("T\u00ECm ki\u1EBFm");
		timKiemButton.setContentAreaFilled(false);
		timKiemButton.setBounds(627, 11, 114, 35);
		panel_3.add(timKiemButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 731, 424);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setBackground(UIManager.getColor("TextField.disabledBackground"));
		textField.setBounds(454, 18, 163, 28);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton xoaKhaiBaoButton = new JButton("Xóa");
		xoaKhaiBaoButton.setContentAreaFilled(false);
		xoaKhaiBaoButton.setBounds(308, 11, 140, 35);
		panel_3.add(xoaKhaiBaoButton);
	}
}
