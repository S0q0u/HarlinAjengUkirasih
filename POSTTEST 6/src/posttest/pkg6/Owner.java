/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static posttest.pkg6.Pelanggan.Pelanggan;

/**
 *
 * @author Harlin
 */
public class Owner extends Acc implements InterfaceOwner{
    public String antrian, nama, kendaraan, perbaikan, nomor, item, merk, jenis;
    
    static ArrayList <Ban> dtban = new ArrayList<>();
    static ArrayList <Oli> dtoli = new ArrayList<>();
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    //constructor
    public Owner(String username, String password){
        super(username,password);
    }
    
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
    

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void menu(){
        try{
            while(true){
                System.out.println("""
                           -----------------------------------------------
                           -------: Program Pendataan Bengkel NEO :-------
                           -----------------------------------------------
                           Silakan pilih menu :
                           [1]. Lihat Data
                           [0]. Exit
                           -----------------------------------------------""");
                System.out.print("Masukkan pilihan : ");
                int pilih = Integer.parseInt(br.readLine());
                System.out.println("-----------------------------------------------");

                switch(pilih){
                    case 1 : { 
                        lihat();
                        break;
                    }
                    case 0 : {
                        return;
                    }
                    default : {
                        System.out.println("Pilihan Tidak Ada");
                    }
                }
            }
        }
        catch(Exception c){
            System.out.println(c);
        }
    }
    
    @Override
    public void lihat(){
        try{
            System.out.println("");
            System.out.println("-----------------------------------------------");
            System.out.println("---------------- DISPLAY MENU -----------------");
            System.out.println("-----------------------------------------------");
            System.out.println("[1]. Data Pelanggan Biasa");
            System.out.println("[2]. Data Pelanggan Beli");
            System.out.println("-----------------------------------------------");
            System.out.print("Masukkan pilihan : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("-----------------------------------------------");
            if (pilih == 1){
                if (Pelanggan.isEmpty()){
                    System.out.println("Belum ada data");
            } 
            else{
                System.out.println("");
                for (int i = 0; i < Pelanggan.size(); i++) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Data Pelanggan ke-" + (i + 1));
                    Pelanggan.get(i).tampil();
                    System.out.println("-----------------------------------------------");
                    }
                }
            }
        else if (pilih == 2){
            System.out.println("");
            System.out.println("-----------------------------------------------");
            System.out.println("---------------- DISPLAY MENU -----------------");
            System.out.println("-----------------------------------------------");
            System.out.println("[1]. Pembelian Ban");
            System.out.println("[2]. Pembelian Oli");
            System.out.println("-----------------------------------------------");
            System.out.print("[1/2]? : ");
            int beli = Integer.parseInt(br.readLine());
            System.out.println("-----------------------------------------------");
            if (beli == 1){
                if (dtban.isEmpty()){
                    System.out.println("Belum ada data");
                }
                else{
                    System.out.println("");
                    for (int i = 0; i < dtban.size(); i++) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Data Pelanggan ke-" + (i + 1));
                        dtban.get(i).tampil(true);
                    }
                }
            }
            else if (beli == 2){
                if (dtoli.isEmpty()){
                    System.out.println("Belum ada data");
                }
                else{
                    System.out.println("");
                    for (int i = 0; i < dtoli.size(); i++) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Data Pelanggan ke-" + (i + 1));
                        dtoli.get(i).tampil(true);
                    }
                }
            }
        }
        System.out.println("");
        }
        catch(Exception c){
            System.out.println(c);
        }
    }
}
