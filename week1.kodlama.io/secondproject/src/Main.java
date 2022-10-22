public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        char ses ='2';
        switch (ses){
            case 'a','e','ı','i','o','ö','u','ü':
                System.out.println("sesli harftir");
                break;
            default:
                System.out.println("Sessiz harftir");
        }


    }
}