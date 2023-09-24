/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pemesananmakanan;

/**
 *
 * @author LINDA
 */

// Kelas untuk merepresentasikan produk makanan
class Produk {
    private String namaProduk;
    private double harga;
    private int qty;
    
    // Konstruktor untuk inisialisasi produk
    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.qty = 0;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public void tambahQty(int qty) {
        this.qty += qty;
    }
}

