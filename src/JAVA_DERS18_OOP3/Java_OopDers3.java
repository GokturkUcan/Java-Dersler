package JAVA_DERS18_OOP3;

public class Java_OopDers3 {
    public static void main(String[] args) {



        //KONU[1]
        //POLYMORPHİSM

    /*
        Overriding child class'daki bir method'un parent class'i
        override = gecersiz kilmasidir
     */
        // child class'daki method'un
        // override edebilmesi icin parent class'daki method ile
        // isimleri ve signature'lari ayni olmalidir

          /*
            override icin method'u kendimiz olusturmak zorunda degiliz
            istersek menu'den generate/ override methods secerek
            override edecekl method'u olusturabiliriz

            Override method'u intelliJ'ye olusturtunca
            intelliJ @Override notasyonu kullanir
            bu notasyon mecburi degildir
            ama faydali bir ozelligi vardir

            Eger @Override notasyonu kullanirsak
            bu notasyon parent class'daki overridden method'u kontrol eder
            o method silinirse veya override islemini engelleyecek sekilde bir degisiklik yapilirsa
            CTE verir
         */
           /*
            Her ne kadar signature dahil olmasa da
            ovverriding icin access modifier da onemlidir

            Child class'daki overriding method'un access modifier'i
            parent class'daki overridden method'un access modifier'indan
            daha kisitlayici olamaz

            child parent'i kisitlayamaz
         */

        // eger parent class'daki method final yapilirsa
        // Java "overridden method is final" der ve CTE verir

        // eger parent class'daki method static yapilirsa
        //  "cannot override static method" der ve CTE verir
        // eger child class'daki method'u da static yaparsak
        // CTE olmaz ama Override da olmaz
        // bu iki method, birbirinden bagimsiz iki method olarak kullanilabilir

        // parent class'da private bir method oldugunda
        // child class onu goremeyeceginden
        // method5 bagimsiz bir method gibi davranir
        // override etmis olmaz

        // Parent class'daki method'un return type'i
        // void veya primitive ise child class'daki method'un return type'i
        // parent'daki method ile ayni olmalidir


        // overridden method'un return type'i non-primitive ise
        // child class'daki method'un return type'i
        // Ya aynisi olmali,
        // Veya parent'daki return type'in child'i olmali
        // Buna Covariant denir




























    }
}
