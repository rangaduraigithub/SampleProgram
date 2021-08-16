package sam;
import java.util.Scanner;
public class MinLength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string length");
		String[] str=new String[s.nextInt()];
		s.nextLine();
		System.out.println("Enter the string");
		for(int i=0;i<str.length;i++){
			str[i]=s.nextLine();
		}
		String min=str[0];
		for(int i=1;i<str.length;i++){
			if(str[i].length()<min.length())
				min=str[i];
				}
				System.out.println(min);
		}
}
