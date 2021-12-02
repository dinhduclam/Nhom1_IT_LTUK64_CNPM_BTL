package controller.testcovid;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.TestCovidModel;
import view.testcovid.UpdateTestCovidView;

public class UpdateTestCovidController {
	UpdateTestCovidView updateTestCovidView = new UpdateTestCovidView();
	TestCovidModel testCovidModel = null;
	
	public UpdateTestCovidController(TestCovidModel testCovidModel, Object[] data) {
		this.testCovidModel = testCovidModel;
		updateTestCovidView.initialize();
		updateTestCovidView.setData(data);
		updateTestCovidView.setActionSubmitButton(new updateTTTestCovid());
	}
	
	class updateTTTestCovid implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				Object[] data = {
					updateTestCovidView.getHoTen(),
					updateTestCovidView.getId(),
					updateTestCovidView.getKetQua(),
					updateTestCovidView.getLoaiTest(),
					updateTestCovidView.getNgayTest()
				};
				testCovidModel.update(data);
				updateTestCovidView.dispose();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				updateTestCovidView.showMessage(e.getMessage());
			}
		}
	}
}
