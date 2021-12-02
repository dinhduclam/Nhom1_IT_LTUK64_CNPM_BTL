package controller.cachly;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import model.CachLyModel;
import view.cach_ly.AddCachLyView;

public class AddCachLyController {
	AddCachLyView addCachLyView = new AddCachLyView();
	CachLyModel cachLyModel = null;
	
	public AddCachLyController(CachLyModel cachLyModel) {
		this.cachLyModel = cachLyModel;
		addCachLyView.initialize();
		addCachLyView.setActionSubmitButton(new addTTCachLy());
	}
	
	class addTTCachLy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				Object[] data = {
					addCachLyView.getHoTen(),
					addCachLyView.getId(),
					addCachLyView.getNgayBatDau(),
					addCachLyView.getMucDoCachLy(),
					addCachLyView.getDiaChiCachLy()
				};
				cachLyModel.insert(data);
				addCachLyView.clear();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				addCachLyView.showMessage(e.getMessage());
			}
		}	
	}
	
}
