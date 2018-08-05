package mathQuizStefanINikola;

import java.util.Scanner;

public class MathQuiz {
	
	Scanner input = new Scanner(System.in);
	double unos;	
	
	public MathQuiz() {
		
	}

	public void sabiranje() {
		//Stefan
	}
	public void oduzimanje() {
		int a = (int) (Math.random() * 10);
		int b = (int) (Math.random() * 10);
		System.out.println("\nKoliko je " + a + " - " + b + " ?");
		unos = input.nextDouble();
		if(unos == (a - b))
			System.out.println("Tacan odgovor!");
		else
			System.out.println("Netacan odgovor!");
	}
	public void mnozenje() {
		//Nikola
	}
	public void dijeljenje() {
		//Nikola
	}
	public void korjenovanje() {
		//Stefan;
	}
	public void kvadriranje() {
		//Stefan
	}

}
