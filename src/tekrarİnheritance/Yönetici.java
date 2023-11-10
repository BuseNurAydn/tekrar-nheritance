package tekrarÝnheritance;

public class Yönetici extends Calisan{
	private int calisan_sayisi; //yönetici sýnýfýna ait özellik sadece

	public Yönetici(String isim, int maas, String departman,int calisan_sayisi) {
		super(isim, maas, departman);
		this.calisan_sayisi=calisan_sayisi;
	
	}

    public void Zam_Yap(int zam){
        
        System.out.println("Çalýþanlara " + zam + " TL Zam Yapýldý.");
        
    }

    public void BilgileriGoster(){
        
        super.BilgileriGoster();
        System.out.println("Çalýþan Sayýsý : " + calisan_sayisi);
        
        
    }
}
