package objekti;

public abstract class UredjenaLista implements Merljiv {
	
	private class Elem {
		MerljivObjekat obj;
		Elem sled;
		Elem(MerljivObjekat o, Elem p, Elem s) {
			obj = o; sled = s;
			if(p == null) prvi = this; else p.sled = this;
		}
	}
	
	private Elem prvi;
	
	public boolean dodaj(MerljivObjekat obj) {
		Elem pret = null, tek = prvi;
		while(tek!=null && tek.obj.velicina() <= obj.velicina()) {
			pret = tek; tek = tek.sled;
		}
		new Elem(obj, pret, tek);
		return true;
	}
	
	@Override
	public double velicina() {
		double v = 0;
		for(Elem tek=prvi; tek!=null; tek=tek.sled) 
			v += tek.obj.velicina();
		return v;
	}
	
	@Override
	public String toString() {
		StringBuffer s = new StringBuffer("[");
		for(Elem tek=prvi; tek!=null; tek=tek.sled) {
			s.append(tek.obj);
			if(tek.sled != null) s.append(", ");
		}
		return s.append(']').toString();
	}
}
