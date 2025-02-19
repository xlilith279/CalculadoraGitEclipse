import java.sql.SQLIntegrityConstraintViolationException;

public class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}
	
	public int restar(int a, int b) {
		return a - b;
	}
	
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();

		System.out.println("Resultado de la suma: " + calc.sumar(5, 3));
		System.out.println("Resultado de la resta: " + calc.restar(5, 3));
		System.out.println("Resultado de la multiplicacion: " + calc.multiplicar(5, 3));
	}

}
