package Tabela;

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
		
		
		Mostrar(matriz);
		
		
	    
	}
}
