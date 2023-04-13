
import java.util.ArrayList;
import java.util.List;


public abstract class Oyuncu {
    public int oyuncuID=0;
    public float skor=0;
    public String oyuncuAdi;
    public List<Nesne> liste = new ArrayList<>();
    public Oyuncu(){
        
    }
    public Oyuncu(int oyuncuID, String oyuncuAdi){
        
    }
    
    public int getOyuncuID(){
        return oyuncuID;        
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public float getSkor() {
        return skor;
    }

    public void setSkor(float skor) {
        this.skor = skor;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public float skorGoster() {
        for (int j = 0; j < this.liste.size(); j++) {
                this.skor = this.skor + this.liste.get(j).getDayaniklilik();
            }
        return this.skor;
    }
    
    public String nesneListesi(String o){
        return o;  
    }
    
    public Nesne nesneSec(int nesneİndex) {
        return liste.get(nesneİndex);
    }
}
