package Games;

import java.util.Scanner;

public class RockPaperScissors {
    public static boolean[] RockPaperScissorsGame(boolean results[]) throws InterruptedException {
        boolean bucle = true; 
        do{
        //Boolean Results [chapter1, chapter2, chapter3, puck, death, endGame]
        Scanner read = new Scanner(System.in);
        int IA2 = 0, respuestaUser2 = 0, IApoints = 0, userpoints = 0;
        boolean correct; 

        // !TERMINAL CLEAR
        System.out.print("\033[H\033[2J");

        System.out.println("""
                           __                          ___
                          / /_  _____  ____ _____     |__ \\
                     __  / / / / / _ \\/ __ `/ __ \\    __/ /
                    / /_/ / /_/ /  __/ /_/ / /_/ /   / __/
                    \\____/\\__,_/\\___/\\__, /\\____/   /____/
                                    /____/""");

        System.out.println("""
            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
            PIEDRA, PAPEL O TIJERA:
            COMO JUGAR?
            ⥤ Gana el que llegue a 3 rondas ganadas
            ⥤ Las normas son:
                - Papel gana Piedra
                - Piedra gana Tijeras
                - Tijeras gana Papel
            ⥤ Para elegir que objeto quieres debes escribir el numero indicado:
                0. PIEDRA
                1. PAPEL
                2. TIJERA
            ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
            
            ⮕ INTRO para seguir""");
        read.nextLine();
        System.out.println();
        String[] objeto = {
                        """
                _______
            ---'   ____)
                  (_____)
                  (_____)
                  (____)
            ---.__(___)""",
                        """
                 _______
            ---'    ____)____
                       ______)
                      _______)
                     _______)
            ---.__________)""",
                        """
                _______
            ---'   ____)____
                      ______)
                   __________)
                  (____)
            ---.__(___)"""};

        // POR SI PIERDES LA PARTIDA ANTERIOR
        userpoints = 0;
        IApoints = 0;
        do {

            //TIRADA DE LA IA
            IA2 = (int)(Math.random()*3);

            //TIRADA DEL USER
            do {
                System.out.println("""
                Que quieres sacar?
                0. PIEDRA
                1. PAPEL
                2. TIJERA""");
                correct = read.hasNextInt();

                if (!correct) {
                    System.out.println("-- ERROR -- Esto no es un numero :(");
                    read.nextLine();
                }else{
                    respuestaUser2 = read.nextInt();
                    if (respuestaUser2 >= 3 || respuestaUser2 < 0) {
                        System.out.println("-- ERROR -- Este numero no esta en la lista :(");
                        correct = false;
                    }
                    read.nextLine();
                }
            }while (!correct);


            // !TERMINAL CLEAR
            System.out.print("\033[H\033[2J");

            System.out.println("""
                     $$$$$$\\ \s
                    $$ ___$$\\\s
                    \\_/   $$ |
                      $$$$$ /\s
                      \\___$$\\\s
                    $$\\   $$ |
                    \\$$$$$$  |
                     \\______/""");

            // ESPERA 1 SEC
            Thread.sleep(1000);

            // !TERMINAL CLEAR
            System.out.print("\033[H\033[2J");

            System.out.println("""
                     $$$$$$\\ \s
                    $$  __$$\\\s
                    \\__/  $$ |
                     $$$$$$  |
                    $$  ____/\s
                    $$ |     \s
                    $$$$$$$$\\\s
                    \\________|""");

            // ESPERA 1 SEC
            Thread.sleep(1000);

            // !TERMINAL CLEAR
            System.out.print("\033[H\033[2J");

            System.out.println("""
                      $$\\    \s
                    $$$$ |   \s
                    \\_$$ |   \s
                      $$ |   \s
                      $$ |   \s
                      $$ |   \s
                    $$$$$$\\  \s
                    \\______|""");

            // ESPERA 1 SEC
            Thread.sleep(1000);

            // !TERMINAL CLEAR
            System.out.print("\033[H\033[2J");

            //Enseñar codigo ASCII del vector
            System.out.println("ENEMIGO: ");
            switch (IA2) {
                case 0 -> System.out.println(objeto[0]);
                case 1 -> System.out.println(objeto[1]);
                case 2 -> System.out.println(objeto[2]);
            }
            System.out.println("""
                    
                    
                --- VS ---
                TU:
                """);
            switch (respuestaUser2) {
                case 0 -> System.out.println(objeto[0]);
                case 1 -> System.out.println(objeto[1]);
                case 2 -> System.out.println(objeto[2]);
            }

            // COMPROBAR RESULTADO
            if (IA2 == respuestaUser2){
                System.out.println("""            
                    ┃━━━━━━━━━━┃
                    ┃  EMPATE  ┃
                    ┃━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
            }else if (IA2 == 0 && respuestaUser2 == 1){
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  ¡¡HAS GANADO!!  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                userpoints = userpoints + 1;
            }else if (IA2 == 0 && respuestaUser2 == 2){
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  HAS PERDIDO :(  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                IApoints = IApoints + 1;
            }else if (IA2 == 1 && respuestaUser2 == 0){
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  HAS PERDIDO :(  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                IApoints = IApoints + 1;
            }else if (IA2 == 1 && respuestaUser2 == 2){
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  ¡¡HAS GANADO!!  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                userpoints = userpoints + 1;
            }else if (IA2 == 2 && respuestaUser2 == 0){
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  ¡¡HAS GANADO!!  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                userpoints = userpoints + 1;
            }else if (IA2 == 2 && respuestaUser2 == 1){
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  HAS PERDIDO :(  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃
            
                    ⮕ INTRO para seguir""");
                read.nextLine();
                IApoints = IApoints + 1;
            }

            System.out.println("\n" +
                "La puntuacion es de:\n" + "Tu: " + userpoints + "\n" + "Maquina: " + IApoints + "\n");

            }while (userpoints != 3 && IApoints != 3);

            // !TERMINAL CLEAR
            System.out.print("\033[H\033[2J");

            // GANADOR DEL MEJOR DE 3
            System.out.println("""            
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃  Y la victoria es paraaaa....  ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
        
                ⮕ INTRO para seguir""");
            read.nextLine();

            if (IApoints == 3){

                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                    ┃ ( ఠ ͟ʖ ఠ)  El ENEMIGO   ( ఠ ͟ʖ ఠ)  ┃
                    ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            
                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[4] = true;
                bucle = false;
            }else {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
                    ┃ (っ▀¯▀)つ HAS GANADOOOO (っ▀¯▀)つ ┃
                    ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            
                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[1] = false;
                results[2] = true;
                bucle = false;
            }
        }while(bucle);
        return results;
    }
}
