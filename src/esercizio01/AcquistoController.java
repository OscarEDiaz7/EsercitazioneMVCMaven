package esercizio01;

public class AcquistoController {

	private double totale = 0.0;

	private Ordine ordine;

	public void creaOrdine(String nomeCliente) {

		ordine = new Ordine(nomeCliente);
	}

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

		RigaOrdine riga1 = new RigaOrdine(prodotto1, quantita);

		ordine.aggiungiRiga(riga1);

	}

	public double getTotale() {
		return totale;
	}

	public Ordine getOrdine() {
		return ordine;
	}

}
