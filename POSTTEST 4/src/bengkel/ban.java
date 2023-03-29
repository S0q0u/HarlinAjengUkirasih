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
    public void tampil(){
        super.tampilkan();
        System.out.println("Merk Item : " + this.merk);
        System.out.println("Ukuran Item : " + this.ukuran);
        System.out.println("-----------------------------------------------");
    }
    
    //overload
    public void tampil(boolean showBan){
        if (showBan) tampil();
        else super.tampil();
    }
}
