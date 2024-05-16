package JAVA_DERS10;

public class JavaDers10 {
    public static void main(String[] args) {


        //KONU[1]
        //OLUŞTURULAN BİR ARRAYA YENİ BİR ELEMAN EKLEMEK VEYA ÇİKARMAK ZOR OLSADA MÜMKÜNDÜR
        // Array'in uzunlugunu degistirmek istersek,yeniArray oluşturup eski arrayi-den 1 fazla eleman sahip
        //yeniArray oluşturup eski arrayin değerlerini atayip ve yeni elemani yeniArray atayip tekrar eski array yeniArrayi atamamiz gerekir

//        int[] arr = {1,2,3,4,5};
//        int[] yeniArr = new int[arr.length+1]; //arr array eleman sayisindan 1 fazla olarak yeniArr oluşturduk
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            yeniArr[i] = arr[i];
//        }
//
//        yeniArr[5] = 6;
//        arr = yeniArr;
//        System.out.println(Arrays.toString(arr));








        //KONU[2]
        //BİR ARRAYDEKİ TEKRAR EDEN ELEMANLARİ ARRAY LİST SAYESİNDE YOK ET VE TEKRAR ARRY TEKRARSİZ OLARAK KAYDET
//        int[] arrays = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//
//        List<Integer> tekrarEdenElemenlariYokEt = new ArrayList<>();
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
















        //KONU[3]
        //MULTİDİMANTİONAL İÇ İÇER ARRAY KOMPLEX ARRAY DEMEKTİR

//        int[][] arr1 = {{1,2,3},{9,10},{15,20,25,30}};
//
//        System.out.println(arr1[0][2]); //3 ARRAY İÇİNDE ÖZEL OLARAK ELEMAN YAZDİRMA
//        System.out.println(Arrays.toString(arr1[0])); //[1, 2, 3] AYRİ OLARAK ARRAY YAZDİRMA
//        System.out.println(Arrays.deepToString(arr1)); //[[1, 2, 3], [9, 10], [15, 20, 25, 30]] TOPLU ARRAYLERİ


//        List<Integer> arrayList = new ArrayList<>();
//
//        arrayList.add(3);
//        arrayList.add(5);
//        arrayList.add(7);
//        arrayList.add(4);
//        arrayList.add(3);

//        int arraylarinToplami = 0;
//
//        for (int i = 0; i < arrayList.size() ; i++) {
//
//            arraylarinToplami += arrayList.get(i);
//        }
//        System.out.println("ARRAY LSİTLERİN TOPLAMİ: " +arraylarinToplami);








        //KONU[4]ARRAYDE ARANAN SAYİNİN KAÇ YERDE OLUDĞUNUZ ADEDİNİ YANİ BULAN PROGRAM

//        int[][] arr = {{1,2,3},{3,5,6,3},{1,4,7,8,5,3}};
//        int arananSayi = 3;
//
//        int kullanimAdedi = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            for (int j = 0; j < arr[i].length ; j++) {
//
//                if (arr[i][j] == arananSayi){
//                    kullanimAdedi++;
//                }
//            }
//        }
//        System.out.println("Aradiginiz " + arananSayi + ", array' de " + kullanimAdedi + " adet kullanilmis");










        //KONU[6]
        // Array'ler eleman ekleme ve eleman silme ozlellikleri olmadigindan
        // kullanimda cok tercih edilmezler
        // Java array ozelliklerini kullanan ama ekleme ve cikarma yapabildigimiz
        // ArrayList'i de olusturmustur.

//        List<Integer> sayilarList = new ArrayList<>();
//        sayilarList.add(3);
//        sayilarList.add(5);
//
//        sayilarList.remove(0);
//        System.out.println(sayilarList);







        //KONU[7]
        //ARRAYLİST DEKİ ELEMANLARİ TOPLAYAN PROGRAM

//        List<Integer> sayilar = new ArrayList<>();
//        sayilar.add(5);
//        sayilar.add(3);
//
//        int toplam = 0;
//
//        for (int i = 0; i < sayilar.size(); i++) {
//
//            toplam += sayilar.get(i);
//        }
//
//        System.out.println("Listedeki sayilarin toplami : " + toplam); //8 yazdirir









        //KONU[8]
        //ARRAYLİST DEKİ ELEMANLARİ UPDATE ETME HAZİRT METHOD İLE YAPİLİR

//        List<String> isimler = new ArrayList<>();
//        isimler.add("Deniz");
//        isimler.add("Gokhan");
//        isimler.add("Canan");
//        isimler.add("Gokturk");
//
//        isimler.set(1,"Hasan");
//        System.out.println(isimler); //[Deniz, Hasan, Canan, Gokturk] 1 indexdeki eleman değişti


















    }
}
