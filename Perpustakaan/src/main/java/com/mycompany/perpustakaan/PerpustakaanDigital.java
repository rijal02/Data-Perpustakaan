/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author rizal
 */
import java.util.HashMap;
import java.util.Map;

public class PerpustakaanDigital implements Perpustakaan {

    private HashMap<String, Boolean> daftarBuku;

    public PerpustakaanDigital() {
        this.daftarBuku = new HashMap<>();
        this.daftarBuku.put("Peradabaan Mesopotamia", true);
        this.daftarBuku.put("Ahmad Dahlan", true);
        this.daftarBuku.put("Guardians Of The Galaxy Vol.3", true);
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        if (this.daftarBuku.get(judulBuku)) {
            this.daftarBuku.put(judulBuku, false);
            System.out.println("Meminjam buku: " + judulBuku);
        } else {
            System.out.println("Buku " + judulBuku + " sedang dipinjam.");
        }
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        if (!this.daftarBuku.get(judulBuku)) {
            this.daftarBuku.put(judulBuku, true);
            System.out.println("Mengembalikan buku: " + judulBuku);
        } else {
            System.out.println("Buku " + judulBuku + " sudah dikembalikan.");
        }
    }

    @Override
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan digital:");
        for (Map.Entry<String, Boolean> entry : this.daftarBuku.entrySet()) {
            String buku = entry.getKey();
            boolean tersedia = entry.getValue();
            System.out.println("- " + buku + " (Tersedia: " + tersedia + ")");
        }
    }
}
