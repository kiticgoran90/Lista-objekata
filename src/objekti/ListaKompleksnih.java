package objekti;

public class ListaKompleksnih extends UredjenaLista {
	
	@Override
	public boolean dodaj(MerljivObjekat obj) {
		if(!(obj instanceof Kompleksni)) return false;
		super.dodaj(obj);
		return true;
	}
}
