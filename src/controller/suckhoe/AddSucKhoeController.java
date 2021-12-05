package controller.suckhoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.SucKhoeModel;
import view.suckhoe.AddSucKhoeView;

public class AddSucKhoeController {
	AddSucKhoeView addSucKhoeView = new AddSucKhoeView();
	SucKhoeModel sucKhoeModel = null;
	
	public AddSucKhoeController(SucKhoeModel sucKhoeModel) {
		this.sucKhoeModel = sucKhoeModel;
		addSucKhoeView.initialize();
		addSucKhoeView.setActionSubmitButton(new addTTSucKhoe());
	}
	
	class addTTSucKhoe implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				//HoTen	Id	KetQua	LoaiTest NgayTest
				Object[] data = {
					addSucKhoeView.getHoTen(),
					addSucKhoeView.getId(),
					addSucKhoeView.getHo(),
					addSucKhoeView.getSot(),
					addSucKhoeView.getKhoTho(),
					addSucKhoeView.getDauNguoi(),
					addSucKhoeView.getMatViGiac(),
					addSucKhoeView.getBuonNon(),
					addSucKhoeView.gettrieuChungKhac()
				};
				sucKhoeModel.insert(data);
				addSucKhoeView.clear();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				addSucKhoeView.showMessage(e.getMessage());
			}
		}	
	}
	
}

