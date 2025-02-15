/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masyaallah;
import java.util.Scanner;
public class Lampu {
    public static void main(String[] args) {
      String lampu;
      Scanner scan = new Scanner(System.in);
      
        System.out.print("Inputkan data : ");
        lampu = scan.nextLine();  
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, hati hati!!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!!");
                break;
            default:
                System.out.println("Warna lampu salah!!");
        }
    }
}
