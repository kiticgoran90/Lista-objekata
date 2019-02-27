package objekti;

public class Kompleksni extends MerljivObjekat {
	private double re, im;
	
	public Kompleksni(double re, double im) {
		this.re = re; this.im = im;
	}
	
	@Override
	public double velicina() {
		return Math.sqrt(re*re + im*im);
	}
	
	@Override
	public String toString() {
		return "K" + super.toString() + "(" + re + "," + im + ")";
	}
}
