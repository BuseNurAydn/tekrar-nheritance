package tekrar�nheritance;

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
        
        System.out.println("�al��an S�n�f� �al���yor...");
    }
    
    public void BilgileriGoster(){
        
        System.out.println("�sim : " + isim);
        System.out.println("Maa� : " + maas);
        System.out.println("Departman : " + departman);
        
    }

}
