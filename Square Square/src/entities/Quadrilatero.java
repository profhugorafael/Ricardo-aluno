package entities;

public class Quadrilatero {
	
	// atributos
	public double a;
	public double b;
	public double c;
	public double d;
	public String tipo;
	
	// construtores
	public Quadrilatero(double a) {
		this.a = a;
		this.b = a;
		this.c = a;
		this.d = a;
		tipo = "Quadrado";
	}
	
	public Quadrilatero(double a, double b) {
		this.a = a;
		this.b = b;
		this.c = a;
		this.d = b;
		tipo = "Retangulo";
	}

	public Quadrilatero(double a, double b, double c, double d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		tipo = "Quadrilatero qualquer";
	}

	// métodos
	public double area() {
		if(a == c && b == d) {
			return (a*b);
		} else {
			double s = perimetro()/2;
			return Math.sqrt((s-a)*(s-b)*(s-c)*(s-d));
		}
	}
	
	public double perimetro() {
		return a+b+c+d;
	}
	
	// to String
	@Override // anotation
	public String toString() {
		return "[a = " + a + ", b = " 
				+ b + ", c = " 
				+ c + ", d = " 
				+ d + " ]";
	}
	
}
