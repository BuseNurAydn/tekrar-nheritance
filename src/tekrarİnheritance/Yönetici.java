package tekrar�nheritance;

public class Y�netici extends Calisan{
	private int calisan_sayisi; //y�netici s�n�f�na ait �zellik sadece

	public Y�netici(String isim, int maas, String departman,int calisan_sayisi) {
		super(isim, maas, departman);
		this.calisan_sayisi=calisan_sayisi;
	
	}

    public void Zam_Yap(int zam){
        
        System.out.println("�al��anlara " + zam + " TL Zam Yap�ld�.");
        
    }

    public void BilgileriGoster(){
        
        super.BilgileriGoster();
        System.out.println("�al��an Say�s� : " + calisan_sayisi);
        
        
    }
}
