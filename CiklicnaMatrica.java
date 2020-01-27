package zimskizadaci;

import javax.swing.JOptionPane;

		//program koji ispisuje cikličnu matricu iz donje desnog kuta i ide u smjeru kazaljke na satu

public class CiklicnaMatrica {
	
	
	
	//konstruktor  
	
public CiklicnaMatrica () {
	
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesite dimenziju matrice broj kolona"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesite dimenziju matrice broj stupaca"));
		
		
		int[][] matrica = new int[a][b];
		
		int dimenzija = a*b;  
        
        int vrijednost = 1;	
         
        int minKol = 0;		// kraj kolone
         
        int maxKol = a-1;	// početak kolone
         
        int minStu = 0;		// kraj stupca
         
        int maxStu = b-1;	// početak 
         
        while (vrijednost <= dimenzija)
        {
        	for (int i = maxStu; i >= minStu; i--)
            {
                matrica[maxKol][i] = vrijednost;
                     
                vrijednost++;
                
            }
        	
        	if (vrijednost > dimenzija) {break;}  // uvjet za izlazak iz petlje ako je matrica ne simetrična
        	
        	maxKol --;
             
            for (int i = maxKol; i >= minKol; i--) 
            { 
                matrica[i][minStu] = vrijednost; 
                 
                vrijednost++; 
                   
            } 
            
            if (vrijednost > dimenzija) {break;}
            
            minStu ++;
            
             
            for (int i = minStu; i <= maxStu; i++)
            {
                matrica[minKol][i] = vrijednost;
                             
                vrijednost++;
            }
            
            if (vrijednost > dimenzija) {break;}
            
            minKol ++;
             
            for (int i = minKol; i <= maxKol; i++) 
            {
                matrica[i][maxStu] = vrijednost;
                 
                vrijednost++;
            } 
            
            if (vrijednost > dimenzija) {break;}
            
            maxStu --;
            
        }
         
         
        for (int i = 0; i < a; i++)		// ispis matrice
	    {
	        for (int j = 0; j < b; j++)
	        {
	            System.out.print(matrica[i][j]+ "\t");
	        }
	         
	        System.out.println();
	    }
    }
    
public static void main(String[] args) {
	
	new CiklicnaMatrica();		// pozivanje konstruktora
	
	
		
	
	}
	
	
	
	
	
}
