package Chapters;

import java.util.Scanner;

public class Chapter3 {

    public static boolean[] chapter3(boolean results[]) throws InterruptedException{
        boolean bucle = true;
        Scanner read = new Scanner(System.in);

        do{ 
        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("""
                         ██████╗ █████╗ ██████╗ ██╗████████╗██╗   ██╗██╗      ██████╗     ██████╗
                        ██╔════╝██╔══██╗██╔══██╗██║╚══██╔══╝██║   ██║██║     ██╔═══██╗    ╚════██╗
                        ██║     ███████║██████╔╝██║   ██║   ██║   ██║██║     ██║   ██║     █████╔╝
                        ██║     ██╔══██║██╔═══╝ ██║   ██║   ██║   ██║██║     ██║   ██║     ╚═══██╗
                        ╚██████╗██║  ██║██║     ██║   ██║   ╚██████╔╝███████╗╚██████╔╝    ██████╔╝
                         ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝   ╚═╝    ╚═════╝ ╚══════╝ ╚═════╝     ╚═════╝\n""");

        System.out.println("""
            Ares: Un oponente digno, ya solo queda uno...
            
            ⮕ INTRO para seguir
            """);
        read.nextLine();

        System.out.println("""
            Ares: Voy a abrir las puertas del castillo
            
            ⮕ INTRO para seguir
            """);
        read.nextLine();

        System.out.println("""
                               _,-----------._
                           _,-'_,-----------._`-._
                         ,'_,-'  ___________  `-._`.
                  `'   ,','  _,-'___________`-._  `.`.
                     ,','  ,'_,-'     .     `-._`.  `.`.
                    /,'  ,','        >|<        `.`.  `.\\
                   //  ,','      ><  ,^.  ><      `.`.  \\\\
                  //  /,'      ><   / | \\   ><      `.\\  \\\\
                 //  //      ><    \\/\\^/\\/    ><      \\\\  \\\\
                ;;  ;;              `---'              ::  ::
                ||  ||              (____              ||  ||
               _||__||_            ,'----.            _||__||_
              (o.____.o)____        `---'        ____(o.____.o)
                |    | /,--.)                   (,--.\\ |    |
                |    |((  -`___               ___`   ))|    |
                |    | \\\\,'',  `.           .'  .``.// |    |
                |    |  // (___,'.         .'.___) \\\\  |    |
               /|    | ;;))  ____) .     . (____  ((\\\\ |    |\\
               \\|.__ | ||/ .'.--.\\/       `/,--.`. \\;: | __,|;
                |`-,`;.| :/ /,'  `)-'   `-('  `.\\ \\: |.;',-'|
                |   `..  ' / \\__.'         `.__/ \\ `  ,.'   |
                |    |,\\  /,                     ,\\  /,|    |
                |    ||: : )          .          ( : :||    |
               /|    |:; |/  .      ./|\\,      ,  \\| :;|    |\\
               \\|.__ |/  :  ,/-    <--:-->    ,\\.  ;  \\| __,|;
                |`-.``:   `'/-.     '\\|/`     ,-\\`;   ;'',-'|
                |   `..   ,' `'       '       `  `.   ,.'   |
                |    ||  :                         :  ||    |
                |    ||  |                         |  ||    |
                |    ||  |                         |  ||    |
                |    |'  |            _            |  `|    |
                |    |   |          '|))           |   |    |
                ;____:   `._        `'           _,'   ;____:
                {______}     \\___________________/     {______}
                |______|_______________________________|______|

            ⮕ INTRO para seguir""");
        read.nextLine();

        if (results[3]) {
            System.out.println("""
                Puck: Es enormeee!!
                
                ⮕ INTRO para seguir
                """);
            read.nextLine();
        }

        // "LIMPIAR PANTALLA"
        for (int i = 0; i < 69; i++) {
            System.out.println();
        }

        System.out.println("*Abriendo puerta\n");
        Thread.sleep(2000);

        System.out.println("""            
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃
            ┃ En el momento que Ares abrió la    ┃
            ┃ puerta, se quedó paralizado al ver ┃
            ┃ tanta destruccion y oscuridad. Le  ┃
            ┃ sorprendió tanto que se no se      ┃
            ┃ podia mover.                       ┃
            ┃━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┃

            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""
                \\ \\_\\ .----------.     /
                 \\   (  ||    ||  )   /..
              |\\  \\   ~-||====||-~_  ///\\\\
              | \\  \\    ||    || // /((()))
               \\|  |    ||====|| ~ / \\\\\\///
                   |__  ||    ||   |  `|''
                   | |\\ ||====|| __|  _|_
                   | | \\`'    `'/| |  =O=
                   | | |_ `    / | |   ~
                   | | ||\\____|  | |_
               _   | | || ____|  | |_]
              | |  | | |l/::::|  | |
              |/   | | |::::::\\  | |
                   | | /:::::::\\ | |
                   |_|/:::::::::\\|_|
                /|/|:.:.:.:.:.:.:.:|
               | / |.:.:.:.:.:.:.:.|
               |/| /...............\\ |\\
                 |/.................\\ \\|
                 /. . . . . . . . . .\\
                /. . . . . . . . . . .\\\n""");
        if (results[3]) {
            System.out.println("""
                Puck: Ares estas bien?????
                
                ⮕ INTRO para seguir
                """);
            read.nextLine();

            System.out.println("""
                Puck: ...
                
                ⮕ INTRO para seguir
                """);
            read.nextLine();
        }

        System.out.println("""
            Ares: No tengo miedo de nada! Acabare con el ultimo que me queda!!
            
            ⮕ INTRO para seguir
            """);
        read.nextLine();

        // "LIMPIAR PANTALLA"
        for (int j = 0; j < 69; j++) {
            System.out.println();
        }

        System.out.print("""
             ▐▄▄▄ ▄▄▄·
              ·██▐█ ▀█
            ▪▄ ██▄█▀▀█
            ▐▌▐█▌▐█ ▪▐▌
             ▀▀▀• ▀  ▀
            """);

        // ESPERA 1 SEC
        Thread.sleep(850);

        // "LIMPIAR PANTALLA"
        for (int j = 0; j < 69; j++) {
            System.out.println();
        }

        System.out.print("""
             ▐▄▄▄ ▄▄▄·
              ·██▐█ ▀█
            ▪▄ ██▄█▀▀█
            ▐▌▐█▌▐█ ▪▐▌
             ▀▀▀• ▀  ▀""");

        // ESPERA 1 SEC
        Thread.sleep(850);

        // "LIMPIAR PANTALLA"
        for (int j = 0; j < 69; j++) {
            System.out.println();
        }
        System.out.println("""
             ▐▄▄▄ ▄▄▄·
              ·██▐█ ▀█
            ▪▄ ██▄█▀▀█
            ▐▌▐█▌▐█ ▪▐▌
             ▀▀▀• ▀  ▀""");

        // ESPERA 1 SEC
        Thread.sleep(850);

        // "LIMPIAR PANTALLA"
        for (int j = 0; j < 69; j++) {
            System.out.println();
        }

        System.out.println("""
                                
             ▄▄·       • ▌ ▄ ·.                 .▄▄ ·  ▄▄▄· ▪  .▄▄ ·      ▄▄▄·▪   .▄▄ ·  ▄▄▄· ▄▄▄      • ▌ ▄ ·. ▪       ▄▄·  ▄▄▄· .▄▄ · ▄▄▄▄▄▪  ▄▄▌  ▄▄▌
            ▐█ ▌▪▪     ·██ ▐███▪▪         ▪     ▐█ ▀. ▐█ ▀█ ██ ▐█ ▀.     ▐█ ▄█ ██ ▐█ ▀. ▐█ ▀█ ▀▄ █·    ·██ ▐███▪██     ▐█ ▌▪▐█ ▀█ ▐█ ▀. •██  ██ ██•  ██•  ▪
            ██ ▄▄ ▄█▀▄ ▐█ ▌▐▌▐█· ▄█▀▄      ▄█▀▄ ▄▀▀▀█▄▄█▀▀█ ▐█·▄▀▀▀█▄     ██▀· ▐█·▄▀▀▀█▄▄█▀▀█ ▐▀▀▄     ▐█ ▌▐▌▐█·▐█·    ██ ▄▄▄█▀▀█ ▄▀▀▀█▄ ▐█.▪▐█·██▪  ██▪   ▄█▀▄
            ▐███▌▐█▌.▐▌██ ██▌▐█▌▐█▌.▐▌    ▐█▌.▐▌▐█▄▪▐█▐█ ▪▐▌▐█▌▐█▄▪▐█    ▐█▪·• ▐█▌▐█▄▪▐█▐█ ▪▐▌▐█•█▌    ██ ██▌▐█▌▐█▌    ▐███▌▐█ ▪▐▌▐█▄▪▐█ ▐█▌·▐█▌▐█▌▐▌▐█▌▐▌▐█▌.▐▌
            ·▀▀▀  ▀█▄▀▪▀▀  █▪▀▀▀ ▀█▄▀▪     ▀█▄▀▪ ▀▀▀▀  ▀  ▀ ▀▀▀ ▀▀▀▀     .▀    ▀▀▀ ▀▀▀▀  ▀  ▀ .▀  ▀    ▀▀  █▪▀▀▀▀▀▀    ·▀▀▀  ▀  ▀  ▀▀▀▀  ▀▀▀ ▀▀▀.▀▀▀ .▀▀▀  ▀█▄▀▪
            
            ⮕ INTRO para seguir""");
        read.nextLine();

        System.out.println("""
                                
            ▄▄▌             ▄▄▄· ▄▄▄·  ▄▄ •  ▄▄▄· ▄▄▄   ▄▄▄· .▄▄ ·      ▄▄·  ▄▄▄· ▄▄▄        ▄▄
            ██•  ▪         ▐█ ▄█▐█ ▀█ ▐█ ▀ ▪▐█ ▀█ ▀▄ █·▐█ ▀█ ▐█ ▀.     ▐█ ▌▪▐█ ▀█ ▀▄ █·▪     ██▌
            ██▪   ▄█▀▄      ██▀·▄█▀▀█ ▄█ ▀█▄▄█▀▀█ ▐▀▀▄ ▄█▀▀█ ▄▀▀▀█▄    ██ ▄▄▄█▀▀█ ▐▀▀▄  ▄█▀▄ ▐█·
            ▐█▌▐▌▐█▌.▐▌    ▐█▪·•▐█ ▪▐▌▐█▄▪▐█▐█ ▪▐▌▐█•█▌▐█ ▪▐▌▐█▄▪▐█    ▐███▌▐█ ▪▐▌▐█•█▌▐█▌.▐▌.▀
            .▀▀▀  ▀█▄▀▪    .▀    ▀  ▀ ·▀▀▀▀  ▀  ▀ .▀  ▀ ▀  ▀  ▀▀▀▀     ·▀▀▀  ▀  ▀ .▀  ▀ ▀█▄▀▪ ▀
            
            ⮕ INTRO para seguir""");
        read.nextLine();

        // "LIMPIAR PANTALLA"
        for (int j = 0; j < 69; j++) {
            System.out.println();
        }
        results = Games.BlackJack.BlackJackGame(results);
        bucle = false;
    }while (bucle);
        return results;
    }
    
}
