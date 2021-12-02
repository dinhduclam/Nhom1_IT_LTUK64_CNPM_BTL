package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class KhaiBaoDichTeView {

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
					KhaiBaoDichTeView window = new KhaiBaoDichTeView();
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
	public KhaiBaoDichTeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 892, 493);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 49, 856, 278);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("QU\u1EA2N L\u00DD KHAI B\u00C1O Y T\u1EBE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 856, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JButton find = new JButton("T\u00ECm ki\u1EBFm");
		find.setContentAreaFilled(false);
		find.setBounds(743, 338, 123, 38);
		frame.getContentPane().add(find);
		
		textField = new JTextField();
		textField.setBounds(504, 338, 233, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton add = new JButton("Th\u00EAm");
		add.setContentAreaFilled(false);
		add.setBounds(10, 377, 123, 38);
		frame.getContentPane().add(add);
		
		JButton update = new JButton("S\u1EEDa");
		update.setContentAreaFilled(false);
		update.setBounds(143, 377, 123, 38);
		frame.getContentPane().add(update);
		
		JButton close = new JButton("Close");
		close.setContentAreaFilled(false);
		close.setBounds(743, 405, 123, 38);
		frame.getContentPane().add(close);
		
		JButton delete = new JButton("X\u00F3a");
		delete.setContentAreaFilled(false);
		delete.setBounds(276, 377, 123, 38);
		frame.getContentPane().add(delete);
	}
}
