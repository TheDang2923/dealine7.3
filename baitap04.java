//import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class baitap04 {
		public static void main(String[] args) {	
		int n;
		String ten;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ten ");
		ten = sc.next();
		System.out.println("nhap nam sinh ");
		n = sc.nextInt();
		int currentYear = Year.now().getValue();
		
		int age = currentYear - n;
		
		if(age < 16) {
			System.out.println("Bạn " + ten +" ở độ tuổi vị thành niên");
		} else if (age >=16 && age < 18) {
			System.out.println("Bạn " + ten +" ở độ tuổi trưởng thành");
		} else  {
			System.out.println("Bạn " + ten +" đã già");
		}
}
}