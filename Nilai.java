/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package masyaallah;
import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        int nilai;
        String grade = null;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inputkan nilai : ");
        nilai = scan.nextInt();
        
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B";
        } else if (nilai >= 70) {
            grade = "C+";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 50) {
            grade = "D";
        } else if (nilai >= 40) {
            grade = "E";
    }
        System.out.println("Grade : " +grade);
}
}

