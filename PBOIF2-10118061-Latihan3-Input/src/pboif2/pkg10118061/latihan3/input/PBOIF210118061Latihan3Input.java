

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan3.input;

import java.util.Scanner;
/**
 *
 * @author Iqbal
 * NAMA      : Iqbal Argiansyah
 * KELAS     : PBOIF2
 * NIM       : 10118061
 * Deskripsi : Memasukan Nilai Dari Keyboard.
 */
public class PBOIF210118061Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda :");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
