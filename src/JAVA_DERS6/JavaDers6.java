package JAVA_DERS6;

public class JavaDers6 {
    public static void main(String[] args) {


        //SORU[1]
        //KULLANİCİDAN ŞİFRE ALİN ŞİFRE OLUŞTURMASİ İÇİN ŞARTLARİ KONTROL EDİN DÜZELMESİ GEREKEN TÜM EKSİKLERİ SÖYLEYİN
        //İLK HARF KÜÇÜK OLMALİ, SON KAREKTER RAKAM OLMALİ, ŞİFREDE BOŞLUK OLMAMALİ, ÜZÜNLÜĞÜ EN AZ 10 KAREKTER OLMALİ

//        Scanner scan = new Scanner(System.in);
//        System.out.print("LÜTFEN ŞİFRENİZİ OLUŞTURUN: ");
//        String sifre = scan.nextLine();
//
//
//        int sayac = 0;
//
//        char ilkHarf= sifre.charAt(0);
//
//        if (!Character.isLowerCase(ilkHarf)){
//            System.out.println("ŞİFRENİN İLK KAREKTERİ KÜÇÜK HARF OLMALİ");
//            sayac++;
//        }
//
//        char sonKarakter = sifre.charAt(sifre.length()-1);
//
//        if (sonKarakter<'0' || sonKarakter>'9'){
//            System.out.println("ŞİFRENİN SON KAREKTERİ RAKAM OLMALİ");
//            sayac++;
//        }
//
//        if (sifre.contains(" ")){
//            System.out.println("ŞİFRE BOŞLUK İÇERMEMEMLİ");
//            sayac++;
//        }
//
//        if (sifre.length()<10){
//            System.out.println("ŞİFRENİN UZUNLUĞU EN AZ 10 KAREKTER İÇERMELİ");
//            sayac++;
//        }
//
//
//        if (sayac == 0){
//            System.out.println("ŞİFRE BAŞARİLİ KAYDEDİLDİ");
//        }







         /*
         SORU[2]
         KULLANİCİDAN SATİR VE SÜTÜN SAYİSİNİ ALİP AŞAĞİDAKİ ŞEKİLİ OLUŞTURUN
         ÖRNEK: satir = 3, sutun = 7

                    * * * * * * *
                    * * * * * * *
                    * * * * * * *
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("satir sayisini giriniz...");
//        int satirSayisi = scanner.nextInt();
//        System.out.println("Sutun sayisini giriniz...");
//        int sutunsayisi = scanner.nextInt();
//
//        for (int i = 1; i <= satirSayisi ; i++) {
//
//            for (int j = 1; j <= sutunsayisi ; j++) {
//
//                System.out.print("*  ");
//            }
//            System.out.println("");
//        }










        //SOUR[3]   //Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //input1 : “15.35 €” , input2 : “11.40 €”
        //output : 26.75 €


//                String input1 = "15.35 €";
//                String input2 = "11.40 €";
//
//
//                input1 = input1.replaceAll("\\D",""); // "1530"
//                input2 = input2.replaceAll("\\D",""); // "1140"
//
//
//                int fiyat1 = Integer.parseInt(input1);
//                int fiyat2 = Integer.parseInt(input2);
//
//
//
//                System.out.println(  ((double)fiyat1 + fiyat2) / 100  + " €");














    }
}
