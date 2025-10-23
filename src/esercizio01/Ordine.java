package esercizio01;

	import java.time.Year;
	import java.util.ArrayList;
	import java.util.List;

	public class Ordine {
	   
		
		private static int contatore = 1;
	    private String numeroOrdine;
	    private List<RigaOrdine> righe = new ArrayList<>();
	    private StatoOrdine stato;

	    public Ordine() {
	        this.numeroOrdine = "OL" + Year.now().getValue() + (contatore++);
	        this.stato = StatoOrdine.RICEVUTO;
	    }

	    public void aggiungiRiga(RigaOrdine r) {
	        righe.add(r);
	    }

	    public double getTotale() {
	        return righe.stream().mapToDouble(RigaOrdine::getSubTotale).sum();
	    }

	    public StatoOrdine getStato() { return stato; }
	    public void setStato(StatoOrdine stato) { this.stato = stato; }
	    public String getNumeroOrdine() { return numeroOrdine; }

	    @Override
	    public String toString() {
	        return "Ordine " + numeroOrdine + " - Stato: " + stato + "\n" + righe + "\nTotale: €" + getTotale();
	    }
	}


