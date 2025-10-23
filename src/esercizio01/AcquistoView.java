package esercizio01;

import java.util.Scanner;

public class AcquistoView {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);

		AcquistoController controllo = new AcquistoController();

		NegozioSingleton negozio1 = NegozioSingleton.istanza();

		System.out.println("----------------------------");

		System.out.println("--------Venta de fumo------------");

		System.out.println("----------------------------");

		boolean continua = true;

		while (continua) {

			System.out.println("Nome del cliente?");

			String cliente = sc.nextLine();

			controllo.creaOrdine(cliente);

			System.out.println("Prodotti disponibili:");

			System.out.println(negozio1.mostraProdotti());

			System.out.println("Inserire codice del prodotto da acquistare");

			String codice = sc.nextLine();

			if (codice == "0") {
				System.out.println("Ciao!");
				continua = false;
			}

			System.out.println("Quanti prodotti?");

			int quantita = sc.nextInt();

			/// AGGIUNTO
						if (quantita == 0) {
							System.out.println("Ciao!");
							continua = false;
						}

			sc.nextLine();

			controllo.acquistaS(codice, quantita);

			continua = false;

		}

		//// AGGIUNTO
		///controllo.cambiaStato();
		
		System.out.println("Ecco il totale: " + controllo.getTotale());

		System.out.println("Ordini effettuati: " + controllo.getOrdine());

		sc.close();

	}

}
