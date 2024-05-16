package JAVA_DERS4;

public class Java_Ders4 {
    public static void main(String[] args) {


        //KONU[1]
        //İF ELSE.İF STATEMENTS
        //KULLANİCİDAN BİR KARAKTER ALİN KARAKTER BÜYÜK HAFR İSE BÜYÜK HARF, KÜÇÜK HARF İSE KÜÇÜK HARF YAZDİRİN

//        Scanner scan = new Scanner(System.in);
//        System.out.print("PLASE ENTER CHARAKTER: ");
//        char charek = scan.next().charAt(0);
//
//        if(charek >= 'A' && charek <= 'Z'){
//            System.out.println("BİG CHAREKTER");
//        }
//        else{
//            System.out.println("SMALL CHAREKTER");
//        }


        //KULLANİCİDAN BİR KARAKTER ALİN KARAKTER KÜÇÜK İSE BÜYÜK OLARAK YAZDİRİN BÜYÜK İSE OLDUĞU GİBİ YAZDİRİN

//        System.out.print("PLASE ENTER CHAREKTER: ");
//        char charekter = scan.next().charAt(0);
//
//        if(charekter >= 'a' && charekter <= 'z'){
//            System.out.println("ENTERED CHAREKTER HAS BEEN CHANGED: "+Character.toUpperCase(charekter));
//        }
//        else{
//            System.out.println("ENTERED CHAREKTER: "+charekter);
//        }


        //KONU[2]
        //İF ELSE ELSE.İF STATEMENTS
        //KULLANİCİDAN NOTUNU ALİN NOTU 85 ÜZERİ İSE AA, 65 ÜZERİ İSE BB, 50 ÜZERİ İSE CC GERİYE KALANLARİ DD YAZDİRİN

//        Scanner scan = new Scanner(System.in);
//        System.out.print("PLASE ENTER NUMBER: ");
//        int number = scan.nextInt();
//
//        if(number % 3 == 0 && number % 5 == 0)
//            System.out.print("NUMBER MULTİPLE 3 AND 5");
//        else if(number % 3 == 0)
//            System.out.println("NUMBER MULTİPLE 3");
//        else if(number % 5 == 0)
//            System.out.println("NUMBER MULTİPLE 5");
//        else
//            System.out.println("PLASE TRY AGAİN");


        //KONU[3]
        //NESTED İF ELSE İF
        ///*
        //            Nested if else
        //            daha kisa oldugu icin degil
        //            daha anlasilir oldugu icin tercih edilen bir yontemdir
        //
        //            Eger degisken sayiniz birden fazla ise
        //            once birini ana degisken kabul edip
        //            ona gore bir if-else statement olusturalim
        //
        //            Bu soru icin cinsiyet ana degisken olsun
        //*/


//        Scanner scan = new Scanner(System.in);
//        System.out.println("LÜTFEN CİNSİYETİNİZİ GİRİNİZ: ");
//        String cinsiyet = scan.nextLine();
//        System.out.println("LÜTFEN YAŞİNİZİ GİRİNİZ: ");
//        int yas = scan.nextInt();
//
//        if (cinsiyet.equalsIgnoreCase("kadin")) {
//            // bu bolume kadin suzgeci tarafindan yakalananlar gelecek
//            // bu if blogunda yazacagimiz kodlar SADECE kadinlari ilgilendirmeli
//
//            if (yas < 20 || yas > 70) {
//                System.out.println("Yas girisi hatali");
//            } else if (yas >= 60) {
//                System.out.println("Kadin 60 yasindan buyuk, emekli olabilir...");
//            } else {
//                System.out.println("Kadin 60 yasindan kucuk, emekli olmasi icin " + (60 - yas) + " yil daha calismasi lazim");
//            }
//
//        } else if (cinsiyet.equalsIgnoreCase("Erkek")) {
//            // bu bolume erkek suzgeci tarafindan yakalananlar gelecek
//            // bu bolumdeki kodlar sadece erkekler icin yazilmali
//
//            if (yas < 20 || yas > 70) {
//                System.out.println("Yas girisi hatali");
//            } else if (yas >= 65) {
//                System.out.println("Erkek 65 yasindan buyuk, emekli olabilir...");
//            } else {
//                System.out.println("Erkek 65 yasindan kucuk, emekli olmasi icin " + (65 - yas) + " yil daha calismasi lazim");
//            }
//
//        } else {
//            System.out.println("Lutfen kadin veya erkek degeri giriniz");
//        }






        //KONU[4]
        //TERNARY BASİT İF ELSE SORGULAMALARİ DAHA BASİT HALE GETİRMEK İÇİN VARDİR
        //NESTED TERNARY DE VARDİR FAKAT ÇOK KARMAŞİK HALE GELİR SORGULAMA ONUN İÇİN TERCİH EDİLMEZ
          /*
            DIKKAT EDILMESI GEREKEN KONULAR
            1- ternary tek basina kullanilamaz,
               ya direk yazdirmalisiniz
               veya bir variable'a atama yapmalisiniz

            2- eger sartin true vermesi durumunda elde edilen sonucun data turu ile,
               sartin false vermesi durumunda elde edilen sonucun data turu farkli olursa
               atama yapmamiz mumkun olmaz, sadece yazdirabiliriz
         */

        //soru: sayi 0 dan büyükse +5 ekle küçükse -5 çikar

        //int sayi = 10;

        //System.out.println(sayi>0 ? sayi+5 : sayi-5 );    // ya direk yazdirmali

        //sayi = sayi>0 ? sayi+5 : sayi-5 ;     // veya atama yapmaliyiz































    }
}
