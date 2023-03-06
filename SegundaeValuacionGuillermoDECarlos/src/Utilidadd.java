/**
 *
 * @author GuilleDCM
 * @version 1.0
 * 
 */

/*
 * este metodo se llama utilidad
 *
 */
public class Utilidadd {
	
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	/*
	 * nos devueleve el factorial
	 */
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	/*
	 * metodo que vamos a usar para refactorizar
	 * @params a numero entero
	 * @params b numero entero
	 */
	public boolean refactorizacionD(int a, int b) {
		// Calculo único
		int c = a + b;
		// Calculo único
		int d = c + 34;
		
		//Calculo si d es primo
		boolean esPrimo = true;
		for (int i=2;i<d;i++) {
			if (d%i==0) {
				esPrimo = false;
			}
		}
		
		boolean resultado = !esPrimo;
		return (resultado);
	}
	
}

