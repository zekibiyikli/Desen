import java.util.Scanner;

public class Desen2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int satir;
		System.out.print("kaç satýrlýk olsun:");
		satir=input.nextInt();

		for(int i=1;i<=satir;i++) {
			for(int j=0;j<(satir-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=satir-1;i>0;i--) {
			for(int j=0;j<(satir-i);j++) {
				System.out.print(" ");
			}
			for(int k=0;k<(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
