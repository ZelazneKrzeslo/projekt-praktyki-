import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static String menu() {
        System.out.println("Witaj, co chcialbys zrobic\n 1. dodac produkt\n 2.usunac produkt\n3. zmienic cene produktu(administracja)\n 4. Zakoncz program");
        String wypelniacz = " ";
        return wypelniacz;
    }

    public static Object dodawanie(ArrayList<towar> list){
        Scanner scanner2 = new Scanner(System.in);

        String wypelniacz = "";

        String nazwa_produktu = null;
        System.out.println("Wybierz produkt:\n 1.chleb - 3.00\n 2.chleb zytni - 4.00\n 3.makaron spaghetti - 5.00(promocja 10%)\n 4.makaron swiderki - 5.00\n 5.jajka - 6.00(promocja 20%)\n 6.mleko - 3.00\n 7.maslo - 4.00\n 8.cukier - 11.00(promocja 30%)\n 9.kawa - 33.00(promocja 20%)\n 10. herbata - 16.00\n");
        String produkt = scanner2.nextLine();
        System.out.println("Podaj ilosc:");
        int cena = scanner2.nextInt();
        list.add(new towar(nazwa_produktu,cena));

        return wypelniacz;
    }
    public static Object usuwanie(ArrayList<towar>list){
        Scanner scanner3 = new Scanner(System.in);

        String wypelniacz = " ";
        System.out.println("Co chcialbys usunac?");
        int usuniecie = scanner3.nextInt();
        list.remove(usuniecie - 1);

        return wypelniacz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<towar> list = new ArrayList<>();

        int wybor = 0;

        while(true){
            System.out.println(menu());

            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println(dodawanie(list));
                    break;
                case 2:
                    System.out.println(usuwanie(list));
                    break;
                case 3:
                    System.out.println(" „Snake Venom”, czyli „Jad Węża”, to najmocniejsze piwo świata. Stężenie alkoholu w nim to… aż 67,5 procent! Producentem piwa jest szkocki browar Brewmeister. ");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("hehe");
            }
        }
    }
}