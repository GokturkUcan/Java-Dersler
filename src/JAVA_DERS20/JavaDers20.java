package JAVA_DERS20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaDers20 {

    public static void main(String[] args) {


           /*
            java kodlarimizi calistirirken
            bir hata ile karsilastiginda kod yazan kisinin
            bu hatayi ongorup, java'ya bir cozum yolu uretip uretmedigine bakar

            eger kod yazari bu hatayi ongormus
            ve java'ya yapmasi gerekeni soylemisse
            java kendisine soyleneni yapar
            ve normal calismasina devam eder

            bazi hatalari if statement'lar ile
            kontrol altina alabiliriz (handle edebiliriz)
            if-else ile cozemeyecegimiz durumlar icin
            Java try-catch (/ finally) bloklarini olusturmustur
         */

        // System.out.println(e.getMessage()); // null
        // e.printStackTrace(); // tum hata mesajini yazdirir
        // System.out.println(e.toString()); // java.util.InputMismatchException



   /*
            Exception turleri arasinda da parent-child iliskisi olanlar vardir

            Exceptions class'i tum exception'larin parent'idir
            Exceptions ikiye ayrilir

            1- RunTimeExceptions / Unchecked
            2- Compile Time'da anlasilabilen exceptions // Checked

            Java compile time'da variable'larin degerleriyle degil
            data turleriyle degerlendirme yapar

            eger data turu acisindan kullanimda sorun varsa
            veya compile time exception riskini farkederse
            kod'un altini cizer ve duzeltilmeden kodu calistirmaz

            eger data turlerinde degil, variable'in degerinde sorun varsa
            Java bunu calistirmadan farkedemez
            Calistirdiktan sonra soruna bagli olarak
             - NullPointerException
             - StringIndexOutOfBoundsException
             - ArithmethicException
             - ArrayIndexOutOfBoundsException
             gibi RunTimeException'in child'i olan exception'lar olusur.

         */

        // Eger birbiri ile parent child iliskisi olmayan
        // birden fazla exception ihtimali varsa
        // bunlari farkli 4 yontemle kontrol altina alabiliriz

        // 1- ikisini ayri ayri try catch'ler ile kontrol altina alabiliriz

        // 2- tek bir try, birden fazla catch cumlesi kullanabiliriz

        // 3- tek bir try ve potansiyel exception'lari kapsayan
        //    parent exception ile tek bir catch kullanabiliriz

        // 4- Isterseniz iki exception'i kontrol altina almak icin
        //    nested try-catch olusturabilirsiniz


          /*
            Checked Exceptions, kodlarimiz compile edilirken
            riski farkedilen exception'lardir

            Checked Exceptions genelde dosya islemlerinde karsimiza cikar

            Exception   ==> tum exception'larin parent'idir
            IOException ==> dosya islemleri ile ilgili parent exception
            FileNotFoundException ==> IOException'in child'idir. Dosya bulunamadiginda olusur

            Checked Exceptions olustugunda
            kodun alti kirmizi cizilir, bu durumda kod calismaz

            1- Ya Try-catch ile handle edip
               exception olustugunda hata mesaji verip
               yoluna normal olarak devam etmesini saglayabiliriz
            2- Ya da exception'i handle etmeden
               sadece kirmizi cizgiyi kaldirmak icin
               method deklarasyonuna throws keyword ile
               exception riski yazdirilabilir

         */

           /*
            Checked exception'lar genelde dosya islemleri ile ilgilidir
            Dosya islemlerinde parent exception IOException

            yani aile agaci

            Exception / IOException / FileNotFoundException

            eger tek bir try, birden fazla catch kullanacaksak
            child once yazilmalidir

            Cunku parent'in yakalama kapasitesi daha fazladir
            ustte olursa child'in yakalayacklarini da yakalar
            ve child'a is kalmaz
         */


          /*
            Throw keyword
            IHTIYAC DUYDUGUMUZDA bilerek ve isteyerek
            exception firlatmak icin kullanilir

            temel amac firlattigimiz exception'i try catch ile yakalayip
            kodumuzu istedigimiz sekilde planlamaktir.



         */





































































    }
}
