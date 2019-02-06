import java.util.Scanner;

public class Desen1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int satir;
		System.out.print("kaç satýrlýk olsun:");
		satir=input.nextInt();
		
		for(int i=1;i<=satir;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
