import java.security.Key;
import java.util.Scanner;
public class Main{
    public static void main (String[] Args){
        int decisionJuego = 0;
        Scanner userInputVar = new Scanner(System.in);
        String nombre = "";
        System.out.println("Eres una araña, introduce tu nombre: ");
        nombre = userInputVar.nextLine();
        userInputVar.nextLine(); //Limpiar el buffer
        System.out.println("Te encuentras colgando de tu tela en el techo de la aula de 1º de DAM, que haces?");
        System.out.println("1: Bajas a explorar la clase");
        System.out.println("2: Subes tu tela para explorar el techo");
        decisionJuego = userInputVar.nextInt();
        if(decisionJuego == 1){
            System.out.println("Cuidadosamente bajas al suelo de la clase. Una vez llegas al suelo ves el mundo desde " +
                    "una nueva perspectiva, ¿qué haces?");
            System.out.println("1: Ir a la ventana");
            System.out.println("2: Ir a la mochila de un estudiante");
            System.out.println("3: Subir a la mesa del escritorio y esconderte en la chaqueta");
            decisionJuego = userInputVar.nextInt();
            if(decisionJuego == 1){
                //bajar -- cañería
                System.out.println("Sin llamar la antención te subes a la ventana y observas que está abierta. " +
                        "Te asomas y ves 2 caminos:");
                System.out.println("1: Bajar a fuera");
                System.out.println("2: Subir la cañería");
                decisionJuego = userInputVar.nextInt();
                if(decisionJuego == 1){
                    //muerte por balón
                    System.out.println("Disfrutas tu exploración del mundo exterior durante unos días, " +
                            "encontrando comida y refugiándote hasta que un día eres aplastado por un balón");
                    System.out.println("BAD ENDING");
                    System.exit(0);
                }else{
                    //lugar magnífico para crear un nido y ser feliz
                    System.out.println("Te cuesta escalar la cañería hasta que encuentras un rincón en el tejado " +
                            "que conviertes en una alcoba y tu nido");
                    System.out.println("HAPPY ENDING");
                    System.exit(0);
                }
            }else if(decisionJuego == 2){
                //Aplastado bad ending
                System.out.println("Disfrutas de las comodidades de una mochila hasta que eres aplastado " +
                        "por un ordenador");
                System.out.println("BAD ENDING");
                System.exit(0);
            }else{
                //Chaqueta
                System.out.println("Te encuentras dentro de una maravillosa chaqueta, te sientes intocable");
                System.out.println("Te tomas una pequeña siesta y cuando despiertas te encuentras en una nueva clase");
                System.out.println("1: Decides bajar al suelo a explorar la clase");
                System.out.println("2: Mejor esconderse, sube el muro al techo");
                decisionJuego = userInputVar.nextInt();
                if(decisionJuego == 1){
                    System.out.println("Asustas a un estudiante en el proceso y te aplasta");
                    System.out.println("TRUE ENDING");
                    System.exit(0);
                }else{
                    System.out.println("Intentas subir sin llamar la antención, pero rápidamente se escucha un " +
                            "grito y eres aplastado por un libro");
                    System.out.println("TRUE ENDING");
                    System.exit(0);
                }
            }
        }else{
            //Seguir ruído -- tela
            System.out.println("Subes cuidadosamente y te encuentras en el techo, a la izquierda hay un " +
                    "pasillo oscuro y a la izquierda escuchas un ruído");
            System.out.println("1: Vas a la derecha a explorar la oscuridad");
            System.out.println("2: Explorars en la dirección del ruído");
            decisionJuego = userInputVar.nextInt();
            if(decisionJuego == 1){
                //Rebelión de arañas
                System.out.println("Te encuentras con un ejército de arañas esperándote. Una identificada con " +
                        "una medalla te pregunta si has terminado explorando, le asientes.");
                System.out.println(nombre + ": Que comience la rebelón de las arañas.");
                System.out.println("Tras unos duros meses de conquista las arañas ahora son la " +
                        "especie dominante en la Tierra.");
                System.out.println("DOMINACIÓN GLOBAL");
                System.exit(0);
            }else{
                //Bajar a una nueva clase -- Girar a la izquierda
                System.out.println("Te adentras más hacia el pasillo oscuro.");
                System.out.println("Hay una bifurcación en el pasillo, a la derecha bajas a una nueva clase " +
                        "y a la izquierda el ruído se itensifica.");
                System.out.println("1: Bajas a la nueva clase");
                System.out.println("2: Te diriges hacia el sonido");
                decisionJuego = userInputVar.nextInt();
                if(decisionJuego == 1){
                    System.out.println("Bajas cuidadosamente del techo y asustas a un estudiante, " +
                            "eres rápidamente aplastado por un zapato.");
                    System.out.println("BAD ENDING COVARDE");
                }else{
                    System.out.println("De repente te encuentras en Hallownest y un bicho con un clavo te mata");
                    System.out.println("CROSSOVER ENDING");
                }
            }
        }
    }
}