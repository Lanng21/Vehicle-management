package Model;

public class Chuphuongtien {
	private int ID;
	private String hovaten;
	private String sodienthoai;
	private String Cccd;
	private String ngaysinh;
	private String noicutru;

	public Chuphuongtien() {
	}

	public Chuphuongtien(int ID, String hovaten, String sodienthoai, String cccd, String ngaysinh, String noicutru) {

		this.ID = ID;
		this.hovaten = hovaten;
		this.sodienthoai = sodienthoai;
		this.Cccd = cccd;
		this.ngaysinh = ngaysinh;
		this.noicutru = noicutru;
	}

	public String gethovaten() {
		return hovaten;
	}

	public void sethovaten(String ten) {
		this.hovaten = ten;
	}

	public String getSodienthoai() {
		return sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	public String getCccd() {
		return Cccd;
	}

	public void setCccd(String cccd) {
		this.Cccd = cccd;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getnoicutru() {
		return noicutru;
	}

	public void setnoicutru(String chocutru) {
		this.noicutru = chocutru;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}
