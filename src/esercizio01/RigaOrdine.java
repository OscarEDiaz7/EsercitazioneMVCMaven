package esercizio01;

public class RigaOrdine {
	
    private Prodotto prodotto;
    private int quantita;

    public RigaOrdine(Prodotto prodotto, int quantita) {
        this.prodotto = prodotto;
        this.quantita = quantita;
    }

    public double getSubTotale() {
        return prodotto.getPrezzo() * quantita;
    }

    public Prodotto getProdotto() { return prodotto; }
    public int getQuantita() { return quantita; }

    @Override
    public String toString() {
        return prodotto.getTitolo() + " x " + quantita + " = €" + getSubTotale();
    }
}

