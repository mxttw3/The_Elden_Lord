package Games;

import java.util.Scanner;

public class BlackJack {
    public static boolean[] BlackJackGame(boolean results[]) {
        boolean bucle = true, correct;
        Scanner read = new Scanner(System.in);
        do{
            //VARIABLES CAPITULO 3
            int userpoints2 = 0, IApoints2 = 0, rounds = 1, cartasRandom = 0, roundIApoints = 0, respuestaUser3 = 0, userRoundPoints = 0;
            boolean reinicioRonda, playerfinish = false, gameover = false;
            int[] cardPoints = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1,2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1,2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1,2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 1};

            // "LIMPIAR PANTALLA"
            for (int j = 0; j < 69; j++) {
                System.out.println();
            }

            System.out.println("""           
                       __                          _____
                      / /_  _____  ____ _____     |__  /
                 __  / / / / / _ \\/ __ `/ __ \\     /_ <
                / /_/ / /_/ /  __/ /_/ / /_/ /   ___/ /
                \\____/\\__,_/\\___/\\__, /\\____/   /____/
                                /____/
            
                ⮕ INTRO para seguir""");

            System.out.print("""
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                Blackjack v.2
                COMO JUGAR?
                ⥤ Gana el que llegue a 5 rondas ganadas
                
                ⥤ Las normas principales son:
                    - Se repartiran dos cartas a ti y al crupier, el tendra una carta visible.
                    - El crupier cuando llegue a 13 o mas se plantará, si se pasa de 21 la ronda se reiniciará.
                    - Viendo tus cartas podras elegir si quieres que te repartan mas o te plantas (vijila no te pases de 21!).
                    - Gana la ronda el jugador que mas se acerque a 21.
                    - Si te pasas de 21 perderas automaticamente.
                    - Si con las dos primeras cartas llegas justo a 21, es como si ganaras 2 rondas haciendo BLACKJACK!
                    
                ⥤ El valor de las cartas es:
                    - Los numeros valen el mismo valor del numero.
                    - Las letras menos la A ( el as ) tienen el valor de 10.
                    - El As ( la letra A ) tiene el valor de 1.
                ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                ⮕ INTRO para seguir""");
            read.nextLine();

            userRoundPoints = 0;
            roundIApoints = 0;

            String[] cartas = {"""
                .-----.\s
                |2    |\s
                |  ♥  |\s
                |    2|\s
                `-----'""",
                """                       
                .-----.\s
                |3    |\s
                |  ♥  |\s
                |    3|\s
                `-----'""",
                """
                .-----.\s
                |4    |\s
                |  ♥  |\s
                |    4|\s
                `-----'""",
                """
                .-----.\s
                |5    |\s
                |  ♥  |\s
                |    5|\s
                `-----'""",
                """
                .-----.\s
                |6    |\s
                |  ♥  |\s
                |    6|\s
                `-----'""",
                """
                .-----.\s
                |7    |\s
                |  ♥  |\s
                |    7|\s
                `-----'""",
                """
                .-----.\s
                |8    |\s
                |  ♥  |\s
                |    8|\s
                `-----'""",
                """
                .-----.\s
                |9    |\s
                |  ♥  |\s
                |    9|\s
                `-----'""",
                """
                .-----.\s
                |10   |\s
                |  ♥  |\s
                |   10|\s
                `-----'""",
                """
                .-----.\s
                |J    |\s
                |  ♥  |\s
                |    J|\s
                `-----'""",
                """
                .-----.\s
                |Q    |\s
                |  ♥  |\s
                |    Q|\s
                `-----'""",
                """
                .-----.\s
                |K    |\s
                |  ♥  |\s
                |    K|\s
                `-----'""",
                """
                .-----.\s
                |A    |\s
                |  ♥  |\s
                |    A|\s
                `-----'""",
                """
                .-----.\s
                |2    |\s
                |  ♦  |\s
                |    2|\s
                `-----'""",
                """
                .-----.\s
                |3    |\s
                |  ♦  |\s
                |    3|\s
                `-----'""",
                """
                .-----.\s
                |4    |\s
                |  ♦  |\s
                |    4|\s
                `-----'""",
                """
                .-----.\s
                |5    |\s
                |  ♦  |\s
                |    5|\s
                `-----'""",
                """
                .-----.\s
                |6    |\s
                |  ♦  |\s
                |    6|\s
                `-----'""",
                """
                .-----.\s
                |7    |\s
                |  ♦  |\s
                |    7|\s
                `-----'""",
                """
                .-----.\s
                |8    |\s
                |  ♦  |\s
                |    8|\s
                `-----'""",
                """
                .-----.\s
                |9    |\s
                |  ♦  |\s
                |    9|\s
                `-----'""",
                """
                .-----.\s
                |10   |\s
                |  ♦  |\s
                |   10|\s
                `-----'""",
                """
                .-----.\s
                |J    |\s
                |  ♦  |\s
                |    J|\s
                `-----'""",
                """
                .-----.\s
                |Q    |\s
                |  ♦  |\s
                |    Q|\s
                `-----'""",
                """
                .-----.\s
                |K    |\s
                |  ♦  |\s
                |    K|\s
                `-----'""",
                """
                .-----.\s
                |A    |\s
                |  ♦  |\s
                |    A|\s
                `-----'""",
                """
                .-----.\s
                |2    |\s
                |  ♣  |\s
                |    2|\s
                `-----'""",
                """
                .-----.\s
                |3    |\s
                |  ♣  |\s
                |    3|\s
                `-----'""",
                """
                .-----.\s
                |4    |\s
                |  ♣  |\s
                |    4|\s
                `-----'""",
                """
                .-----.\s
                |5    |\s
                |  ♣  |\s
                |    5|\s
                `-----'""",
                """
                .-----.\s
                |6    |\s
                |  ♣  |\s
                |    6|\s
                `-----'""",
                """
                .-----.\s
                |7    |\s
                |  ♣  |\s
                |    7|\s
                `-----'""",
                """
                .-----.\s
                |8    |\s
                |  ♣  |\s
                |    8|\s
                `-----'""",
                """
                .-----.\s
                |9    |\s
                |  ♣  |\s
                |    9|\s
                `-----'""",
                """
                .-----.\s
                |10   |\s
                |  ♣  |\s
                |   10|\s
                `-----'""",
                """
                .-----.\s
                |J    |\s
                |  ♣  |\s
                |    J|\s
                `-----'""",
                """
                .-----.\s
                |Q    |\s
                |  ♣  |\s
                |    Q|\s
                `-----'""",
                """
                .-----.\s
                |K    |\s
                |  ♣  |\s
                |    K|\s
                `-----'""",
                """
                .-----.\s
                |A    |\s
                |  ♣  |\s
                |    A|\s
                `-----'""",
                """
                .-----.\s
                |2    |\s
                |  ♠  |\s
                |    2|\s
                `-----'""",
                """
                .-----.\s
                |3    |\s
                |  ♠  |\s
                |    3|\s
                `-----'""",
                """
                .-----.\s
                |4    |\s
                |  ♠  |\s
                |    4|\s
                `-----'""",
                """
                .-----.\s
                |5    |\s
                |  ♠  |\s
                |    5|\s
                `-----'""",
                """
                .-----.\s
                |6    |\s
                |  ♠  |\s
                |    6|\s
                `-----'""",
                """
                .-----.\s
                |7    |\s
                |  ♠  |\s
                |    7|\s
                `-----'""",
                """
                .-----.\s
                |8    |\s
                |  ♠  |\s
                |    8|\s
                `-----'""",
                """
                .-----.\s
                |9    |\s
                |  ♠  |\s
                |    9|\s
                `-----'""",
                """
                .-----.\s
                |10   |\s
                |  ♠  |\s
                |   10|\s
                `-----'""",
                """
                .-----.\s
                |J    |\s
                |  ♠  |\s
                |    J|\s
                `-----'""",
                """
                .-----.\s
                |Q    |\s
                |  ♠  |\s
                |    Q|\s
                `-----'""",
                """
                .-----.\s
                |K    |\s
                |  ♠  |\s
                |    K|\s
                `-----'""",
                """
                .-----.\s
                |A    |\s
                |  ♠  |\s
                |    A|\s
                `-----'"""};

            do {
                IApoints2 = 0;
                userpoints2 = 0;
                reinicioRonda = false;
                playerfinish = false;
                gameover = false;
                // "LIMPIAR PANTALLA"
                for (int j = 0; j < 69; j++) {
                    System.out.println();
                }

                //Comienzo del juego
                if (rounds == 1) {
                    System.out.println("""
                        ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                        EMPIEZA EL JUEGO!!!
                        """);
                }else {
                    System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "La ronda " + rounds + " va a empezar!\n");
                    System.out.println( "Rondas ganadas:\n" + "Crupier: " + roundIApoints + "\nJugador: " + userRoundPoints + "\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                }

                //TURNO DEL CRUPIER
                do {
                    cartasRandom = (int)(Math.random()*52);
                    IApoints2 = IApoints2 + cardPoints[cartasRandom];
                    if (IApoints2 >= 22) {
                        reinicioRonda = true;
                        System.out.print("El crupier ha llegado a mas de 21, la ronda se reiniciará\n" + "⮕ INTRO para seguir");
                        read.nextLine();
                    }
                }while (IApoints2 <= 13);

                System.out.println("La carta visible del crupier es:\n" + cartas[cartasRandom]);

                //WHILE Por si el crupier llega a mas de 21 y reiniciar ronda y TURNO DEL JUGADOR
                if (!reinicioRonda){
                    System.out.println("""
                        ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
                        turno del usuario:""");
                    System.out.println("Tus cartas son:");
                    for (int i = 0; i < 2; i++) {
                        cartasRandom = (int)(Math.random()*52);
                        System.out.println(cartas[cartasRandom]);
                        userpoints2 = userpoints2 + cardPoints[cartasRandom];
                    }

                    // MENU DE QUE HACER DESPUES DE LAS DOS CARTAS
                    do {
                        do {
                            System.out.println("""
                                Que quieres hacer?
                                1. Recuento de puntos
                                2. Pedir otra carta
                                3. Plantarse""");
                            correct = read.hasNextInt();

                            if (!correct) {
                                System.out.println("-- ERROR -- Esto no es un numero :(");
                                read.nextLine();
                            }else{
                                respuestaUser3 = read.nextInt();
                                if (respuestaUser3 >= 4 || respuestaUser3 < 1) {
                                    System.out.println("-- ERROR -- Este numero no esta en la lista :(");
                                    correct = false;
                                }
                                read.nextLine();
                            }
                        }while (!correct);

                        switch (respuestaUser3) {
                            case 1 -> System.out.println("Tu recuento total es de: " + userpoints2);
                            case 2 -> {
                                cartasRandom = (int) (Math.random() * 52);
                                System.out.println(cartas[cartasRandom]);
                                userpoints2 = userpoints2 + cardPoints[cartasRandom];
                                if (userpoints2 >= 22) {
                                    System.out.println("TE HAS PASADO!!! :C");
                                    gameover = true;
                                    playerfinish = true;
                                } else if (userpoints2 == 21) {
                                    System.out.println("¡¡¡JUSTO EN EL CLAVO, 21!!!");
                                    playerfinish = true;
                                }
                            }
                            case 3 -> playerfinish = true;
                        }
                    }while (!playerfinish);

                    // VER EL GANADOR DE LA RONDA
                    if (userpoints2 > IApoints2 && !gameover) {
                        userRoundPoints++;
                        System.out.println( "\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "Puntos de cada jugador:\n" + "Crupier: " + IApoints2 + "\nJugador: " + userpoints2);

                        System.out.println("""            
                            ┃━━━━━━━━━━━━━━━━━━━━┃
                            ┃  ¡¡RONDA GANADA!!  ┃
                            ┃━━━━━━━━━━━━━━━━━━━━┃
                    
                            ⮕ INTRO para seguir""");
                        read.nextLine();
                    } else if (userpoints2 == IApoints2) {
                        System.out.println( "\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "Puntos de cada jugador:\n" + "Crupier: " + IApoints2 + "\nJugador: " + userpoints2);

                        System.out.println("""            
                            ┃━━━━━━━━━━┃
                            ┃  EMPATE  ┃
                            ┃━━━━━━━━━━┃
                    
                            ⮕ INTRO para seguir""");
                        read.nextLine();
                    }else{
                        System.out.println( "\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "Puntos de cada jugador:\n" + "Crupier: " + IApoints2 + "\nJugador: " + userpoints2);

                        System.out.println("""            
                            ┃━━━━━━━━━━━━━━━━━━━━┃
                            ┃  RONDA PERDIDA :C  ┃
                            ┃━━━━━━━━━━━━━━━━━━━━┃
                    
                            ⮕ INTRO para seguir""");
                        read.nextLine();
                        roundIApoints++;
                    }
                        reinicioRonda = true;
                };

                //Recuento de rondas
                rounds++;
            }while (roundIApoints != 5 && userRoundPoints != 5);

            // "LIMPIAR PANTALLA"
            for (int j = 0; j < 69; j++) {
                System.out.println();
            }

            if (userRoundPoints > roundIApoints) {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  ¡¡HAS GANADO!!  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[2] = false;
                results[5] = false;
                bucle = false;
            } else {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  HAS PERDIDO :(  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[4] = false;
                bucle = false;
            }
        }while(bucle);
        return results;
    }
}
