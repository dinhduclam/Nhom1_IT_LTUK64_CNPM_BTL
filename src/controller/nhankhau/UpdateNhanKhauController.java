package controller.nhankhau;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import model.NhanKhauModel;
import view.nhankhau.UpdateNhanKhauView;

public class UpdateNhanKhauController {
	UpdateNhanKhauView updateNhanKhauView = new UpdateNhanKhauView();
	NhanKhauModel nhanKhauModel = null;
	
	public UpdateNhanKhauController(NhanKhauModel nhanKhauModel, Object[] data) {
		this.nhanKhauModel = nhanKhauModel;
		updateNhanKhauView.initialize();
		updateNhanKhauView.setData(data);
		updateNhanKhauView.setActionSubmitButton(new updateTTNhanKhau());
	}
	
	class updateTTNhanKhau implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				String name = updateNhanKhauView.getHoTen();
				String id = updateNhanKhauView.getId();
				String sex = updateNhanKhauView.getGioiTinh();
				Date ngaySinh = updateNhanKhauView.getNgaySinh();
				String phoneNumber = updateNhanKhauView.getSoDienThoai();
				String bhyt = updateNhanKhauView.getSoBHYT();
				String email = updateNhanKhauView.getEmail();
				String nation = updateNhanKhauView.getQuocTich();
				String stay = updateNhanKhauView.getThuongTruTamTru();
				Object[] data = {name, id, sex, ngaySinh, phoneNumber, bhyt, email, nation, stay};
				nhanKhauModel.update(data);
				updateNhanKhauView.dispose();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				updateNhanKhauView.showMessage(e.getMessage());
			}
		}
	}
}
