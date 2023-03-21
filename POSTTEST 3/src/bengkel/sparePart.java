package bengkel;

/**
 *
 * @author Harlin
 */
public class sparePart{
    protected String item;
    protected int harga;
    
    public sparePart(String item, int harga){
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
}
