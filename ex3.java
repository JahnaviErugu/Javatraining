import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		int num = sc.nextInt();
		int res = num % 10;
		System.out.println("Last digit:"+res);
	}

}
