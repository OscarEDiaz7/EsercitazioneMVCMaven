package esercizio01;

public class AcquistoController {

	private double totale = 0.0;

	public void acquistaS(String codice, int quantita) {

		NegozioSingleton negozio = NegozioSingleton.istanza();

		Prodotto prodotto1 = negozio.trovaProdotto(codice);

		if (prodotto1 == null) {
			System.out.println("Prodotto non trovato!");
		}

		if (quantita > prodotto1.getQuantitaDisponibile()) {
			System.out.println("Quantita non disponibile!");
		}

		totale += quantita * prodotto1.getPrezzo();

		prodotto1.setQuantitaDisponibile(prodotto1.getQuantitaDisponibile() - quantita);

	}
	
	public double getTotale() {
		return totale;
	}

}
