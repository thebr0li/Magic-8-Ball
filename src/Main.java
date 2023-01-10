import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        boolean salir;

        do {
            salir = false;
            System.out.println("Queres sacudirla?");
            String respuesta = sc.nextLine();

            if (respuesta.equals("no")){
                salir = true;
            }else{
                int sacudir = (int) Math.abs(Math.random() * 10);

                System.out.println(sacudir);

                switch (sacudir){
                    case 1 -> System.out.println("Eres el mañana con el que me atrvo a soñar");
                    case 2 -> System.out.println("No dejes que se muera el sol, sin que hayan muerto tus rencores ");
                    case 3 -> System.out.println("El entusiasmo mueve el mundo");
                    case 4 -> System.out.println("La vida es corta, la juventud es finita, y las oportunidades no tienen fin");
                    case 5 -> System.out.println("La cosa más bella del mundo es, por supuesto, el mundo mismo");
                    case 6 -> System.out.println("De las dificultades nacen los milagros");
                    case 7 -> System.out.println("Tienes que hacer que ocurra");
                    case 8 -> System.out.println("Los días más perdidos de tu vida son los que no has sonreído");
                    default -> System.out.println("Este numero no dice nada");
                }
            }
        }while(!salir);
    }
}
