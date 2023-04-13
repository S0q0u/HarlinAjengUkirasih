/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest.pkg6;

/**
 *
 * @author Harlin
 */
public abstract class Sparepart extends Pelanggan{
    protected String item;
    protected int harga; 
    
    public Sparepart(String a, long b, String c, String d, String e, String f, String item, int harga){
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
    
    public abstract void tampilkan();
}
