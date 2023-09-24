/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pemesananmakanan;

/**
 *
 * @author LINDA
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PemesananMakanan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Penjualan penjualan = new Penjualan();

        // Tambahkan beberapa contoh produk
        Produk produk1 = new Produk("Nasi Goreng", 25000);
        Produk produk2 = new Produk("Mie Ayam", 20000);
        Produk produk3 = new Produk("Ayam Geprek", 15000);
        Produk produk4 = new Produk("Ayam Bakar", 25000);
        Produk produk5 = new Produk("Bakso", 10000);
        Produk produk6 = new Produk("Ramen", 30000);
        Produk produk7 = new Produk("Rice bowl", 35000);
        Produk produk8 = new Produk("Nasi Liwet", 50000);
        Produk produk9 = new Produk("Sate", 13000);
        Produk produk10 = new Produk("Somay", 10000);
        Produk produk11 = new Produk("Rujak", 12000);
        Produk produk12 = new Produk("Bebek Bakar", 32000);

        // Menampilkan menu
        System.out.println("Menu Makanan:");
        System.out.println("1. " + produk1.getNamaProduk() + " - Rp. " + produk1.getHarga());
        System.out.println("2. " + produk2.getNamaProduk() + " - Rp. " + produk2.getHarga());
        System.out.println("3. " + produk3.getNamaProduk() + " - Rp. " + produk3.getHarga());
        System.out.println("4. " + produk4.getNamaProduk() + " - Rp. " + produk4.getHarga());
        System.out.println("5. " + produk5.getNamaProduk() + " - Rp. " + produk5.getHarga());
        System.out.println("6. " + produk6.getNamaProduk() + " - Rp. " + produk6.getHarga());
        System.out.println("7. " + produk7.getNamaProduk() + " - Rp. " + produk7.getHarga());
        System.out.println("8. " + produk8.getNamaProduk() + " - Rp. " + produk8.getHarga());
        System.out.println("9. " + produk9.getNamaProduk() + " - Rp. " + produk9.getHarga());
        System.out.println("10. " + produk10.getNamaProduk() + " - Rp. " + produk10.getHarga());
        System.out.println("11. " + produk11.getNamaProduk() + " - Rp. " + produk11.getHarga());
        System.out.println("12. " + produk12.getNamaProduk() + " - Rp. " + produk12.getHarga());

        // Memulai pemesanan
        boolean lanjutPesan = true;
        while (lanjutPesan) {
            System.out.print("Pilih nomor menu yang ingin dipesan (1-12): ");
            int pilihan = scanner.nextInt();
            System.out.print("Masukkan jumlah pesanan: ");
            int qty = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    penjualan.tambahPesanan(produk1, qty);
                    break;
                case 2:
                    penjualan.tambahPesanan(produk2, qty);
                    break;
                case 3:
                    penjualan.tambahPesanan(produk3, qty);
                    break;
                case 4:
                    penjualan.tambahPesanan(produk4, qty);
                    break;
                case 5:
                    penjualan.tambahPesanan(produk5, qty);
                    break;
                case 6:
                    penjualan.tambahPesanan(produk6, qty);
                    break;
                case 7:
                    penjualan.tambahPesanan(produk7, qty);
                    break;
                case 8:
                    penjualan.tambahPesanan(produk8, qty);
                    break;
                case 9:
                    penjualan.tambahPesanan(produk9, qty);
                    break;
                case 10:
                    penjualan.tambahPesanan(produk10, qty);
                    break;
                case 11:
                    penjualan.tambahPesanan(produk11, qty);
                    break;
                case 12:
                    penjualan.tambahPesanan(produk12, qty);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            
            // Menampilkan pengulangan pesanan jika ingin menambah produk yang ingin dipesan
            System.out.print("Apakah Anda ingin memesan item makanan lain? (ya/tidak): ");
            String lanjut = scanner.next();
            lanjutPesan = lanjut.equalsIgnoreCase("ya");
        }

        // Menampilkan pesanan dan total bayar
        penjualan.tampilkanPesanan();
    }
}
