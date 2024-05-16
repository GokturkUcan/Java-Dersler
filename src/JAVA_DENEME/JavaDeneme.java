package JAVA_DENEME;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

class methodlar{

    public static double emeklikikHesaplamaMethod(double yas, String cinsiyet) {

        if (cinsiyet.equalsIgnoreCase("kadin") && yas >= 60) {
            System.out.println("Kadin 60 yasindan buyuk, emekli olabilir...");
        } else if (cinsiyet.equalsIgnoreCase("kadin") && yas < 60) {
            System.out.println("Kadin 60 yasindan kucuk, emekli olmasi icin " + (60 - yas) + " yil daha calismasi lazim");
        } else if (cinsiyet.equalsIgnoreCase("erkek") && yas >= 65) {
            System.out.println("Erkek 65 yasindan buyuk, emekli olabilir");
        } else if (cinsiyet.equalsIgnoreCase("erkek") && yas < 65) {
            System.out.println("Erkek 65 yasindan kucuk, emekli olmasi icin " + (65 - yas) + " yil daha calismasi lazim");
        } else {
            System.out.println("Girilen degerler hatali");
        }
        return yas;
    }

    public static void indirimHesaplamaMethod(double listeFiyati, int urunSayisi, char kartVarMi) {

        if (kartVarMi == 'E') {
            // buraya sadece karti olanlar icin kod yazacagiz

            if (urunSayisi <= 0) {
                System.out.println("Urun sayisi girisi yanlis");

            } else if (urunSayisi <= 10) {

                System.out.println("%15 indirimli toplam fiyat : " + listeFiyati * urunSayisi * 85 / 100);
            } else {

                System.out.println("%20 indirimli toplam fiyat : " + listeFiyati * urunSayisi * 80 / 100);
            }

        } else if (kartVarMi == 'H') {

            if (urunSayisi <= 0) {

                System.out.println("Urun sayisi girisi yanlis");

            } else if (urunSayisi <= 10) {

                System.out.println("%10 indirimli toplam fiyat : " + listeFiyati * urunSayisi * 90 / 100);

            } else {

                System.out.println("%15 indirimli toplam fiyat : " + listeFiyati * urunSayisi * 85 / 100);
            }

        } else {
            System.out.println("Kart bilgisi hatali");
        }

    }

    public static String sifreKontrolEtmeMethod(String sifre) {

        int sayac = 0;

        char ilkHarf = sifre.charAt(0);

        if (!Character.isLowerCase(ilkHarf)) {
            System.out.println("Ilk karakter kucuk harf olmali");
            sayac++;
        }

        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (sonKarakter < '0' || sonKarakter > '9') {
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }

        if (sifre.length() < 10) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }

        if (sayac == 0) {
            System.out.println("sifre basariyla kaydedildi");
        }
        return sifre;
    }

    public static String metinTersCivirMethod(String metin) {

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {

            tersMetin += metin.charAt(i);
        }

        return tersMetin;
    }

    public static void satirStunSayiSekilMethod(int satir, int stun) {

        for (int i = 1; i <= satir; i++) { // satirlar

            for (int j = 1; j <= stun; j++) { // sutunlar

                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void satirileSekilOlusturMethod(int satir) {

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
            System.out.println("");
        }
    }

    public static String ismiDuzenle(String isim) {

        int index = 0;
        String duzenlenmisIsim = "";

        while (index < isim.length()) {

            if (index == 0) {
                duzenlenmisIsim += isim.toUpperCase().charAt(0);
            }
            else if (isim.charAt(index - 1) == ' ') {
                duzenlenmisIsim += isim.toUpperCase().charAt(index);
            }
            else if (isim.charAt(index) == ' ') {
                duzenlenmisIsim += " ";
            }
            else {
                duzenlenmisIsim += isim.toLowerCase().charAt(index);
            }

            index++;
        }

        return duzenlenmisIsim;
    }

    public static void kuallaniciSayiAlinToplayinMethod() {

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 10;

        int sayilarinToplami = 0;
        int pozitifSayiAdedi = 0;

        while (girilenSayi != 0) {

            System.out.print("Toplanmak uzere pozitif tamsayilar girin, bitirmek icin 0'a basin: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi > 0) {
                sayilarinToplami += girilenSayi;
                pozitifSayiAdedi++;

            } else if (girilenSayi < 0) {
                System.out.println("negatif sayi kullanamazsiniz");

            }
        }
        System.out.println("GİRİLEN PSİTİVE SAYİLARİN TOPLAMİ:" +sayilarinToplami);
        System.out.println("GİRİLEN POSİTİVE SAYİLARİN ADEDİ:"+pozitifSayiAdedi);


    }

    public static  int[] arrayinElemanlariniArtir(int[] arr , int artisMiktari){

        for (int i = 0; i <arr.length ; i++) {

            arr[i] += artisMiktari;
        }

        return arr;
    }

    public static void kullanimSayisiYazdir(int[] arr , int arananSayi) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Aradiginiz sayi array'de yok");
        }
        else {
            System.out.println("Aradiginiz " + arananSayi + " sayisi array'de " + sayac + " kere kullanilmis");
        }
    }

    public static void enUzunEnKisayiyazdir(String[] arr) {

        String enuzunIsim = arr[0];
        String enKisaIsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enuzunIsim.length()) {
                enuzunIsim = arr[i];
            }


            if (arr[i].length() < enKisaIsim.length()) {
                enKisaIsim = arr[i];
            }


        }

        System.out.println("En uzun isim : " + enuzunIsim);
        System.out.println("En kisa isim : " + enKisaIsim);
    }

    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen olusturulacak array'in eleman sayisini giriniz: ");
        int verilenLength = scanner.nextInt();

        int[] arr = new int[verilenLength];

        for (int i = 0; i <verilenLength ; i++) {

            System.out.print("Array'e eklemek icin " + i + ". indexdeki sayiyi giriniz: ");

            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void kullanimAdediyazdir(int[][] arr , int arananSayi){

        int kullanimAdedi = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j] == arananSayi){
                    kullanimAdedi++;
                }
            }
        }

        System.out.println("Aradiginiz " + arananSayi + ", array' de " + kullanimAdedi + " adet kullanilmis");

    }

    public static void listeToplaminiYazdir(List<Integer> sayilar){

        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {

            toplam += sayilar.get(i);
        }

        System.out.println("Listedeki sayilarin toplami : " + toplam);

    }

    public static List<String> istenmeyenIsimleriTemizle(List<String> isimler , String istenmeyenHarf){

        for (int i = 0; i < isimler.size() ; i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i)); // isim silindiginde indeksler kayacagi icin i-- yazdik
                i--;
            }
        }

        return isimler;
    }

    public static List<String> listeOlustur(){

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenIsim="";

        do {

            System.out.println("Lutfen listeye eklemek icin isim giriniz...");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimler.add(girilenIsim);
            }

        }while(!girilenIsim.equalsIgnoreCase("Q"));

        return isimler;
    }









}

public class JavaDeneme {
    public static void main(String[] args) throws FileNotFoundException {






        //SORU[1]
        //İF ELSE İF İLE Kullanicidan cinsiyetini ve yasini alin,
        //Kadin, 60 yas ve uzeri ,
        //Erkek 65 yas ve uzeri emekli olabilir.
        //Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Lutfen yasinizi giriniz: ");
//        double yas = scanner.nextDouble();
//
//        System.out.print("Lutfen cinsiyetinizi giriniz: ");
//        String cinsiyet = scanner.next();
//
//        methodlar.emeklikikHesaplamaMethod(yas,cinsiyet); //METHOD









        //SORU[2]
        //NESTED İF ELSE İLE KULLANİCİDAN ÜRÜN ADETİ VE ÜRÜN LSİTE FİYATİ VE İNDİRİM KARTİ VAR Mİ SORGULAYİN
        //KARTİ OLUP 10 ADET ÜZERİ ÜRÜN ALSA %20 İNDİRİM YAPİN KART OLUP 10 AŞAĞİ ÜRÜN ALSA %15 İNDİRİM YAPİN
        //KART OLMAYİP 10 ÜZERİ ÜRÜN ALSA %15 İNDİRİM YAPİN KART OLMAYİP 10 AŞAĞİ ÜRÜN ALSA %10 İNDİRİM


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Lutfen aldiginiz urunun liste fiyatini girin: ");
//        double listeFiyati = scanner.nextDouble();
//
//        System.out.print("Lutfen aldiginiz urun sayisini giriniz: ");
//        int urunSayisi = scanner.nextInt();
//
//        System.out.print("Musteri kartiniz var mi ? E : Evet, H: Hayir: ");
//        char kartVarMi = scanner.next().toUpperCase().charAt(0);
//
//        methodlar.indirimHesaplamaMethod(listeFiyati,urunSayisi,kartVarMi); // METHOD










        //SORU[3]
        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //		   input1 : “15.35 €” , input2 : “11.40 €”
        //		   output : 26.75 €

//        String input1 = "15.35 €";
//        String input2 = "11.40 €";
//
//        input1 = input1.replaceAll("\\D",""); // "1530"
//        input2 = input2.replaceAll("\\D",""); // "1140"
//
//        int fiyat1 = Integer.parseInt(input1);
//        int fiyat2 = Integer.parseInt(input2);
//
//        System.out.println(  ((double)fiyat1 + fiyat2) / 100  + " €");










        //SORU[4]
        //Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin, kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //ilk harf kucuk harf olmal, son karakter rakam olmali, sifre bosluk icermemeli, uzunlugu en az 10 karakter olmali


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Lutfen bir sifre giriniz: ");
//        String sifre = scanner.nextLine();
//
//        methodlar.sifreKontrolEtmeMethod(sifre); //METHOD












        //SORU[5]
        //Kullanicidan bir Metin isteyin
        //ve Metini tersine cevirip kaydedin.


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Lutfen bir metin giriniz: ");
//        String metin = scanner.nextLine();
//
//        System.out.println(methodlar.metinTersCivirMethod(metin)); //METHOD










        //SORU[6]
          /*
           Kullanicidan satir ve sutun sayisini alip
           asagidaki sekli olusturun

           ornek  : satir = 3, sutun = 7
           output :

                    * * * * * * *
                    * * * * * * *
                    * * * * * * *
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("satir sayisini giriniz: ");
//        int satir = scanner.nextInt();
//        System.out.print("Sutun sayisini giriniz: ");
//        int sutun = scanner.nextInt();
//
//        methodlar.satirStunSayiSekilMethod(satir,sutun); //METHOD









        //SORU[7]
         /*
         Kullanicidan satir sayisini alip, asagidaki sekli olusturun

         1
         1 2
         1 2 3
         1 2 3 4
         1 2 3 4 5
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("satir sayisini giriniz: ");
//        int satir = scanner.nextInt();
//
//        methodlar.satirileSekilOlusturMethod(satir); //METHOD










        //SORU[8]
        // Kullanicidan ismini isteyin
        // Ismi, ismin ilk harfi buyuk, diger harfleri kucuk olacak sekilde duzenleyip kaydedin
        // Eger kullanici birden fazla isim girerse, her ismin ilk harfi buyuk olmali

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("lutfen isminizi giriniz: ");
//        String isim = scanner.nextLine();
//
//        System.out.println(methodlar.ismiDuzenle(isim)); //METHOD











        //SORU[9]
        //        Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //        Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //        ve bunlarin toplaminin kac oldugunu yazdirin
        //        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //        bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        //methodlar.kuallaniciSayiAlinToplayinMethod(); //METHOD










        //SORU[10]
        //        Verilen bir int array’in tum elemanlarini 2 artirip
        //        bize donduren bir method olusturun.
        //        Eski array’i yeni haliyle kaydedin.

//        int[] arr ={1,2,3,4,5,6,7,8,9};
//        arr = methodlar.arrayinElemanlariniArtir(arr,2);  //METHOD
//        System.out.println(Arrays.toString(arr));












        //SORU[11]
        //         Verilen bir array’de
        //         istenen bir elemanin var olup olmadigini ve
        //         varsa kac kere kullanildigini yazdiran bir method olusturun.


//        int[] arr = {3,5,6,7,5,4,3,2,3,5,7,8,9,7,4,3,2,4,6,2,1,4};
//        methodlar.kullanimSayisiYazdir(arr,5); //METHOD











        //SORU[12]
        //         Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

//        String[] isimler = {"Cem","Ergun","Vildan", "Ece","Ali","Eren","Kaan","Canan","Ibrahim"};
//
//        methodlar.enUzunEnKisayiyazdir(isimler); //METHOD









        //SORU[13]
        //         Kullanicidan array’in boyutunu ve elementlerini alip
        //         array’i olusturan ve bize donduren bir method olusturun.

//        int[] kullaniciArr = methdolar.intArrayOlustur(); //METHOD
//        System.out.println(Arrays.toString(kullaniciArr));








        //KONU[14]
        //MULTİDAİMANSİONAL ARRAYDE ARANAN SAYİNİN KAÇ YERDE OLUDĞUNUZ ADEDİNİ YANİ BULAN METHOD OLUŞTURUN

//        int[][] arr = {{1,2,3},{3,5,6,3},{1,4,7,8,5,3}};
//        methodlar.kullanimAdediyazdir(arr,5);










        //KONU[15]
        //ARRAYLİST DEKİ ELEMANLARİ TOPLAYAN BİR METHOD OLUŞTURUN

//        List<Integer> sayilarList = new ArrayList<>();
//        sayilarList.add(3);
//        sayilarList.add(5);
//        methodlar.listeToplaminiYazdir(sayilarList); //8 yazdirir











        //KONU[16]
        //Verilen String bir array listede,  istenmeyen harf iceren elementleri silip,
        //kalan kismini list olarak bize donduren bir method olusturun

//        List<String> isimler = new ArrayList<>();
//        isimler.add("Ece");
//        isimler.add("Eren");
//        isimler.add("Tugce");
//        isimler.add("Kaan");
//        isimler.add("Gokturk");
//
//        System.out.println(methodlar.istenmeyenIsimleriTemizle(isimler, "e"));











        //KONU[17]
        // Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize liste olarak
        // oluşturan bir method oluşturun

//        methodlar.listeOlustur(); //METHOD











        //KONU[18]
        //OLUŞTURULAN BİR ARRAYA YENİ BİR ELEMAN EKLEMEK VEYA ÇİKARMAK ZOR OLSADA MÜMKÜNDÜR
        // Array'in uzunlugunu degistirmek istersek,yeniArray oluşturup eski arrayi-den 1 fazla eleman sahip
        //yeniArray oluşturup eski arrayin değerlerini atayip ve yeni elemani yeniArray atayip tekrar eski array yeniArrayi atamamiz gerekir

//        int[] arr = {1,2,3,4,5};
//
//        int[] yeniArr = new int[arr.length + 1];
//
//        for (int i = 0; i <arr.length ; i++) {
//
//            yeniArr[i] += arr[i];
//        }
//
//        yeniArr[5] = 6;
//        arr = yeniArr;
//        System.out.println(Arrays.toString(arr));






















        //KONU[19]
        //BİR ARRAYDEKİ TEKRAR EDEN ELEMANLARİ ARRAY LİST SAYESİNDE YOK ET VE TEKRAR ARRY TEKRARSİZ OLARAK KAYDET
//        int[] arrays = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        List<Integer> tekrarEdenElemenlariYokEt = new ArrayList<>();                                         //KONTROL EDİLMESİ GEREKEN SORU!!!!
//
//        for (int i = 0; i < arrays.length ; i++) {
//
//            for (int j = 0; j < tekrarEdenElemenlariYokEt.size() ; j++) {
//
//                if(tekrarEdenElemenlariYokEt.size() != arrays.length){
//
//                    tekrarEdenElemenlariYokEt.add(arrays.length);
//                }
//            }
//        }
//        System.out.println(tekrarEdenElemenlariYokEt);
//
//
//        arrays = new int[tekrarEdenElemenlariYokEt.size()];
//        for (int i = 0; i < arrays.length ; i++) {
//            arrays[i] = tekrarEdenElemenlariYokEt.get(i);
//        }
//        System.out.println(Arrays.toString(arrays));












        //KONU[20]
        //MULTİDİMANTİONAL İÇ İÇER ARRAY KOMPLEX ARRAY DEMEKTİR

//        int[][] arr1 = {{1,2,3},{9,10},{15,20,25,30}};
//
//        System.out.println(arr1[0][2]); //3 ARRAY İÇİNDE ÖZEL OLARAK ELEMAN YAZDİRMA
//        System.out.println(Arrays.toString(arr1[0])); //[1, 2, 3] AYRİ OLARAK ARRAY YAZDİRMA
//        System.out.println(Arrays.deepToString(arr1)); //[[1, 2, 3], [9, 10], [15, 20, 25, 30]] TOPLU ARRAYLERİ










        //KONU[21]
        //Olusturmak istedigimiz liste uzun bir liste ise,  elemanlari tek tek eklemek zahmetli bir iş
        //bunun yerine istenen listeyi once array olarak tanimlayip, sonra bu array'i list'e cevirebiliriz
        //2 yolu vardir biri manuel olarak yapmak iki hazirmethod ile yapmak ama genelde manuel olarak yapilir
        //hazirmethod ile yapilirsa listde artik eleman ekleme çikarma gibi şeyler yapilamaz, başka devazantaj arrayde
        //değişiklik yapilirsa listede değişir listde değişiklik yapilirsa arrayde değişir bu yüzden tercih edilmez hazir method

//        String[] urunler = {"Nutella", "Pirinc", "Ekmek", "Seker", "Sut", "Sut", "Seker", "Cokoprens"};
//
//        List<String> urunlerListesi = new ArrayList<>();
//
//        for (int i = 0; i < urunler.length ; i++) {
//
//            urunlerListesi.add(urunler[i]);
//        }
//        System.out.println("Urunler Listesi: " + urunlerListesi);
//
//
//        List<String> urunlerHazirMethodList = Arrays.asList(urunler); //HAZİR METHOD İLE YAPİLİŞİ BU KADAR TEK SATİRDA İŞİ ÇÖZER









        //KONU[22]
        //FOREACH LOOP KULLANİM, Kullanicidan bir cumle ve bir harf alin, harf case sensitive olmadan,yani büyük küçük olamadan
        //cumlede kullanilmissa kac kere kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Lutfen bir cumle giriniz: ");
//        String cumle = scanner.nextLine();
//        System.out.print("Cumlede aramak istediginiz harfi girin: ");
//        String arananHarf = scanner.nextLine();
//
//        String[] karakterler = cumle.split(""); //[o, n, d, e, r] işimiz kolaylaşir böylece
//
//        int sayac = 0;
//
//        for (String each : karakterler
//        ) {
//
//            if (each.equalsIgnoreCase(arananHarf)){
//                sayac++;
//            }
//        }
//
//        if (sayac == 0){
//            System.out.println("harf cumlede kullanilmamis");
//        }else{
//            System.out.println(arananHarf + " harfi cumlede " + sayac + " kez kullanilmis");
//        }










        //KONU[23]
        //NESTED FOREACH LOOP, Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri ayri bir
        // liste olarak veren bir program yapin

//        int[] arr1 = {3,6,8,9,5,3,8,5,9};
//        int[] arr2 = {5,7,9,9,1,3,9,5,1};
//
//        List<Integer> ortakElementlerListesi = new ArrayList<>();
//
//        for (int eachArr1 : arr1
//        ) {
//
//            for (int eachArr2 : arr2
//            ) {
//
//                if (eachArr1 == eachArr2 && !ortakElementlerListesi.contains(eachArr1)){
//                    ortakElementlerListesi.add(eachArr1);
//                }
//            }
//        }
//
//        System.out.println(ortakElementlerListesi);
//












        //konu[24]
        //EXCEPTİON
        // kullanicidan bir metin ve bir tane pozitif tamsayi alin
        // girilen metindeki , girilen index'deki karakteri yazdirin
        // input : Ali , 1   Output ==> l
        //burda iki exception verme riski var metin yerine başka birşey girer veya girilen metinin indexden fazla olan sayi girer
        //bunu gibi istisnai durumlari kontrol altina alip kod sorunsuz çaliştirabiliriz kullanici hata değer girsede
        //parent child işikisi olanlarda childari en başa koyariz en parentleri en alta koyariz parent bütün hatalari yakaladiği için


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("LÜTFEN BİR METİN GİRİNİZ: ");
//        String metin = scanner.nextLine();
//
//        int sayi = 0;
//        try {
//
//            System.out.print("LÜTFEN BİR POZİTİF TAM SAYİ GİRİNİZ: ");
//            sayi = scanner.nextInt();
//
//        } catch (InputMismatchException e) {
//
//            // System.out.println(e.getMessage()); // null
//            // e.printStackTrace(); // tum hata mesajini yazdirir
//            // System.out.println(e.toString()); // java.util.InputMismatchException
//            System.out.println("Tamsayi girmelisiniz..."); //BİZDE UYARİ VEREBİLİRİZ HAZİR METHOD KULLANMADAN
//        }
//        catch (StringIndexOutOfBoundsException e){
//
//            System.out.println("INDEX " + metin.length() + "'DEN KÜÇÜK OLMALİ");
//        }












//        KONU[25]
//        JAVA DA DOSYA OKUMA İŞLEMİ
//        Checked exception'lar genelde dosya islemleri ile ilgilidir
//        Dosya islemlerinde parent IOException  zaten bunu ustunde de butun exceptionlarin Atasi olan Exception var
//        yani aile Agaci Exception / IOException / FileNotFoundException

//
//        String dosyaYolu = "src/JAVA_DENEME/dosyaYolu";
//        try {
//
//            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
//
//            int k = 0;
//            while((k = fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
//                System.out.print((char) k);
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Belirtilen dosya yolunda, dosya bulunamadi");
//
//        } catch (IOException e) {
//            System.out.println("Dosyadaki yazilar okunamadi");
//        }








        //KONU[26]
        //ITERATOR
        // Java'da coklu eleman barindiran her yapi index'i desteklemez
        // biz index olmadan listede kalici degisiklik yapamiyoruz
        // Index olmadan kalici degisiklik yapabilmemiz icin
        // Java Iterator ve ListIterator'i olusturmustur

        // 10'dan kucuk olan sayilari iterator ile silin

//        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,34,7,12,4,5,14));
//        Iterator iterator = sayilar.iterator();
//
//        while (iterator.hasNext()){
//
//            Integer sayi = (Integer) iterator.next();
//
//            if (sayi < 10){

//                iterator.remove();
//            }
//        }


















        //KONU[27]
        //MAPS
        // Soru :  Verilen bir array’deki
        //         tekrar eden elementleri silerek,
        //         her element’den sadece bir tane olacak sekilde yeni bir array olusturun.

//        Integer[] sayilar = {2,5,6,2,5,3,4,6,5,3,2,6,5,6,5,6,5};
//
//        Set<Integer> sayiSeti = new HashSet<>();
//        sayiSeti.addAll(Arrays.asList(sayilar));
//
//        System.out.println("Set olarak tekrarsiz sayilar : "+ sayiSeti); //  [2, 3, 4, 5, 6]
//
//        sayilar = new Integer[sayiSeti.size()]; // [null, null, null, null, null]
//
//        int index = 0;
//
//        for (Integer each : sayiSeti
//        ) {
//            sayilar[index] = each;
//            index++;
//        }
//
//        System.out.println("Array'in son hali : " + Arrays.toString(sayilar));
//


















        //KONU[28]
        //MAPS
        // Soyadi Can olan ogrencilerin
        // sinif sube isim ve soyisimleri yazdirin

//        Map<Integer, String> ogrenciMap = new HashMap<>();
//        ogrenciMap.put(101, "Ali-Can-11-H-MF");
//        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
//        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
//        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
//        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
//        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
//        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
//
//        Collection<String> valueCollection = ogrenciMap.values();
//
//        for (String eachValue : valueCollection
//        ) {
//
//            String[] valueArr = eachValue.split("-"); // [Ali, Can, 11, H, MF]
//
//            if (valueArr[1].equalsIgnoreCase("Can")) {
//
//                System.out.println(
//                        // sinif sube isim ve soyisim
//                        valueArr[2] + "   " +  // sinif
//                                valueArr[3] + "   " +  // sube
//                                valueArr[0] + "   " +  // isim
//                                valueArr[1]  // soyisim
//                );
//
//
//            }
//
//        }













        //KONU[29]
        //MAPS
        //104 numarali öğrencinin adini aslan yapin

//        Map<Integer, String> ogrenciMap = new HashMap<>();
//        ogrenciMap.put(101, "Ali-Can-11-H-MF");
//        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
//        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
//        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
//        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
//        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
//        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
//
//        // 1- once 104 numarali ogrencinin value'sunu kaydedelim
//
//        String eskiValue = ogrenciMap.get(104); // Ayse-Can-10-H-MF
//
//        // 2- value'de update yapabilmek icin split ile array'e cevirelim
//
//        String[] eskiValueArr = eskiValue.split("-"); // [Ayse, Can, 10, H, MF]
//
//        // 3- array'de istenen update'i yapalim
//
//        eskiValueArr[1] = "Aslan"; // [Ayse, Aslan, 10, H, MF]
//
//        // 4- array'in son halini ogrenci map'ine kaydetmek icin, eskivalueArr'ini value formatinda String yapalim
//
//        String yeniValue = String.join("-",eskiValueArr); // Ayse-Aslan-10-H-MF
//
//        // 5- Key ve yeni value'yu kullanarak map'i update edelim
//
//        ogrenciMap.put(104,yeniValue);
//
//        System.out.println("Ogrenci map'in yeni hali : "+ ogrenciMap);








        //KONU[30]
        //NEESTED MAPS
        //101 olarak ogrenci ekle, 101 numarali öğrencinin adini aslan yapin

//        Map<Integer, Map<String, String>> ogrenciNestedMap = new HashMap<>();
//
//        Map<String, String> ogrenciValueMap = new HashMap<>();
//        ogrenciValueMap.put("Name","Ali");
//        ogrenciValueMap.put("Surname","Can");
//        ogrenciValueMap.put("Class","A1");
//
//        ogrenciNestedMap.put(101,ogrenciValueMap);
//
//        ogrenciNestedMap.get(101).put("Surname","Aslan");
//
//        System.out.println(ogrenciNestedMap);












        //KONU[31]
        //MAPS
        // Verilen harfler listesinde
        // herbir harfi ve kacar defa kullanildigini bir map olarak yazdirin
//
//        List<String> harfler = new ArrayList<>(Arrays.asList("a","b","b","z","k","z","k","b","k"));
//
//        // a=1, b=3, z=2, k=3
//
//        Map<String ,Integer> kullanimSayiMap = new TreeMap<>();
//
//        for (String each: harfler
//        ) {
//
//            kullanimSayiMap.computeIfPresent(each , (k,v) -> v+1);
//            kullanimSayiMap.computeIfAbsent(each,v->1);
//
//        }
//
//        System.out.println(kullanimSayiMap);














        //KONU[32]
        //NESTED MAPS REZEVASYON PROGRAMİ
          /*

       {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */

//        Map<String, Object> rezervasyonMap = new HashMap<>();
//
//        rezervasyonMap.put("firstname","Ahmet");
//        rezervasyonMap.put("lastname","Bulut");
//        rezervasyonMap.put("totalprice",500);
//        rezervasyonMap.put("depositpaid",false);
//
//        Map<String,String> bookingDatesmap = new HashMap<>();
//        bookingDatesmap.put("checkin","2024-07-21");
//        bookingDatesmap.put("checkout","2024-08-10");
//
//        rezervasyonMap.put("bookingdates",bookingDatesmap);
//        rezervasyonMap.put("additionalneeds","wi-fi");
//
//        System.out.println(rezervasyonMap);
//
//
//        System.out.println(rezervasyonMap.get("firstname")); // isim bilgisini yazdir Ahmet
//
//        System.out.println(rezervasyonMap.get("totalprice")); // total price yazdir 50
//
//        System.out.println(rezervasyonMap.get("bookingdates"));  // {checkin=2024-07-21, checkout=2024-08-10}
//
//        System.out.println(((Map<String, String>) rezervasyonMap.get("bookingdates")).get("checkin")); //ayri tarih yazdir
//        // 2024-07-21
//














































































    }


}