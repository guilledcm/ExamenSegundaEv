
public class NuevaRefactorizado {

	public NuevaRefactorizado() {
		super();
	}

	public boolean refactorizado(RefactorizadoParameter parameterObject) {
		// Calculo único
		int c = parameterObject.getY() + parameterObject.getX();
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean nuevoPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				nuevoPrimo = false;
			}
		}
		
		boolean resultado = !nuevoPrimo;
		return (resultado);
	}

}