
public abstract class FiguraGeometricaPGB {

	protected String tipoFigura;

	public FiguraGeometricaPGB(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public double semiPerimetro() {
		return this.perimetro() / 2;
	}
	
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
