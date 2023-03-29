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
    
    //constructor
    public oli(String a, long b, String c, String d, String e, String f, String item, int harga, String jenis) {
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
    
    //method menampilkan objek
    @Override
    public void tampil(){
        super.tampilkan();
        System.out.println("Jenis Item : " + this.jenis);
        System.out.println("-----------------------------------------------");
    }
    
    //overload
    public void tampil(boolean showOli){
        if (showOli) tampil();
        else super.tampil();
    }
}
