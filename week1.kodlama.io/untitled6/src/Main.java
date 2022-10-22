import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] rakamlar = {222,321,343,4352,23543,23456435,1234546574,2324543,56455};
        int total =0;
        for(int adamlar : rakamlar)
        total=total+adamlar;
        System.out.println("toplam = "+total);


        String metin = ("Allah Büyüktür.");
        System.out.println(metin.length());
        System.out.println(metin.split(" "));
        System.out.println(metin.toUpperCase(Locale.ROOT));
        System.out.println(metin.substring(0,6));
        System.out.println(metin.trim());
        System.out.println(metin.replace(" ","-"));
        System.out.println(metin.concat(" Elhamdulillah."));


    }
}