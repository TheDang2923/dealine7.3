import java.util.Iterator;
import java.util.Scanner;

public class baitap2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("nhap vào số a:");
		a = sc.nextInt();
		String ketqua = (a % 2 == 0) ? "a la so chan" : "a la sao le";
		System.out.println(a + " là số:" + ketqua);

	}

}
