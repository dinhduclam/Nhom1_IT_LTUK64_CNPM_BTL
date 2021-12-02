package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import controller.nhankhau.AddNhanKhauController;
import controller.nhankhau.UpdateNhanKhauController;
import model.NhanKhauModel;
import view.NhanKhauView;

public class NhanKhauController {
	private NhanKhauView nhanKhauView = new NhanKhauView();
	private NhanKhauModel nhanKhauModel = new NhanKhauModel(nhanKhauView);
	
	public static final String colName[] = {"Họ tên", "Số hộ chiếu/CCCD", "Giới tính", "Ngày sinh", "Số điện thoại", "Số thẻ BHYT", "Email", "Quốc tịch", "Thường trú/Tạm trú"};
	
	public NhanKhauController() {
		nhanKhauView.initialize();
		nhanKhauView.setActionAddButton(new addBtnAction());
		nhanKhauView.setActionUpdateButton(new updateBtnAction());
		nhanKhauView.setActionDeleteButton(new deleteBtnAction());
		nhanKhauView.setKeyListenerFind(new findKeyListener());
		try {
			nhanKhauView.setDataForTable(colName, nhanKhauModel.getData(""));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			nhanKhauView.showMessage("Lỗi kết nối database");
		}
	}
	
	class addBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new AddNhanKhauController(nhanKhauModel);
		}
	}
	
	class updateBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				new UpdateNhanKhauController(nhanKhauModel, nhanKhauView.getSelectedInfo());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				nhanKhauView.showMessage(e.getMessage());
			}
		}
	}
	
	class deleteBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				nhanKhauModel.delete((String) nhanKhauView.getSelectedInfo()[1]);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				nhanKhauView.showMessage("Loi databse");
			} catch (Exception e1) {
				// TODO: handle exception
				nhanKhauView.showMessage(e1.getMessage());
			}
		}
	}
	
	class findKeyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			try {
				nhanKhauView.setDataForTable(colName, nhanKhauModel.getData(nhanKhauView.getTextToFind()));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				nhanKhauView.showMessage("Loi databse");
			} catch (Exception e1) {
				// TODO: handle exception
				nhanKhauView.showMessage(e1.getMessage());
			}
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		NhanKhauController nhankhau = new NhanKhauController();
	}
}
