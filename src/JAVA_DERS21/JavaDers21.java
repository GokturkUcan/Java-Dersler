package JAVA_DERS21;

import java.util.Iterator;

public class JavaDers21 {
    public static void main(String[] args) {



        //[1]ERORR

        // String str = 23 ; // Bir syntax hatasi vardir ve duzeltmemiz icin Java bizi uyariyor
        //String str = 23+"" ; //.satirda alti kirmiz cizilen satir duzeltilebilir
        // ve bu durumda kod normal olarak calismaya devam eder


        // burada method1'in icinden tekrar method1() cagrildigindan
        // tam bir sonsuz dongu olusur




        //[2]ITERATOR


        // Java'da coklu eleman barindiran her yapi index'i desteklemez
        // biz index olmadan listede kalici degisiklik yapamiyoruz
        // Index olmadan kalici degisiklik yapabilmemiz icin
        // Java Iterator ve ListIterator'i olusturmustur

        // Iterator iterator = new Iterator();
        // 'Iterator' is abstract; cannot be instantiated
        // Iterator bir Interface oldugu icin direk obje olusturulamaz
        // bunun yerine kullanacagimiz coklu element barindiran yapi uzerinden obje olustururuz



        //Iterator iterator = sayilar.iterator();
        // bir iterator olusturup, listenin en basina konumlandirir

        //System.out.println(iterator.next()); // 1
        // iterator'i bis sonraki elemanin onune gecirir
        // ve uzerinden gectigi elemani iterator'a alir

        //iterator.remove();
        // o an uzerinde olan sayiyi listeden siler
        // iterator uzerinde sayi kalmadi

        //System.out.println(sayilar); // [2, 5, 8, 4]

        // Eger iterator'i yeniden hareket ettirmeden
        // bir kere daha remove() calistirirsak
        // IllegalStateException aliriz
        // iterator.remove();

        //System.out.println(iterator.hasNext()); // true
        // bulundugu yer itibariyle
        // iterator'dan sonra eleman olup olmadigini
        // bize true veya false olarak bildirir


//        while(iterator.hasNext()){ // iterator'in yaninda sayi oldugu muddetce loop calisacak
//
//            iterator.next();
//            iterator.remove();
//        }



        // Iterator'da dikkat etmemiz gereken en onemli konu
        // Iterator'i nerede biraktigimizdir
        // bu soru icin dusunursek, yukardaki while loop
        // itarator'i en sona goturmustur
        // yani loop bittiginde iterator 14'un sagindadir
        // iterator'i bir daha kullanmak isterseniz
        // yeniden iterator olusturmalisiniz


        // constructor LinkedList secilse de
        // data turu List oldugundan
        // tum List'lerin ortak ozelliklerini gosterir
        // bizim daha once arrayList'de gordugumuz ayni ozellikler
        // burda da var





        // Queue'da FIFO gecerlidir
        // eklemeler her zaman sona yapilir,
        // silmeler ise bastan olur

//        Queue<Integer> sayilar3 = new LinkedList<>();


        // element ve peek ikisi de
        // queue'nun basindaki elemani silmeden bize getirir
        // aralarindaki fark bos queue'da calistirilinca
        // element exception firlatir, peek ise null dondurur































    }
}
