package br.Univela;

import javax.swing.JFrame;


/**
 * 
 *      Desenha a figura  abaixo com largura = SIZE;
 *      
 *      
 *      
 *      
 *      
 *      ****
 *      *  *
 *      *  *
 *      ****
 *
 */


public class ExE  implements Desenho  {

	
	public static int SIZE = 10;
	
	@Override
	public void desenhar() {
		
		System.out.println("E)\n\n");
		
		for (int linha = 0; linha < SIZE; linha++) {
			for (int coluna = 0; coluna < SIZE; coluna++) {
				if(linha==0  || linha==SIZE-1){
					System.out.print("*");
				}else{
					if(coluna == 0 || coluna == SIZE-1){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
		
		
	}

}
