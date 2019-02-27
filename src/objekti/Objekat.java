package objekti;

public abstract class Objekat {
	private static int ID = 0;
	private int id = ++ID;
	
	public String toString() {
		return Integer.toString(id);
	}
}