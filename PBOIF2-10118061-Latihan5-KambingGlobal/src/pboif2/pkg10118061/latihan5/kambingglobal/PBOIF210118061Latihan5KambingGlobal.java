/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118061.latihan5.kambingglobal;

/**
 *
 * @author Iqbal
 *  NAMA      : Iqbal Argiansyah
 * KELAS     : PBOIF2
 * NIM       : 10118061
 * Deskripsi : Aritmatika
 */
public class PBOIF210118061Latihan5KambingGlobal {

    int jumlahKambing = 88;
        
        public void getJumlahKambing() {
            System.out.println("Jumlah Kambing : " + jumlahKambing);
        }
        
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
            
        }
    public static void main(String[] args) {
        // TODO code application logic here
            KambingGlobal kambingSusu = new KambingGlobal();
            
            kambingSusu.getJumlahKambing();
            kambingSusu.tambahKaming();
            kambingSusu.getJumlahKambing();
        }
        }
    }
    
}
