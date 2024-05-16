package JAVA_DERS19_OOP4;

public class Java_OopDers4 {
    public static void main(String[] args) {



        //KONU[1]
        //ABSTRACT CLASS
   /*
            Klasik inheritance kullandigimizda
            tum kararlari child class verir
            - child class, istedigi class'i parent edinebilir
            - eger child isterse, kendisi hic bir method olusturmadan
              parent class'daki method'lari kullanabilir
            - child class isterse parent class'daki method'lari override edebilir
            - child class isterse, parent class'da olmayan yeni method'lar ekleyebilir
         */

  /*
        Eger Parent class'in kural koymasini istiyorsaniz, yapisini degistirmek zorundasiniz

        Bir Class'in child class'larini,
        belirledigi method'lari bulundurmaya MECBUR ETMESI icin
        parent class'in abstract yapida olmasi lazim

        Eger butun kurallari belirlemeyecekseniz,
        yani bazi method'lari uyarlamaya mecbur ederken,
        bazilarini child class'in inisiyatifine birakacaksaniz
        kismi abstraction uygulamalisiniz

        1- Kismi abstraction icin ABSTRACT CLASS'lar kullanilir

        2- Bir class'i abstract class haline getirmek icin
           class deklarasyonuna abstract yazmaniz yeterlidir

        3- Bir class'i abstract class yapinca,
           child class'larinin mutlaka bulundurmasini istedigi
           method'lari da abstract yapmalisiniz

         4- Eger abstraction'dan bahsediyorsak,
            bugune kadar kullandigimiz, abstract olmayan
            class ve method'lar icin CONCRETE tabiri kullanilir

         5- Bir class abstract bir class'i PARENT edinirse
            parent class'da kural koymak icin
            abstract(body'siz) olarak olusturulan tum method'lari
            concrete'lestirmelidir (body'li hale getirmelidir)

         6- Abstract class sadece kendini parent edinen
            ilk concrete class'i bu method'lari override etmeye zorlar
            concrete class'in child'lari olursa
            onlarin hic bir mecburiyeti olmaz

          7- Abstract bir class'in abstract child'i oldugunda
             bu child class da abstract oldugundan
             parent class'daki method'lari override etme mecburiyeti olmaz

          8- eger birbirini parent edinen
             birden fazla abstract class varsa
             bu abstract class'lardan sonra gelen ilk concrete class
             concrete'lestirilmemis method'lari
             concrete'lestirmelidir


     */

        // bu class'da child class'larin MUTLAKA OVERRIDE etmesini istedigimiz
        // method1 ve method2  (abstract method)
        // child class'larin isterse direk kullanabilecegi, isterse override edebilecegi
        // method3 ve method4 (concrete method)olsun

        // abstract method'lar concrete method'lar gibi degildir
        // bir seye benzeteceksek,
        // abstract method'lar resmi gazetedeki kural belirleyen maddeler gibidir









        //KONU[2]
        //INTERFACE NOT CLASS DEĞİLDİR

        // Bir interface icindeki tum method'lar
        // public ve abstract'tir
        // public ve abstract yazmasak da farketmez

        // Bir interface icindeki tum variable'lar ise
        // public static ve final'dir
        // static oldugu icin child class'dan direk ulasilabilir
        // final oldugu icin sonradan deger atanamaz

        // Kullanmak istediginiz variable
        // birden fazla parent'da varsa
        // static yontemi kullanarak
        // classIsmi.varibleIsmi yazabiliriz

        // sadece 1 interface de olan variable'lari ise
        // direk kullanabiliriz

          /*
        Bir interface'e sonradan method eklenir mi ?

        Bir interface'e sonradan method eklemek
        interface acisindan HIC BIR SORUN olusturmaz

        ANCAK....
        Bir interface'e yeni bir abstract method eklendiginde
        o interface'i daha onceden implement etmis olan TUM CLASS'lari
        gozden gecirip, yeni eklenen method'u o class'lara uyarlamak zorunda kaliriz

        Ozellikle uzun zamandir devam eden projelerde
        bu tur eklemeler ciddi problemlere yol acabilir

        Java developer'lardan gelen talepler cercevesinde
        Java8 ile interface'lere bir istisna getirmistir.

        Java, Interface'e sonradan eklenen method'un
        child class'lar tarafindan implement edilme zorunlulugunun olmamasi icin
        ozel iki keyword kullanilarak isaretlenen method'larin
        body'si olmasina izin vermistir.

     */

        // Implement edilen interface'de
        // static veya default keyword'u kullanilarak olusturulan
        // body'li method'larin farki, erisim bicimindedir

        // static keyword kullanan method'a static yol ile ulasabilirsiniz
        // default keyword kullanan method'a ise obje olusturarak ulasabilirsiniz
















    }
}
