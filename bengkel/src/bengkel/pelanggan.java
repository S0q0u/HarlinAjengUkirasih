/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */

import java.util.ArrayList;
import java.util.HashSet;

public class pelanggan {
    String antrian, nama, kendaraan, perbaikan, nomor;
    long NIK;
    
    //arraylist pelanggan
    static ArrayList <pelanggan> pelanggan = new ArrayList<>();
    static HashSet <String> antri = new HashSet <>();
    
    //constructor
    public pelanggan(String a, long b, String c, String d, String e, String f){
        this.antrian = a;
        this.NIK = b;
        this.nama = c;
        this.kendaraan = d;
        this.perbaikan = e;
        this.nomor = f;
    }
    
    //method menampilkan objek
    public void tampil(){
        System.out.println("-----------------------------------------------");
        System.out.println("Kode Antrian : " + this.antrian);
        System.out.println("NIK Pelanggan : " + this.NIK);
        System.out.println("Nama Pelanggan : " + this.nama);
        System.out.println("Jenis Kendaraan : " + this.kendaraan);
        System.out.println("Jenis Perbaikan : " + this.perbaikan);
        System.out.println("Nomor Telepon : " + this.nomor);
        System.out.println("-----------------------------------------------");
    }
    
    //set
    public void setAntri(String antrian){
        this.antrian = antrian;
    }
    
    public void setNIK(long NIK){
        this.NIK = NIK;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setKendaraan(String kendaraan){
        this.kendaraan = kendaraan;
    }
    
    public void setPerbaikan(String perbaikan){
        this.perbaikan = perbaikan;
    }
    
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
}
