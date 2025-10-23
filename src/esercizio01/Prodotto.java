/*
 * Esercizio 1
 * Scrivere un programma java che consenta di simulare un acquisto di alcuni prodotti da
 * parte di un utente. Un prodotto è costituito dalle seguenti informazioni:
  • codice (univoco e progressivo)
  • titolo
  • prezzo unitario
  • quantità disponibile
 * il programma deve consentire all'utente di selezionare un prodotto alla volta indicando il
 * numero di pezzi che desidera acquistare. Quando l'utente avrà terminato la selezione,
 * allora il programma dovrà stampare il totale da pagare
 * Scrivere il programma applicando (se possibile il pattern singleton e mvc).
 */
package esercizio01;

public class Prodotto {
	
	
	private String codiceUnivoco;
	private String titolo;
	private double prezzo;
	private int quantitaDisponibile;
	
	public Prodotto() {}

	public Prodotto(String codiceUnivoco, String titolo, double prezzo, int quantitaDisponibile) {
		this.codiceUnivoco = codiceUnivoco;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.quantitaDisponibile = quantitaDisponibile;
	}

	public String getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public void setCodiceUnivoco(String codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}

	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}

	@Override
	public String toString() {
		return "Prodotto " + codiceUnivoco + ":" + titolo + ", prezzo: " + prezzo
				+ ", disponibilità: " + quantitaDisponibile + "]";
	}
	
}
