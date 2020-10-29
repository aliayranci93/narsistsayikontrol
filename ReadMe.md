 
 //Girilen sayı kaç basamaklı sayarak bunu bulalım
 
 public static Integer basamakSay(int n)
    {
       
        if (n == 0)
            return 0;

        return 1 + basamakSay(n / 10);
    }
    
    
//Şimdiden sayımız narsistmi bunu bulalım ve metodumuzla Boolean türünden bi dönüş yapaşım.
    
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
            //tüm basamakları basamak sayısı kadar üssünü alıp topladıktan sonra girilen sayı ile hesaplanan sayı birbirine eşitse narsist bir sayıdır.
    
        }
        
        
    