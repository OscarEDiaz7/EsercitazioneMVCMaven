package esercizio01;

public class Operatore {
    private String email;
    private String password;

    public Operatore(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public boolean cambiaStato(Ordine ordine, StatoOrdine nuovoStato) {
        StatoOrdine attuale = ordine.getStato();
        switch (attuale) {
            case RICEVUTO:
                if (nuovoStato == StatoOrdine.IN_LAVORAZIONE) { ordine.setStato(nuovoStato); return true; }
                break;
            case IN_LAVORAZIONE:
                if (nuovoStato == StatoOrdine.SPEDITO) { ordine.setStato(nuovoStato); return true; }
                break;
            case SPEDITO:
                if (nuovoStato == StatoOrdine.ARCHIVIATO) { ordine.setStato(nuovoStato); return true; }
                break;
        }
        return false;
    }
}
