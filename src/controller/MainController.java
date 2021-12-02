package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MainView;

public class MainController {
	private MainView mainView = new MainView();
	
	public MainController() {
		mainView.initialize();
		mainView.setActionCachLy(new CachLyBtn());
		mainView.setActionTestCovid(new TestCovidBtn());
		mainView.setActionNhanKhau(new NhanKhauBtn());
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
			new NhanKhauController();
		}
	}
	
	public static void main(String[] args) {
		new MainController();
	}
}
