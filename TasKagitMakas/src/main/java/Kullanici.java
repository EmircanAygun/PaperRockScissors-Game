
import java.util.ArrayList;
import java.util.List;

public class Kullanici extends Oyuncu{
    public List<Nesne> liste = new ArrayList<>();
    public List<Integer> loop = new ArrayList<>();
    public int tekrar=0;
    public int i4;
    public Kullanici(){
        
    }
    public Kullanici(float skor){
        this.skor = skor;
    }
    
    @Override
    public int getOyuncuID() {
        return oyuncuID;
    }

    @Override
    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    @Override
    public float getSkor() {
        return skor;
    }

    @Override
    public void setSkor(float skor) {
        this.skor = skor;
    }

    @Override
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    @Override
    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }
    
    @Override
    public float skorGoster() {
        for (int j = 0; j < this.liste.size(); j++) {
                this.skor = this.skor + this.liste.get(j).getDayaniklilik();
            }
        return this.skor;
    }  
    
    @Override
    public String nesneListesi(String s)
    {        
        if(this.i4 !=5 ){
            if(s.contentEquals("tas")){
                Tas tas = new Tas();tas.setİsim("tas");liste.add(tas);this.i4++;
                return "tas";}
            else if(s.contentEquals("kagit")){
                Kagit kagit = new Kagit();kagit.setİsim("kagit");liste.add(kagit);this.i4++;
                return "kagit";}
            else {
                Makas makas = new Makas();makas.setİsim("makas");liste.add(makas);this.i4++;
                return "makas";}
        }
        else{
            return "dolu";}        
    }  
    
    @Override
    public Nesne nesneSec(int nesneİndex) {

    return liste.get(nesneİndex);
    } 
    
}
