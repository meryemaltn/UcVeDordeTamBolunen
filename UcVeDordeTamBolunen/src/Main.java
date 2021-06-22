import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//Deðiþken tanýmlýyorum.
		int n, toplam=0 ;
		
		//Kullanýcýdan bir sayý istiyorum.
		Scanner input=new Scanner(System.in);
		System.out.println("Sayýyý Giriniz: ");
		
		//Sayýyý n deðiþkenine atýyorum.
		n=input.nextInt();
		
		//For Döngüsü oluþturuyorum.
		for (int i=0; i<=n ; i++) {
			
			// 3 veya 4'e bölünmeyenler hariç geri kalanlarýn toplamý:
			if ((i%3!=0) || (i%4!=0)) {
				continue;
			}
			toplam=toplam+i;
		}
		System.out.println("3 ve 4'e Tam Bölünenlerin Toplamý: "+ toplam);
	}
}

		
