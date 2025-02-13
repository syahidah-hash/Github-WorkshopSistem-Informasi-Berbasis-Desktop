/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masyaallah;
import java.util.Scanner;
public class PromoBelanja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("                    Kharisma Agung Plaza ( KAP )                    ");
        System.out.println("                     Promo Belanja Berhadiah                 ");
        System.out.println("                 Khusus Pembelian 5 Barang Pertama              ");
        System.out.println("                 Dengan harga minimum Rp 10000,00              ");
        System.out.println("--------------------------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = scan.nextLine();

        int totalHarga = 0;
        int minHarga = 10000;
        int jumlahBarang = 5;

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            int harga = scan.nextInt();

            if (harga < minHarga) {
                System.out.println("Harga barang harus minimal Rp " + minHarga + ",00. Silakan masukkan ulang.");
                i--; 
            } else {
                totalHarga += harga;
            }
        }

        System.out.println("\nTotal harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);

        if (totalHarga >= 100000) {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
        }

        System.out.println("----------------------------------------------------");
        System.out.println("                    Terima Kasih                    ");
        System.out.println("       Anda sudah belanja di Kharisma Agung Plaza                    ");
        System.out.println("----------------------------------------------------");

        scan.close();
    }
}

