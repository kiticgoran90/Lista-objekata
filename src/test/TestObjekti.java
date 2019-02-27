package test;

import objekti.*;

public class TestObjekti {
	
	public static void main(String[] args) {
		ListaKompleksnih listaKomp = new ListaKompleksnih();
		ListaPravougaonika listaPrav = new ListaPravougaonika();
		
		radi:while(true) {
			System.out.print("Vrsta (K,P,*) i parametri: ");
			MerljivObjekat obj = null;
			switch(Citaj.Char()) {
			case 'K': case 'k': obj = new Kompleksni(Citaj.Double(), Citaj.Double()); break;
			case 'P': case 'p': obj = new Pravougaonik(Citaj.Double(), Citaj.Double()); break;
			case '*': break radi;
			default: System.out.println("Nepoznat unos!");
			}
			if(obj!=null) {
				listaKomp.dodaj(obj);
				listaPrav.dodaj(obj);
			}
		}
		System.out.println("Lista kompleksnih brojeva je: " + listaKomp);
		System.out.println("Lista pravougaonika je: " + listaPrav);
	}
}
