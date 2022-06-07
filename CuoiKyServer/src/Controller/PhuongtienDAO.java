package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.PhuongTien;

public class PhuongtienDAO {


	public static ArrayList<PhuongTien> getData() {

		ArrayList<PhuongTien> list = new ArrayList<>();

		try {
			Connection connection = Service.ConnectDB.getconnection(); 
			Statement statement;
			String sql = "Select * from phuongtien";
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				PhuongTien phuongtien = new PhuongTien(rs.getInt("ID"), rs.getString("phuongtien"),
						rs.getString("bienso"), rs.getString("ngaydangki"), rs.getString("nhanhieu"),
						rs.getString("dungtichsilanh"), rs.getString("sochongoi"), rs.getString("tenchusohuu"),
						rs.getString("ngaysinh"), rs.getString("noicutru"), rs.getString("Cccd"),
						rs.getString("sodienthoai"), rs.getInt("thang"));
				list.add(phuongtien);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	public static void insertData(PhuongTien pt) {
		Connection connection = Service.ConnectDB.getconnection();

		String sql = "Insert into PHUONGTIEN(id, phuongtien, bienso, ngaydangki, nhanhieu,dungtichsilanh,sochongoi, tenchusohuu,ngaysinh, noicutru,Cccd, sodienthoai,thang) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, pt.getID());
			preparedStatement.setString(2, pt.getPhuongtien());
			preparedStatement.setString(3, pt.getBienSo());
			preparedStatement.setString(4, pt.getNgayDangKi());
			preparedStatement.setString(5, pt.getNhanHieu());
			preparedStatement.setString(6, pt.getDungTichSiLanh());
			preparedStatement.setString(7, pt.getSochongoi());
			preparedStatement.setString(8, pt.gethovaten());
			preparedStatement.setString(9, pt.getNgaysinh());
			preparedStatement.setString(10, pt.getnoicutru());
			preparedStatement.setString(11, pt.getCccd());
			preparedStatement.setString(12, pt.getSodienthoai());
			preparedStatement.setInt(13, pt.getThang());
			if (preparedStatement.executeUpdate() > 0) {
				System.out.println("add thanh cong");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void Delete(PhuongTien pt) {
		String sql = "Delete from Phuongtien where ID = '" + pt.getID() + "'";
		try {
			Connection connection = Service.ConnectDB.getconnection();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void Update(PhuongTien pt) {
		Connection connection = Service.ConnectDB.getconnection();
		String sql = "Update PHUONGTIEN set id=?, phuongtien=?, bienso=?, ngaydangki=?,"
				+ " nhanhieu=?, dungtichsilanh=?,sochongoi=?, tenchusohuu=?, ngaysinh=?, noicutru=?, cccd=?,sodienthoai=?, thang = ?  where ID = '"
				+ pt.getID() + "'";
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, pt.getID());
			preparedStatement.setString(2, pt.getPhuongtien());
			preparedStatement.setString(3, pt.getBienSo());
			preparedStatement.setString(4, pt.getNgayDangKi());
			preparedStatement.setString(5, pt.getNhanHieu());
			preparedStatement.setString(6, pt.getDungTichSiLanh());
			preparedStatement.setString(7, pt.getSochongoi());
			preparedStatement.setString(8, pt.gethovaten());
			preparedStatement.setString(9, pt.getNgaysinh());
			preparedStatement.setString(10, pt.getnoicutru());
			preparedStatement.setString(11, pt.getCccd());
			preparedStatement.setString(12, pt.getSodienthoai());
			preparedStatement.setInt(13, pt.getThang());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	
	public static ArrayList<PhuongTien> findID(String id) {
		
		ArrayList<PhuongTien> phuongtien = new ArrayList<>();
		
		try {

			{
			
				String sql = "select * from PHUONGTIEN where id like '%" + id +"%'" ; 
				Connection connection = Service.ConnectDB.getconnection();
				Statement statement;
				statement = connection.createStatement();
				ResultSet rs = statement.executeQuery(sql);

				while (rs.next()) {
					PhuongTien s4 = new PhuongTien();
					s4.setID(rs.getInt("ID"));
					s4.setPhuongtien(rs.getString("Phuongtien"));
					s4.setBienSo(rs.getString("bienso"));
					s4.setNgayDangKi(rs.getString("ngaydangki"));
					s4.setNhanHieu(rs.getString("nhanhieu"));
					s4.setDungTichSiLanh(rs.getString("dungtichsilanh"));
					s4.setSochongoi(rs.getString("sochongoi"));
					s4.sethovaten(rs.getString("tenchusohuu"));
					s4.setNgaysinh(rs.getString("ngaysinh"));
					s4.setnoicutru(rs.getString("noicutru"));
					s4.setCccd(rs.getString("Cccd"));
					s4.setSodienthoai(rs.getString("sodienthoai"));
					s4.setThang(rs.getInt("thang"));
					phuongtien.add(s4);
					
					
				}
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return phuongtien;
	}
	}

