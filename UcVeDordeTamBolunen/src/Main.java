import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//De�i�ken tan�ml�yorum.
		int n;
		double toplam;
		
		//Kullan�c�dan bir say� istiyorum.
		Scanner input=new Scanner(System.in);
		System.out.println("Say�y� Giriniz: ");
		
		//Say�y� n de�i�kenine at�yorum.
		n=input.nextInt();
		
		//For D�ng�s� olu�turuyorum.
		for (int i=0; i<=n ; i++) {
			if ((i%3==0) && (i%4==0)) {
				continue;
			}
			toplam=0.0;
			toplam= toplam+i;
			System.out.println("3 ve 4'e Tam B�l�nenlerin Toplam�: "+toplam);
			
		}
	}
}

		
