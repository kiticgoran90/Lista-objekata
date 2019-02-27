package objekti;

public class Pravougaonik extends MerljivObjekat {
	private double a, b;
	
	public Pravougaonik(double a, double b) {
		this.a = a; this.b = b;
	}
	
	@Override
	public double velicina() {
		return a*b;
	}

	@Override
	public String toString() {
		return "P" + super.toString() + "(" + a + "," + b + ")";
	}
}
