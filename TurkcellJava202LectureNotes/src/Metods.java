
public class Metods {
	
	int x;
	
	
	Metods() {
		System.out.println("Constracter çaliştı");
		x = 20;
	}

	public void helloWorld() {
		System.out.println("hello world");
	}

	public void Merhaba() {
		System.out.println("Merhaba");
	}

	public int topla(int a, int b) {
		int topla = a + b;
		return topla;
	}

	public int yasBull(int a) {
		int sonuc = 2022 - a;
		return sonuc;
	}

	public float toplama(float a, float b) {
		return a + b;
	}

	public float cikarma(float a, float b) {
		return a - b;
	}

	public float carpma(float a, float b) {
		return a * b;
	}

	public float bolme(float a, float b) {
		return a / b;
	}
	public static void yaz() {
		System.out.println("hellooo");
	}
}
