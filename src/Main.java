import java.util.Scanner;
public class Main{
    public static int depurarInput(Scanner gameInput, int minValue, int maxValue){
        int numInput = -1; //Inicializamos la variable a -1 para que siempre entre en el loop
        numInput = gameInput.nextInt();
        while(!(minValue <= numInput && numInput <= maxValue)){
            System.out.println("Por favor escribe un valor válido:");
            numInput = gameInput.nextInt();
        }
        return(numInput);
    }
    public static void main (String[] Args){
        int decionesTomadas =0;
        int decisionJuego;
        boolean happyEnding = false;
        boolean trueEnding = false;
        boolean crossoverEnding = false;
        boolean cowardEnding = false;
        boolean globalDomination = false;
        Scanner userInputVar = new Scanner(System.in);
        String nombre;
        System.out.println("Eres una araña, introduce tu nombre: ");
        nombre = userInputVar.nextLine();
        System.out.println("Te encuentras colgando de tu tela en el techo de la aula de 1º de DAM, que haces?");
        System.out.println("1: Bajas a explorar la clase");
        System.out.println("2: Subes tu tela para explorar el techo");
        decisionJuego = Main.depurarInput(userInputVar, 1, 2);
        decionesTomadas ++;
        if(decisionJuego == 1){
            System.out.println("Cuidadosamente bajas al suelo de la clase. Una vez llegas al suelo ves el mundo desde " +
                    "una nueva perspectiva, ¿qué haces?");
            System.out.println("1: Ir a la ventana");
            System.out.println("2: Ir a la mochila de un estudiante");
            System.out.println("3: Subir a la mesa del escritorio y esconderte en la chaqueta");
            decisionJuego = Main.depurarInput(userInputVar, 1, 3);
            decionesTomadas ++;
            if(decisionJuego == 1){
                //bajar -- cañería
                System.out.println("Sin llamar la antención te subes a la ventana y observas que está abierta. " +
                        "Te asomas y ves 2 caminos:");
                System.out.println("1: Bajar a fuera");
                System.out.println("2: Subir la cañería");
                decisionJuego = Main.depurarInput(userInputVar, 1, 2);
                decionesTomadas ++;
                if(decisionJuego == 1){
                    //muerte por balón
                    System.out.println("Disfrutas tu exploración del mundo exterior durante unos días, " +
                            "encontrando comida y refugiándote hasta que un día eres aplastado por un balón");
                    System.out.println("BAD ENDING");
                    decisionJuego = 1000;
                }else if (decisionJuego == 2){
                    //lugar magnífico para crear un nido y ser feliz
                    System.out.println("Te cuesta escalar la cañería hasta que encuentras un rincón en el tejado " +
                            "que conviertes en una alcoba y tu nido");
                    System.out.println("HAPPY ENDING");
                    happyEnding = true;
                    decisionJuego = 1000;
                }
            }else if(decisionJuego == 2){
                //Aplastado bad ending
                System.out.println("Disfrutas de las comodidades de una mochila hasta que eres aplastado " +
                        "por un ordenador");
                System.out.println("BAD ENDING");
                decisionJuego = 1000;
            }else if (decisionJuego == 3){
                //Chaqueta
                System.out.println("Te encuentras dentro de una maravillosa chaqueta, te sientes intocable");
                System.out.println("Te tomas una pequeña siesta y cuando despiertas te encuentras en una nueva clase");
                System.out.println("1: Decides bajar al suelo a explorar la clase");
                System.out.println("2: Mejor esconderse, sube el muro al techo");
                decisionJuego = Main.depurarInput(userInputVar, 1, 2);
                decionesTomadas ++;
                if(decisionJuego == 1){
                    System.out.println("Asustas a un estudiante en el proceso y te aplasta");
                    System.out.println("TRUE ENDING");
                    trueEnding = true;
                    decisionJuego = 1000;
                }else if (decisionJuego == 2){
                    System.out.println("Intentas subir sin llamar la antención, pero rápidamente se escucha un " +
                            "grito y eres aplastado por un libro");
                    System.out.println("TRUE ENDING");
                    trueEnding = true;
                    decisionJuego = 1000;
                }
            }
        }else  if (decisionJuego == 2){
            //Seguir ruído -- tela
            System.out.println("Subes cuidadosamente y te encuentras en el techo, a la izquierda hay un " +
                    "pasillo oscuro y a la izquierda escuchas un ruído");
            System.out.println("1: Vas a la derecha a explorar la oscuridad");
            System.out.println("2: Exploras en la dirección del ruído");
            decisionJuego = Main.depurarInput(userInputVar, 1, 2);
            decionesTomadas ++;
            if(decisionJuego == 1){
                //Rebelión de arañas
                System.out.println("Te encuentras con un ejército de arañas esperándote. Una identificada con " +
                        "una medalla te pregunta si has terminado explorando, le asientes.");
                System.out.println(nombre + ": Que comience la rebelón de las arañas.");
                System.out.println("Tras unos duros meses de conquista las arañas ahora son la " +
                        "especie dominante en la Tierra.");
                System.out.println("DOMINACIÓN GLOBAL");
                globalDomination = true;
                decisionJuego = 1000;
            }else  if (decisionJuego == 2){
                //Bajar a una nueva clase -- Girar a la izquierda
                System.out.println("Te adentras más hacia el pasillo oscuro.");
                System.out.println("Hay una bifurcación en el pasillo, a la derecha bajas a una nueva clase " +
                        "y a la izquierda el ruído se itensifica.");
                System.out.println("1: Bajas a la nueva clase");
                System.out.println("2: Te diriges hacia el sonido");
                decisionJuego = Main.depurarInput(userInputVar, 1, 2);
                decionesTomadas ++;
                if(decisionJuego == 1){
                    System.out.println("Bajas cuidadosamente del techo y asustas a un estudiante, " +
                            "eres rápidamente aplastado por un zapato.");
                    System.out.println("BAD ENDING COVARDE");
                    cowardEnding = true;
                }else if (decisionJuego == 2){
                    System.out.println("De repente te encuentras en Hallownest y un bicho con un clavo te mata");
                    System.out.println("CROSSOVER ENDING");
                    crossoverEnding = true;
                }
            }
        }
        //Estadísticas de final de partida
        System.out.println("ESTADÍSTICAS FINALES");
        System.out.println("Decisiones tomadas: " + decionesTomadas);
        if(happyEnding){
            System.out.println("LOGRO OBTENIDO: Happy Ending C:");
        }else if (crossoverEnding){
            System.out.println("LOGRO OBTENIDO: Welcome to hallownest");
        }else if(cowardEnding){
            System.out.println("LOGRO NEGATIVO OBTENIDO: Covarde >:(");
        } else if (trueEnding) {
            System.out.println("LOGRO OBTENIDO: Triste Realidad :(");
        }else if (globalDomination){
            System.out.println("LOGRO OBTENIDO: Dominación Global >:)");
        }
    }
}