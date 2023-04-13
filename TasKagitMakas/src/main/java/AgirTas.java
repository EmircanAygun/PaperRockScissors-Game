
public class AgirTas extends Tas {
    public int sicaklik=2;
    public String isim;
    
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    public int getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        this.sicaklik = sicaklik;
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
    
    public AgirTas(){
        super.dayaniklilik=20;
        super.seviyePuani=0;
    }
    public AgirTas(float dayaniklilik,int seviyePuani){
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
        float agirTasEtkisi=0;
        Tas tas= new Tas();
        AgirTas agirTas = new AgirTas();
        Kagit kagit = new Kagit();
        Makas makas = new Makas();
        UstaMakas ustaMakas = new UstaMakas();
        OzelKagit ozelKagit = new OzelKagit();
        
        if(r.contentEquals("Kagit"))         {agirTasEtkisi = (agirTas.katilik*agirTas.sicaklik)/((1 - a)*(kagit.nufuz));}
        else if(r.contentEquals("OzelKagit")){agirTasEtkisi = (agirTas.katilik*agirTas.sicaklik)/((1 - a)*(ozelKagit.nufuz)*(ozelKagit.kalınlık));}
        else if(r.contentEquals("Makas"))    {agirTasEtkisi = (agirTas.katilik*agirTas.sicaklik)/((a)*(makas.keskinlik));}
        else if(r.contentEquals("UstaMakas")){agirTasEtkisi = (agirTas.katilik*agirTas.sicaklik)/((a)*(ustaMakas.keskinlik)*(ustaMakas.direnc));}
        else if(r.contentEquals("Tas"))      {agirTasEtkisi = (agirTas.katilik*agirTas.sicaklik)/(tas.katilik);}
        else if(r.contentEquals("AgirTas"))  {agirTasEtkisi = (agirTas.katilik*agirTas.sicaklik)/((agirTas.katilik)*(agirTas.sicaklik));}
        
        return agirTasEtkisi;
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
