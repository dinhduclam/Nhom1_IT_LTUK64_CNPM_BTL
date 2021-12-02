package view.testcovid;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class AddTestCovidView {

	private JFrame frame;
	private JTextField hoTen;
	private JTextField id;
	private JButton submit;
	private JTextField ngayTest;
	private JRadioButton amTinh, duongTinh, testNhanh, testPCR;

	public AddTestCovidView() {
//		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÊM THÔNG TIN TEST COVID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 11, 338, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD & T\u00EAn:");
		lblNewLabel_1.setBounds(10, 83, 148, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		hoTen = new JTextField();
		hoTen.setBackground(UIManager.getColor("TextField.disabledBackground"));
		hoTen.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		hoTen.setBounds(155, 83, 127, 20);
		frame.getContentPane().add(hoTen);
		hoTen.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ph\u1EA7n h\u00E0nh ch\u00EDnh:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 52, 148, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		id = new JTextField();
		id.setBackground(UIManager.getColor("TextField.disabledBackground"));
		id.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		id.setColumns(10);
		id.setBounds(480, 83, 127, 20);
		frame.getContentPane().add(id);
		
		JLabel lblNewLabel_1_1 = new JLabel("S\u1ED1 h\u1ED9 chi\u1EBFu/CCCD:");
		lblNewLabel_1_1.setBounds(335, 83, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Thông tin test covid:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(10, 123, 148, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Kết quả:");
		lblNewLabel_1_4.setBounds(10, 154, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Loại test:");
		lblNewLabel_1_1_1.setBounds(335, 154, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		submit = new JButton("Submit");
		submit.setContentAreaFilled(false);
		submit.setBounds(257, 261, 109, 34);
		frame.getContentPane().add(submit);
		
		JButton close = new JButton("Close");
		close.setContentAreaFilled(false);
		close.setBounds(515, 280, 92, 29);
		close.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		frame.getContentPane().add(close);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Ngày test (yyyy/MM/dd):");
		lblNewLabel_1_4_1.setBounds(10, 210, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
		ngayTest = new JTextField();
		ngayTest.setColumns(10);
		ngayTest.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		ngayTest.setBackground(SystemColor.menu);
		ngayTest.setBounds(155, 210, 127, 20);
		frame.getContentPane().add(ngayTest);
		
		amTinh = new JRadioButton("Âm tính");
		amTinh.setBounds(155, 150, 109, 23);
		frame.getContentPane().add(amTinh);
		
		duongTinh = new JRadioButton("Dương tính");
		duongTinh.setBounds(155, 176, 109, 23);
		frame.getContentPane().add(duongTinh);
		
		ButtonGroup kq = new ButtonGroup();
		kq.add(amTinh);
		kq.add(duongTinh);
		
		testNhanh = new JRadioButton("Test nhanh");
		testNhanh.setBounds(480, 153, 109, 23);
		frame.getContentPane().add(testNhanh);
		
		testPCR = new JRadioButton("PCR");
		testPCR.setBounds(480, 181, 109, 23);
		frame.getContentPane().add(testPCR);
		
		ButtonGroup loaiTest = new ButtonGroup();
		loaiTest.add(testNhanh);
		loaiTest.add(testPCR);
		
		frame.setVisible(true);
		
	}
	//done
	public void setActionSubmitButton(ActionListener a) {
		submit.addActionListener(a);
	}
	
	public void clear() {
		hoTen.setText("");
		id.setText("");
		amTinh.setSelected(false);
		duongTinh.setSelected(false);
		testNhanh.setSelected(false);
		testPCR.setSelected(false);
		ngayTest.setText("");
		hoTen.requestFocus();
	}
	
	//done
	public String getHoTen() throws Exception{
		String name = hoTen.getText();
		if (name.equals("")) {
			hoTen.requestFocus();
			throw new Exception("Chưa điền Họ & tên");
		}
		return name;
		
	}
	//done
	public String getId() throws Exception {
		String cccd = id.getText();
		if (cccd.equals("")) {
			id.requestFocus();
			throw new Exception("Chưa điền Số hộ chiếu/CCCD");
		}
		return cccd;
	}
	
	public String getKetQua() throws Exception {
		try{
			if (amTinh.isSelected()) return "Âm tính";
			if (duongTinh.isSelected()) return "Dương tính";
			throw new Exception();
		} catch (Exception e){
			throw new Exception("Chưa chọn Kết quả");
		}
	}
	
	public String getLoaiTest() throws Exception {
		try{
			if (testNhanh.isSelected()) return "Test nhanh";
			if (testPCR.isSelected()) return "PCR";
			throw new Exception();
		} catch (Exception e){
			throw new Exception("Chưa chọn Loại test");
		}
	}
	
	public Date getNgayTest() throws Exception{
		String dateString = ngayTest.getText();
		Date date = null;

		if (dateString.equals("")) {
			ngayTest.requestFocus();
			throw new Exception("Chưa điền Ngày test");
		}
		else {
			String[] d = dateString.split("[^0-9]");
			if (d.length != 3) throw new Exception("Sai định dạng (yyyy/MM/dd)");
			try {
				date = Date.valueOf(d[0] + "-" + d[1] + "-" + d[2]);
			} catch (Exception e) {
				throw new Exception("Ngày không hợp lệ (yyyy/MM/dd)");
			}
		}
		return date;
	}

	//done
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(frame, message);
	}

}
