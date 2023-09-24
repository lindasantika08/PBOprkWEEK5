/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurant;

/**
 *
 * @author LINDA
 */
import java.util.ArrayList;

public class Restaurant {
    private ArrayList<String> namaMakanan;
    private ArrayList<Double> hargaMakanan;
    private ArrayList<Double> stokMakanan;
    private int id;
    
    // Digunakan unutk menampilkan list produk
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // Menambahkan menu makanan
        restaurant.tambahMenuMakanan("Nasi Goreng", 25000, 10);
        restaurant.tambahMenuMakanan("Mie Ayam", 20000, 8);

        // Menampilkan menu makanan
        restaurant.tampilMenuMakanan();
    }

    public Restaurant() {
        namaMakanan = new ArrayList<>();
        hargaMakanan = new ArrayList<>();
        stokMakanan = new ArrayList<>();
        id = 0;
    }

    public void tambahMenuMakanan(String nama, double harga, double stok) {
        namaMakanan.add(nama);
        hargaMakanan.add(harga);
        stokMakanan.add(stok);
        id++;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < namaMakanan.size(); i++) {
            if (!isOutOfStock(i)) {
                System.out.println(namaMakanan.get(i) + "[" + String.format("%.0f", stokMakanan.get(i)) + "]" + "Rp. " + String.format("%.0f", hargaMakanan.get(i)));
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stokMakanan.get(id) == 0;
    }

    public int getId() {
        return id++;
    }
}

