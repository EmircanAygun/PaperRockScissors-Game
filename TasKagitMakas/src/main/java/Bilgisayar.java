
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Bilgisayar extends Oyuncu{
    public List<Nesne> liste = new ArrayList<>();
    public int i4;
    public Bilgisayar(int skor){
        this.skor = skor;this.i4=0;
    }
    public Bilgisayar(int oyuncuID, String oyuncuAdi){
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        System.out.println("b cons");
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
        Random rand = new Random();
        int rand_int1 = rand.nextInt(3);
        //rand_int1 = 2;
        if(rand_int1==0){
            Tas tas = new Tas();tas.setİsim("tas");liste.add(tas);i4++;
            return "Tas";}        
        else if(rand_int1==1){
            Kagit kagit = new Kagit();kagit.setİsim("kagit");liste.add(kagit);i4++;
            return "Kagit";}
        else{
            Makas makas = new Makas();makas.setİsim("makas");liste.add(makas);i4++;
            return "Makas";}
    }  
    
    @Override
    public Nesne nesneSec(int nesneİndex) {
        
        return liste.get(nesneİndex);
    }
    
}
