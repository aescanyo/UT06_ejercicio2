
/**
 *
 * @author aescano
 */
class Aplicacion extends Juego {

    Juego player1 = new Juego(vidasIniciales);
    int vidas = player1.getVidasIniciales();

    public static void main(String[] args) throws Exception {

        //creamos el objeto
        Juego player1 = new Juego(5);

        // muestra vidas restantes
        System.out.println("Numero vidas restantes: " + player1.MuestraVidasRestantes());

        /**
         * Resta una vida al valor del atributo con las vidas y vuelve a llamar
         * a MuestraVidasRestantes.
         */
        player1.quitarVida();
        String result = String.format("Restando 1 vida, el total vidas queda a %d", player1.MuestraVidasRestantes());
        System.out.println(result);

        /**
         * Crea otra instancia de la clase Juego indicando que el número de
         * vidas es también de 5
         */
        Juego player2 = new Juego(5);

        /**
         * Llama al método MuestraVidasRestantes de la nueva instancia y luego
         * al de la instancia anterior.
         */
        System.out.println("Jugador2 " + player2.MuestraVidasRestantes());
        System.out.println("Jugador1 " + player1.MuestraVidasRestantes());

    }

}
