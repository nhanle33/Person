package Module03_Bai09;

public class Customer extends Person {
	private String tenCongTy;
	private double TriGia;
	private String DanhGia;
	public Customer() {
		super();
		tenCongTy="";
		TriGia=0;
		DanhGia="";
	}
	public Customer(String ht, String dc,String tct,double tg,String dg) {
		super(ht,dc);
		setTenCongTy(tct);
		setTriGia(tg);
		setDanhGia(dg);
	}
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public double getTriGia() {
		return TriGia;
	}
	public void setTriGia(double triGia) {
		TriGia = triGia;
	}
	public String getDanhGia() {
		return DanhGia;
	}
	public void setDanhGia(String danhGia) {
		DanhGia = danhGia;
	}
	public String toString() {
		return super.toString()+"\tTên công ty:"+this.tenCongTy+"\tTrị giá:"+this.TriGia+"\tĐánh giá:"+this.DanhGia+"\n";
	}
	
	
	

}
