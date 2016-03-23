package br.Univela;

public class ExC implements Desenho{

	public static int SIZE = 9;
	
	@Override
	public void desenhar() {
		System.out.println("C)\n\n");
		
		int brancos = 0;
		for (int  linha = 0; linha <= 9; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if(coluna>brancos){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			brancos++;
			System.out.print("\n");
		}
	}
}
