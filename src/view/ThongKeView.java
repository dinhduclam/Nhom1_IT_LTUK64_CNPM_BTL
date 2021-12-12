package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ThongKeView {

	private JFrame frame;
	
	
	public ThongKeView() {
		initialize();
	}

	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 892, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
	}
	
	public void setActionNhanKhau(ActionListener action) {
		btnQLNhanKhau.addActionListener(action);
	}
	public void setActionKhaiBaoYTe(ActionListener action) {
		btnQLKhaiBaoYTe.addActionListener(action);
	}
	public void setActionSucKhoe(ActionListener action) {
		btnQLSucKhoe.addActionListener(action);
	}
	public void setActionCachLy(ActionListener action) {
		btnQLCachLy.addActionListener(action);
	}
	public void setActionTestCovid(ActionListener action) {
		btnQLTestCovid.addActionListener(action);
	}	
	public void setActionTiemVaccine(ActionListener action) {
		btnQLTiemVaccine.addActionListener(action);
	}
	public void setActionThongKe(ActionListener action) {
		btnThongKe.addActionListener(action);
	}
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(frame, message);
	}
}
