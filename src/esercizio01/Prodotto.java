package esercizio01;

public class Prodotto {
    
	private static int progressivo = 1;
    private int codice;
    private String titolo;
    private double prezzo;
    private int quantitaDisponibile;

    public Prodotto(String titolo, double prezzo, int quantitaDisponibile) {
        this.codice = progressivo++;
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    public int getCodice() { return codice; }
    public String getTitolo() { return titolo; }
    public double getPrezzo() { return prezzo; }
    public int getQuantitaDisponibile() { return quantitaDisponibile; }

    public void scalaQuantita(int q) {
        if (q <= quantitaDisponibile) {
            quantitaDisponibile -= q;
        }
    }

    @Override
    public String toString() {
        return codice + " - " + titolo + " (€" + prezzo + ") Disponibili: " + quantitaDisponibile;
    }
}

