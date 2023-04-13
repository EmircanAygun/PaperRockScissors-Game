
public class OzelKagit extends Kagit {
    public int kalınlık=2;
    public String isim;
    
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    public int getKalınlık() {
        return kalınlık;
    }

    public void setKalınlık(int kalınlık) {
        this.kalınlık = kalınlık;
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
    
    public OzelKagit(){
        super.dayaniklilik=20;
        super.seviyePuani=0;
    }
    public OzelKagit(float dayaniklilik,int seviyePuani){
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
        float ozelKagitEtkisi=0;
        Tas tas= new Tas();
        AgirTas agirTas = new AgirTas();
        Kagit kagit = new Kagit();
        Makas makas = new Makas();
        UstaMakas ustaMakas = new UstaMakas();
        OzelKagit ozelKagit = new OzelKagit();
        
        if(r.contentEquals("Kagit"))         {ozelKagitEtkisi = (ozelKagit.nufuz*ozelKagit.kalınlık)/((kagit.nufuz));}
        else if(r.contentEquals("OzelKagit")){ozelKagitEtkisi = (ozelKagit.nufuz*ozelKagit.kalınlık)/((ozelKagit.nufuz)*(ozelKagit.kalınlık));}
        else if(r.contentEquals("Makas"))    {ozelKagitEtkisi = (ozelKagit.nufuz*ozelKagit.kalınlık)/((1 - a)*(makas.keskinlik));}
        else if(r.contentEquals("UstaMakas")){ozelKagitEtkisi = (ozelKagit.nufuz*ozelKagit.kalınlık)/((1 - a)*(ustaMakas.keskinlik)*(ustaMakas.direnc));}
        else if(r.contentEquals("Tas"))      {ozelKagitEtkisi = (ozelKagit.nufuz*ozelKagit.kalınlık)/(a * tas.katilik);}
        else if(r.contentEquals("AgirTas"))  {ozelKagitEtkisi = (ozelKagit.nufuz*ozelKagit.kalınlık)/(a * (agirTas.katilik) * (agirTas.sicaklik));}
        
        return ozelKagitEtkisi;
    }
    @Override
    public Nesne durumGuncelle(float etki,int w,Nesne n){
        if(w==1){
            this.dayaniklilik = this.dayaniklilik-etki;
            this.seviyePuani = this.seviyePuani + 20;}
        else if(w==0){
            this.dayaniklilik = this.dayaniklilik-etki;}
        if(this.dayaniklilik<=0){
            n=null;
        }
    return n;
    }
    
}
