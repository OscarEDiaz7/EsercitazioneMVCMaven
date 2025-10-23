package esercizio01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ordine {

	private List<RigaOrdine> righe = new ArrayList<>();

//	private static String numeroOrdine;
//	
//	private static int progressivo;

//	public static String generaNumeroOrdine() {
//		int annoCorrente = LocalDate.now().getYear();
//		numeroOrdine = ("OL" + annoCorrente + progressivo);
//		progressivo++;
//		return numeroOrdine;
//	}

//	String cliente;
//
//	/// AGGIUNTO
//	StatoLav statolavorazione;
//
//	public StatoLav cambiaStato() {
//
//		if (this.statolavorazione == null) {
//			this.statolavorazione = StatoLav.RICEVUTO;
//			System.out.println("Stato da nullo a ricevuto");
//			return this.statolavorazione;
//		}
//
//		else
//			switch (this.statolavorazione) {
//
//			case RICEVUTO: {
//				this.statolavorazione = StatoLav.INLAVORAZIONE;
//				break;
//			}
//			case INLAVORAZIONE: {
//				this.statolavorazione = StatoLav.SPEDITO;
//				break;
//			}
//			case SPEDITO: {
//				this.statolavorazione = StatoLav.ARCHIVIATO;
//				break;
//			}
//			case ARCHIVIATO: {
//				System.out.println("Ordine già archiviato");
//				break;
//			}
//			}
//
//		return this.statolavorazione;
//
//	}

	public void aggiungiRiga(RigaOrdine riga) {
		righe.add(riga);
	}

	public Ordine(String cliente) {
		this.cliente = cliente;
		this.statolavorazione = StatoLav.RICEVUTO;
	};

	public Ordine(List<RigaOrdine> righe, String numeroOrdine, String cliente) {
		super();
		this.righe = righe;
		this.numeroOrdine = numeroOrdine;
		this.cliente = cliente;
		this.statolavorazione = StatoLav.RICEVUTO;
	}

	public List<RigaOrdine> getRighe() {
		return righe;
	}

	public void setRighe(List<RigaOrdine> righe) {
		this.righe = righe;
	}

	public String getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(String numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Ordine [righe=" + righe + ", numeroOrdine=" + numeroOrdine + ", cliente=" + cliente + "]";
	}

}
