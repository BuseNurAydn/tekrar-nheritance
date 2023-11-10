package tekrarÝnheritance;

public class Calisan {

    private String isim;
    private int maas;
    private String departman;
    
    
    public Calisan(String isim, int maas, String departman) {
        
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    
    public void calis(){
        
        System.out.println("Çalýþan Sýnýfý Çalýþýyor...");
    }
    
    public void BilgileriGoster(){
        
        System.out.println("Ýsim : " + isim);
        System.out.println("Maaþ : " + maas);
        System.out.println("Departman : " + departman);
        
    }

}
