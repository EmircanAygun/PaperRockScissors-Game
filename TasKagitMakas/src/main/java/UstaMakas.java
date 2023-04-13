
public class UstaMakas extends Makas {
    public int direnc=2;
    public String isim;
    
    public String getİsim(){
        return isim;
    }
    public void setİsim(String isim){
        this.isim=isim;
    }
    public int getDirenc() {
        return direnc;
    }

    public void setDirenc(int direnc) {
        this.direnc = direnc;
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
    
    public UstaMakas(){
        super.dayaniklilik=20;
        super.seviyePuani=0;
    }
    public UstaMakas(float dayaniklilik,int seviyePuani){
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
        float ustaMakasEtkisi=0;
        Tas tas= new Tas();
        AgirTas agirTas = new AgirTas();
        Kagit kagit = new Kagit();
        Makas makas = new Makas();
        UstaMakas ustaMakas = new UstaMakas();
        OzelKagit ozelKagit = new OzelKagit();
        
        if(r.contentEquals("Kagit"))         {ustaMakasEtkisi = (ustaMakas.keskinlik*ustaMakas.direnc)/((a * kagit.nufuz));}
        else if(r.contentEquals("OzelKagit")){ustaMakasEtkisi = (ustaMakas.keskinlik*ustaMakas.direnc)/((a * ozelKagit.nufuz)*(ozelKagit.kalınlık));}
        else if(r.contentEquals("Makas"))    {ustaMakasEtkisi = (ustaMakas.keskinlik*ustaMakas.direnc)/((makas.keskinlik));}
        else if(r.contentEquals("UstaMakas")){ustaMakasEtkisi = (ustaMakas.keskinlik*ustaMakas.direnc)/((ustaMakas.keskinlik)*(ustaMakas.direnc));}
        else if(r.contentEquals("Tas"))      {ustaMakasEtkisi = (ustaMakas.keskinlik*ustaMakas.direnc)/((1 - a) * tas.katilik);}
        else if(r.contentEquals("AgirTas"))  {ustaMakasEtkisi = (ustaMakas.keskinlik*ustaMakas.direnc)/((1 - a) * (agirTas.katilik) * (agirTas.sicaklik));}
        
        return ustaMakasEtkisi;
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
