package br.Univela;


public class ExD implements Desenho{
	
	public static int SIZE = 9;
	
	@Override
	public void desenhar() {
		
		System.out.println("D)\n\n");  
		
		int brancos = 9;
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if(coluna<brancos-1){
					System.out.print(" "); 
				}else{
					System.out.print("*");  
				}
			}
			brancos--;
			System.out.println();
		}
	}

}