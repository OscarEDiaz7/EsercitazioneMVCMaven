package esercizio01;

public class RigaOrdine {
	
	private Prodotto prodottoRiga;
	
	private int quantitaRiga;
	
	private double totaleRiga;

	public RigaOrdine(Prodotto prodottoRiga, int quantitaRiga) {
		this.prodottoRiga = prodottoRiga;
		this.quantitaRiga = quantitaRiga;
		this.totaleRiga = prodottoRiga.getPrezzo() * totaleRiga;
	}
	

	public Prodotto getProdottoRiga() {
		return prodottoRiga;
	}

	public void setProdottoRiga(Prodotto prodottoRiga) {
		this.prodottoRiga = prodottoRiga;
	}

	public int getQuantitaRiga() {
		return quantitaRiga;
	}

	public void setQuantitaRiga(int quantitaRiga) {
		this.quantitaRiga = quantitaRiga;
	}

	public double getTotaleRiga() {
		return totaleRiga;
	}

	public void setTotaleRiga(double totaleRiga) {
		this.totaleRiga = totaleRiga;
	}


	@Override
	public String toString() {
		return "Prodotto:" + prodottoRiga + ", quantita=" + quantitaRiga + ", totale="
				+ totaleRiga + "]";
	}
	
	
	
	
	
	
	
	

}
