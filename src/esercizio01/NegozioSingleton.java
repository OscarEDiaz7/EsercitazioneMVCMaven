package esercizio01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NegozioSingleton {

	HashMap<String, Prodotto> prodotti = new HashMap<>();

	private NegozioSingleton() {

		prodotti.put("40", new Prodotto("40", "a", 10.0, 5));
		prodotti.put("50", new Prodotto("50", "b", 20.0, 1));
		prodotti.put("60", new Prodotto("60", "c", 30.0, 20));
		prodotti.put("70", new Prodotto("70", "d", 40.0, 15));
		prodotti.put("30", new Prodotto("30", "e", 50.0, 10));

	};

	private static NegozioSingleton istanza;

	public static NegozioSingleton istanza() {

		if (istanza == null) {

			istanza = new NegozioSingleton();
		}
		return istanza;

	}

	public List<Prodotto> mostraProdotti() {

		List<Prodotto> lista2 = new ArrayList<>();

		for (HashMap.Entry<String, Prodotto> entry : prodotti.entrySet()) {

			lista2.add(entry.getValue());
		}

		return lista2;
	}

	public Prodotto trovaProdotto(String codice) {

		Prodotto ret = null;

		if (prodotti.containsKey(codice)) {
			ret = prodotti.get(codice);
		}

		return ret;

	}

}
