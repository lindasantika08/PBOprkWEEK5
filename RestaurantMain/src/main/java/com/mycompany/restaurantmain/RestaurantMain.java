/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.restaurantmain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMain {
    public static void main(String[] args) {
        // Membuat daftar item menu sebagai sebuah ArrayList
        List<MenuItem> menuItems = new ArrayList<>();

        tambahMenuMakanan(menuItems, "Bala-Bala", 1000, 20);
        tambahMenuMakanan(menuItems, "Gehu", 1000, 20);
        tambahMenuMakanan(menuItems, "Tahu", 1000, 0);
        tambahMenuMakanan(menuItems, "Molen", 1000, 20);

        tampilMenuMakanan(menuItems);
    }

    public static void tambahMenuMakanan(List<MenuItem> menuItems, String nama, int harga, int stok) {
        MenuItem newItem = new MenuItem(nama, harga, stok);
        menuItems.add(newItem);
    }
    
    // Menampilkan daftar menu makanan
    public static void tampilMenuMakanan(List<MenuItem> menuItems) {
        System.out.println("Daftar Menu Makanan:");
        for (MenuItem item : menuItems) {
            System.out.println("Nama: " + item.getNama() + ", Harga: " + item.getHarga() + ", Stok: " + item.getStok());
        }
    }

    // Kelas privat yang merepresentasikan item menu
    private static class MenuItem {
        private String nama;
        private int harga;
        private int stok;

        public MenuItem(String nama, int harga, int stok) {
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
        }

        public String getNama() {
            return nama;
        }

        public int getHarga() {
            return harga;
        }

        public int getStok() {
            return stok;
        }
    }
}

