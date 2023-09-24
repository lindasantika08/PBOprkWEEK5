/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemesananmakanan;

/**
 *
 * @author LINDA
 */

import java.util.ArrayList;

// Kelas untuk melacak pesanan
class Penjualan {
    private ArrayList<Produk> pesanan = new ArrayList<>();

    // Metode untuk menambahkan pesanan
    public void tambahPesanan(Produk produk, int qty) {
        produk.tambahQty(qty);
        pesanan.add(produk);
    }
    
    // Metode untuk menghitung total bayar
    public double hitungTotalBayar() {
        double total = 0;
        for (Produk produk : pesanan) {
            total += (produk.getHarga() * produk.getQty());
        }
        return total;
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan Anda:");
        for (Produk produk : pesanan) {
            System.out.println(produk.getNamaProduk() + " - " + produk.getQty() + " x Rp. " + produk.getHarga());
        }
        System.out.println("Total Bayar: Rp. " + hitungTotalBayar());
    }
}

