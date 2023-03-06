
public class UtilidadRefactor extends NuevaRefactorizado {
	
	public int ejercicioD(int a) {
		return (a==0) ? 0: a+factorial(a);
	}
	
	
	public int factorial(int n) {
		if (n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
}
