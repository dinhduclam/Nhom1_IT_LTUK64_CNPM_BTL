package controller.nhankhau;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

import model.NhanKhauModel;
import view.nhankhau.AddNhanKhauView;

public class AddNhanKhauController {
	AddNhanKhauView addNhanKhauView = new AddNhanKhauView();
	NhanKhauModel nhanKhauModel = null;
	
	public AddNhanKhauController(NhanKhauModel nhanKhauModel) {
		this.nhanKhauModel = nhanKhauModel;
		addNhanKhauView.initialize();
		addNhanKhauView.setActionSubmitButton(new addTTCachLy());
	}
	
	class addTTCachLy implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				//HoTen Id	GioiTinh NgaySinh SoDienThoai SoTheBHYT Email QuocTich ThuongTruTamTru
				String name = addNhanKhauView.getHoTen();
				String id = addNhanKhauView.getId();
				String sex = addNhanKhauView.getGioiTinh();
				Date ngaySinh = addNhanKhauView.getNgaySinh();
				String phoneNumber = addNhanKhauView.getSoDienThoai();
				String bhyt = addNhanKhauView.getSoBHYT();
				String email = addNhanKhauView.getEmail();
				String nation = addNhanKhauView.getQuocTich();
				String stay = addNhanKhauView.getThuongTruTamTru();
				Object[] data = {name, id, sex, ngaySinh, phoneNumber, bhyt, email, nation, stay};
				nhanKhauModel.insert(data);
				addNhanKhauView.clear();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				addNhanKhauView.showMessage(e.getMessage());
			}
		}	
	}
	
}
