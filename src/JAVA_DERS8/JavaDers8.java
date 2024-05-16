package JAVA_DERS8;

import java.util.Scanner;

public class JavaDers8 {
    public static void main(String[] args) {

        //SORU[1] While loop kullanarak verilen bir String’i terse cevirip,
        //bu halini bize donduren bir method olusturun.

//        System.out.println(metniTerseCevir("Hasan"));


        //SOUR[2] While Loop Kullanicidan ismini isteyin
        // Ismi, ismin ilk harfi buyuk, diger harfleri kucuk olacak sekilde duzenleyip kaydedin

//        String isim = "ali can";
//        System.out.println(ismiDuzenle(isim));


        //SORU[3] While Loop Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //       Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //       Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //       ve bunlarin toplaminin kac oldugunu yazdiran method tasarlayin

//        kullaniciPozitifTamsayi();


        //SORU[4] DO While Loop Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //       Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //       Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        //       ve bunlarin toplaminin kac oldugunu yazdiran method tasarlayin

//        kullanicPozitiftamsayi();


    }


    public static String metniTerseCevir( String metin){

        String tersMetin ="";

        int index= metin.length()-1; // son harften baslamak istedigim icin

        while (index >= 0){
            tersMetin += metin.charAt(index);
            index--;
        }

        return tersMetin;
    }

    public static String ismiDuzenle(String isim){

        int index = 0;
        String duzenlenmisIsim ="";

        while (index < isim.length()){

            if (index == 0){
                duzenlenmisIsim += isim.toUpperCase().charAt(0);
            }
            else if(isim.charAt(index-1) == ' ') {
                duzenlenmisIsim += isim.toUpperCase().charAt(index);

            } else if (isim.charAt(index)== ' ') {
                duzenlenmisIsim += " ";

            } else{
                duzenlenmisIsim += isim.toLowerCase().charAt(index);
            }

            index++;
        }

        return duzenlenmisIsim;
    }

    public static void kullaniciPozitifTamsayi(){

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 10;

        int sayilarinToplami= 0 ;
        int pozitifSayiAdedi = 0;

        while (girilenSayi != 0 ){

            System.out.print("Toplanmak uzere pozitif tamsayilar Girin, bitirmek icin 0'a basin: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi > 0){
                sayilarinToplami += girilenSayi;
                pozitifSayiAdedi++;

            } else if (girilenSayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }
        }

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari : " + sayilarinToplami);

    }

    public static void kullanicPozitiftamsayi(){

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        int sayilarinToplami= 0 ;
        int pozitifSayiAdedi = 0;

        do {

            System.out.print("Toplanmak uzere pozitif tamsayi giriniz, bitirmek icin 0'a basin: ");
            girilenSayi= scanner.nextInt();

            if (girilenSayi > 0){
                sayilarinToplami += girilenSayi;
                pozitifSayiAdedi++;
            }
            else if (girilenSayi < 0) {
                System.out.println("Negatif sayi giremezsiniz...");
            }

        }while (girilenSayi != 0);

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari : " + sayilarinToplami);




    }






































 }

