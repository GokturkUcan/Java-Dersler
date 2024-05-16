package JAVA_DERS9;

import java.util.Scanner;

public class JavaDers9 {
    public static void main(String[] args) {


        //SORU[1] Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

//        int[] arrays ={4,6,8};
//        arrays = arraySayiArtir(arrays,5);
//        System.out.println(Arrays.toString(arrays));




        //SOURU[2] Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

//        int[] arr = {2,5,6,4,3,-5,-8,4};
//        System.out.println(pozitifElemanlariTopla(arr));





        //SORU[3] Verilen bir array’de istenen bir elemanin var olup olmadigini ve
        // varsa kac kere kullanildigini yazdiran bir method olusturun.

//        int[] arr = {3,5,6,7,5,4,3,2,3,5,7,8,9,7,4,3,2,4,6,2,1,4};
//        kullanimSayisiYazdir(arr,5);





        //SORU[4] Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

//        String[] isimler = {"Cem","Ergun","Vildan", "Ece","Ali","Eren","Kaan","Canan","Ibrahim"};
//        enUzunEnKisayiyazdir(isimler);









        //SORU[5] Kullanicidan array’in boyutunu ve
        // elementlerini alip array’i olusturan ve bize donduren bir method olusturun.

//        int[] kullaniciArr = intArrayOlustur();
//        System.out.println(Arrays.toString(kullaniciArr));









    }




    public static int[] arraySayiArtir(int[] array, int artisMiktari) {


        for (int i = 0; i < array.length; i++) {

            if (artisMiktari < 0)
                array[i] += artisMiktari;
        }

        return array;
    }

    public static int pozitifElemanlariTopla(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {

                toplam += arr[i];
            }
        }

        return toplam;
    }

    public static void kullanimSayisiYazdir(int[] arr, int arananSayi) {

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == arananSayi) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Aradiginiz sayi array'de yok");
        } else {
            System.out.println("Aradiginiz " + arananSayi + " sayisi array'de " + sayac + " kere kullanilmis");
        }

    }

    public static void enUzunEnKisayiyazdir(String[] arr){

        String enuzunIsim = arr[0];
        String enKisaIsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enuzunIsim.length()){
                enuzunIsim = arr[i];
            }


            if (arr[i].length() < enKisaIsim.length()){
                enKisaIsim = arr[i];
            }


        }

        System.out.println("En uzun isim : " + enuzunIsim);
        System.out.println("En kisa isim : " + enKisaIsim);
    }

    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen olusturulacak array'in eleman sayisini giriniz: ");
        int verilenLength = scanner.nextInt();

        int[] arr = new int[verilenLength];

        for (int i = 0; i <verilenLength ; i++) {

            System.out.print("Array'e eklemek icin " + i + ". indexdeki sayiyi giriniz: ");

            arr[i] = scanner.nextInt();
        }

        return arr;
    }
































}

