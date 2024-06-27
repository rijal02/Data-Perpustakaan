/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author rizal
 */
public class Perpustakaanumum implements Perpustakaan {

    private String[] daftarBuku = {"Tenggelamnya Kapal Van Der Wick", "Dampak Perang Dingin di Afganistan", "Penyebab Permusuhan Iraq dan Iran"};

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println("Meminjam buku: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println("Mengembalikan buku: " + judulBuku);
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan:");
        for (String buku : daftarBuku) {
            System.out.println("- " + buku);
        }
    }
}
