/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan45.cetaknama;

/**
 *
 * @author Zulfi
 */
public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        System.out.println("Nama Anda : " + getNama());
    }

    public void cetak(int jmlCetak, String nama) {
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " +getNama());
        }
    }

}
