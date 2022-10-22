public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        int sayi1 = 220;
        int sayi2 = 284;
        int total1 = 0;
        int total2 = 0;
        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                total1 = total1 + i;

            }


        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                total2 = total2 + i;{

                }
                }if (sayi2 == total1 && sayi1 == total2)
                System.out.println("arkadaş dayıdır");
            else{
                System.out.println("arkadaş dayı değildir");

                }
            }int[] sayilar = {1,2,3,4,213,23,34534,2523,3461,46,246546,7521,4,234};
        int total=0;
        for(int sayi:sayilar) {
            total=total+sayi;
            System.out.println(sayi);
            System.out.println("total:"+total);
        }
        }

    }
