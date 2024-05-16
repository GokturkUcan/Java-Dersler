package JAVA_DERS14;

public class JavaDers14 {
    public static void main(String[] args) {

        //KONU[1]
        /*
        IMMUTABLE CLASS nedir non primitve ve wrepper class yani primitive ler ımmutable classlara bağlidir
        bir hazir method ile yapilan değişiklik kalici olmaz, MUATBLE CLASS NEDİR array veya list gibi yapilardir
        hazir method ile yapilan dğeişikler kalici olur
         */






        //KONU[2]
        //DOUBLE ECULSİNE KARŞİLAŞTİRMASİ ==
          /*
            String Pool , String Havuzu

            Java'da String olusturmak icin 2 yontem kullanabiliriz
            1- "" icinde direk deger atama
            2- new keyword kullanarak veya baska String variable'larla islem yaparak String olusturma
         */
 /*
         == hem metne, hem de referansa bakar
         String'de ayni metinleri karsilastirdigimizda
         her zaman true vermez, bazen false da verir

         Java yukarda yazdigimiz 1.yontemle yani "" icerisinde deger ile String olusturdugumuzda
         bu String'leri String Pool'a koyar

         EGER
         String pool'da olan iki String'in
         metinleri de ayni ise
         == ile karsilastirdigimizda sonuc true olur

         havuz disindaki iki String'i
         veya havuzda olan bir String ile disarda olan bir String'i == ile karsilastirirsaniz
         java false verir

         */







        //KONU[2]
        //LOCALTİME KONUSU
           /*
           3 farkli oluşturma vardir bunlar içindeki hazir methodlar hemen hemen aynidir

            LocalTime saat = LocalTime.now();  //Saat
            DateTime tarih = DateTime.now();  //Tarih
            LocaleDateTime saatTarih = LocaleDateTime.now(); //SaatTarih

            olusturdugumuz saat variable'i
            bir kronometre gibi canli bir sayac degil,
            9.satir calistigi anda bilgisayarin, saat degerini alip saklayan,
            sabit degerli bir variable'dir
         */


        //METHOD 1
        //Thread.sleep(2000); // kodlari 5000 milisaniye bekletir



        //METHOD 2
        // get method'lari, kaydedilen saatin belirli bolumlerini bize getirir
        //System.out.println(saat.getMinute());



        //METHOD 3
        // minus ve plus, kaydettigimiz zamani ilerletme veya geriye alma icin kullanilir
        //System.out.println(saat.plusHours(4).plusMinutes(20)); // 22:49:25.228115
        //System.out.println(saat.minusHours(15).minusMinutes(5).minusSeconds(20));



        //METHOD 4 DEĞİŞTİRME
        // with()
//        System.out.println(saat.withHour(20)); // 20:32:10.472887
//        System.out.println(saat.withNano(0)); // 18:32:42
//        System.out.println(saat.withNano(0).withSecond(0)); // 18:33



        //METHOD 5
        // istedigimiz degerlere sahip, bir saat olusturup kaydedelim
//        LocalTime istenenSaat = LocalTime.of(23,45);



        //METHOD 6
        // gun baslangicindan istenen zamana kadar gecen saniye, nanosaniye yi yazdiralim
//        System.out.println(saat.toSecondOfDay());
//        System.out.println(saat.toNanoOfDay());




        //KONU[3]
        //İSTENEN FORMATTA SAAT VE TARİH OLUŞTURMA
          /*
        GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar

         */

//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt); // 2024-02-10T19:29:02.513795
//
//        // 24/Mayis/2024
//        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");  //FORMAT BUDUR: dd,MMMM,yyyy
//        System.out.println(ldt.format(format1));






























    }
}
