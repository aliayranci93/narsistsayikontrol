import static java.lang.Math.*; 
import java.util.Scanner;


public class Main {
	
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Sayı giriniz : ");
			int num = scanner.nextInt();
			if (kontrol(num))
			    System.out.println(num+" Narsistik Bir Sayı");
			else
			    System.out.println(num+" Narsistik Bir Sayı Değil");
		}
    }

    public static Integer basamakSay(int n)
    {
        //Girilen sayı kaç basamaklı sayarak bunu bulalım
        if (n == 0)
            return 0;

        return 1 + basamakSay(n / 10);
    }


    public static Boolean kontrol(int n)
    {
   
        int basamakSayisi = basamakSay(n);
        int hesaplanacakSayi = n;
        int toplam = 0;

        while(hesaplanacakSayi > 0)
        {
            toplam += pow(hesaplanacakSayi % 10, basamakSayisi);
            //Modunu alarak kalan üzerinden son basamaktaki sayıyı bularak  kaç basamaklı bir sayı girildiyse countDigit metodumuzla basamak sayısını bulmuştuk okadar üssünü alıyoruz ve toplayarak devam ediyoruz. Bu işlemi sayının her basamağı için yaparak devam edeceğiz.
            hesaplanacakSayi /= 10;
            // 10 'a bölerek bir basamak sola kayarak hesabımıza devam ediyoruz.
        }

        return (n == toplam);
        //tüm basamakları basamak sayısı kadar üssünü alıp topladıktan sonra girilen sayı ile hesaplanan sayı birbirine eşitse Narsistik bir sayıdır.

    }
}
