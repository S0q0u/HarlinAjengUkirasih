/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */
import static bengkel.pelanggan.antri;
import static bengkel.pelanggan.pelanggan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class method {
    static String antrian, nama, kendaraan, perbaikan, nomor, item, merk, jenis;
    static int harga, ukuran;
    static long NIK;
    
    //ArrayList
    static ArrayList <ban> dtban = new ArrayList<>();
    static ArrayList <oli> dtoli = new ArrayList<>();
     
    static InputStreamReader masuk = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(masuk);
    
    //penerapan final pada method
    static final void tambah() throws IOException {
        System.out.print("Kode Antrian : ");
        antrian = br.readLine();
        for(int i = 0; i <= pelanggan.size(); i++) {
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
                        NIK = Long.parseLong(br.readLine());
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
                        ban data = new ban(antrian, NIK, nama, kendaraan, perbaikan, nomor, item, harga, merk, ukuran);
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
                        oli data2 = new oli(antrian,  NIK, nama, kendaraan, perbaikan, nomor, item, harga, jenis);
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
                        pelanggan data3 = new pelanggan(antrian,  NIK, nama, kendaraan, perbaikan, nomor);
                        pelanggan.add(data3);
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
    
    static void lihat() throws IOException{
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
            if (pelanggan.isEmpty()){
                System.out.println("Belum ada data");
            } 
            else{
                System.out.println("");
                for (int i = 0; i < pelanggan.size(); i++) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Data Pelanggan ke-" + (i + 1));
                    pelanggan.get(i).tampil();
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
    
    static void edit() throws IOException {
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
            if (pelanggan.isEmpty()){
                System.out.println("Belum ada data");
            } 
            else{
                for (int i = 0; i < pelanggan.size(); i++) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Data Pelanggan ke-" + (i + 1));
                    pelanggan.get(i).tampil();
                    System.out.println("-----------------------------------------------");
                }
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.print("Pilih nomor urut data pelanggan : ");
                int indx = Integer.parseInt(br.readLine());
                int indeks = indx - 1;
                System.out.println("-----------------------------------------------");
                System.out.println("Data baru");
                System.out.println("-----------------------------------------------");
                System.out.print("Kode Antrian : ");
                pelanggan.get(indeks).setAntri(br.readLine());
                System.out.print("NIK Pelanggan : ");
                pelanggan.get(indeks).setNIK(Long.parseLong(br.readLine()));
                System.out.print("Nama Pelanggan : ");
                pelanggan.get(indeks).setNama(br.readLine());
                System.out.print("Jenis Kendaraan : ");
                pelanggan.get(indeks).setKendaraan(br.readLine());
                System.out.print("Jenis Perbaikan : ");
                pelanggan.get(indeks).setPerbaikan(br.readLine());
                System.out.print("Nomor Telepon : ");
                pelanggan.get(indeks).setNomor(br.readLine());
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
                    System.out.print("Pilih nomor urut data pelanggan : ");
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
                    System.out.print("Pilih nomor urut data pelanggan : ");
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

    static void hapus() throws IOException{
        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("[1]. Data Pelanggan Biasa");
        System.out.println("[2]. Data Pelanggan Beli");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukkan pilihan : ");
        int hapus = Integer.parseInt(br.readLine());
        System.out.println("-----------------------------------------------");
        if (hapus == 1){
            if (pelanggan.isEmpty()){
                    System.out.println("Belum ada data");
            }
            else{
                System.out.println("");
                for (int i = 0; i < pelanggan.size(); i++) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Data Pelanggan ke-" + (i + 1));
                    pelanggan.get(i).tampil();
                    System.out.println("-----------------------------------------------");
                }
                System.out.println("");
                System.out.println("-----------------------------------------------");
                System.out.print("Pilih nomor urut data pelanggan : ");
                int indx = Integer.parseInt(br.readLine());
                int indeks = indx - 1;
                pelanggan.remove(indeks);
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
                    System.out.print("Pilih nomor urut data ban : ");
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
                    System.out.print("Pilih nomor urut data oli : ");
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
}