import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1 and n2");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = n1 + n2;
		if(n3%2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
			
		}
	}
}