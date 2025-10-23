//package esercizio01;
//
//import java.util.Scanner;
//
//public class OperatoreView {
//
//	public static void main(String[] args) {
//		
//		AcquistoController controllo = new AcquistoController();
//
//		NegozioSingleton negozio1 = NegozioSingleton.istanza();
//
//		
//		Operatore op1 = new Operatore("batman@exolab.it", "cane");
//
//		Operatore OpEsempio;
//
//		Scanner sc = new Scanner(System.in);
//
//		String mailInput;
//		String pwInput;
//
//		System.out.println("Mail?");
//
//		mailInput = sc.nextLine();
//
//		System.out.println("Password?");
//
//		pwInput = sc.nextLine();
//
//		OpEsempio = new Operatore(mailInput, pwInput);
//
//		while (true) {
//
//			if (!op1.validato(mailInput, pwInput)) {
//
//				System.out.println("Sbagliato!");
//				break;
//
//			} else
//			
//			System.out.println("Il codice dell'ordine di cui vuoi cambiare lo stato?");
//			
//			String numeroOrdine = sc.nextLine();
//			
//			if (!negozio1.prodotti.containsKey(numeroOrdine)) {
//				
//				System.out.println("Non c'è");
//				break;
//				
//			}  else
//				
//				negozio1.prodotti
//				
//				
//			
//			
//
//		}
//
//	}
//
//}