package JAVA_DERS11;

public class JavaDers11 {
    public static void main(String[] args) {


        //KONU[1]
        // Verilen String bir array listede,  istenmeyen harf iceren elementleri silip,
        //kalan kismini list olarak bize donduren bir method olusturun

//        List<String> isimler = new ArrayList<>();
//        isimler.add("Ece");
//        isimler.add("Eren");
//        isimler.add("Tugce");
//        isimler.add("Kaan");
//        isimler.add("Gokturk");
//
//        String istenmeyenHarf = "e";
//
//        for (int i = 0; i < isimler.size() ; i++) {
//
//            if (isimler.get(i).contains(istenmeyenHarf)){
//                isimler.remove(isimler.get(i)); // isim silindiginde indeksler kayacagi icin i-- yazdik
//                i--;
//            }
//        }
//        System.out.println(isimler);











        //KONU[2]
        // Kullanicidan istedigi kadar isim alip, Q’ya bastiginda girdigi isimleri bize liste olarak OLUŞTURAN PROGRAM

//        List<String> isimler = new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        String girilenIsim ="";
//
//        do {
//
//            System.out.print("Lutfen listeye eklemek icin isim giriniz: ");
//            girilenIsim = scanner.nextLine();
//
//            if (!girilenIsim.equalsIgnoreCase("Q")){
//                isimler.add(girilenIsim);
//            }
//
//
//        }while(!girilenIsim.equalsIgnoreCase("Q"));
//
//        System.out.println(isimler);








        //KONU[3]
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


//        List<String> urunlerHazirMethodList = Arrays.asList(urunler); //HAZİR METHOD İLE YAPİLİŞİ BU KADAR BASİT











        //KONU[4]
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










        //KONU[5]
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




































    }
}
