
public class Tas extends Nesne{
    public int katilik=20;
    public String isim;
    
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    
    public int getKatilik() {
        return katilik;
    }
   
    public void setKatilik(int katilik) {
        this.katilik = katilik;
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
    
    public Tas(){
        super.dayaniklilik=20;
        super.seviyePuani=0;
    }
    public Tas(float dayaniklilik,int seviyePuani){
        super.dayaniklilik=dayaniklilik;
        super.seviyePuani=seviyePuani;
    }
    
    @Override
    public String nesnePuaniGoster(){
        String puanlar = this.dayaniklilik+" "+this.seviyePuani;
        
        return puanlar;
    }
    
    @Override
    public float etkiHesapla(String r){
        float tasEtkisi=0;
        Tas tas= new Tas();
        AgirTas agirTas = new AgirTas();
        Kagit kagit = new Kagit();
        Makas makas = new Makas();
        UstaMakas ustaMakas = new UstaMakas();
        OzelKagit ozelKagit = new OzelKagit();
        
        if(r.contentEquals("Kagit"))         {tasEtkisi = (tas.katilik)/((1 - a)*(kagit.nufuz));}
        else if(r.contentEquals("OzelKagit")){tasEtkisi = (tas.katilik)/((1 - a)*(ozelKagit.nufuz)*(ozelKagit.kalınlık));}
        else if(r.contentEquals("Makas"))    {tasEtkisi = (tas.katilik)/((a)*(makas.keskinlik));}
        else if(r.contentEquals("UstaMakas")){tasEtkisi = (tas.katilik)/((a)*(ustaMakas.keskinlik)*(ustaMakas.direnc));}
        else if(r.contentEquals("Tas"))      {tasEtkisi = (tas.katilik)/(tas.katilik);}
        else if(r.contentEquals("AgirTas"))  {tasEtkisi = (tas.katilik)/((agirTas.katilik)*(agirTas.sicaklik));}
        
        return tasEtkisi;
    }
    
    @Override
    public Nesne durumGuncelle(float etki,int w,Nesne n){
        
        if(w==1){
            this.dayaniklilik = this.dayaniklilik-etki;
            this.seviyePuani = this.seviyePuani + 20;}
            if(this.seviyePuani >= 30){AgirTas agirTas =new AgirTas(this.dayaniklilik,this.seviyePuani);n=agirTas;}
        else if(w==0){
            this.dayaniklilik = this.dayaniklilik-etki;}
        if(this.dayaniklilik<=0){
            n=null;
        }
    
    return n;
    }
}
