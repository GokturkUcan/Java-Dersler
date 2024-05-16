package JAVA_DERS17_OOP2;

public class Java_OopDers2 {
    public static void main(String[] args) {



        //KONU[1]
        //İNHERİTANCE

           /*
            Bir class'dan obje olusturulup,
            ilk deger atamalarinin yapilabilmesi icin
            mutlaka constructor calismalidir

            Child class'da olusturulan bir objenin
            parent class(lar)daki ozellikleri de tasiyabilmesi icin
            parent class(lar)daki constructor'lar calismalidir

            java bunu saglayabilmek icin
            su mekanizmayi olusturmustur

            ---- Extends keyword kullanan bir class'da
                 olusturulan HER CONSTRUCTOR'in ilk satirinda
                 MUTLAKA constructor call OLMALIDIR

                 Eger kodu yazan kisi
                 ilk satira gorunur bir constructor call yazmissa
                 java yazilan constructor call'u kullanir
                 ama gorunur bir constructor call yoksa
                 JAVA default olarak super(); yaz

                 kullanilan constructor
                 parametreli de olsa,
                 java'nin default olarak koydugu constructor call
                 parametresiz super(); olacaktir----
         */

  /*
            Java'da herhangi bir yerde
            bir class uyesine ulasmak isterseniz
            Java sirasi ile
                1- icinde bulundugumuz scope
                2- icinde bulundugumuz class
                3- parent class(lar)'a bakar
            ve ilk buldugunu kullanir

            eger this.classUyeIsmi  yazarsak, scope'a bakmadan 2.adima gecer
            eger super.classUyeIsmi  yazarsak scope ve class'a bakmadan 3.adima gecer

            aramaya basladigi yerden
            hep ileriye dogru gider
            bulamazsa CTE verir
            ama geriye donmez
        */


           /*
        Java bir ozelligi
        variable olarak olusturmak ile
        method olarak olusturma arasinda bir kullanim farki kabul eder

        Bu farklilik bize istedigimizi yapma adina esneklik hakki verir

        Ozellikler variable olarak olusturulursa
        1- Eger data turu ve constructor ayni ise
           o class'dan aramaya baslariz ve ilk buldugumuz
           ozelligi kullaniriz

        2- Eger data turu ve constructor farkli ise
           aramaya data turu olan class'dan baslariz
           ve ilk buldugumuz ozelligi kullaniriz

     */








































    }
}
