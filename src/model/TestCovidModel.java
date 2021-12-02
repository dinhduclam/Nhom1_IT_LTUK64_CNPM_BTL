package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import controller.TestCovidController;
import view.TestCovidView;

public class TestCovidModel {
	TestCovidView testCovidView = null; 
	private final String databaseName = "ql_test_covid";
	private final String insertSQL = "INSERT INTO " + databaseName + " VALUE (?, ?, ?, ?, ?)"; 
	private final String updateSQL = "UPDATE " + databaseName + " SET KetQua = ?, LoaiTest = ?, NgayTest = ? WHERE Id = ?";
	private final String selectAllSQL = "SELECT * FROM " + databaseName;
	private final String deleteSQL = "DELETE FROM " + databaseName + " WHERE Id = ?";
	
	public TestCovidModel(TestCovidView testCovidView) {
		this.testCovidView = testCovidView;
	}
	
	public void insert(Object[] data) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(insertSQL);
		//HoTen	Id	KetQua	LoaiTest	NgayTest	
		stmt.setString(1, (String) data[0]);
		stmt.setString(2, (String) data[1]);
		stmt.setString(3, (String) data[2]);
		stmt.setString(4, (String) data[3]);
		stmt.setDate(5, (Date) data[4]);
		
		String name = NhanKhauModel.getHoTen((String)data[1]);
		if (!name.equals(""))
			if (!data[0].equals(name)) throw new SQLException("Nhân khẩu có mã CCCD = " + data[1] + " tên là " + name);
		
		try {
			stmt.execute();
		} catch (SQLIntegrityConstraintViolationException e) {
			// TODO: handle exception
			throw new SQLException("Không tồn tại nhân khẩu có CCCD là " + data[1] + " trong dữ liệu nhân khẩu");
		}
		
		con.close();
		testCovidView.setDataForTable(TestCovidController.colName, getData(testCovidView.getTextToFind()));
	}
	
	public void update(Object[] data) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(updateSQL);
//		HoTen	Id	KetQua	LoaiTest	NgayTest	
		
		stmt.setString(4, (String) data[1]);
		stmt.setString(1, (String) data[2]);
		stmt.setString(2, (String) data[3]);
		stmt.setDate(3, (Date) data[4]);
		stmt.execute();
		con.close();
		testCovidView.setDataForTable(TestCovidController.colName, getData(testCovidView.getTextToFind()));
	}
	
	public void delete(String id) throws SQLException {
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(deleteSQL);
		stmt.setString(1, id);
		stmt.execute();
		con.close();
		testCovidView.setDataForTable(TestCovidController.colName, getData(testCovidView.getTextToFind()));
	}
	
	public ArrayList<Object[]> getData(String condition) throws SQLException{
		String query = selectAllSQL;
		if (!condition.equals("")) query = selectAllSQL + " WHERE Id LIKE ? OR HoTen LIKE ?";
		
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(query);
//		HoTen	Id	NgayBatDau	MucDoTestCovid	DiaChiTestCovid
		if (!condition.equals("")) {
			condition = "%" + condition + "%";
			stmt.setString(1, condition);
			stmt.setString(2, condition);
		}
		ResultSet rs = stmt.executeQuery();
		ArrayList<Object[]> data = new ArrayList<>();
		while (rs.next()) {
//			HoTen	Id	KetQua	LoaiTest	NgayTest	
			Object[] row = {
				rs.getString("HoTen"),
				rs.getString("Id"),
				rs.getString("KetQua"),
				rs.getString("LoaiTest"),
				rs.getDate("NgayTest")
			};
			
			data.add(row);
		}
		con.close();
		return data;
	}
	

}
