import java.util.Scanner;

public class Game {    
    public static void main(String[] args) throws InterruptedException {
        Scanner read = new Scanner(System.in);
        // VARIABLES DEL MENU
        boolean correct, out = false;
        int menu = 0, submenu = 0;

        //Boolean Results [chapter1, chapter2, chapter3, puck, death, endGame]
        boolean results[] = {false, false, false, false, false, false};

        do {
        // MENU PRINCIPAL
        System.out.println(
                """ 
                        ▓█████  ██▓    ▓█████▄ ▓█████  ███▄    █     ██▓     ▒█████   ██▀███  ▓█████▄
                        ▓█   ▀ ▓██▒    ▒██▀ ██▌▓█   ▀  ██ ▀█   █    ▓██▒    ▒██▒  ██▒▓██ ▒ ██▒▒██▀ ██▌
                        ▒███   ▒██░    ░██   █▌▒███   ▓██  ▀█ ██▒   ▒██░    ▒██░  ██▒▓██ ░▄█ ▒░██   █▌
                        ▒▓█  ▄ ▒██░    ░▓█▄   ▌▒▓█  ▄ ▓██▒  ▐▌██▒   ▒██░    ▒██   ██░▒██▀▀█▄  ░▓█▄   ▌
                        ░▒████▒░██████▒░▒████▓ ░▒████▒▒██░   ▓██░   ░██████▒░ ████▓▒░░██▓ ▒██▒░▒████▓
                        ░░ ▒░ ░░ ▒░▓  ░ ▒▒▓  ▒ ░░ ▒░ ░░ ▒░   ▒ ▒    ░ ▒░▓  ░░ ▒░▒░▒░ ░ ▒▓ ░▒▓░ ▒▒▓  ▒
                         ░ ░  ░░ ░ ▒  ░ ░ ▒  ▒  ░ ░  ░░ ░░   ░ ▒░   ░ ░ ▒  ░  ░ ▒ ▒░   ░▒ ░ ▒░ ░ ▒  ▒
                           ░     ░ ░    ░ ░  ░    ░      ░   ░ ░      ░ ░   ░ ░ ░ ▒    ░░   ░  ░ ░  ░
                           ░  ░    ░  ░   ░       ░  ░         ░        ░  ░    ░ ░     ░        ░""");
            do {
                System.out.println("""
                                                
                        ┃━━━━━━━━━━━━━━━━━━━━━┃
                        ┃ 1. COMEZAR JUEGO    ┃
                        ┃ 2. Ir a un capitulo ┃
                        ┃ 3. EXIT             ┃
                        ┃━━━━━━━━━━━━━━━━━━━━━┃
                        """);
                correct = read.hasNextInt();

                if (!correct) {
                    System.out.println("-- Esto no es un numero --");
                    read.nextLine();
                } else {
                    menu = read.nextInt();
                    if (menu >= 4 || menu <= 0) {
                        System.out.println("--- Esto no es un numero del menu ---");
                        correct = false;
                    }
                    read.nextLine();
                }
            } while (!correct);
            switch (menu) {
                case 1 -> results[0] = true;
                case 2 -> {
                    do {
                        System.out.println("""
                                ┃━━━━━━━━━━━━━━━━━┃
                                ┃ 1. Capítulo 1   ┃
                                ┃ 2. Capítulo 2   ┃
                                ┃ 3. Capítulo 3   ┃
                                ┃ 4. Ir atrás     ┃
                                ┃━━━━━━━━━━━━━━━━━┃""");
                        correct = read.hasNextInt();

                        if (!correct) {
                            System.out.println("-- Wrong Carathere --");
                            read.nextLine();
                        } else {
                            submenu = read.nextInt();
                            read.nextLine();
                        }
                    } while (!correct);
                    switch (submenu) {
                        case 1 -> results[0] = true;
                        case 2 -> results[1] = true;
                        case 3 -> results[2] = true;
                    }
                }
                case 3 -> {
                    out = true;
                    System.out.println("-- GOOD BYE --");
                }
            }

            do {
                if (results[4] == true) {
                    results = death(results);
                }else if (results[0]) {
                    results = Chapters.Chapter1.chapter1(results);
                } else if (results[1]) {
                    results = Chapters.Chapter2.chapter2(results);
                } else if (results[2]) {
                    results = Chapters.Chapter3.chapter3(results);
                }
            } while (!results[5]);

            if (results[5]) {
                // !TERMINAL CLEAR
                System.out.print("\033[H\033[2J");
        
                System.out.println("""
                      (,);    /\\                    
                     ((  ^_   ||            ...     
                      ' /  \\  ||           (()))    
                        L {=) ||           {' ())   
                         ) -  ||            )_ (()  
                       (_   \\====       @  (   (_)  
                       | (___/{ }        \\7 \\ _) | 
                        \\____\\/)          {)=== /\\
                        |    |             \\ |    | 
                        |_/\\_|               |    | 
                         |  |                |    | 
                          ) )\\               |    |
                        _/| |/               |    |
                       ( ,\\ |_               '~~~~'    
                        \\_(___)               _/Y\
                        
                    ⮕ INTRO para seguir
                    """);
                read.nextLine();
    
                System.out.println("""
                        (,);        ...
                       ((  ^_.     (()))
                        ' / /_\\    {' ())
                          L( '}     )_ (()
                           ) (_    (   (_)
                         (_  / }{)===='_/
                         | `/\\/\\     |   \\
                         L___/ |     |    |
                          |  . \\     |    |
                          |_/ \\_\\    |    |
                          ( ____ )   |    |
                           | | | |   |    |
                       ( --' | \\ |_  '~~~~'
                       /_/---) (___)  _/Y
                    
                    ⮕ INTRO para seguir
                    """);
                read.nextLine();
    
                System.out.println("""
                             (\\/)
                              \\/
                            
                        (,);
                       ((  ^_.  ...
                        ' / /_\\(()))
                          L( '}{' ())
                          ) (   )_ (()
                        (_   \\ (   (_)
                        | (__'__\\_) |
                         \\___|_(}==/ \\
                         |    |  |    |
                         |_/\\_|  |    |
                          |  |   |    |
                           ) )\\  |    |
                         _/| |/  |    \\
                        ( ,\\ |_  '~~~~/7
                         \\_(___)  _/Y
                                             
                    ⮕ INTRO para seguir
                    """);
                read.nextLine();
    
                System.out.println("""
    
                    ████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗
                    ╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗
                       ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║
                       ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║
                       ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝
                       ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝
                                            
                    GRACIAS POR JUGAR!!!
                    CREATOR: @mxttw
                                      
                    ⮕ INTRO para acabar :)""");
                read.nextLine();
            }
        }while (!out);
    }

    public static boolean[] death(boolean results[]){
        Scanner read = new Scanner(System.in);
            // SOUT DE HAS MUERTO
        System.out.println("""
             ██░ ██  ▄▄▄        ██████     ███▄ ▄███▓ █    ██ ▓█████  ██▀███  ▄▄▄█████▓ ▒█████
            ▓██░ ██▒▒████▄    ▒██    ▒    ▓██▒▀█▀ ██▒ ██  ▓██▒▓█   ▀ ▓██ ▒ ██▒▓  ██▒ ▓▒▒██▒  ██▒
            ▒██▀▀██░▒██  ▀█▄  ░ ▓██▄      ▓██    ▓██░▓██  ▒██░▒███   ▓██ ░▄█ ▒▒ ▓██░ ▒░▒██░  ██▒
            ░▓█ ░██ ░██▄▄▄▄██   ▒   ██▒   ▒██    ▒██ ▓▓█  ░██░▒▓█  ▄ ▒██▀▀█▄  ░ ▓██▓ ░ ▒██   ██░
            ░▓█▒░██▓ ▓█   ▓██▒▒██████▒▒   ▒██▒   ░██▒▒▒█████▓ ░▒████▒░██▓ ▒██▒  ▒██▒ ░ ░ ████▓▒░
             ▒ ░░▒░▒ ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░   ░ ▒░   ░  ░░▒▓▒ ▒ ▒ ░░ ▒░ ░░ ▒▓ ░▒▓░  ▒ ░░   ░ ▒░▒░▒░
             ▒ ░▒░ ░  ▒   ▒▒ ░░ ░▒  ░ ░   ░  ░      ░░░▒░ ░ ░  ░ ░  ░  ░▒ ░ ▒░    ░      ░ ▒ ▒░
             ░  ░░ ░  ░   ▒   ░  ░  ░     ░      ░    ░░░ ░ ░    ░     ░░   ░   ░      ░ ░ ░ ▒
             ░  ░  ░      ░  ░      ░            ░      ░        ░  ░   ░                  ░ ░
            
            ⮕ INTRO para seguir""");
        read.nextLine();
        results[4] = false;
        // !TERMINAL CLEAR
        System.out.print("\033[H\033[2J");
        return results;
    }
}
