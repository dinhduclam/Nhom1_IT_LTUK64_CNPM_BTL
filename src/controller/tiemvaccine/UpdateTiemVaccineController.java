package controller.tiemvaccine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TiemVaccineModel;
import view.tiemvaccine.UpdateTiemVaccineView;

public class UpdateTiemVaccineController {
	UpdateTiemVaccineView updateTiemVaccineView = new UpdateTiemVaccineView();
	TiemVaccineModel tiemVaccineModel = null;
	
	public UpdateTiemVaccineController(TiemVaccineModel tiemVaccineModel, Object[] data) {
		this.tiemVaccineModel = tiemVaccineModel;
		updateTiemVaccineView.initialize();
		updateTiemVaccineView.setData(data);
		updateTiemVaccineView.setActionSubmitButton(new updateTTTiemVaccine());
	}
	
	class updateTTTiemVaccine implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				Object[] data = {
					updateTiemVaccineView.getHoTen(),
					updateTiemVaccineView.getId(),
					updateTiemVaccineView.getLanTiem(),
					updateTiemVaccineView.getLoaiVaccine(),
					updateTiemVaccineView.getLoVaccine(),
					updateTiemVaccineView.getNgayTiem(),
					updateTiemVaccineView.getDonViTiemChung()
				};
				tiemVaccineModel.update(data);
				updateTiemVaccineView.dispose();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				updateTiemVaccineView.showMessage(e.getMessage());
			}
		}
	}
}
