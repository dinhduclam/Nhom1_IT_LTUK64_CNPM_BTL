package view.cach_ly;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;

public class UpdateCachLyView {

	private JFrame frame;
	private JTextField hoTen;
	private JTextField id;
	private JTextField ngayBatDau;
	private JTextField mucDoCachLy;
	private JTextField diaChiCachLy;
	private JButton submit;

	public UpdateCachLyView() {
//		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 633, 325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("S\u1EECA TH\u00D4NG TIN C\u00C1CH LY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(134, 11, 338, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("H\u1ECD & T\u00EAn:");
		lblNewLabel_1.setBounds(10, 83, 148, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		hoTen = new JTextField();
		hoTen.setEditable(false);
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
		id.setEditable(false);
		id.setBackground(UIManager.getColor("TextField.disabledBackground"));
		id.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		id.setColumns(10);
		id.setBounds(480, 83, 127, 20);
		frame.getContentPane().add(id);
		
		JLabel lblNewLabel_1_1 = new JLabel("S\u1ED1 h\u1ED9 chi\u1EBFu/CCCD:");
		lblNewLabel_1_1.setBounds(335, 83, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Th\u00F4ng tin c\u00E1ch ly:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(10, 123, 148, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ng\u00E0y b\u1EAFt \u0111\u1EA7u c\u00E1ch ly:");
		lblNewLabel_1_4.setBounds(10, 154, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("M\u1EE9c \u0111\u1ED9 c\u00E1ch ly:");
		lblNewLabel_1_1_1.setBounds(335, 154, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		ngayBatDau = new JTextField();
		ngayBatDau.setBackground(UIManager.getColor("TextField.disabledBackground"));
		ngayBatDau.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		ngayBatDau.setColumns(10);
		ngayBatDau.setBounds(155, 154, 127, 20);
		frame.getContentPane().add(ngayBatDau);
		
		mucDoCachLy = new JTextField();
		mucDoCachLy.setBackground(UIManager.getColor("TextField.disabledBackground"));
		mucDoCachLy.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		mucDoCachLy.setColumns(10);
		mucDoCachLy.setBounds(480, 154, 127, 20);
		frame.getContentPane().add(mucDoCachLy);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("\u0110\u1ECBa ch\u1EC9 c\u00E1ch ly:");
		lblNewLabel_1_2_1.setBounds(10, 181, 148, 20);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		diaChiCachLy = new JTextField();
		diaChiCachLy.setBackground(UIManager.getColor("TextField.disabledBackground"));
		diaChiCachLy.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		diaChiCachLy.setColumns(10);
		diaChiCachLy.setBounds(155, 181, 452, 20);
		frame.getContentPane().add(diaChiCachLy);
		
		submit = new JButton("Submit");
		submit.setContentAreaFilled(false);
		submit.setBounds(256, 225, 109, 34);
		frame.getContentPane().add(submit);
		
		JButton close = new JButton("Close");
		close.setContentAreaFilled(false);
		close.setBounds(515, 246, 92, 29);
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				frame.dispose();
			}
		});
		frame.getContentPane().add(close);
		
		frame.setVisible(true);
	}
	
	//done
	public void setActionSubmitButton(ActionListener a) {
		submit.addActionListener(a);
	}
	
	public void setData(Object[] data){
		hoTen.setText((String) data[0]);
		id.setText((String) data[1]);
		ngayBatDau.setText(data[2].toString());
		mucDoCachLy.setText("F" + data[3].toString());
		diaChiCachLy.setText((String) data[4]);
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
	//done
	public Date getNgayBatDau() throws Exception{
		String dateString = ngayBatDau.getText();
		Date date = null;

		if (dateString.equals("")) {
			ngayBatDau.requestFocus();
			throw new Exception("Chưa điền Ngày bắt đầu");
		}
		else {
			String[] d = dateString.split("[^0-9]");
			if (d.length != 3) throw new Exception("Sai định dạng (yyyy/MM/dd)");
			try {
				date = Date.valueOf(d[0] + "-" + d[1] + "-" + d[2]);
			} catch (Exception e) {
				throw new Exception("Sai định dạng (yyyy/MM/dd)");
			}
		}
		return date;
	}
	//done
	public int getMucDoCachLy() throws Exception {
		String f = mucDoCachLy.getText();
		if (f.equals("")) {
			mucDoCachLy.requestFocus();
			throw new Exception("Chưa điền Mức độ cách ly");
		}
		else {
			if (f.charAt(0) != 'f' && f.charAt(0) != 'F') {
				throw new Exception("Sai định dạng (F1, F2, F3...)");
			}
			f = f.substring(1);
			try {
				return Integer.parseInt(f);
			} catch (Exception e) {
				// TODO: handle exception
				throw new Exception("Sai định dạng (F1, F2, F3...)");
			}
		}
	}
	//done
	public String getDiaChiCachLy() throws Exception {
		String address = diaChiCachLy.getText();
		if (address.equals("")) {
			diaChiCachLy.requestFocus();
			throw new Exception("Chưa điền Địa chỉ cách ly");
		}
		return address;
	}
	//done
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(frame, message);
	}
	public void dispose() {
		frame.dispose();
	}
	
}
