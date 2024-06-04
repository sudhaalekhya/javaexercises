package operators;
import java.util.Scanner;
public class ArithOpEx {
public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.out.println("Add:"+c);
        c=a-b;
        System.out.println("Sub:"+c);
        c=a*b;
        System.out.println("Mul:"+c);
        c=a/b;
        System.out.println("Div:"+c);
        c=a%b;
        System.out.println("Mod:"+c);
  }
}
