/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambing;

/**
 * Nama : Rezky Nur Fauzi
 * NIM  : 10118016  
 * Kelas: IF-1 
 * Deskripsi Program : Menambahkan jumlah Kambing
 */
public class Kambing {

    public void tambahKambing(){
    //Deklarasi variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " +jumlahKambing);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
    
}
