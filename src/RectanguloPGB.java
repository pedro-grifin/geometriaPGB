/**
 * 
 * @author Pedro Guzman
 * @version 1.2
 *
 */
public class RectanguloPGB extends FiguraGeometricaPGB {
	private double l1;
	private double l2;
	
	/**
	 * Constructor
	 * @param tipoFigura descripcion del tipo de figura
	 * @param lG valor del lado grande
	 * @param lP valor del lado pequeño
	 */
	public RectanguloPGB(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el area 
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * calcula el perimetro.
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
