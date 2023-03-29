/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */
public class sparePart extends pelanggan{
    protected String item;
    protected int harga; 
    
    public sparePart(String a, long b, String c, String d, String e, String f, String item, int harga){
        super(a, b, c, d, e, f);
        this.item = item;
        this.harga = harga;
    }
    
    //setter
    public void setItem(String item) {
            this.item = item;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //getter
    public String getItem() {
        return item;
    }

    public int getHarga() {
        return harga;
    }
    
    public void tampilkan(){
        System.out.println("-----------------------------------------------");
        System.out.println("Kode Antrian : " + super.antrian);
        System.out.println("NIK Pelanggan : " + super.NIK);
        System.out.println("Nama Pelanggan : " + super.nama);
        System.out.println("Jenis Kendaraan : " + super.kendaraan);
        System.out.println("Jenis Perbaikan : " + super.perbaikan);
        System.out.println("Nomor Telepon : " + super.nomor);
        System.out.println("Nama Item : " + this.item);
        System.out.println("Harga Item : " + this.harga);
    }
}
