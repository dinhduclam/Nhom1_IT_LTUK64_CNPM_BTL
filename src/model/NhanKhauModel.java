package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.NhanKhauController;
import view.NhanKhauView;

public class NhanKhauModel {
	
	private NhanKhauView nhanKhauView = null; 
	private final static String databaseName = "ql_nhan_khau";
	// HoTen Id	GioiTinh NgaySinh SoDienThoai SoTheBHYT Email QuocTich ThuongTruTamTru	
	private final String insertSQL = "INSERT INTO " + databaseName + " VALUE (?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
	private final String updateSQL = "UPDATE " + databaseName + " SET HoTen = ?, GioiTinh = ?, NgaySinh = ?, SoDienThoai = ?, SoTheBHYT = ?, Email = ?, QuocTich = ?, ThuongTruTamTru = ? WHERE Id = ?";
	private final String selectAllSQL = "SELECT * FROM " + databaseName;
	private final String deleteSQL = "DELETE FROM " + databaseName + " WHERE Id = ?";
	
	public NhanKhauModel(NhanKhauView nhanKhauView) {
		this.nhanKhauView = nhanKhauView;
	}
	
	public void insert(Object[] data) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(insertSQL);
		// HoTen Id	GioiTinh NgaySinh SoDienThoai SoTheBHYT Email QuocTich ThuongTruTamTru
		stmt.setString(1, (String) data[0]);
		stmt.setString(2, (String) data[1]);
		stmt.setString(3, (String) data[2]);
		stmt.setDate(4, (Date) data[3]);
		stmt.setString(5, (String) data[4]);
		stmt.setString(6, (String) data[5]);
		stmt.setString(7, (String) data[6]);
		stmt.setString(8, (String) data[7]);
		stmt.setString(9, (String) data[8]);
		try {
			stmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
			throw new SQLException("Đã tồn tại nhân khẩu có CCCD là " + data[1]);
		}
		con.close();
		nhanKhauView.setDataForTable(NhanKhauController.colName, getData(nhanKhauView.getTextToFind()));
	}
	
	public void update(Object[] data) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(updateSQL);
		// HoTen Id	GioiTinh NgaySinh SoDienThoai SoTheBHYT Email QuocTich ThuongTruTamTru
		stmt.setString(1, (String) data[0]);
		stmt.setString(9, (String) data[1]);
		stmt.setString(2, (String) data[2]);
		stmt.setDate(3, (Date) data[3]);
		stmt.setString(4, (String) data[4]);
		stmt.setString(5, (String) data[5]);
		stmt.setString(6, (String) data[6]);
		stmt.setString(7, (String) data[7]);
		stmt.setString(8, (String) data[8]);
		stmt.execute();
		con.close();
		nhanKhauView.setDataForTable(NhanKhauController.colName, getData(nhanKhauView.getTextToFind()));
	}
	
	public void delete(String id) throws SQLException {
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(deleteSQL);
		stmt.setString(1, id);
		stmt.execute();
		con.close();
		nhanKhauView.setDataForTable(NhanKhauController.colName, getData(nhanKhauView.getTextToFind()));
	}
	
	public ArrayList<Object[]> getData(String condition) throws SQLException{
		String query = selectAllSQL;
		if (!condition.equals("")) query = selectAllSQL + " WHERE Id LIKE ? OR HoTen LIKE ?";
		
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement(query);
		if (!condition.equals("")) {
			condition = "%" + condition + "%";
			stmt.setString(1, condition);
			stmt.setString(2, condition);
		}
		ResultSet rs = stmt.executeQuery();
		ArrayList<Object[]> data = new ArrayList<>();
		while (rs.next()) {
			// HoTen Id	GioiTinh NgaySinh SoDienThoai SoTheBHYT Email QuocTich ThuongTruTamTru
			Object[] row = {				
					rs.getString("HoTen"),
					rs.getString("Id"),
					rs.getString("GioiTinh"),
					rs.getDate("NgaySinh"),
					rs.getString("SoDienThoai"),
					rs.getString("SoTheBHYT"),
					rs.getString("Email"),
					rs.getString("QuocTich"),
					rs.getString("ThuongTruTamTru")
			};
			
			data.add(row);
		}
		con.close();
		return data;
	}
	
	public static String getHoTen(String id) throws SQLException{
		Connection con = SQLConnector.getCon();
		PreparedStatement stmt = con.prepareStatement("SELECT HoTen FROM " + databaseName + " WHERE Id = ?");
		stmt.setString(1, id);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) return rs.getString("HoTen");
		return "";
	}

}
