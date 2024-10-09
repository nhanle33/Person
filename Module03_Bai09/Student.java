package Module03_Bai09;

public class Student extends Person {
	private double DiemMH1;
	private double DiemMH2;
	
	public Student() {
		super();
		this.DiemMH1=0;
		this.DiemMH2=0;
	}
	public Student(String ht, String dc,double dmh1, double dmh2) {
		super(ht,dc);
		setDiemMH1(dmh1);
		setDiemMH2(dmh2);
	}

	public double getDiemMH1() {
		return DiemMH1;
	}

	public void setDiemMH1(double diemMH1) {
		if(diemMH1<0) {
			throw new IllegalAccessError("Điểm môn học 1 sai");
		}else {
			this.DiemMH1=diemMH1;
		}
	}

	public double getDiemMH2() {
		return DiemMH2;
	}

	public void setDiemMH2(double diemMH2) {
		if(diemMH2<0)
			throw new IllegalAccessError("Điểm môn học 2 sai");
		this.DiemMH2=diemMH2;
		
	}
	
	public double TinhDTB() {
		return (DiemMH1+DiemMH2)/2;
	}
	public String Danhgia() {
		if(TinhDTB()>=4 && TinhDTB()<=5) {
			return "Yếu";
		}else if(TinhDTB()>5 && TinhDTB()<=7) {
			return "Trung bình";
		}else if(TinhDTB()>7 && TinhDTB()<=8) {
			return "Khá";
		}else if(TinhDTB()>8 && TinhDTB()<=9) {
			return "Giỏi";
		}else {
			return "Xuất sắc";
			
		}
			
		
	}
	@Override
	public String toString() {
		return super.toString()+"\tĐiểm môn học 1: "+this.DiemMH1+
				"\tĐiểm môn học 2: "+this.DiemMH2+"\tĐiểm trung bình: "+TinhDTB()+"\t"+Danhgia()+"\n";
	}
	
	

	
	
	
}
