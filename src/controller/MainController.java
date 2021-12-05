package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MainView;

public class MainController {
	private MainView mainView = new MainView();
	private String permission;
	public MainController(String permission) {
		this.permission = permission;
		//permission = "Trưởng khu" | "Cán bộ y tế"
		mainView.initialize();
		mainView.setActionCachLy(new CachLyBtn());
		mainView.setActionTestCovid(new TestCovidBtn());
		mainView.setActionNhanKhau(new NhanKhauBtn());
		mainView.setActionTiemVaccine(new TiemVaccineBtn());
		mainView.setActionKhaiBaoYTe(new KhaiBaoYTeBtn());
		mainView.setActionSucKhoe(new SucKhoeBtn());
		mainView.setActionThongKe(new ThongKeBtn());
	}
	
	class CachLyBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new CachLyController();
		}
	}
	
	class TestCovidBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new TestCovidController();
		}
	}
	

	class NhanKhauBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (permission.equals("Trưởng khu")) new NhanKhauController();
			else mainView.showMessage("Bạn không có quyền truy cập vào chức năng này");
		}
	}
	
	class TiemVaccineBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new TiemVaccineController();
		}
	}
	
	class SucKhoeBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			mainView.showMessage("Chức năng này chưa hoàn thành");
		}
	}
	
	class KhaiBaoYTeBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			mainView.showMessage("Chức năng này chưa hoàn thành");
		}
	}
	
	class ThongKeBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			mainView.showMessage("Chức năng này chưa hoàn thành");
		}
	}
	
	public static void main(String[] args) {
		new MainController("Trưởng khu");
	}
}
