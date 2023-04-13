/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static posttest.pkg6.Pelanggan.Pelanggan;
import static posttest.pkg6.Pelanggan.antri;

/**
 *
 * @author Harlin
 */


public class Admin extends Acc implements InterfaceAdmin{
    public String antrian, nama, kendaraan, perbaikan, nomor, item, merk, jenis;
    public int harga, ukuran;
    
    static ArrayList <Ban> dtban = new ArrayList<>();
    static ArrayList <Oli> dtoli = new ArrayList<>();
    
    //constructor
    public Admin(String username, String password){
        super(username,password);
    }

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

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
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

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
                        return;
                    }
                    default : {
                        System.out.println("Pilihan Tidak Ada!!");
                    }
                }
            }
        }
        catch(Exception c){
            System.out.println(c);
        }
    }
    
    @Override
    public void tambah(){
        try{
            System.out.print("Kode Antrian : ");
            antrian = br.readLine();
            for(int i = 0; i <= Pelanggan.size(); i++) {
                if(antri.contains(antrian)) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("----------! Kode Antrian Sudah Ada !-----------");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");
                    tambah();
                } 
                else {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Pembelian Spare Part??");
                    System.out.println("[1]. Ban");
                    System.out.println("[2]. Oli");
                    System.out.println("[0]. Tidak");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Masukkan Pilihan : ");
                    int beli = Integer.parseInt(br.readLine());
                    System.out.println("-----------------------------------------------");
                    switch (beli) {
                        case 1:
                            System.out.print("Nama Item : ");
                            item = (br.readLine());
                            System.out.print("Harga Item : ");
                            harga = Integer.parseInt(br.readLine());
                            antri.add(antrian);
                            System.out.print("NIK Pelanggan : ");
                        long NIK = Long.parseLong(br.readLine());
                            System.out.print("Nama Pelanggan : ");
                            nama = br.readLine();
                            System.out.print("Jenis Kendaraan : ");
                            kendaraan = br.readLine();
                            System.out.print("Jenis Perbaikan : ");
                            perbaikan = br.readLine();
                            System.out.print("Merk Item : ");
                            merk = br.readLine();
                            System.out.print("Ukuran Item : ");
                            ukuran = Integer.parseInt(br.readLine());
                            System.out.print("Nomor Telepon : ");
                            nomor = br.readLine();
                            Ban data = new Ban(antrian, NIK, nama, kendaraan, perbaikan, nomor, item, harga, merk, ukuran);
                            dtban.add(data);
                            System.out.println("-----------------------------------------------");
                            System.out.println("----------: Data Berhasil Ditambah :-----------");
                            System.out.println("-----------------------------------------------");
                            System.out.println("");
                            break;

                        case 2:
                            System.out.print("Nama Item : ");
                            item = br.readLine();
                            System.out.print("Harga Item : ");
                            harga = Integer.parseInt(br.readLine());
                            antri.add(antrian);
                            System.out.print("NIK Pelanggan : ");
                            NIK = Long.parseLong(br.readLine());
                            System.out.print("Nama Pelanggan : ");
                            nama = br.readLine();
                            System.out.print("Jenis Kendaraan : ");
                            kendaraan = br.readLine();
                            System.out.print("Jenis Perbaikan : ");
                            perbaikan = br.readLine();
                            System.out.print("Jenis Item : ");
                            jenis = br.readLine();
                            System.out.print("Nomor Telepon : ");
                            nomor = br.readLine();
                            Oli data2 = new Oli(antrian,  NIK, nama, kendaraan, perbaikan, nomor, item, harga, jenis);
                            dtoli.add(data2);
                            System.out.println("-----------------------------------------------");
                            System.out.println("----------: Data Berhasil Ditambah :-----------");
                            System.out.println("-----------------------------------------------");
                            System.out.println("");
                            break;
                            
                        case 0:
                            antri.add(antrian);
                            System.out.print("NIK Pelanggan : ");
                            NIK = Long.parseLong(br.readLine());
                            System.out.print("Nama Pelanggan : ");
                            nama = br.readLine();
                            System.out.print("Jenis Kendaraan : ");
                            kendaraan = br.readLine();
                            System.out.print("Jenis Perbaikan : ");
                            perbaikan = br.readLine();
                            System.out.print("Nomor Telepon : ");
                            nomor = br.readLine();
                            Pelanggan data3 = new Pelanggan(antrian,  NIK, nama, kendaraan, perbaikan, nomor);
                            Pelanggan.add(data3);
                            System.out.println("-----------------------------------------------");
                            System.out.println("----------: Data Berhasil Ditambah :-----------");
                            System.out.println("-----------------------------------------------");
                            System.out.println("");
                            break;
                            
                        default : 
                            System.out.println("Pilihan Tidak Ada");
                    }
                }
                break;
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
    
    @Override
    public void hapus(){
        try{
            System.out.println("");
            System.out.println("-----------------------------------------------");
            System.out.println("[1]. Data Pelanggan Biasa");
            System.out.println("[2]. Data Pelanggan Beli");
            System.out.println("-----------------------------------------------");
            System.out.print("Masukkan pilihan : ");
            int hapus = Integer.parseInt(br.readLine());
            System.out.println("-----------------------------------------------");
            if (hapus == 1){
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
                    System.out.println("");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Pilih nomor urut data Pelanggan : ");
                    int indx = Integer.parseInt(br.readLine());
                    int indeks = indx - 1;
                    Pelanggan.remove(indeks);
                    System.out.println("-----------------------------------------------");
                    System.out.println("-----------: Data Berhasil Dihapus :-----------");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");
                }
            }
            else{
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.println("[1]. Pembelian Ban");
                System.out.println("[2]. Pembelian Oli");
                System.out.println("-----------------------------------------------");
                System.out.print("[1/2]? : ");
                int pilihan = Integer.parseInt(br.readLine());
                System.out.println("-----------------------------------------------");
                if (pilihan == 1){
                    if (dtban.isEmpty()){
                        System.out.println("Belum ada data");
                    } 
                    else{
                        for (int i = 0; i < dtban.size(); i++) {
                            System.out.println("-----------------------------------------------");
                            System.out.println("Data Pelanggan ke-" + (i + 1));
                            dtban.get(i).tampil(true);
                        }
                        System.out.println("");
                        System.out.println("-----------------------------------------------");
                        System.out.print("Pilih nomor urut data Ban : ");
                        int indx = Integer.parseInt(br.readLine());
                        int indeks = indx - 1;
                        dtban.remove(indeks);
                        System.out.println("-----------------------------------------------");
                        System.out.println("-----------: Data Berhasil Dihapus :-----------");
                        System.out.println("-----------------------------------------------");
                        System.out.println("");
                        }
                    }
                else{
                    if (dtoli.isEmpty()){
                        System.out.println("Belum ada data");
                    } 
                    else{
                        for (int i = 0; i < dtoli.size(); i++) {
                            System.out.println("-----------------------------------------------");
                            System.out.println("Data Pelanggan ke-" + (i + 1));
                            dtoli.get(i).tampil(true);
                        }
                        System.out.println("");
                        System.out.println("-----------------------------------------------");
                        System.out.print("Pilih nomor urut data Oli : ");
                        int indx = Integer.parseInt(br.readLine());
                        int indeks = indx - 1;
                        dtoli.remove(indeks);
                        System.out.println("-----------------------------------------------");
                        System.out.println("-----------: Data Berhasil Dihapus :-----------");
                        System.out.println("-----------------------------------------------");
                        System.out.println("");
                    }
                }
            }
        }
        catch(Exception c){
            System.out.println(c);
        }
    }
    
    @Override
    public void edit(){
        try{
            System.out.println("");
            System.out.println("-----------------------------------------------");
            System.out.println("[1]. Data Pelanggan Biasa");
            System.out.println("[2]. Data Pelanggan Beli");
            System.out.println("-----------------------------------------------");
            System.out.print("Masukkan pilihan : ");
            int ubah = Integer.parseInt(br.readLine());
            System.out.println("-----------------------------------------------");
            if (ubah == 1){
                System.out.println("");
                if (Pelanggan.isEmpty()){
                    System.out.println("Belum ada data");
                } 
                else{
                    for (int i = 0; i < Pelanggan.size(); i++) {
                        System.out.println("-----------------------------------------------");
                        System.out.println("Data Pelanggan ke-" + (i + 1));
                        Pelanggan.get(i).tampil();
                        System.out.println("-----------------------------------------------");
                    }
                    System.out.println("");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Pilih nomor urut data Pelanggan : ");
                    int indx = Integer.parseInt(br.readLine());
                    int indeks = indx - 1;
                    System.out.println("-----------------------------------------------");
                    System.out.println("Data baru");
                    System.out.println("-----------------------------------------------");
                    System.out.print("Kode Antrian : ");
                    Pelanggan.get(indeks).setAntri(br.readLine());
                    System.out.print("NIK Pelanggan : ");
                    Pelanggan.get(indeks).setNIK(Long.parseLong(br.readLine()));
                    System.out.print("Nama Pelanggan : ");
                    Pelanggan.get(indeks).setNama(br.readLine());
                    System.out.print("Jenis Kendaraan : ");
                    Pelanggan.get(indeks).setKendaraan(br.readLine());
                    System.out.print("Jenis Perbaikan : ");
                    Pelanggan.get(indeks).setPerbaikan(br.readLine());
                    System.out.print("Nomor Telepon : ");
                    Pelanggan.get(indeks).setNomor(br.readLine());
                    System.out.println("-----------------------------------------------");
                    System.out.println("-----------: Data Berhasil Diubah :------------");
                    System.out.println("-----------------------------------------------");
                    System.out.println("");
                }
            }
            else if (ubah == 2){
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.println("[1]. Pembelian Ban");
                System.out.println("[2]. Pembelian Oli");
                System.out.println("-----------------------------------------------");
                System.out.print("[1/2]? : ");
                int pilihan = Integer.parseInt(br.readLine());
                System.out.println("-----------------------------------------------");
                if (pilihan == 1){
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
                        System.out.println("-----------------------------------------------");
                        System.out.print("Pilih nomor urut data Pelanggan : ");
                        int indx = Integer.parseInt(br.readLine());
                        int indeks = indx - 1;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Data baru");
                        System.out.println("-----------------------------------------------");
                        System.out.print("Kode Antrian : ");
                        dtban.get(indeks).setAntri(br.readLine());
                        System.out.print("Nama Item : ");
                        dtban.get(indeks).setItem(br.readLine());
                        System.out.print("Harga Item : ");
                        dtban.get(indeks).setHarga(Integer.parseInt(br.readLine()));
                        System.out.print("NIK Pelanggan : ");
                        dtban.get(indeks).setNIK(Long.parseLong(br.readLine()));
                        System.out.print("Nama Pelanggan : ");
                        dtban.get(indeks).setNama(br.readLine());
                        System.out.print("Jenis Kendaraan : ");
                        dtban.get(indeks).setKendaraan(br.readLine());
                        System.out.print("Jenis Perbaikan : ");
                        dtban.get(indeks).setPerbaikan(br.readLine());
                        System.out.print("Merk Item : ");
                        dtban.get(indeks).setMerk(br.readLine());
                        System.out.print("Ukuran Item : ");
                        dtban.get(indeks).setUkuran(Integer.parseInt(br.readLine()));
                        System.out.print("Nomor Telepon : ");
                        dtban.get(indeks).setNomor(br.readLine());
                        System.out.println("-----------------------------------------------");
                        System.out.println("-----------: Data Berhasil Diubah :------------");
                        System.out.println("-----------------------------------------------");
                        System.out.println("");
                    }
                }
                else if (pilihan == 2){
                    if (dtoli.isEmpty()){
                        System.out.println("Belum ada data");
                    } 
                    else{
                        for (int i = 0; i < dtoli.size(); i++) {
                            System.out.println("-----------------------------------------------");
                            System.out.println("Data Pelanggan ke-" + (i + 1));
                            dtoli.get(i).tampil(true);
                        }
                        System.out.println("-----------------------------------------------");
                        System.out.print("Pilih nomor urut data Pelanggan : ");
                        int indx = Integer.parseInt(br.readLine());
                        int indeks = indx - 1;
                        System.out.println("-----------------------------------------------");
                        System.out.println("Data baru");
                        System.out.println("-----------------------------------------------");
                        System.out.print("Kode Antrian : ");
                        dtoli.get(indeks).setAntri(br.readLine());
                        System.out.print("NIK Pelanggan : ");
                        dtoli.get(indeks).setNIK(Long.parseLong(br.readLine()));
                        System.out.print("Nama Pelanggan : ");
                        dtoli.get(indeks).setNama(br.readLine());
                        System.out.print("Jenis Kendaraan : ");
                        dtoli.get(indeks).setKendaraan(br.readLine());
                        System.out.print("Jenis Perbaikan : ");
                        dtoli.get(indeks).setPerbaikan(br.readLine());
                        System.out.print("Nama Item : ");
                        dtoli.get(indeks).setItem(br.readLine());
                        System.out.print("Jenis Item : ");
                        dtoli.get(indeks).setJenis(br.readLine());
                        System.out.print("Harga Item : ");
                        dtoli.get(indeks).setHarga(Integer.parseInt(br.readLine()));
                        System.out.print("Nomor Telepon : ");
                        dtoli.get(indeks).setNomor(br.readLine());
                        System.out.println("-----------------------------------------------");
                        System.out.println("-----------: Data Berhasil Diubah :------------");
                        System.out.println("-----------------------------------------------");
                        System.out.println("");
                    }
                }
                else{
                    System.out.println("Pilihan Tidak Ada");
                }
            }
        }
        catch(Exception c){
            System.out.println(c);
        }
    }
}
