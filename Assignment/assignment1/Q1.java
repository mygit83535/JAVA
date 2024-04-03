import java.util.Scanner;

public class NumberConversion {

	public static void main(String[] args) {
		int num1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number - ");
		num1 = sc.nextInt();
		
		System.out.println("Given number - "+num1);
		System.out.println("Binary Equivalent - "+Integer.toBinaryString(num1));
		System.out.println("Hexadecimal Equivalent - "+Integer.toHexString(num1));
		System.out.println("Octal Equivalent - "+Integer.toOctalString(num1));
		
		

	}
	

}
