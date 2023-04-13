/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg6;

/**
 *
 * @author Harlin
 */
public class Oli extends Sparepart{
    private String jenis;
    
    //constructor
    public Oli(String a, long b, String c, String d, String e, String f, String item, int harga, String jenis) {
        super(a,b,c,d,e,f,item, harga);
        this.jenis = jenis;
    }

    //setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    //getter
    public String getJenis() {
        return jenis;
    }
    
    @Override
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
        System.out.println("Jenis Item : " + this.jenis);
        System.out.println("-----------------------------------------------");
    }
    
    //overload
    public void tampil(boolean showOli){
        if (showOli) tampilkan();
        else super.tampil();
    }
}
