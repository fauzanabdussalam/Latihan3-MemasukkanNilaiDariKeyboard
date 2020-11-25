/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan3.memasukkannilaidarikeyboard;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Fauzan Muhammad Abdussalam
 * KELAS    : IF-10K
 * NIM      : 10119901
 * Deskripsi Program : Memasukkan Nilai Dari Keyboard
 *
 */
public class PBO10K10119901Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
    
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
