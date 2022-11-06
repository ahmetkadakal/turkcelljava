import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * System.out.println("Hello world"); System.out.println(Math.pow(5, 5));
		 * 
		 * Scanner scanner = new Scanner(System.in); String nextLine =
		 * scanner.nextLine(); System.out.println(nextLine.toUpperCase()); //metotların
		 * imazasşna geri dönüş parametresi dahil değildir //farklı parametreler vererek
		 * aynı isimde metotlar yazılabilir new Metods().helloWorld(); Metods metods =
		 * new Metods(); metods.Merhaba(); System.out.println(metods.topla(44, 24));
		 * 
		 * Scanner scanner = new Scanner(System.in); String deger = scanner.nextLine();
		 * 
		 * int yas = metods.yasBull(Integer.parseInt(deger));
		 * System.out.println("Yaşınız : " + yas);
		 * 
		 * static metodlar için nesne oluşturmak gerekmez class adıyla ulasılabilir
		 * javada bir değeri başka biriyle değiştirmek için array tarzı araçlar
		 * kullanmak gerekir
		 */

		Metods.yaz();
		Metods metods = new Metods();
		float toplama = metods.toplama(2.0f, 5.0f);
		System.out.println(toplama);
		System.out.println(metods.x);
	}
}
