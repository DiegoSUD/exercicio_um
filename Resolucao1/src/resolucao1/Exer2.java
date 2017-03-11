package resolucao1;

import java.util.Scanner;

public class Exer2 { 
public static void main(String[] args) {
   Scanner leia = new Scanner(System.in);
   
    int Emin = 1;
    int Emax;
    int media;
    /*System.out.println("Quantidade Minína da Peça em Estoque");
        Emin = leia.nextInt();*/
    System.out.println("Quantidade Maxíma da Peça em Estoque");
        Emax = leia.nextInt();
    media = (Emin+Emax)/2;
    System.out.println("Media em Estoque é:"+media);
    
    }
}