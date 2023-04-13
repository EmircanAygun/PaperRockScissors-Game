
public class Kagit extends Nesne{
    public int nufuz=2;
    public String isim;
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    public int getNufuz() {
        return nufuz;
    }

    public void setNufuz(int nufuz) {
        this.nufuz = nufuz;
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
    
    public Kagit(){
        super.dayaniklilik=20;
        super.seviyePuani=0;
    }
    public Kagit(float dayaniklilik,int seviyePuani){
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
        float kagitEtkisi=0;
        Tas tas= new Tas();
        AgirTas agirTas = new AgirTas();
        Kagit kagit = new Kagit();
        Makas makas = new Makas();
        UstaMakas ustaMakas = new UstaMakas();
        OzelKagit ozelKagit = new OzelKagit();
        
        if(r.contentEquals("Kagit"))         {kagitEtkisi = (kagit.nufuz)/((kagit.nufuz));}
        else if(r.contentEquals("OzelKagit")){kagitEtkisi = (kagit.nufuz)/((ozelKagit.nufuz)*(ozelKagit.kalınlık));}
        else if(r.contentEquals("Makas"))    {kagitEtkisi = (kagit.nufuz)/((1 - a)*(makas.keskinlik));}
        else if(r.contentEquals("UstaMakas")){kagitEtkisi = (kagit.nufuz)/((1 - a)*(ustaMakas.keskinlik)*(ustaMakas.direnc));}
        else if(r.contentEquals("Tas"))      {kagitEtkisi = (kagit.nufuz)/(a * tas.katilik);}
        else if(r.contentEquals("AgirTas"))  {kagitEtkisi = (kagit.nufuz)/(a * (agirTas.katilik) * (agirTas.sicaklik));}
        
        return kagitEtkisi;
    }
    
    @Override
    public Nesne durumGuncelle(float etki,int w,Nesne n){
        if(w==1){
            this.dayaniklilik = this.dayaniklilik-etki;
            this.seviyePuani = this.seviyePuani + 20;}
            if(this.seviyePuani >= 30){OzelKagit ozelKagit =new OzelKagit(this.dayaniklilik,this.seviyePuani);n=ozelKagit;}
        else if(w==0){
            this.dayaniklilik = this.dayaniklilik-etki;}
            if(this.dayaniklilik<=0){
            n=null;
        }
    return n;
    }
}
