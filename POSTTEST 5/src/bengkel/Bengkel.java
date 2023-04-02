
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */

import static bengkel.method.tambah;
import static bengkel.method.lihat;
import static bengkel.method.edit;
import static bengkel.method.hapus;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bengkel {
    static InputStreamReader masuk = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(masuk);
    
    //penerapan final pada variabel  
    static final boolean jalan = true;
    
    static void menu() throws IOException {
        System.out.println("""
                           -----------------------------------------------
                           -------: Program Pendataan Bengkel NEO :-------
                           -----------------------------------------------
                           Silakan pilih menu :
                           [1]. Tambah Data
                           [2]. Lihat Data
                           [3]. Edit Data
                           [4]. Hapus Data
                           [0]. Exit
                           -----------------------------------------------""");
        System.out.print("Masukkan pilihan : ");
        int pilih = Integer.parseInt(br.readLine());
        System.out.println("-----------------------------------------------");
        
        switch(pilih){
            case 1 : { 
                tambah();
                break;
            }
            case 2 : {
                lihat();
                break;
            }
            case 3 : {
                edit();
                break;
            }
            case 4 : {
                hapus();
                break;
            }
            case 0 : {
                System.out.println("You've been choosing exit program");
                System.exit(0);
                break;
            }
            default : {
                System.out.println("Pilihan Tidak Ada!!");
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        do {
            menu();
        }
        while(jalan);
    }
}