public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for (int i = 1; i < 10; i += 1)
            System.out.print(i);
        System.out.println("adamolun");
        String[] parabirimleri = new String[6];
        parabirimleri[0] = "dolaaaaaaaar";
        parabirimleri[1] = "tl";
        parabirimleri[2] = "eoro";
        parabirimleri[3] = "leva";
        parabirimleri[4] = "yen";
        parabirimleri[5] = "rubel";
        {
            for (String paralar : parabirimleri) {
                System.out.println(paralar);
            }
            System.out.println("lessonforteen");
            String[] parabirimler = {"dolaaaaaaaar", "tl", "eoro", "leva", "yen", "rubel"};

            {
                for (String paralar : parabirimleri) {
                    System.out.println(paralar);
                }
            }
        }
    }
    }