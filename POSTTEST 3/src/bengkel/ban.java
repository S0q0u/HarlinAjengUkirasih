/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */

public class ban extends sparePart{
    private int ukuran;
    private String merk;
    String antri, nama, kendaraan, perbaikan, nomor, iBan;
    int hargaBan;
    long NIK;
    
    public ban(String item, int harga, String antri, long NIK, String nama, String kendaraan, String perbaikan, String merk, int ukuran, String nomor){
        super(item, harga);
        this.antri = antri;
        this.NIK = NIK;
        this.nama = nama;
        this.kendaraan = kendaraan;
        this.perbaikan = perbaikan;
        this.merk = merk;
        this.ukuran = ukuran;
        this.nomor = nomor;
    }

    //setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

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
    
    public void setiBan(String iBan) {
        this.iBan = iBan;
    }
    
    public void setHargaBan(int hargaBan) {
        this.hargaBan = hargaBan;
    }
    
    public void setNIK(long NIK) {
        this.NIK = NIK;
    }
    
    //getter
    public String getMerk() {
        return merk;
    }
    
    public int getUkuran() {
            return ukuran;
        }
    
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

    public String getiBan() {
        return iBan;
    }

    public long getNIK() {
        return NIK;
    }
    
    public int getHargaBan(){
        return hargaBan;
    }
    
    public void tampilBan(){
        System.out.println("-----------------------------------------------");
        System.out.println("Kode Antrian : " + this.antri);
        System.out.println("NIK Pelanggan : " + this.NIK);
        System.out.println("Nama Pelanggan : " + this.nama);
        System.out.println("Jenis Kendaraan : " + this.kendaraan);
        System.out.println("Jenis Perbaikan : " + this.perbaikan);
        System.out.println("Nama Item : " + super.item);
        System.out.println("Harga Item : " + super.harga);
        System.out.println("Merk Item : " + this.merk);
        System.out.println("Ukuran Item : " + this.ukuran);
        System.out.println("Nomor Telepon : " + this.nomor);
        System.out.println("-----------------------------------------------");
    }
    
}
