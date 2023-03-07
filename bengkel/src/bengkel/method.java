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

public class method {
    static String antrian, nama, kendaraan, perbaikan, nomor;
    static long NIK;
     
    static InputStreamReader masuk = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(masuk);
    
    static void tambah() throws IOException {
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
                pelanggan data = new pelanggan(antrian, NIK, nama, kendaraan, perbaikan, nomor);
                pelanggan.add(data);
                System.out.println("-----------------------------------------------");
                System.out.println("----------: Data Berhasil Ditambah :-----------");
                System.out.println("-----------------------------------------------");
                System.out.println("");
            }
            break;
        }
    }
    
    static void lihat(){
        if(pelanggan.isEmpty()){
            System.out.println("Belum ada data");
        } 
        else{
            System.out.println("");
            for (int i = 0; i < pelanggan.size(); i++) {
                System.out.println("-----------------------------------------------");
                System.out.println("Data Pelanggan ke-" + (i + 1));
                pelanggan.get(i).tampil();
            }
        }
        System.out.println("");
    }
    
    static void edit() throws IOException {
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
        System.out.print("Jenis Perbaikan");
        pelanggan.get(indeks).setPerbaikan(br.readLine());
        System.out.print("Nomor Telepon : ");
        pelanggan.get(indeks).setNomor(br.readLine());
        System.out.println("-----------------------------------------------");
        System.out.println("-----------: Data Berhasil Diubah :------------");
        System.out.println("-----------------------------------------------");
        System.out.println("");
    }

    static void hapus() throws IOException{
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
