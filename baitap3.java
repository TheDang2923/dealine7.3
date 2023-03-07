import java.util.Scanner;

public class baitap3 {
	public static void main(String[] args) {	
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap so nguyen tu 1 đến 12: ");
	n = sc.nextInt();

	switch (n) {
		case (n>2): {
			System.out.println("Tháng 1 ");
			break;
		}
		case 15: {
			System.out.println("Tháng 2");
			break;
		}
		case 3: {
			System.out.println("tháng 3");
			break;
		}
		case 4: {
			System.out.println("tháng 4");
			break;
		}
		case 5: {
			System.out.println("tháng 5");
			break;
		}
		case 6: {
			System.out.println("tháng 6");
			break;
		}
		case 7: {
			System.out.println("tháng 7");
			break;
		}
		case 8: {
			System.out.println("tháng 8");
			break;
		}
		case 9: {
			System.out.println("tháng 9");
			break;
		}
		case 10: {
			System.out.println("tháng 10");
			break;
		}
		case 11: {
			System.out.println("tháng 11");
			break;
		}
		case 12: {
			System.out.println("tháng 12");
			break;
		}
		default:
			System.out.println("Nhap du lieu sai");
		}
	}
}