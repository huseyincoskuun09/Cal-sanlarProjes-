
public class Yonetici extends Calisan {
	
	private int sorumlu_kısı_sayısı ;
	
	public Yonetici(String ad, String soyad, int id,int sorumlu_kısı_sayısı) {
		super(ad, soyad, id);
		
		this.sorumlu_kısı_sayısı = sorumlu_kısı_sayısı ;
		
	}

	@Override
	public void bilgilerigoster() {
		// TODO Auto-generated method stub
		super.bilgilerigoster();
		System.out.println("Yöneticinin sorumlu olduğuı kişi sayısı : " +sorumlu_kısı_sayısı);
	}
		public void zamYap(int zam_mıktarı) {
			
			System.out.println(getAd() + " çalışanlara " +zam_mıktarı +" kadar zam yapıyor ....");
			
		}



	
}

