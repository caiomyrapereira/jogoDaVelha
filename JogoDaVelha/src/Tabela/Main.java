package Tabela;

import java.util.Scanner;

public class Main {
	
	public static void Mostrar(String matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz.length; j++) {
    			System.out.print("["+ matriz[i][j]+"]");
    		}
    		System.out.println("");
    	}
	}
	
	public  static void main(String args[]) {
		String[][] matriz = {  
	              { "1", "2", "3"},  
	              { "4", "5", "6"}, 
	              { "7", "8", "9"}
	    };
		int opc, cont, partida = 0;
	    Scanner ler = new Scanner(System.in);
	    String[] jogador = { "X","O"};
		
	    do {
	    	Mostrar(matriz);
	    	System.out.println(jogador[partida%2]+", digite qual posi��o deseja:");
	    	opc = ler.nextInt();
		    
	    	cont = 0;
	    	for(int l = 0; l<3; l++ ) {
	    		for(int c = 0; c<3; c++ ) {
	    			cont++;
	    			if(opc == cont) {
	    				if( (matriz[l][c] == "X") || (matriz[l][c] == "O")){
	    					System.out.println("J� foi escolhido");
	    				}
	    				else {
	    					matriz[l][c]  = jogador[partida%2];  // jogador
	    					partida++;		
	    					break;
	    				}  
	    			}
	    		}
	    	}
	    	
	    	
	    }while( true ); 
		
		
	    
	}
}
