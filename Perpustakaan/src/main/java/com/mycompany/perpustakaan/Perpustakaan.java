/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.perpustakaan;

/**
 *
 * @author rizal
 */
public interface Perpustakaan {

    void pinjamBuku(String judulBuku);

    void kembalikanBuku(String judulBuku);

    void lihatDaftarBuku();
}
