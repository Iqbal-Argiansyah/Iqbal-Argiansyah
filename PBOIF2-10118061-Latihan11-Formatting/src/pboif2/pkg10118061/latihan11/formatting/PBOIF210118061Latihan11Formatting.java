/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan11.formatting;

/**
 *
 * @author Iqbal
 *  NAMA      : Iqbal Argiansyah
 * KELAS     : PBOIF2
 * NIM       : 10118061
 * Deskripsi : Formatting
 */
public class PBOIF210118061Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10%n", i);
        System.out.printf("%%+10d : %+10%n", i);
        System.out.printf("%%+10d : %+10%n", iMinus);
        System.out.printf("%%,10d : %,10%n", i);
        System.out.printf("%%-10d : %-10%n", i);
        double f = 5675482.982;
        System.out.println("f : "+ f);
        System.out.printf("%%f : %f%n",f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
    
}
