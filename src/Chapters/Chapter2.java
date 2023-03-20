package Chapters;

import java.util.Scanner;

public class Chapter2 {

    public static boolean[] chapter2(boolean results[]) throws InterruptedException{
        do{
        Scanner read = new Scanner(System.in);
        //Boolean Results [chapter1, chapter2, chapter3, puck, death, endGame]
        int userimput2 = 0;
        boolean correct; 

        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""
             ██████╗ █████╗ ██████╗ ██╗████████╗██╗   ██╗██╗      ██████╗     ██████╗
            ██╔════╝██╔══██╗██╔══██╗██║╚══██╔══╝██║   ██║██║     ██╔═══██╗    ╚════██╗
            ██║     ███████║██████╔╝██║   ██║   ██║   ██║██║     ██║   ██║     █████╔╝
            ██║     ██╔══██║██╔═══╝ ██║   ██║   ██║   ██║██║     ██║   ██║    ██╔═══╝
            ╚██████╗██║  ██║██║     ██║   ██║   ╚██████╔╝███████╗╚██████╔╝    ███████╗
             ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝   ╚═╝    ╚═════╝ ╚══════╝ ╚═════╝     ╚══════╝\n""");

        System.out.println("""            
            Ares: Por poco no acaba conmigo… Uno menos!!!
                    
            ⮕ INTRO para seguir""");
        read.nextLine();

        if (results[3]) {
            System.out.println("""            
            Puck: Esperate que te curo las heridas, los elfos tenemos ese poder :)
                    
            ⮕ INTRO para seguir""");
            read.nextLine();

            System.out.println("""            
            Ares: Ya no me duele nada! Gracias puck...
                    
            ⮕ INTRO para seguir""");
            read.nextLine();

            System.out.println("""            
            Puck: Denada :). Mira allí, el castillo!
                    
            ⮕ INTRO para seguir""");
            read.nextLine();
        }

        System.out.println("""            
            Ares: Es enorme!! Es como un castillo de cuento de hadas.
                    
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""
            El castillo del rey Morgott       |>>>
            ----------------                  |
                                |>>>      _  _|_  _         |>>>
                                |        |;| |;| |;|        |
                            _  _|_  _    \\\\.    .  /    _  _|_  _
                           |;|_|;|_|;|    \\\\:. ,  /    |;|_|;|_|;|
                           \\\\..      /    ||;   . |    \\\\.    .  /
                            \\\\.  ,  /     ||:  .  |     \\\\:  .  /
                             ||:   |_   _ ||_ . _ | _   _||:   |
                             ||:  .|||_|;|_|;|_|;|_|;|_|;||:.  |
                             ||:   ||.    .     .      . ||:  .|
                             ||: . || .     . .   .  ,   ||:   |       \\,/
                             ||:   ||:  ,  _______   .   ||: , |            /`\\
                             ||:   || .   /+++++++\\    . ||:   |
                             ||:   ||.    |+++++++| .    ||: . |
                          __ ||: . ||: ,  |+++++++|.  . _||_   |
                 ____--`~    '--~~__|.    |+++++__|----~    ~`---,              ___
            -~--~                   ~---__|,--~'                  ~~----_____-~'   `~----~~

            ⮕ INTRO para seguir""");
        read.nextLine();

        // "LIMPIAR PANTALLA"
        for (int j = 0; j < 69; j++) {
            System.out.println();
        }

        System.out.println("""            
            Ares: Hay una entrada principal pero también veo un sótano que lleva a la entrada sin que nos vean.
                    
            ⮕ INTRO para seguir""");
        read.nextLine();
        if (results[3]) {
            System.out.println("""            
            Puck: No parece muy buena idea ir por el sótano...
                    
            ⮕ INTRO para seguir""");
            read.nextLine();
        }


        do {
            System.out.println("""
                                        
                ┃━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ Por donde quieres ir? ┃
                ┃ 1. Puerta principal   ┃
                ┃ 2. Sótano             ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━┃
                """);
            correct = read.hasNextInt();

            if (!correct) {
                System.out.println("-- Esto no es un numero --");
                read.nextLine();
            } else {
                userimput2 = read.nextInt();
                if (userimput2 >= 3 || userimput2 <= 0) {
                    System.out.println("--- Esto no es un numero del menu ---");
                    correct = false;
                }
                read.nextLine();
            }
        } while (!correct);

        if (userimput2 == 2) {
            userimput2 = (int) (Math.random()*2);
            System.out.println("""            
                Ares: Esta muy oscuro....

                ⮕ INTRO para seguir""");
            read.nextLine();

            if (results[3]) {
                System.out.println("""            
            Puck: Espera que ilumino un poco el sitio
                    
            ⮕ INTRO para seguir""");
                read.nextLine();
            }

            System.out.println("*Sonidos de agua al pisar\n");
            Thread.sleep(2000);

            System.out.println("""            
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ TIENES 50% DE PROBABILIDAD      ┃
                ┃ DE QUE SE DERRUMBEN LAS PAREDES ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                        
                ⮕ INTRO para seguir""");
            read.nextLine();

            if (userimput2 == 0) {
                System.out.println("*Las pareces se derrumban\n");
                Thread.sleep(2000);
                results[4] = true;
                break;
            } else {
                System.out.println("*Sales del sótano a la entrada\n");
                Thread.sleep(2000);
            }
        } else {
            System.out.println("""            
                Ares: Es un paisaje increible con las montañas.

                ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""
                    _    .  ,   .           .
                *  / \\_ *  / \\_      _  *        *   /\\'__        *
                  /    \\  /    \\,   ((        .    _/  /  \\  *'.
             .   /       \\/ :' __ \\_  `          _^/  ^/    `--.
                /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *
               /   .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\
              / `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-
             /     `.  / /       `.~-^=-=~=^=.-'      '-._ `._""");
        }

        System.out.println("""            
                Ares: Y ese ruido?!?!

                ⮕ INTRO para seguir""");
        read.nextLine();

        if (results[3]) {
            System.out.println("""            
            Puck: VIGILA ARRIBA!!!
                    
            ⮕ INTRO para seguir""");
            read.nextLine();
        }

        System.out.println("*Caida fuerte del cielo\n");
        Thread.sleep(2000);

        System.out.println("""            
                Mogh el condenado: NADIE PASARA POR AQUI SIN DERROTARME ANTES!!!

                ⮕ INTRO para seguir""");
        read.nextLine();

        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }
        results = Games.RockPaperScissors.RockPaperScissorsGame(results);
        break;
    }while(true);
    return results;
    }
}
