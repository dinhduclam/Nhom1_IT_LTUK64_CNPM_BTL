package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import controller.TiemVaccineController;
import view.TiemVaccineView;

public class TiemVaccineModel {
	TiemVaccineView tiemVaccineView = null; 
	private final String databaseName = "ql_tiem_vaccine";
	private final String insertSQL = "INSERT INTO " + databaseName + " VALUE (?, ?, ?, ?, ?, ?, ?)"; 
	private final String updateSQL = "UPDATE " + databaseName + " SET LoaiVaccine = ?, LoVaccine = ?, NgayTiem = ?, DonViTiemChung = ? WHERE Id = ? AND LanTiem = ?";
	private final String selectAllSQL = "SELECT * FROM " + databaseName;
	private final String deleteSQL = "DELETE FROM " + databaseName + " WHERE Id = ? AND LanTiem = ?";
//	HoTen	Id	LanTiem	LoaiVaccine	LoVaccine	NgayTiem	DonViTiemChung	
	public TiemVaccineModel(TiemVaccineView tiemVaccineView) {
		this.tiemVaccineView = tiemVaccineView;
	}
	
	public void insert(Object[] data) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(insertSQL);
//		HoTen	Id	LanTiem	LoaiVaccine	LoVaccine	NgayTiem	DonViTiemChung
		stmt.setString(1, (String) data[0]);
		stmt.setString(2, (String) data[1]);
		stmt.setInt(3, (int) data[2]);
		stmt.setString(4, (String) data[3]);
		stmt.setString(5, (String) data[4]);
		stmt.setDate(6, (Date) data[5]);
		stmt.setString(7, (String) data[6]);
		
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
		tiemVaccineView.setDataForTable(TiemVaccineController.colName, getData(tiemVaccineView.getTextToFind()));
	}
	
	public void update(Object[] data) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(updateSQL);
//		HoTen	Id	LanTiem	LoaiVaccine	LoVaccine	NgayTiem	DonViTiemChung
		stmt.setString(1, (String) data[3]);
		stmt.setString(2, (String) data[4]);
		stmt.setDate(3, (Date) data[5]);
		stmt.setString(4, (String) data[6]);
		stmt.setString(5, (String) data[1]);
		stmt.setInt(6, (int) data[2]);
		stmt.execute();
		con.close();
		tiemVaccineView.setDataForTable(TiemVaccineController.colName, getData(tiemVaccineView.getTextToFind()));
	}
	
	public void delete(Object data[]) throws SQLException {
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(deleteSQL);
		stmt.setString(1, (String) data[1]);
		stmt.setInt(2, (int) data[2]);
		stmt.execute();
		con.close();
		tiemVaccineView.setDataForTable(TiemVaccineController.colName, getData(tiemVaccineView.getTextToFind()));
	}
	
	public ArrayList<Object[]> getData(String condition) throws SQLException{
		String query = selectAllSQL;
		if (!condition.equals("")) query = selectAllSQL + " WHERE Id LIKE ? OR HoTen LIKE ?";
		
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(query);
//		HoTen	Id	LanTiem	LoaiVaccine	LoVaccine	NgayTiem	DonViTiemChung
		if (!condition.equals("")) {
			condition = "%" + condition + "%";
			stmt.setString(1, condition);
			stmt.setString(2, condition);
		}
		ResultSet rs = stmt.executeQuery();
		ArrayList<Object[]> data = new ArrayList<>();
		while (rs.next()) {
			Object[] row = {
				rs.getString("HoTen"),
				rs.getString("Id"),
				rs.getInt("LanTiem"),
				rs.getString("LoaiVaccine"),
				rs.getString("LoVaccine"),
				rs.getDate("NgayTiem"),
				rs.getString("DonViTiemChung")
			};
			data.add(row);
		}
		con.close();
		return data;
	}
}
