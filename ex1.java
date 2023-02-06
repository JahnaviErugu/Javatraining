import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Negative");
		}
		else if(n>0) {
			System.out.println("Positive");
		}
		else {
			System.out.println("Zero");
		}
		
    
	}

}
