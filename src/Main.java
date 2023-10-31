import  java.util.Scanner;
import java.lang.InterruptedException;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        menu();

    }

    public static void  menu() throws InterruptedException{

        Scanner mode = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("| Witaj w QuizNOW |");
        System.out.println("-------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("| Zapraszamy Cię do rozwiązania quizu o języku JAVA |");
        System.out.println("-----------------------------------------------------");

        Thread.sleep(1000);

        System.out.println("------------------------------------");
        System.out.println("| Zasady:                          |");
        System.out.println("| 1. Zamiast spacji używaj podłogi |");
        System.out.println("------------------------------------");

        Thread.sleep(1000);

        System.out.println("--------------------------------------------------------");
        System.out.println("| Masz do wyboru 3 poziomy trudności                   |");
        System.out.println("| 1. Łatwy                                             |");
        System.out.println("| 2. Średni                                            |");
        System.out.println("| 3. Trudny                                            |");
        System.out.println("| Wybierz poziom trudności gry poprzez wpisanie numeru |");
        System.out.println("--------------------------------------------------------");

        int qmode = mode.nextInt();

        switch (qmode) {
            case 1:
                System.out.println("-------------------------");
                System.out.println("| Wybrałeś poziom łatwy |");
                System.out.println("-------------------------");

                Thread.sleep(500);

                easy();
                break;

            case 2:

                System.out.println("--------------------------");
                System.out.println("| Wybrałeś poziom średni |");
                System.out.println("--------------------------");
                medium();
                break;

            case 3:
                System.out.println("--------------------------");
                System.out.println("| Wybrałeś poziom trudny |");
                System.out.println("--------------------------");
                hard();
                break;

            default:
                System.out.println("-------------------------------");
                System.out.println("| Wybrałeś nieprawidłowy tryb |");
                System.out.println("-------------------------------");
        }

    }

    public static void easy() throws InterruptedException {

        Scanner easy = new Scanner(System.in);

        String[] questions = {"Uzupełnij lukę. ....out.println();", "Jaki jest skrót nazwy typu danych liczb całkowitych", "Czy w instrukcji warunkowej if można użyć 'break'"};
        String[] answers = {"System", "int", "nie"};

        Thread.sleep(500);

        System.out.println("-----------------------------");
        System.out.println("| Poziom łatwy ma 3 pytania |");
        System.out.println("-----------------------------");

        Thread.sleep(500);

        System.out.println("---------------------------");
        System.out.println("|  Oto pierwsze pytanie:  |");
        System.out.println("|  Trzy kropki oznaczają  |");
        System.out.println("|         spację          |");
        System.out.println("---------------------------");

        System.out.println(questions[0]);
        String e0result = easy.next();

        if (e0result.equals(answers[0])) {

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();
        }

        System.out.println("--------------------------");
        System.out.println("| Czas na drugie pytanie |");
        System.out.println("--------------------------");

        Thread.sleep(500);

        System.out.println(questions[1]);
        String e1result = easy.next();

        if (e1result.equals(answers[1])) {

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);
            menu();
        }

        System.out.println("---------------------");
        System.out.println("| Trzecie pytanie:  |");
        System.out.println("---------------------");

        Thread.sleep(500);

        System.out.println(questions[2]);
        String e2result = easy.next();

        if (e2result.equals(answers[2])) {

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(300);

            System.out.println("--------------------------------------------------------");
            System.out.println("| ✪ Gratulacje! Udało Ci się ukończyć poziom łatwy! ✪ |");
            System.out.println("--------------------------------------------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();
        }

        System.out.println("---------------------------------------------");
        System.out.println("| Czy chcesz przejść do pozostałych quizów? |");
        System.out.println("---------------------------------------------");
        String choice0 = easy.next();

        switch (choice0){
            case "tak":
                menu();
                break;

            case "nie":
                System.exit(0);
        }

    }

    public static void medium() throws InterruptedException{

        Scanner med = new Scanner(System.in);

        String[] questions1 = {"Jak utworzyć podstawową metodę 'main'", "Jaka jest alternatywa dla float?", "Przy utworzeniu obiektu klasy o nazwie MyClass jaki typ przyjmuje zmienna", "Który operator jest używany do porównywania dwóch obiektów pod względem ich treści w Javie?", "Jakie słowo kluczowe używamy do zdefiniowania stałej, której wartość nie może być zmieniana w trakcie działania programu?"};
        String[] answers1 = {"public_static_void_main(){}", "double", "MyClass", ".equals()", "final"};


        Thread.sleep(500);

        System.out.println("----------------------------");
        System.out.println("| Poziom średni ma 5 pytań |");
        System.out.println("----------------------------");

        Thread.sleep(500);

        System.out.println("------------------------");
        System.out.println("| Oto pierwsze pytanie |");
        System.out.println("------------------------");

        Thread.sleep(500);

        System.out.println(questions1[0]);
        String m0result = med.next();

        if (m0result.equals(answers1[0])) {

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("---------------------------");
        System.out.println("| Czas na drugie pytanie! |");
        System.out.println("---------------------------");

        System.out.println(questions1[1]);
        String m1result = med.next();

        if (m1result.equals(answers1[1])) {

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("-------------------");
        System.out.println("| Trzecie pytanie |");
        System.out.println("-------------------");

        Thread.sleep(500);

        System.out.println(questions1[2]);
        String m2result = med.next();

        if (m2result.equals(answers1[2])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("-----------------------");
        System.out.println("| Oto czwarte pytanie |");
        System.out.println("-----------------------");

        Thread.sleep(500);

        System.out.println(questions1[3]);
        String m3result = med.next();

        if (m3result.equals(answers1[3])) {

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);

        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("--------------------------");
        System.out.println("| Ostatnie piąte pytanie |");
        System.out.println("--------------------------");

        Thread.sleep(500);

        System.out.println(questions1[4]);
        String m4result = med.next();

        if (m4result.equals(answers1[4])) {

            System.out.println("--------------------------------------------");
            System.out.println("| ✪ Gratulacje ukończyłeś średni poziom ✪ |");
            System.out.println("--------------------------------------------");

            Thread.sleep(500);

            System.out.println("---------------------------------------------");
            System.out.println("| Czy chcesz przejść do pozostałych quizów? |");
            System.out.println("---------------------------------------------");
            String choice1 = med.next();

            switch (choice1){
                case "tak":
                    menu();
                    break;
                case "nie":
                    System.exit(0);
                    break;
            }
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

    }

    public static void hard() throws InterruptedException{

        String[] questions2 = {"Jaki modyfikator dostępu jest bardziej restrykcyjny: protected czy default?", "Która z tych klas jest abstrakcyjna: AbstractClass czy AbstractMethod?", "Która klasa jest wykorzystywana do obsługi wyjątków w Javie?", "Jaki modyfikator dostępu pozwala na dostęp do składowych klasy tylko w obrębie tej samej klasy?", "Który operator w Javie jest używany do porównywania referencji obiektów?", "Która klasa umożliwia obsługę operacji wejścia/wyjścia (I/O) w Javie?", "Który typ danych reprezentuje wartość null w Javie?", "Czy w Javie istnieje możliwość wielokrotnego dziedziczenia klas?", "Czy interfejs w Javie może zawierać implementacje domyślne metod?", "Czy w Javie istnieje możliwość ręcznego zarządzania pamięcią, tak jak w języku C++?"};
        String[] answers2 = {"protected", "AbstractClass", "Exception", "private", "==", "java.io.File", "null", "nie", "tak", "nie"};

        Scanner hard = new Scanner(System.in);

        Thread.sleep(500);

        System.out.println("-----------------------------");
        System.out.println("| Poziom trudny ma 10 pytań |");
        System.out.println("-----------------------------");

        Thread.sleep(500);

        System.out.println("------------------------");
        System.out.println("| Oto pierwsze pytanie |");
        System.out.println("------------------------");

        Thread.sleep(500);

        System.out.println(questions2[0]);
        String h0result = hard.next();

        if (h0result.equals(answers2[0])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);
            menu();

        }

        System.out.println("------------------");
        System.out.println("| Drugie pytanie |");
        System.out.println("------------------");

        Thread.sleep(500);

        System.out.println(questions2[1]);
        String h1result = hard.next();

        if (h1result.equals(answers2[1])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("-------------------");
        System.out.println("| Trzecie pytanie |");
        System.out.println("-------------------");

        Thread.sleep(500);

        System.out.println(questions2[2]);
        String h2result = hard.next();

        if (h2result.equals(answers2[2])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("-------------------");
        System.out.println("| Czwarte pytanie |");
        System.out.println("-------------------");

        Thread.sleep(500);

        System.out.println(questions2[3]);
        String h3result = hard.next();

        if (h3result.equals(answers2[3])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("-----------------");
        System.out.println("| Piąte pytanie |");
        System.out.println("-----------------");

        Thread.sleep(500);

        System.out.println(questions2[4]);
        String h4result = hard.next();

        if (h4result.equals(answers2[4])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("-----------------");
        System.out.println("| Szóste pytanie |");
        System.out.println("-----------------");

        Thread.sleep(500);

        System.out.println(questions2[5]);
        String h5result = hard.next();

        if (h5result.equals(answers2[5])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("------------------");
        System.out.println("| Siódme pytanie |");
        System.out.println("------------------");

        Thread.sleep(500);

        System.out.println(questions2[6]);
        String h6result = hard.next();

        if (h6result.equals(answers2[6])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("----------------");
        System.out.println("| Ósme pytanie |");
        System.out.println("----------------");

        Thread.sleep(500);

        System.out.println(questions2[7]);
        String h7result = hard.next();

        if (h7result.equals(answers2[7])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("---------------------");
        System.out.println("| Dziewiąte pytanie |");
        System.out.println("---------------------");

        Thread.sleep(500);

        System.out.println(questions2[8]);
        String h8result = hard.next();

        if (h8result.equals(answers2[8])){

            System.out.println("----------------------");
            System.out.println("| Poprawna odpowiedź |");
            System.out.println("----------------------");

            Thread.sleep(500);
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }

        System.out.println("---------------------");
        System.out.println("| Dziesiąte pytanie |");
        System.out.println("---------------------");

        Thread.sleep(500);

        System.out.println(questions2[9]);
        String h9result = hard.next();

        if (h9result.equals(answers2[9])){

            System.out.println("--------------------------------------------");
            System.out.println("| ✪ Gratulacje ukończyłeś średni poziom ✪ |");
            System.out.println("--------------------------------------------");

            Thread.sleep(500);
            Thread.sleep(500);

            System.out.println("---------------------------------------------");
            System.out.println("| Czy chcesz przejść do pozostałych quizów? |");
            System.out.println("---------------------------------------------");

            String choice1 = hard.next();

            switch (choice1){
                case "tak":
                    menu();
                    break;
                case "nie":
                    System.exit(0);
                    break;
            }
        } else {

            System.out.println("-------------------------");
            System.out.println("| Niepoprawna odpowiedź |");
            System.out.println("-------------------------");

            Thread.sleep(500);

            menu();

        }
    }
}