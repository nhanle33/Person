package Module03_Bai09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Management {
	private ArrayList<Person> listpp;
	private int soLuong;
	
	public Management(int n) {
		listpp=new ArrayList<>(n);
		soLuong=n;
		
	}
	public void Add(Person p) {
		if(listpp.size()<soLuong) {
			listpp.add(p);
			
		}else {
			throw new IllegalAccessError("Danh sach day!!!");
		}
	}
	public void Xoa(String name) {
		for(Person p : listpp) {
			if(p.getHoten().equals(name)) {
				listpp.remove(p);
				return;
			}
			System.out.println("Khong tim thay ten");
			return;
		}
		
	}
	public void SapXep() {
		Collections.sort(listpp,Comparator.comparing(Person::getHoten));
		System.out.println("Sap xep xong");
	}
	public void XuatDanhSach() {
		System.out.printf("Danh sach quan li:\n");
		for(Person P: listpp) {
			System.out.printf("%-20s%n",P.toString());
		}
	}
	
	
	
	
	

}
