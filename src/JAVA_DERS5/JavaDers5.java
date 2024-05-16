package JAVA_DERS5;

public class JavaDers5 {
    public static void main(String[] args) {


        //KONU[1]
        //SWİTCH STATEMENTS
          /*
            Bir switch statement'da verdigimiz degere uygun olan case devreye girer
            case calismaya basladiktan sonra,
            break gorunceye veya switch statement'in sonuna kadar calisir
            else gibi default vardir
         */



        //KONU[2]
        //STRİNG MANİPULATİON
        //JAVADA VERİLEN HAZİR METHODLAR İLE DEĞİŞİKLİK YAPMAK
        // String'de atama yapmazsaniz, method ile yapilan degisiklikler KALICI OLMAZ
        // yaptiginiz degisikligin kalici olmasini isterseniz ATAMA yapmalisiniz




        //KONU[1]
        //KÜÇÜK HARF BÜYÜK HARF METHODLAR
        String str1 = "Java Candir";
        //System.out.println(str1.toUpperCase()); // JAVA CANDIR
        //System.out.println(str1.toLowerCase()); // java candir
        //str = str1.toUpperCase(); // KALİCİ OLMASİ İÇİN ATAMA
        //System.out.println(str1.toLowerCase(Locale.forLanguageTag("TR"))); // java candır //LOKASYONA GÖRE HARF BÜYÜK KÜÇÜK YAPMA




        //KONU[2]
        //İNDEX NUMARASİNA GÖRE HARFLERİ BULUP YAZDİRMA METHODLAR
        //System.out.println(str1.charAt(0)); //ÖNDEN BULARAK J YAZAR
        //System.out.println(str1.charAt(11 - 1)); // SONDAN BULARAK r YAZAR




        //KONU[3]
        //STRİNG DEĞERİ MATİMATİKSEL ÇİVİRİP KULLANMAK İÇİN METHODLAR
        String str2 = "150";
        //System.out.println( Integer.parseInt(str2) * 2 ); //300 YAZDİRİR
        //System.out.println(Integer.valueOf(str2) * 2);  //300 YAZDİRİR




        //KONU[4]
        //STRİNG DEĞERİN KAÇ İNDEXTEN OLUŞTUĞUNU BULAN METHODLAR
        String str3 = "JAVACANDİR FAKAT OGRENMESİ KOLAY DEGİL";
        //System.out.println(str3.length()); //STR3 DEĞERİ KAÇ İNDEX İSE O SAYİYİ YAZDİRİR
        //System.out.println(  str3.charAt(str3.length() -1)); //SONDAN BAŞLADİĞİ İÇİN L YAZDİRİR ÖNDEN KULLANİLMAZ




        //KONU[5]
        //STRİNG DEĞERLERİ EŞİT Mİ DİYEREK VEYA AYNİ Mİ DİYEREK KARŞİLAŞTİRMA METHODLAR
        // equals() metne odaklanir, buyuk kucuk harf dikkate alinarak metin ayni ise TRUE verir
        // Eger buyuk-kucuk harf dikkate almadan metni karsilastirmak istersek
        // equalsIgnoreCase() kullaniriz.
        String s1 = "ALİ";    String s2 = "ali";   String s3 = new String("ali");
        //System.out.println(s1.equals(s2)); //False
        //System.out.println(s1.equalsIgnoreCase(s3)); //True




        //KONU[6]
        //STRİNG DE VERDİĞİMİZ İNDEXDEN BAŞLAYARAK SON İNDEX KADAR OLAN HARFLERİ BİRLEŞİK YAZDİRAN METHODLAR
        String str4 = "JAVA CANDİR";
        //System.out.println(str4.substring(3)); // A CANDİR YAZDİRİR
        //System.out.println(str4.substring(3,8)); //YAZDİĞİMİZ SON İNDEXDEN BİR ÖNCEKİ 7 İNDEX YAZDİRİR A CAN
        //System.out.println(str4.substring(str4.length()-5)); //BÖYLEDE KULLANİLİR  ANDİR YAZDİRİR




        //KONU[7]
        //STRİNG DEĞERİNDE BU VAR Mİ BU İÇERİİR Mİ GİBİ SORGULAMA YAPAN METHODLAR
        //BÜYÜK HARF KÜÇÜK HARF DİKKAT EDEREK YAPAR BUNU METHOD
        String str5 = "JAVA CANDİR";
        //System.out.println(str5.contains("ACAN")); // False
        //System.out.println(str5.contains("A CAN")); // True



        //KONU[8]
        //STRİNG DEĞERİNDE BU HARFTAN BAŞLAYİP BU HARFTAN BİTİYOR MU SORGULAMA YAPAN METHODLAR
        //BÜYÜK HARF KÜÇÜK HARF DİKKAT EDEREK YAPAR BUNU, METHOD ÇİFT PARAMETRİLİ OLANİ KULLANİRSAK
        String str6 = "JAVA CANDİR";
        //System.out.println(str5.startsWith("JA")); // true
        //System.out.println(str5.endsWith("CANDİR")); // true
        //System.out.println(str5.startsWith("V",2)); //True 2 İNDEX A İLE BAŞLİYOR MU GİBİ SORGULAMA YAPAR



        //KONU[9]
        //STRİNG DEĞERİNDE BU HARF VEYA KELİME GEÇİYOR MU GEÇİYORSA İNDEX YAZDİR BANA SORGULAMA YAPAN METHODLAR
        String str7 = "ALİ TOPU AT ATSANA  KARDESİM HADE  AT";
        //System.out.println(str7.indexOf("AT")); //9 YAZDİRİR OF ÖNDEN BAŞLAR İLK BULDUĞU AT KELİMESİNİN İNDEX VERİR
        //System.out.println(str7.lastIndexOf("AT")); //35 YAZDİRİR LAST SONDAN BAŞLAR İLK BULDUĞU AT KELİMESİNİN İNDEX VERİR
        //System.out.println(str7.indexOf("EXPERT")); //-1 YAZDİRİR BUNUN ANLAMİ ÖYLE BİR KELİME İÇERMİYOR DEMEKTİR



        //KONU[10]
        //STRİNG BİR VERİABLE İÇİNDE DEĞER VAR Mİ BOŞMU SORGULAMA YAPAN METHODLAR
        String str8 = " ";     String str9 = "JAVA"; String str10 = "";

        //System.out.println(str8.isEmpty()); //False YAZDİRİR ÇÜNKÜ SPAECE VAR
        //System.out.println(str9.isEmpty()); //False YAZDİRİR ÇÜNKÜ DEĞER VAR
        //System.out.println(str10.isEmpty()); //True YAZDİRİR ÇÜNKÜ BOŞ DEĞER YOK

        //System.out.println(str8.isBlank()); //True YAZDİRİR ÇÜNKÜ BOŞLUK VAR
        //System.out.println(str9.isBlank()); //False YAZDİRİR ÇÜNKÜ BOŞLUK YOK




























    }
}
