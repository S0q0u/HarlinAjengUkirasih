/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest.pkg6;


/**
 *
 * @author Harlin
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Praktikum6 {
    public String antrian, nama, kendaraan, perbaikan, nomor, item, merk, jenis;
    public int harga, ukuran;
    public long NIK;
    
    static InputStreamReader masuk = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(masuk);
    
    //penerapan final pada variabel  
    static final boolean jalan = true;

    public String getAntrian() {
        return antrian;
    }

    public void setAntrian(String antrian) {
        this.antrian = antrian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public String getPerbaikan() {
        return perbaikan;
    }

    public void setPerbaikan(String perbaikan) {
        this.perbaikan = perbaikan;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public long getNIK() {
        return NIK;
    }

    public void setNIK(long NIK) {
        this.NIK = NIK;
    }
    
     //penerapan static pada method
    static void menu() throws IOException {
        ArrayList<Admin> dataAdmin = new ArrayList<>();
        ArrayList<Owner> dataOwner = new ArrayList<>();
        dataAdmin.add(new Admin("admin","admin"));
        dataOwner.add(new Owner("owner","owner"));
        
        System.out.println("""
                           -----------------------------------------------
                           -------: Program Pendataan Bengkel NEO :-------
                           -----------------------------------------------
                           Silakan pilih menu :
                           [1]. Login
                           [0]. Exit
                           -----------------------------------------------""");
        System.out.print("Masukkan pilihan : ");
        int pilih = Integer.parseInt(br.readLine());
        System.out.println("-----------------------------------------------");
        
        switch(pilih){
            case 1 : { 
                System.out.print("Username : ");
                String username = br.readLine();
                System.out.print("Password : ");
                String password = br.readLine();
                for (Admin Admin : dataAdmin){
                    if(username.equals(Admin.getUsername()) && password.equals(Admin.getPassword())){
                        Admin.menu();
                    }
                }
                for (Owner Owner : dataOwner){
                    if(username.equals(Owner.getUsername()) && password.equals(Owner.getPassword())){
                        Owner.menu();
                    }
                }
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
