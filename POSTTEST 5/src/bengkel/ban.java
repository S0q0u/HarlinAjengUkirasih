/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bengkel;

/**
 *
 * @author Harlin
 */

//penerapan final pada class
public final class ban extends sparePart{
    private int ukuran;
    private String merk;
    
    public ban(String a, long b, String c, String d, String e, String f, String item, int harga,String merk, int ukuran){
//        super(a,b,c,d,e,f,item,harga,merk,ukuran);
        super(a,b,c,d,e,f,item, harga);
        this.merk = merk;
        this.ukuran = ukuran;
    }

    //setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
    //getter
    public String getMerk() {
        return merk;
    }
    
    public int getUkuran() {
            return ukuran;
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
        System.out.println("Merk Item : " + this.merk);
        System.out.println("Ukuran Item : " + this.ukuran);
        System.out.println("-----------------------------------------------");
    }
    
//    @Override
//    public void tampil(){
//        tampilkan();
////        super.tampilkan();
//        System.out.println("Merk Item : " + this.merk);
//        System.out.println("Ukuran Item : " + this.ukuran);
//        System.out.println("-----------------------------------------------");
//    }
    
    //overload
    public void tampil(boolean showBan){
        if (showBan) tampilkan();
        else super.tampil();
    }
}
