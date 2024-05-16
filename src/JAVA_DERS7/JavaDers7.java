package JAVA_DERS7;

import java.util.Scanner;

public class JavaDers7 {
    public static void main(String[] args) {


        //SORU[1]
        // AŞAĞİDA VERİLEN STRİNG SAYİ DEĞERLERİ BİRBİRİNE TOPLAYİN VE YAZDİRİN.
        //		   “15.35 €” + “11.40 €”
        //		   output : 26.75 €

//
//        System.out.println(input1 + input2); // 15.30 €11.40 €
//
//        input1 = input1.replaceAll("\\D",""); // "1530"
//        input2 = input2.replaceAll("\\D",""); // "1140"
//
//
//        int fiyat1 = Integer.parseInt(input1);
//        int fiyat2 = Integer.parseInt(input2);
//
//
//
//        System.out.println(  ((double)fiyat1 + fiyat2) / 100  + " €");







         /*
         SORU[2]
         KULLANİCİDAN SATİR SAYİSİNİ ALİP AŞAĞİDAKİ ŞEKİLİ OLUŞTURUN
         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Lutfen satir sayisini giriniz...");
//        int satirSayisi = scanner.nextInt();
//
//        for (int i = 1; i <=satirSayisi ; i++) {
//
//            for (int j = 1; j <=i ; j++) {
//
//                System.out.print(j + " ");
//
//            }
//            System.out.println("");
//        }


        //SORU[3]
        //BAŞKA BİR CLASS DA OLUŞTURULAN METHODU YENİ BİR CLASS DA KULLANİMİ

        //System.out.println(C06_MethodOlusturma.isimSoyisimDuzenle("KEMal", "OZDEmir")); // Kemal Ozdemir


        //SORU[4]
        // Soru 4 : Kullanicidan bir sifre isteyip,
        //          asagidaki sartlari kontrol edin ve gecerli sifre girilene kadar tekrar sifre isteyin
        //          sifre kontrolunu bir method'da yapip,
        //          sifre gecerli ise true, sifre gecersiz ise false dondurun


        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 1000; i++) {
            System.out.print("Lutfen sifrenizi giriniz: ");
            String sifre = scanner.nextLine();

            boolean kontrolSonucu = sifreKontrolEt(sifre);

            if (kontrolSonucu == true) {
                System.out.println("Sifreniz basariyla kaydedildi..");
                break;
            }
        }

    }






    public static boolean sifreKontrolEt(String sifre){

        boolean sifreGecerliMi = true; // bu bizim flag'imiz, hata bulursak bunu false yapicaz

        //          - ilk harf kucuk harf olmali

        char ilkHarf= sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)){
            System.out.println("Ilk karakter kucuk harf olmali");
            sifreGecerliMi = false;
        }

        //          - son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (sonKarakter<'0' || sonKarakter>'9'){
            System.out.println("Son karakter rakam olmali");
            sifreGecerliMi = false;
        }

        //          - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sifreGecerliMi = false;
        }

        //          - uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sifreGecerliMi = false;
        }

        return sifreGecerliMi;

    }




































































    }




