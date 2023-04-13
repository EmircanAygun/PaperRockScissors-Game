
public class Makas extends Nesne{
    public int keskinlik=2;
    public String isim;
    
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    public int getKeskinlik() {
        return keskinlik;
    }

    public void setKeskinlik(int keskinlik) {
        this.keskinlik = keskinlik;
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
    
    public Makas(){
        super.dayaniklilik=20;
        super.seviyePuani=0;
    }
    public Makas(int dayaniklilik,int seviyePuani){
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
        float makasEtkisi=0;
        Tas tas= new Tas();
        AgirTas agirTas = new AgirTas();
        Kagit kagit = new Kagit();
        Makas makas = new Makas();
        UstaMakas ustaMakas = new UstaMakas();
        OzelKagit ozelKagit = new OzelKagit();
        
        if(r.contentEquals("Kagit"))         {makasEtkisi = (makas.keskinlik)/((a * kagit.nufuz));}
        else if(r.contentEquals("OzelKagit")){makasEtkisi = (makas.keskinlik)/((a * ozelKagit.nufuz)*(ozelKagit.kalınlık));}
        else if(r.contentEquals("Makas"))    {makasEtkisi = (makas.keskinlik)/((makas.keskinlik));}
        else if(r.contentEquals("UstaMakas")){makasEtkisi = (makas.keskinlik)/((ustaMakas.keskinlik)*(ustaMakas.direnc));}
        else if(r.contentEquals("Tas"))      {makasEtkisi = (makas.keskinlik)/((1 - a) * tas.katilik);}
        else if(r.contentEquals("AgirTas"))  {makasEtkisi = (makas.keskinlik)/((1 - a) * (agirTas.katilik) * (agirTas.sicaklik));}
        
        return makasEtkisi;
    }
    @Override
    public Nesne durumGuncelle(float etki,int w,Nesne n){
        if(w==1){
            this.dayaniklilik = this.dayaniklilik-etki;
            this.seviyePuani = this.seviyePuani + 20;}
            if(this.seviyePuani >= 30){UstaMakas ustaMakas =new UstaMakas(this.dayaniklilik,this.seviyePuani);n=ustaMakas;}
        else if(w==0){
            this.dayaniklilik = this.dayaniklilik-etki;}
        if(this.dayaniklilik<=0){
            n=null;
        }   
    return n;
    }
}
