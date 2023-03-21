/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */
public class oli extends sparePart{
    private String jenis;
    String antri, nama, kendaraan, perbaikan, nomor;
    long NIK;
    
    //constructor
    public oli (String item, int harga, String antri, long NIK, String nama, String kendaraan, String perbaikan, String jenis,  String nomor){
        super(item, harga);
        this.antri = antri;
        this.NIK = NIK;
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.perbaikan = perbaikan;
        this.jenis = jenis;
        this.nomor = nomor;
    }

    //setter
    public void setAntri(String antri) {
        this.antri = antri;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKendaraan(String kendaraan) {
        this.kendaraan = kendaraan;
    }

    public void setPerbaikan(String perbaikan) {
        this.perbaikan = perbaikan;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    
    public void setNIK(long NIK) {
        this.NIK = NIK;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    //getter
    public String getAntri() {
        return antri;
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

    public String getJenis() {
        return jenis;
    }
    
    public oli(String item, int harga, String jenis) {
        super(item, harga);
        this.jenis = jenis;
    }
    
    //method menampilkan objek
    public void tampilOli(){
        System.out.println("-----------------------------------------------");
        System.out.println("Kode Antrian : " + this.antri);
        System.out.println("NIK Pelanggan : " + this.NIK);
        System.out.println("Nama Pelanggan : " + this.nama);
        System.out.println("Jenis Kendaraan : " + this.kendaraan);
        System.out.println("Jenis Perbaikan : " + this.perbaikan);
        System.out.println("Nama Item : " + super.item);
        System.out.println("Harga Item : " + super.harga);
        System.out.println("Jenis Item : " + this.jenis);
        System.out.println("Nomor Telepon : " + this.nomor);
        System.out.println("-----------------------------------------------");
    }
}
