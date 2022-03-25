
public class ExemploFuncoes3 {
	
	public static void imprimir (String txt) {
		System.out.println(txt);
	}
	
	public static double multiplicar(double a, double b) {
		//mudou o retorno de void para double
		double vlr = a * b;
		return vlr;
	}
	
	public static void main(String [] args) {
		//static = função do java
		// () entrada de valor na função
		double valor1 = 100;
		double valor2 = 80;
		//double resultado = valor1 * valor2;
		double resultado = multiplicar(valor1, valor2);
	
		String texto = String.valueOf(resultado);
		imprimir(texto);
	}
}