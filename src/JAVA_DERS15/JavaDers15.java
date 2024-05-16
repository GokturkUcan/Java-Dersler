package JAVA_DERS15;

public class JavaDers15 {
    public static void main(String[] args) {


        //KONU[1]
        //VARAGS
        /*
            Bir method'a farkli sayida argumentler yollayabilmek istedigimizde
            method'da parametre olarak varargs kullaniriz

            java yollanan tum argumentleri bir array olarak kaydeder
         */

          /*
            varargs'in alabilecegi elementlerin siniri olmadigindan
            varargs devreye girdikten sonra TUM ELEMENTLERI almak ister

            bu sebeple, bir method'da varargs kullanilacaksa
            son parametre OLMALIDIR

            ayni sebeple bir method'da parametre olarak
            2 varargs da olmaz, genelde varags method da kullanilir ama constructor da kullanabiliriz

         */
        // public static void islem(int... geriyeKalanler , int sonSayi){ //VARAGS BÖYLE OLUŞTURULUR









        //KONU[2]
        //STRİNG BUİLDER
        /*
        string builder hazir method ile yapilan değişikleri atamadan da kalici olur
        muatble olanlar için geçerli java da metin classlar ile yapilacak 3 class vardir
        string ımmuatble, string builder mautble, string buffer muatble, builder ile buffer arasindaki fark
        builder de multheread çalişir, buffer da multitheared çalişmaz multihread de bir uygulama da bir anda 1 den fazla
        kişinin ayni anda işlem yapmasi ve bunu siralamasini yapar ve bunu developerlar düşünüz biz değil

        StringBuilder sb1 = new StringBuilder(); olarak oluşturulur  ve bu muatble string yapilan değişikler kalici olur hazirmethod
        kapasitesi genelde 16 harflik olur, oluşturukern direk değer tamada yapilir("JAVA") gibi yapilir java harf sayisi + 16
        hafizasi oluş olur
         */








        //KONU[3]
        /*
        ACCESS MODİFER 4 ADET ACESSE MODİFER VARDİR 1 PRİVATE SADECE O CLASS DAN ERİŞİLERN BİLGİLER İÇİN
        2 DEFAULT SADECE O CLASS VE PACKGE İÇİNDEN ERİŞEBİLİRİZ,VE OLUŞTURUKEN DEFAULT YAZMAYİZ ZATEN JAVA BAŞİNA BİRŞEY YAZMASAK
        DEFAULT OLARAK ACESSES MODİFER KOYAR OTOMATİK, 4 PROTECTED CLASS VE PACKGE VE CHİLD CLASSLARDAN ERİŞİLİR
        5 PUBLİC HERYERDEN ERİŞEBİLİRİZ SİNİR YOKTUR
         */

































    }
}
