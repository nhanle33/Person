package Module03_Bai09;

public class Employee extends Person {
	private double LuongCoSo;
	private double HeSoluong;
	
	public Employee() {
		super();
		this.LuongCoSo=0;
		this.HeSoluong=0;
	}
	public Employee(String ht, String dc,double lcs, double hsl) {
		super(ht,dc);
		this.LuongCoSo=lcs;
		this.HeSoluong=hsl;
		
	}
	public double getLuongCoSo() {
		return LuongCoSo;
	}
	public void setLuongCoSo(double luongCoSo) {
		this.LuongCoSo = luongCoSo;
	}
	public double getHeSoluong() {
		return HeSoluong;
	}
	public void setHeSoluong(double heSoluong) {
		this.HeSoluong = heSoluong;
	}
	public double TinhLuong() {
		return HeSoluong*LuongCoSo;
	}
	
	public String DanhGia() {
		if(TinhLuong()>10000000) {
			return "Nhân viên xuất sắc";
		}else {
			return "Nhân viên hoàn thành kpi";
		}
	}
	public String toString() {
		return super.toString()+"\tHệ số lương: "+this.HeSoluong+"\tTiền lương:"+TinhLuong()+"\t"+DanhGia()+"\n";
	}
	

	

	

}
