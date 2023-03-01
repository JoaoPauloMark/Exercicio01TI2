//Joao Paulo de Castro Markiewicz 692297

import java.util.*;

class SomarDoisNumeros {

	public static Scanner sc =
			new Scanner(System.in);
	
	public static void main (String args[])
	{
		
		//Definir variaveis
		int num1, num2;
		
		//Ler os valores
		System.out.println("Digite o primeiro numero");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo numero");
		num2 = sc.nextInt();

		//Prinar o resultado
		System.out.println("Soma:" + Soma(num1, num2));
		
	}
	
	//Metodo que efetua a soma
	public static int Soma (int x, int y)
	{
		
		//Definir variavel
		int soma = 0;
		
		//Somar os parametros
		soma = x + y;
		
		//retornar o resultado
		return(soma);

	}
}
