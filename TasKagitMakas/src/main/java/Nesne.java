
public abstract class Nesne {
    public float dayaniklilik;
    public int seviyePuani;
    public String isim;
    public float a = 0.2f;
    
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    
    public float getDayaniklilik() {
        return dayaniklilik;
    }

    public void setDayaniklilik(int dayaniklilik) {
        this.dayaniklilik = dayaniklilik;
    }

    public int getSeviyePuani() {
        return seviyePuani;
    }

    public void setSeviyePuani(int seviyePuani) {
        this.seviyePuani = seviyePuani;
    }
    
    public Nesne(){
        this.dayaniklilik=20;
        this.seviyePuani=0;
    }
    public Nesne(float dayaniklilik, int seviyePuani){
        this.dayaniklilik=dayaniklilik;
        this.seviyePuani=seviyePuani;
    }
    
    public String nesnePuaniGoster(){
        String puanlar = this.dayaniklilik+"-"+this.seviyePuani;
        
        return puanlar;
    }
    
    public float etkiHesapla(String r){
        float tasEtkisi=0f;
        return tasEtkisi;
    }
    
    public Nesne durumGuncelle(float etki,int w,Nesne n){
        
    return n;
    }
}
