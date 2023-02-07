import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res1 = num1 % 10;
		int res2 = num2 % 10;
		int sum = res1+res2;
		System.out.println("Sum of last digits:"+sum);

	}

}
