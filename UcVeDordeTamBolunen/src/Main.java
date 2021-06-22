import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Deðiþken tanýmlýyorum.
		int n;
		double toplam;
		
		//Kullanýcýdan bir sayý istiyorum.
		Scanner input=new Scanner(System.in);
		System.out.println("Sayýyý Giriniz: ");
		
		//Sayýyý n deðiþkenine atýyorum.
		n=input.nextInt();
		
		//For Döngüsü oluþturuyorum.
		for (int i=0; i<=n ; i++) {
			if ((i%3==0) && (i%4==0)) {
				continue;
			}
			toplam=0.0;
			toplam= toplam+i;
			System.out.println("3 ve 4'e Tam Bölünenlerin Toplamý: "+toplam);
			
		}
	}
}

		
