import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunuSınıfı {

	public static void main(String[] args) {	
		/*Random rand=new Random();			//random sayı böyle de üretilebilir
		int number=rand.nextInt(100);
		System.out.println(number);*/
		int scan,can=5,i=0;
		int iswrong=0;
		boolean iswin=false;
		Scanner scanner=new Scanner(System.in);
		int num= (int) (Math.random()*100);	
		System.out.println("Aklımdan tuttuğum 0-100 arasındaki sayiyi tahmin et");
		while(i<can) {
			System.out.println((i+1)+".tahminini gir:");
			scan=scanner.nextInt();
			if (scan<0 || scan>100) {			//kullanıcı 0-100 aralığında sayı girmezse
				System.out.println("adamakıllı sayi gir.");
				iswrong++;
				if (iswrong!=1) {		//ilk yanlış uyarısını verdikten sonra candan düşürüyor
					can--;
					System.out.println("1 can kaybettin,kalan hakkınız:"+(can-i));
				}
			}else {
				if(scan==num) {
					System.out.println("tebrikler..kazandınız!");
					iswin=true;
					break;
				}else {
					if (scan>num) {
						System.out.println("doğru sayidan daha büyük sayi tahmin ettiniz!");
					}else {
						System.out.println("doğru sayidan daha küçük sayi tahmin ettiniz!");
					}
				}	
				i++;
			}
		}
		if (iswin==false) {
			System.out.println("hakınız bitti..kaybettiniz!\nAklımdan tuttuğum sayi:"+num);
		}
		
	}
}

