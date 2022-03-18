
public class Programa {

	public static void main (String [] args) {
		
		String[] matriculas = new String [5];
		matriculas[0] = "001";
		matriculas[1] = "002";
		matriculas[2] = "003";
		matriculas[3] = "004";
		matriculas[4] = "005";
		
		String[] nomes = new String [5];
		nomes[0] = "Ana";
		nomes[1] = "Bianca";
		nomes[2] = "Carlos";
		nomes[3] = "Daniel";
		nomes[4] = "Eduarda";
		
		double[] notas1 = new double [5];
		notas1[0] = 7.8;
		notas1[1] = 8.6;
		notas1[2] = 4.7;
		notas1[3] = 9.5;
		notas1[4] = 5.8;
		
		double[] notas2 = new double [5];
		notas2[0] = 6.8;
		notas2[1] = 8.9;
		notas2[2] = 9.7;
		notas2[3] = 9.1;
		notas2[4] = 4.8;
		
		double[] notaFinal = new double [5];
		notaFinal[0] = (notas1[0] + notas2[0]) /2;
		notaFinal[1] = (notas1[1] + notas2[1]) /2;
		notaFinal[2] = (notas1[2] + notas2[2]) /2;
		notaFinal[3] = (notas1[3] + notas2[3]) /2;
		notaFinal[4] = (notas1[4] + notas2[4]) /2;
		
		System.out.println("Matricula: " + matriculas[0]);
		System.out.println("Matricula: " + matriculas[1]);
		System.out.println("Matricula: " + matriculas[2]);
		System.out.println("Matricula: " + matriculas[3]);
		System.out.println("Matricula: " + matriculas[4]);
		
		System.out.println("Nome: " + nomes[0]);
		System.out.println("Nome: " + nomes[1]);
		System.out.println("Nome: " + nomes[2]);
		System.out.println("Nome: " + nomes[3]);
		System.out.println("Nome: " + nomes[4]);
		
		System.out.println("Nota final 1: " + notaFinal[0]);
		System.out.println("Nota final 2: " + notaFinal[1]);
		System.out.println("Nota final 3: " + notaFinal[2]);
		System.out.println("Nota final 4: " + notaFinal[3]);
		System.out.println("Nota final 5: " + notaFinal[4]);
		
		//00
		
		if (notaFinal[0] >=6) {
			
			System.out.println("Aprovado: Sim ( ) Não (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) Não ( )");
		}

		//01
		
		if (notaFinal[1] >=6) {
			
			System.out.println("Aprovado: Sim ( ) Não (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) Não ( )");
		}
		

		//02
		
		if (notaFinal[2] >=6) {
			
			System.out.println("Aprovado: Sim ( ) Não (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) Não ( )");
		}

		//03
		
		if (notaFinal[3] >=6) {
			
			System.out.println("Aprovado: Sim ( ) Não (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) Não ( )");
		}
		
		
		//04
		
		if (notaFinal[4] >=6) {
			
			System.out.println("Aprovado: Sim ( ) Não (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) Não ( )");
		}
	}
}
