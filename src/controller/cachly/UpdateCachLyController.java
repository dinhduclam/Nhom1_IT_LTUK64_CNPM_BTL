package controller.cachly;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import model.CachLyModel;
import view.cach_ly.UpdateCachLyView;

public class UpdateCachLyController {
	UpdateCachLyView updateCachLyView = new UpdateCachLyView();
	CachLyModel cachLyModel = null;
	
	public UpdateCachLyController(CachLyModel cachLyModel, Object[] data) {
		this.cachLyModel = cachLyModel;
		updateCachLyView.initialize();
		updateCachLyView.setData(data);
		updateCachLyView.setActionSubmitButton(new updateTTCachLy());
	}
	
	class updateTTCachLy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				Object[] data = {
					updateCachLyView.getHoTen(),
					updateCachLyView.getId(),
					updateCachLyView.getNgayBatDau(),
					updateCachLyView.getMucDoCachLy(),
					updateCachLyView.getDiaChiCachLy()
				};
				cachLyModel.update(data);
				updateCachLyView.dispose();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				updateCachLyView.showMessage(e.getMessage());
			}
		}
	}
}
