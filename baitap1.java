import java.util.Scanner;

public class baitap1 {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so a:");
		a = sc.nextInt();
		System.out.println("nhap vao so b:");
		b = sc.nextInt();
		System.out.println("tong hai so: " + a+ "+" +b+ "=" +(a+b) );
		System.out.println("thuong hai so: " + a+ "/" +b+ "=" +(a/b) );
		System.out.println("tich hai so: " + a+ "*" +b+ "=" +(a*b) );
		System.out.println("hieu hai so: " + a+ "-" +b+ "=" +(a-b) );
		System.out.println("thuong du cua hai so: " + a+ "/" +b+ "=" +(a%b) );
	    System.out.println("---------");
		System.out.println(a +" == "+b +" : "+ (a==b));
		System.out.println(a +" != "+b +" : "+ (a!=b));
		System.out.println(a +" >= "+b +" : "+ (a<=b));
		System.out.println(a +" >= "+b +" : "+ (a>=b));
		}
}
