package esercizio01;

import java.util.ArrayList;
import java.util.List;

public class Ordine {

	private List<RigaOrdine> righe = new ArrayList<>();

	String numeroOrdine;

	String cliente;
	
	public void aggiungiRiga(RigaOrdine riga) {
		righe.add(riga);
	}
	
	public Ordine(String cliente) {
		this.cliente = cliente;
	};

	public Ordine(List<RigaOrdine> righe, String numeroOrdine, String cliente) {
		super();
		this.righe = righe;
		this.numeroOrdine = numeroOrdine;
		this.cliente = cliente;
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
