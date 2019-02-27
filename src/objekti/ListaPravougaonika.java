package objekti;

public class ListaPravougaonika extends UredjenaLista {
	
	@Override
	public boolean dodaj(MerljivObjekat obj) {
		if(!(obj instanceof Pravougaonik)) return false;
		super.dodaj(obj);
		return true;
	}
}
