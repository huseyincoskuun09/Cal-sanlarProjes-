import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Çalışanlar Programına Hoşgeldiniz ...");
		
		String islemler =  "İşlemler...\n"
				         + "1.Yazılımcı İşlemleri"
				         + "2.Yönetici İşlemleri "
				         + "Çıkış için q ya basınız ." ;
		System.out.println("***************************");
				System.out.println(islemler);
		System.out.println("***************************");
		
		
		while(true) {
			
			System.out.print("İşlemi Seçiniz ...");
			String ıslem =scanner.nextLine();
			
			
			if(ıslem.equals("q")) {
				
				System.out.println("Programdan Çıkılıyor ...");
				
				break ;
				
			}
			else if(ıslem.equals("1")) {
				
				Yazılımcı yazılımcı_ıslemlerı = new Yazılımcı("Hüseyin","Coşkun" ,115202033 ,"Java");
				
				String y_ıslemler = "YAZILIMCI MENÜSÜ"
						           + "1.Format at\n"
						           + "2.Yazılımcı Bilgileri Göster\n"
						           + "Yazılımcı işlemlerinden çıkmak için q ya basınız";
				
				System.out.println("y_ıslemler");
						while(true) {
							System.out.println("Bir işlem seçiniz...");
							String secme = scanner.nextLine();
							
					if(secme.equals("q")) {
						System.out.println("Yazılımcı İşlemlerinden Çıkılıyor...");
						break ;
						
					}
					else if(secme.equals("1")) {
						
						System.out.println("Hangi işletim sistemini yüklemek istiyorsunuz ...");
						String ısletım_sıstemı = scanner.nextLine();
						
						yazılımcı_ıslemlerı.formatAt(ısletım_sıstemı);
						
					}
					else if(secme.equals("2")) {
						
						yazılımcı_ıslemlerı.bilgilerigoster();
						
						
					}
					else {
						System.out.println("Yanlış tuşlama... ");
					}
							
							
						}
			}
			
			else if(ıslem.equals("2")) {
				
				Yonetici yonetıcı_ıslemlerı = new Yonetici("Baha", "Coşkun",2588,16);
				
				String yon_ıslemler = "*******************************"
						           + "YÖNETİCİ İŞLEMLERİNE HOŞGELDİNİZ"
						              + "1.Bilgileri Göster \n"
						              + "2.Zam Yap\n"
						              + "Çıkış için q ya basınız\n"
						              + "******************************" ;
				
				System.out.println(yon_ıslemler);
				
				
				
			}
			
		}
		
		
		
	}
}
