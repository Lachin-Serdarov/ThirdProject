import java.util.Scanner;

public class ThirdProject {
    public static void main(String[] args){

        // Dərs 1 - Leap Year

        Scanner scr = new Scanner(System.in);
        System.out.println("Ili daxil edin: ");

        int year = scr.nextInt();

        boolean longYear = (year % 4 == 0 && year % 100 != 0) || (year %400 == 0);

        if (longYear) {
            System.out.println(year + " uzun ildir (366 gün).");
        } else {
            System.out.println(year + " adi ildir (365 gün).");
        }


        // Dərs 2 - Gün sayı

        Scanner scr1 = new Scanner(System.in);

        System.out.println("İli daxil edin: ");
        int year1 = scr1.nextInt();

        System.out.println("Ayın nğmrəsini daxil edin (1-12): ");
        int month = scr1.nextInt();

        int days;

        switch (month) {
            case 1: case 3:case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;

            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
        if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 %400 == 0)) {
            days = 29;
        } else {
            days = 28;
        }
        break;

            default:
                System.out.println("Xəta: Keçərli bir ay nömrəsi daxil edin (1-12)!");
                return;

        }
        System.out.println(year1 + "-ci ilin " + month + "-ci ayında " + days + " gün var.");

    // Dərs 3 - Sait və Samit

        Scanner scr2 = new Scanner(System.in);

        System.out.println("Bir hərf daxil edin: ");
        char letter = scr2.next().toLowerCase().charAt(0);

        if (Character.isLetter(letter)) {
            switch (letter) {
                case 'a': case'ı': case 'o': case 'u':
                case 'e': case'ə': case 'i': case 'ö': case'ü':
                    System.out.println(letter + " saitdir.");
                    break;
                default:
                    System.out.println(letter + " samitdir");
                    break;
            }
        } else {
            System.out.println("Xəta: Daxil edilən simvol hərf deyil!");
        }

        // Dərs 4 - Ayın adını tapmaq

        Scanner scr3 = new Scanner(System.in);

        System.out.println("Ayın nömrəsini daxil edin (1-12):");

        int month1 = scr3.nextInt();

        String nom = switch (month1) {
            case 1 -> "Yanvar";
            case 2 -> "Fevral";
            case 3 -> "Mart";
            case 4 -> "Aprel";
            case 5 -> "May";
            case 6 -> "İyun";
            case 7 -> "İyul";
            case 8 -> "Avqust";
            case 9 -> "Sentyabr";
            case 10 -> "Oktyabr";
            case 11 -> "Noyabr";
            case 12 -> "Dekabr";
            default -> "Yanlış ay nömrəsi daxil edilib! (1-12 arasında olmalıdır)";
        };
        System.out.println("Nəticə: " + nom);
    }
}
