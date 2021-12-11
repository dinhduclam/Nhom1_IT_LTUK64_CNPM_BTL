/**
 * 
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;

import controller.cachly.AddCachLyController;
import controller.cachly.UpdateCachLyController;
import model.CachLyModel;
import model.entity.CachLyInfo;
import view.CachLyView;
import view.cach_ly.ViewDetailCachLy;

/**
 * @author Acer
 *
 */
public class CachLyController {
	private CachLyView cachLyView = new CachLyView();
	private CachLyModel cachLyModel = new CachLyModel(cachLyView);
	
	public CachLyController() {
		cachLyView.initialize();
		cachLyView.setActionAddButton(new addBtnAction());
		cachLyView.setActionUpdateButton(new updateBtnAction());
		cachLyView.setActionDeleteButton(new deleteBtnAction());
		cachLyView.setActionViewButton(new viewDetailAction());
		cachLyView.setKeyListenerFind(new findKeyListener());
		try {
			cachLyView.setDataForTable(cachLyModel.getData(cachLyView.getTextToFind()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			cachLyView.showMessage(e.getMessage());
		}
	}
	
	class addBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new AddCachLyController(cachLyModel);
		}
	}
	
	class updateBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				new UpdateCachLyController(cachLyModel, cachLyView.getSelectedInfo());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				cachLyView.showMessage(e.getMessage());
			}
		}
	}
	
	class viewDetailAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				CachLyInfo cachLyInfo = cachLyView.getSelectedInfo();
				ViewDetailCachLy viewDetail = new ViewDetailCachLy();
				viewDetail.initialize();
				viewDetail.setData(cachLyInfo);
			}catch (Exception e){
				cachLyView.showMessage(e.getMessage());
			}
		}
		
	}
	
	class deleteBtnAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				cachLyModel.delete(cachLyView.getSelectedInfo());
				cachLyView.showMessage("Xóa dữ liệu thành công");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				cachLyView.showMessage("Loi databse");
			} catch (Exception e1) {
				// TODO: handle exception
				cachLyView.showMessage(e1.getMessage());
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
				cachLyView.setDataForTable(cachLyModel.getData(cachLyView.getTextToFind()));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				cachLyView.showMessage("Loi databse");
			} catch (Exception e1) {
				// TODO: handle exception
				cachLyView.showMessage(e1.getMessage());
			}
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
