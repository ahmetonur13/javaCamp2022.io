import java.io.OutputStream;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String message = "Allah yardımcımız olsun";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.charAt(9));
        System.out.println(message.concat(" İnşallah KARDEŞİM"));
        System.out.println(true);
        System.out.println(message.endsWith("m"));
        System.out.println(message.indexOf("a"));
        //index of h ın mesajda kaçıncı sırada olduğunu gösterir.
        System.out.println(message.lastIndexOf("a"));
        //last index of da aramaya sağdan sola başlar.Sağdaki ilk a nın sırasını sola göre sayarak bulur.
        char[] karakter = new char[5];
        message.getChars(0, 5, karakter, 0);
        System.out.println(karakter);


        String newmessage = message.replace(" ", "-");
        System.out.println(newmessage);
        System.out.println(message.substring(0, 17));

        for (String oldmessage : message.split("h")){
            System.out.println(oldmessage);
            System.out.println(message.toLowerCase());
            System.out.println(message.toUpperCase(Locale.ROOT));
            String mewmessage = "             ENGİN DEMİROĞ           ";
            System.out.println(mewmessage.trim());
        }



    }


    {

    }
}