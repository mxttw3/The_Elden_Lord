package Chapters;

import java.util.Scanner;

public class Chapter1 {

    public static boolean[] chapter1(boolean results[]) throws InterruptedException{

        //Boolean Results [chapter1, chapter2, chapter3, puck, death, endGame]
        boolean correct, bucle = true;        
        Scanner read = new Scanner(System.in);
        int userimput = 0;
        
        while(bucle){
        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""
             ██████╗ █████╗ ██████╗ ██╗████████╗██╗   ██╗██╗      ██████╗      ██╗
            ██╔════╝██╔══██╗██╔══██╗██║╚══██╔══╝██║   ██║██║     ██╔═══██╗    ███║
            ██║     ███████║██████╔╝██║   ██║   ██║   ██║██║     ██║   ██║    ╚██║
            ██║     ██╔══██║██╔═══╝ ██║   ██║   ██║   ██║██║     ██║   ██║     ██║
            ╚██████╗██║  ██║██║     ██║   ██║   ╚██████╔╝███████╗╚██████╔╝     ██║
             ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝   ╚═╝    ╚═════╝ ╚══════╝ ╚═════╝      ╚═╝\n""");

        System.out.println("""            
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            ┃ Había una vez un valiente caballero llamado Ares,     ┃
            ┃ quien vivía en un pequeño castillo en el campo. Ares  ┃
            ┃ era conocido por ser un justiciero y defensor de los  ┃
            ┃ más débiles, siempre estaba dispuesto a luchar por la ┃
            ┃ causa correcta.                                       ┃
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                                
            |\\
             \\\\           _!_
              \\\\         /___\\
               \\\\        [+++]\s
                \\\\    _ _\\^^^/_ _
                 \\\\/ (    '-'  ( )
                 /( \\/ | {&}   /\\ \\
                   \\  / \\     / _> )
                    "`   >:::;-'`""'-.

        ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            ┃ Un dia caminando se encontró a  ┃
            ┃ una persona con apariencia poco ┃
            ┃ humana tapandole el camino      ┃
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃

        ⮕ INTRO para seguir""");
        read.nextLine();

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""            
            Malentia: Bienvenido a las tierras intermedias. Pareces un gran caballero, como es su nombre?
              
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            Ares: ...
              
            ⮕ INTRO para seguir""");
        
        read.nextLine();

        System.out.println("""            
            Malentia: Veo que no hablas mucho, tengo una misión para usted. Un viejo amigo necesita ayuda toma esta carta y leela porfavor.
              
            ⮕ INTRO para seguir""");
        read.nextLine();

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        do {
            System.out.println("""
                                        
                ┃━━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ Quieres leer la carta? ┃
                ┃ 1. SI                  ┃
                ┃ 2. NO                  ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━━┃""");
            correct = read.hasNextInt();

            if (!correct) {
                System.out.println("-- Esto no es un numero --");
                read.nextLine();
            } else {
                userimput = read.nextInt();
                if (userimput >= 3 || userimput <= 0) {
                    System.out.println("--- Esto no es un numero del menu ---");
                    correct = false;
                }
                read.nextLine();
            }
        } while (!correct);

        if (userimput == 2) {
            System.out.println("""            
                Malentia: DESAGRADECIDO INSENSIBLE!! MEREZES LA MUERTE!!!!!

                ⮕ INTRO para seguir""");
            read.nextLine();

            results[4] = true;
            break;
        }

        System.out.println("""
                        
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            ┃ El rey Morgott pide vuestra ayuda, para   ┃
            ┃ derrotar a tres poderosos Monstruos que   ┃
            ┃ han tomado control de sus tierras y estan ┃
            ┃ oprimiendo a su pueblo.                   ┃
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                            
            ⮕ INTRO para seguir """);

        read.nextLine();

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        do {
            System.out.println("""
                ┃━━━━━━━━━━━━━━━━━━━━┃
                ┃ Aceptas la mision? ┃
                ┃ 1. SI              ┃
                ┃ 2. NO              ┃
                ┃━━━━━━━━━━━━━━━━━━━━┃""");

            correct = read.hasNextInt();

            if (!correct) {
                System.out.println("-- Esto no es un numero --");
                read.nextLine();
            } else {
                userimput = read.nextInt();
                if (userimput >= 3 || userimput <= 0) {
                    System.out.println("--- Esto no es un numero del menu ---");
                    correct = false;
                }
                read.nextLine();
            }
        } while (!correct);


        if (userimput == 2) {
            System.out.println("""            
                Malentia: DESAGRADECIDO INSENSIBLE!! MEREZES LA MUERTE!!!!!

                ⮕ INTRO para seguir""");

            read.nextLine();
            results[4] = true;
            break;
        }

        System.out.println("""            
            Malentia: Muchas gracias gran guerrero. El castillo esta mas alla de esa montaña al SUR.
            
            Malentia: El rey os compensara muy bien, vereís.
                
            ⮕ INTRO para seguir""");

        read.nextLine();

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""
        El bosque de los elfos:
        -----------------------              
                        .        +          .      .          .
                 .            _        .                    .
              ,              /;-._,-.____        ,-----.__
             ((        .    (_:#::_.:::. `-._   /:, /-._, `._,
              `                 \\   _|`"=:_::.`.);  \\ __/ /
                                  ,    `./  \\:. `.   )==-'  .
                .      ., ,-=-.  ,\\, +#./`   \\:.  / /           .
            .           \\/:/`-' , ,\\ '` ` `   ): , /_  -o
                   .    /:+- - + +- : :- + + -:'  /(o-) \\)     .
              .      ,=':  \\    ` `/` ' , , ,:' `'--".--"---._/`7
               `.   (    \\: \\,-._` ` + '\\, ,"   _,--._,---":.__/
                          \\:  `  X` _| _,\\/'   .-'
            .               ":._:`\\____  /:'  /      .           .
                                \\::.  :\\/:'  /              +
               .                 `.:.  /:'  }      .
                       .           ):_(:;   \\           .
                                  /:. _/ ,  |
                               . (|::.     ,`                  .
                 .                |::.    {\\
                                  |::.\\  \\ `.
                                  |:::(\\    |
                          O       |:::/{ }  |
                           )  ___/#\\::`/ (O "==._____
                      ~~~w/w~"~~,\\` `:/,-(~`"~~~~~~~~~~~
                  ~~~~~~~~~~~~~~~~~~~~~~~\\\\W~~~~~~~~~~~~~~~~
        ⮕ INTRO para seguir""");

        System.out.println();
        read.nextLine();

        System.out.println("*Entra al bosque\n");
        Thread.sleep(2000);

        System.out.println("""            
            Ares: Que es eso?!?!
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("*Sonidos de alas\n");
        Thread.sleep(2000);

        System.out.println("*Ares se pone en guardia\n");
        Thread.sleep(2000);

        System.out.println("""            
            Desconocido: Tranquilo , tranquilo no te pongas tan nervioso
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            Ares: quien eres?! Muestrate!
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            Desconocido: Volteate :)
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            *Se da la vuelta""");
        Thread.sleep(1000);

        System.out.println("""
                                   ,_  .--.
                             , ,   _)\\/    ;--.
                     . ' .    \\_\\-'   |  .'    \\
                    -= * =-   (.-,   /  /       |
                     ' .\\'    ).  ))/ .'   _/\\ /
                         \\_   \\_  /( /     \\ /(
                         /_\\ .--'   `-.    //  \\
                         ||\\/        , '._//    |
                         ||/ /`\\   ,;`-._/     /
                         \\_.'   )   /`\\       .'
                              .' .  |  ;.   /`
                             /      |\\(  `.(
                            |   |/  | `    `
                            |   |  /
                            |   |.'
                         __/'  /
                     _ .'  _.-`
                  _.` `.-;`/
                 /_.-'` / /
                       | /
                      ( /
                     /_/

                 ⮕ INTRO para seguir""");
        read.nextLine();

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""            
            Puck: Me llamo Puck, y soy un elfo.
            
            Puck: El destino nos ha juntado aquí, te ayudare durante tu mision si lo desea joven caballero.
                
            ⮕ INTRO para seguir""");
        read.nextLine();


        do {
            System.out.println("""  
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ Quieres llevar a Puck contigo? ┃
                ┃ 1. SI                          ┃
                ┃ 2. NO                          ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃""");
            correct = read.hasNextInt();

            if (!correct) {
                System.out.println("-- Esto no es un numero --");
                read.nextLine();
            } else {
                userimput = read.nextInt();
                if (userimput >= 3 || userimput <= 0) {
                    System.out.println("--- Esto no es un numero del menu ---");
                    correct = false;
                }
                read.nextLine();
            }
        } while (!correct);

        if (userimput == 1) {
            System.out.println("""            
                Puck: Perfecto, estoy seguro que no le defraudaré!
                
                ⮕ INTRO para seguir""");
            read.nextLine();
            results[3] = true;
        }else {
            System.out.println("""            
                Puck: No se preocupe, entiendo que prefiera ir solo, hasta la proxima!
                
                ⮕ INTRO para seguir""");
            read.nextLine();
        }

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        // Eleccion de camino
        System.out.println("*Avanza por el bosque\n");
        Thread.sleep(2000);

        System.out.println("""            
            Ares: Parece ser que hay tres caminos...
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        if (results[3]) {
            // MENSAJES DE AYUDA SI HAS ELEJIDO AL ACOMPAÑANTE
            System.out.println("""            
                Puck: Vigila con el camino del medio, no me da buena espina...
                
                ⮕ INTRO para seguir""");
            read.nextLine();
        }

        do {
            System.out.println("""
                ┃━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ Por donde debería ir? ┃
                ┃ 1. Izquierda          ┃
                ┃ 2. Recto              ┃
                ┃ 3. Derecha            ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━┃""");
            correct = read.hasNextInt();

            if (!correct) {
                System.out.println("-- Esto no es un numero --");
                read.nextLine();
            } else {
                userimput = read.nextInt();
                if (userimput >= 4 || userimput <= 0) {
                    System.out.println("--- Esto no es un numero del menu ---");
                    correct = false;
                }
                read.nextLine();
            }
        } while (!correct);

        if (userimput == 2) {
            System.out.println("*Entra en un tunel\n");
            Thread.sleep(2000);

            System.out.println("*Sonidos de derrumbe\n");
            Thread.sleep(2000);

            System.out.println("""            
                Ares: QUE ES ESE SONIDO?!
                
                ⮕ INTRO para seguir""");
            read.nextLine();

            System.out.println("*La cueva se derrumba totalmente\n");
            Thread.sleep(2000);

            results[4] = true;
            break;
        } else if (userimput == 1) {
            userimput = (int)(Math.random()*2);

            System.out.println("""            
                Ares: Mira es un puente muy largo y parece un poco inestable...
                
                ⮕ INTRO para seguir""");
            read.nextLine();

            System.out.println("*Sonidos de crugidos al pisar\n");
            Thread.sleep(2000);

            System.out.println("""            
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ TIENES 50% DE PROBABILIDAD   ┃
                ┃ DE QUE EL PUENTE NO SE ROMPA ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃

                ⮕ INTRO para seguir""");
            read.nextLine();

            if (userimput == 0) {
                System.out.println("*El puente se rompe\n");
                Thread.sleep(2000);
                results[4] = true;
                break;
            } else {
                System.out.println("*Sales perfectamente del puente\n");
                Thread.sleep(2000);
            }
        }

        System.out.println("*Avanzas por el camino\n");
        Thread.sleep(2000);

        System.out.println("*Rugidos de animal\n");
        Thread.sleep(2000);

        System.out.println("""            
            Ares: Ese sonido...
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            Ares: Pero si es.... EL GRAN RADAHN!!!!
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""            
            Radahn: Si quieres pasar deberás vencerme!
                
            ⮕ INTRO para seguir""");
        read.nextLine();

        //! "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        Games.TicTacToe.TicTacToe(results);
        bucle = false;
    }
    return results;
    }
}
