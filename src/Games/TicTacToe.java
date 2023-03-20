package Games;

import java.util.Scanner;

public class TicTacToe {
    
    public static boolean[] TicTacToe(boolean results[]) throws InterruptedException {
        while(true){
        // VARIABLES DEL MENU
        Scanner read = new Scanner(System.in);
        boolean correct;

        //VARIABLES DEL CAPITULO 1
        boolean GAMEOVER = false, winner = false;
        int IA = 0, token = 0, respuestaUser = 0, respuestaIA = 0;
        char usr, maquina;
        int[][] WIN = { {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6} };


        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""   
                   __                          ___
                  / /_  _____  ____ _____     <  /
             __  / / / / / _ \\/ __ `/ __ \\    / /\s
            / /_/ / /_/ /  __/ /_/ / /_/ /   / / \s
            \\____/\\__,_/\\___/\\__, /\\____/   /_/  \s
                            /____/               \s
            ⮕ INTRO para seguir""");
        read.nextLine();

        //EMPIEZA EL JUEGO 1

        System.out.println("""
        ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        TRES EN RAYA:
        COMO JUGAR?
        ⥤ Para poner tu ficha debes indicar en que casilla quieres añadirla
        ⥤ Las casillas van del 0 al 8 tal que asi:
        0  1  2
        3  4  5
        6  7  8
        ⥤ Cuando llegas a hacer tres fichas en ralla GANAS!
        ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
        
        ⮕ INTRO para seguir""");
        read.nextLine();

        do {
            System.out.println("""
            Que quieres ser?
            1.⭕
            2.❌""");

            correct = read.hasNextInt();

            if (!correct) {
                System.out.println("-- ERROR -- Esto no es un numero :(");
                read.nextLine();
            }else{
                token = read.nextInt();
                if (token >= 3 || token <= 0){
                    System.out.println("-- ERROR -- No son numeros del menu, vuelve a intentarlo :)");
                    correct = false;
                }
                read.nextLine();
            }
        }while (!correct);

        if (token == 1){
            usr = '⭕';
            maquina = '❌';
        }else {
            usr = '❌';
            maquina = '⭕';
        }

        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""            
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            ┃ EL PRIMER JUGADOR EN TIRAR  ┃
            ┃ SE ELEGIRÁ ALEATORIAMENTE   ┃
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃

            ⮕ INTRO para seguir
            """);
        read.nextLine();
        IA = (int)(Math.random()*2);

        if (IA == 0){
            System.out.println("""            
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━┃
                ┃ LA MAQUINA TIRA PRIMERO ┃
                ┃━━━━━━━━━━━━━━━━━━━━━━━━━┃

                ⮕ INTRO para seguir""");
            read.nextLine();
        }else {
            System.out.println("""            
                ┃━━━━━━━━━━━━━━━━━━━━━┃
                ┃ TU TIRAS PRIMERO :) ┃
                ┃━━━━━━━━━━━━━━━━━━━━━┃

                ⮕ INTRO para seguir""");
            read.nextLine();
        }

        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }
        GAMEOVER = false;
        winner = false;
        char[] tablero = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8'};

        do {
            //TURNO DE LA IA
            if (IA == 0){
                System.out.println("""
                    ━━━━━━━━━━━━━━━━━━━━━
                    TURNO DE LA MAQUINA:""");

                //TURNO DE LA IA
                do {
                    respuestaIA = (int)(Math.random()*9);
                }while(tablero[respuestaIA] == '❌' || tablero[respuestaIA] == '⭕');

                //Reescribir el tablero
                tablero[respuestaIA] = maquina;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[i * 3 + j] + " ");
                    }
                    System.out.println();
                }
                IA = 1;
                System.out.println("⮕ INTRO para seguir");
                read.nextLine();

                //Comprobar si hay tres en ralla
                for (int[] condicion : WIN) {
                    if (tablero[condicion[0]] == tablero[condicion[1]] && tablero[condicion[1]] == tablero[condicion[2]]) {
                        GAMEOVER = true;
                        IA = 2;
                        break;
                    }
                }
            }

            // TURNO DEL USUARIO
            if (IA == 1){
                System.out.println("""
                    ━━━━━━━━━━━━━━━━━━━━━
                    TU TURNO:""");
                // Control de errores para decir la ubicación del token
                do {
                    System.out.println("Donde quieres poner la " + usr);
                    correct = read.hasNextInt();

                    if (!correct) {
                        System.out.println("-- ERROR -- Esto no es un numero :(");
                        read.nextLine();
                    }else{
                        respuestaUser = read.nextInt();
                        if (respuestaUser >= 9 || respuestaUser < 0){
                            System.out.println("-- ERROR -- No son numeros del tablero, vuelve a intentarlo");
                            correct = false;
                        }else if (tablero[respuestaUser] == '❌' || tablero[respuestaUser] == '⭕'){
                            System.out.println("-- ERROR -- Esta posicion ya esta ocupada :(");
                            correct = false;
                        }
                        read.nextLine();
                    }
                }while (!correct);

                //Reescribir el tablero
                tablero[respuestaUser] = usr;

                //Enseñar el tablero
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[i * 3 + j] + " ");
                    }
                    System.out.println();
                }

                IA = 0;
                System.out.println("⮕ INTRO para seguir");
                read.nextLine();
            }

            //Comprobar si hay tres en ralla
            for (int[] condicion : WIN) {
                if (tablero[condicion[0]] == tablero[condicion[1]] && tablero[condicion[1]] == tablero[condicion[2]]) {
                    GAMEOVER = true;
                    break;
                }
            }

        }while (!GAMEOVER);

        // VER GANADORES
        for (int[] condicion : WIN) {
            if (tablero[condicion[0]] == '❌' && tablero[condicion[1]] == '❌' && tablero[condicion[2]] == '❌') {
                winner = true;
                break;
            }
        }

        if (token == 1){
            if (winner) {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━┃
                    ┃  GAME OVER  ┃
                    ┃━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[4] = true;
                break;
            }else {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  ¡¡HAS GANADO!!  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[0] = false;
                results[1] = true;
                break;
            }
        }else {
            if (winner) {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━━━━━━┃
                    ┃  ¡¡HAS GANADO!!  ┃
                    ┃━━━━━━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[0] = false;
                results[1] = true;
                break;
            }else {
                System.out.println("""            
                    ┃━━━━━━━━━━━━━┃
                    ┃  GAME OVER  ┃
                    ┃━━━━━━━━━━━━━┃

                    ⮕ INTRO para seguir""");
                read.nextLine();
                results[4] = true;
                break;
            }
        }
    }
    return results;
    }
}
