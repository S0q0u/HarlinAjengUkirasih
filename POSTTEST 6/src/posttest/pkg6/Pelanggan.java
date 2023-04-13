/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg6;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Harlin
 */
public class Pelanggan {
    public String antrian, nama, kendaraan, perbaikan, nomor;
    public long NIK;
    
    //arraylist pelanggan
    static ArrayList <Pelanggan> Pelanggan = new ArrayList<>();
    static HashSet <String> antri = new HashSet <>();
    
    //constructor
    public Pelanggan(String a, long b, String c, String d, String e, String f){
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
    }
    
    //setter
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
    
    //getter
    public String getAntri() {
        return antrian;
    }

    public String getNama() {
        return nama;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public String getPerbaikan() {
        return perbaikan;
    }

    public String getNomor() {
        return nomor;
    }
    
    public long getNIK() {
        return NIK;
    }
}
