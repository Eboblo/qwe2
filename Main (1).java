import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.println("Input a numbers: ");
        System.out.print("x =");
        int x = in.nextInt();
        System.out.print("y =");
        int y = in.nextInt();
        if (x > y){
            y /= 2;
            System.out.print(y);}
        else {
            x /= 2;
            System.out.print(x);}
	}
}
