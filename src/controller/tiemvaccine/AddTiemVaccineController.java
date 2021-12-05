package controller.tiemvaccine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TiemVaccineModel;
import view.tiemvaccine.AddTiemVaccineView;

public class AddTiemVaccineController {
	AddTiemVaccineView addTiemVaccineView = new AddTiemVaccineView();
	TiemVaccineModel tiemVaccineModel = null;
	
	public AddTiemVaccineController(TiemVaccineModel tiemVaccineModel) {
		this.tiemVaccineModel = tiemVaccineModel;
		addTiemVaccineView.initialize();
		addTiemVaccineView.setActionSubmitButton(new addTTTiemVaccine());
	}
	
	class addTTTiemVaccine implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				Object[] data = {
					addTiemVaccineView.getHoTen(),
					addTiemVaccineView.getId(),
					addTiemVaccineView.getLanTiem(),
					addTiemVaccineView.getLoaiVaccine(),
					addTiemVaccineView.getLoVaccine(),
					addTiemVaccineView.getNgayTiem(),
					addTiemVaccineView.getDonViTiemChung()
				};
				tiemVaccineModel.insert(data);
				addTiemVaccineView.clear();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				addTiemVaccineView.showMessage(e.getMessage());
			}
		}	
	}
	
}
