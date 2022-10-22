public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int number=7;
        int remainder = number % 2;
        boolean isAsale=true;

        for(int i=2;i<number;i++) {
            if (number % i==0){
                isAsale=false;
            }

            if(isAsale){
                System.out.println("Sayı asal değildir.");
            }else{
                System.out.println("Sayı asaldır");
            }
        }
    }
}