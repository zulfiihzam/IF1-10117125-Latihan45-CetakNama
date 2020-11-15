/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan45.cetaknama;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA : Zulfi Ihzam Rahmat 
 * KELAS : IF-1 
 * NIM : 10117125 
 * Deskripsi Program : program yang menampilkan cetak Nama
 *
 */
public class IF110117125Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        
        Printer printer = new Printer();

        System.out.println("===== Aplikasi Pencetak Nama =====");
        
        System.out.print("Masukkan Nama Anda : ");
        String namamu = scan1.nextLine();
        printer.setNama(namamu);

        System.out.print("Mau cetak nama berapa kali? : ");
        int ulang = scan2.nextInt();
        printer.setJmlCetak(ulang);

        printer.cetak(namamu);
        
        System.out.println("Hasil Cetak");
        printer.cetak(ulang, namamu);
    }
    
}
