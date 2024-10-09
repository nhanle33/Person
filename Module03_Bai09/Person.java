package Module03_Bai09;

public class Person {
	private String Hoten;
	private String Diachi;
	public Person() {
		this.Hoten="";
		this.Diachi="";
	}
	public Person(String ht, String dc) {
		this.Hoten=ht;
		this.Diachi=dc;
		
	}	
	
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		this.Hoten = hoten;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		this.Diachi = diachi;
	}
	public double TinhDTB() {
		return 0;
	}
	public double TinhLuong() {
		return 0;
	}
	
	
	
	public String toString() {
		return "Họ tên: "+this.Hoten+"\tĐịa chỉ: "+this.Diachi;
	}
	
	
	
	

}
