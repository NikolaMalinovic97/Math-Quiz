package mathQuizStefanINikola;

import java.util.Scanner;

public class TestMathQuiz {

	public static void main(String[] args) {
		
		//Deklaracija varijabli koje cemo koristiti
		Scanner input = new Scanner(System.in);
		MathQuiz mq = new MathQuiz();
		int unos;
		
		//petlja koja se izvrsava sve dok ne unesemo nulu (0)
		do {
			//tekst koji se ispisuje na ekranu prilikom pokretanja aplikacije
			System.out.println("--------Izaberite opciju--------"
								+ "\n1. Sabiranje"
								+ "\n2. Oduzimanje"
								+ "\n3. Mnozenje"
								+ "\n4. Dijeljenje"
								+ "\n5. Korjenovanje"
								+ "\n6. Kvadriranje"
								+ "\n0. Izlaz"
								+ "\n---------------------------------");
			//dio programa koji brine da korisnik unese ispavan unos
			while(true) {
				try {
					unos = input.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("\nGreska! Morate unijeti jednu od ponudjenih opcija, pokusajte ponovo.");
				}
			}
			
			if(unos < 0 || unos > 6)
				System.out.println("Greska! Morate unijeti jednu od ponudjenih opcija, pokusajte ponovo.\n");
			
			//dio programa koji odradjuje odabranu opciju
			switch(unos) {
			case 1: mq.sabiranje(); break;
			case 2: mq.oduzimanje(); break;
			case 3: mq.mnozenje(); break;
			case 4: mq.dijeljenje(); break;
			case 5: mq.korjenovanje(); break;
			case 6: mq.kvadriranje(); break;
			}
			
		}while(unos != 0);
		
	}
}
