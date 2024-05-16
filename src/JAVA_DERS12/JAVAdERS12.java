package JAVA_DERS12;

import com.sun.tools.javac.Main;

public class JAVAdERS12 {
    public static void main(String[] args) {



        //KONU[1]
        //OBJE OLUŞTURMA ŞEKLİ EN DOĞRU OLARAK NASİL OLUR

        //OLUŞTURMA 1
        //C09_Hastane pers1 = new C09_Hastane();  //EN DOĞRU OBJE OLUŞTURMA BUDUR


        //OLUŞTURMA 2
        //C09_Hastane pers2;

        // Java bizim bir obje olusturma niyetimiz oldugunu anlar
        // AMMA constructor calismadigi icin
        // class'daki ozellikleri kopyalayip getirmez
        // yani obje fiilen ete kemige burunmemis olur

        //ozetle : obje var ama ozellik yok

        //OLUŞTURMA 3
        //new C09_Hastane();

        // burada ise constructor calistigi icin
        // class'a gidip ozellikleri kop[yalayip getirir
        // ancak bir obje'ye atamadigimiz icin
        // getirdigi ozellikler havada kalir
        // sadece 33.satirda oldugu gibi o satirlik getirilen ozelliklerden
        // istediginizi yazdirabilirsiniz.

        // ozetle : ozellik var ama obje yok










        //KONU[2]
        //CONSTRUCTOR HAKKİNDA BİLGİ

        // Java tum class'larda default constructor. olusturur
        // ama biz yil ve fiyat degerlerini girebilecegimiz
        // bir constructor istiyordsak,
        // bunu kendimiz olusturmaliyiz parametreli constructor oluşturup

        // ANCAK biz gorunur bir constructor olusturdugumuzda
        // Java'nin default cons'i sildigini UNUTMAMALIYIZ
        // Yani biz gorunur bir constructor olusturdugumuzda
        // baska bir hataya sebep olmamak icin
        // default cons. yerine PARAMETRESIZ bir cons. da olusturmaliyiz


        //bir class oluşturup o class dan başka classda obje oluşturduğumuzda her class da
        //olduğu gibi default constructor vardir ve biz class da obje oluşturup veriablelara değer atamasini
        //tek tek yapariz ve değer atamasini yaptiktan sonra onlari tek tek yazdirmak zorundayiz ve işte bu işi
        //kolaylaştirmak için java tek tek yazdirmaya gerek olmasin kolay olsun diye ToString method oluşturmuş
        //ToString method,da menü gidip Code basip Generate basip ToString basip ordan istediğimiz veriable seçip
        //toplu şekilde yazdirma işlemi yapabiliriz bu işlem sadece yazdirmak için geçerli atama için değil
        //tek satirda atamak için parametreli construtor oluşturmamiz gerek sonrasi obje ile tek satirda işle olur



        // menu/code/generate/toSting secip
        // class'daki variable'lardan olmasini istediklerimizi
        // isaretliyoruz
//        @Override
//        public String toString() {
//            return "Car ozellikler : " +
//                    "marka='" + marka + '\'' +
//                    ", model='" + model + '\'' +
//                    ", renk='" + renk + '\'' +
//                    ", yil=" + yil +
//                    ", fiyat=" + fiyat ;
//        }







        //KONU[3]
        //CONSTRUCTOR CALL
        //constructor call işlemi























    }
}
