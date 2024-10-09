package Module03_Bai09;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Management management=new Management(10);
		int choice;
		do {
			System.out.println("\nMenu");
			System.out.println("1. Thêm một học sinh");
			System.out.println("2. Thêm một nhân viên");
			System.out.println("3. Thêm một khách hàng");
			System.out.println("4. Xóa một người");
			System.out.println("5. Hiển thị danh sách");
			System.out.println("6. Sắp xếp danh sách");
			System.out.println("0. Kết thúc");	
			System.out.print("Nhap lua chon");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 1:
					System.out.print("Nhập họ tên học sinh:");
					String hoten= scanner.nextLine();
					System.out.print("Nhập địa chỉ:");
					String diachi=scanner.nextLine();
					System.out.print("Nhập điểm môn học 1:");
					double diemmh1=scanner.nextDouble();
					System.out.print("Nhập điểm môn học 2:");
					double diemmh2=scanner.nextDouble();
					management.Add(new Student(hoten,diachi,diemmh1, diemmh2));
					break;	
				case 2:
					
					
			}
		}
		
	}

}
