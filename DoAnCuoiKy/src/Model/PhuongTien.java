package Model;

public class PhuongTien extends Chuphuongtien {
	private String phuongtien;
	private String BienSo;
	private String NgayDangKi;
	private String NhanHieu;
	private String DungTichSiLanh;
	private String sochongoi;
	private int thang;
	


	public PhuongTien() {

	}

	public PhuongTien(int ID, String phuongtien, String bienSo, String ngayDangKi, String nhanHieu,
			String dungTichSiLanh, String sochongoi, String hovaten, String ngaysinh, String noicutru, String Cccd,
			String sodienthoai, int thang) {
		super(ID, hovaten, sodienthoai, Cccd, ngaysinh, noicutru);

		this.phuongtien = phuongtien;
		BienSo = bienSo;
		NgayDangKi = ngayDangKi;
		NhanHieu = nhanHieu;
		DungTichSiLanh = dungTichSiLanh;
		this.sochongoi = sochongoi;
		this.thang=thang;
	}

	public String getPhuongtien() {
		return phuongtien;
	}

	public void setPhuongtien(String phuongtien) {
		this.phuongtien = phuongtien;
	}

	public String getBienSo() {
		return BienSo;
	}

	public void setBienSo(String bienSo) {
		BienSo = bienSo;
	}

	public String getNgayDangKi() {
		return NgayDangKi;
	}

	public void setNgayDangKi(String ngayDangKi) {
		NgayDangKi = ngayDangKi;
	}

	public String getNhanHieu() {
		return NhanHieu;
	}

	public void setNhanHieu(String nhanHieu) {
		NhanHieu = nhanHieu;
	}

	public String getDungTichSiLanh() {
		return DungTichSiLanh;
	}

	public void setDungTichSiLanh(String dungTichSiLanh) {
		DungTichSiLanh = dungTichSiLanh;
	}

	public String getSochongoi() {
		return sochongoi;
	}

	public void setSochongoi(String sochongoi) {
		this.sochongoi = sochongoi;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}
	
	

}
