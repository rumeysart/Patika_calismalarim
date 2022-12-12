import java.util.Scanner;

/*
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre 
ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, 
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

public class kullaniciGirisi {

	public static void main(String[] args) {
	String username, password, answer, newPassword;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Kullanici Adiniz: ");
	username = input.nextLine();
	
	System.out.print("Sifreniz: ");
	password = input.nextLine();
	
	if( password.equals("java123")) {
		System.out.println("Giris Yaptiniz!");
	}
	else {
		System.out.println("Bilgileriniz Yanlis!");
		System.out.println("Yeni sifre olusturmak ister misiniz? evet ya da hayir olarak yanitlayiniz");
		answer = input.nextLine();
		
		if(answer.equals("evet")) {
			System.out.println("Olusturmak istediginiz yeni sifreyi giriniz: ");
			newPassword = input.nextLine();
			if(newPassword.equals("java123")) {
				System.out.println("Farkli bir sifre giriniz: ");
				newPassword = input.nextLine();
			}
			else if(newPassword.equals(answer)) {
				System.out.println("Farkli bir sifre giriniz: ");
				newPassword = input.nextLine();
		}
			System.out.println("Tebrikler, yeni sifrenizi basariyla olusturdunuz! ");
			
	}
		else
		{
			System.out.println("Oyleyse sifrenizi tekrar deneyiniz :) belki bu sefer dogru yazarsiniz ");
		}
	
	}
	
	}

}
