package controller.testcovid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TestCovidModel;
import view.testcovid.AddTestCovidView;

public class AddTestCovidController {
	AddTestCovidView addTestCovidView = new AddTestCovidView();
	TestCovidModel testCovidModel = null;
	
	public AddTestCovidController(TestCovidModel testCovidModel) {
		this.testCovidModel = testCovidModel;
		addTestCovidView.initialize();
		addTestCovidView.setActionSubmitButton(new addTTTestCovid());
	}
	
	class addTTTestCovid implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				//HoTen	Id	KetQua	LoaiTest NgayTest
				Object[] data = {
					addTestCovidView.getHoTen(),
					addTestCovidView.getId(),
					addTestCovidView.getKetQua(),
					addTestCovidView.getLoaiTest(),
					addTestCovidView.getNgayTest()
				};
				testCovidModel.insert(data);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				addTestCovidView.showMessage(e.getMessage());
			}
		}	
	}
	
}

