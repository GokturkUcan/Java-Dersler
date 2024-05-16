package JAVA_DERS13;

public class JavaDers13 {

    public static void main(String[] args) {


        //KONU[1]
          /*
        instance variable'lar obje'ye baglidir
        baska class'dan kullanilmak istendiginde
        objeIsmi.instancevariableIsmi seklinde kullanilir

        static variable'lar claas'a baglidir
        ve baska class'dan kullanilmak istendiginde
        classIsmi.staticVariableIsmi seklinde kullanilmalidir

        NOT : static bir variable'i
        baska class'dan kullanirken
        objeIsmi.staticVariableIsmi seklinde kullanirsaniz
        java size variable'i otomatik olarak getirmez
        ancak siz manuel olarak yazarsaniz
        kullanmaniza itiraz etmez
        intelliJ ise bu kullanimi sariya boyar
        ve static bir variable'a static olmayan yolla ulasmaya calisyorsunuz
        (Static member 'day13_staticKeyword_PassByValue.C01_Hastane.hastaneIsmi' accessed via instance reference )
        diye bizi uyarir

        static variable'lar class'a baglidirlar
        ve tum objeler icin ortak olduklarindan
        Java herbir obje icin static variable'in bir kopyasini olusturmaz
        Class'a bagli kek bir variable olusturur
        ve class'in tum objeleri bu static variable'a ulasabilirler

        Bunun negatif tarafi,
        bir obje static variable'in degerini degistirirse
        tum objeler icin degismis olur

        pozitif tarafi
        tek bir variable oldugu icin
        yonetmesi kolaydir ve
        hafizada az yer kaplar


     */




        //KONU[2]
           /*
        static block'lar class calismaya baslamadan once
        yapilmasi gereken bir islem varsa, kullanilir

        static blocks tum method'lardan
        HATTA main method'dan bile once calisir

        Eger birden fazla static block varsa
        diger kod bloklarina degil kendi iclerindeki siralanisa bakarlar
        usten asagi dogru sirasiyla calisirlar
     */




        //KOU[3]
         /*
        static olmayan bloklar
        bir obje olusturulmak istendiginde
        obje olusturulmadan once yapilacak islem varsa
        halletmek icin kullanilir

        diger bir deyisle
        obje olusturulacaksa, static olmayan blok calisir
        obje olusturulmazsa calismaz

     */









        //KONU[4]
          /*
            PassByValue : method'lar arasinda bir variable gonderilmesi gerektiginde
                          (yani method'a gondermek icin variable ismini yazdigimizda)
                          o variable'in kendisinin DEGIL, value'sunun gonderilmesine denir

                          Bu bizim verecegimiz bir karar degildir.
                          yazilim dilleri kendilerinin
                          passByValue/passByReference oldugu deklare eder
                          biz de kodlarimizi buna gore yazariz


                          DİKKAT:pass by value tek veriable ile işlem yapilirken method da yapilan değişiklik sadce
                          o anlik gerçekleşir kalici olmaz, çoklu elemnt ile yani array veya List gibi yapilar ile
                          method içinde direk atama varsa array e veya liste method da  yapilan değişiklik kalici olmaz
                          ama array e veya list de atama değil de içindeki değerlere atama yapildiysa onlar değiştiyse
                          method ile yapilan değişiklik kalici olur

           */



































    }
}
