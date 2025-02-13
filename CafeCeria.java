/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masyaallah;
import java.util.Scanner;
public class CafeCeria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("----------------------------------------------------");
        System.out.println("                     CAFE CERIA                     ");
        System.out.println("                    ANEKA MINUMAN                   ");
        System.out.println("----------------------------------------------------");
        System.out.println("                    SPECIAL MENU                    ");
        System.out.println("                  1. Soft Drinks                    ");
        System.out.println("                  2. Mix Juice                      ");
        System.out.println("                  3. Nescafe                        ");
        System.out.println("                  4. Soda Milk                      ");
        System.out.println("                  5. Tea                            ");
        System.out.println("----------------------------------------------------");
        
        System.out.print("Masukkan nama pembeli : ");
        String nama = scan.nextLine();
        
        System.out.print("Silahkan masukkan pilihan anda : ");
        int pilihan = scan.nextInt();
        String minuman = "";
        
        switch (pilihan) {
             case 1:
                minuman = "Soft drinks";
                break;
            case 2:
                minuman = "Mix Juice";
                break;
            case 3:
                minuman = "Nescafe";
                break;
            case 4:
                minuman = "Soda Milk";
                break;
            case 5:
                minuman = "Tea";
                break;
            default:
                System.out.println("Maaf, Pilihan Tidak Tersedia.");
                return;
        }
        
        System.out.println("Minuman yang anda pesan adalah " +minuman);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih " + nama + " Telah Berkunjung di Cafe Ceria");

        scan.close();
    }
}
