import uni.robot.Mundo;
/**
 * <p>Title: Ejercicio RobotJugador2.</p>
 * <p>Description: Utilizado para la cátedra de Introducción a la Programación I.</p>
 * <p>Company: Universidad Nacional de Itapúa.</p>
 * @author Samuel Alarcon
 * @version 1.1
 */
public class RobotJugador2 extends RobotJugador1{
    /**
     * Constructor completo
     * @param m Mundo
     * @param fila int
     * @param columna int
     * @param dirInicial int
     * @param cantidadMaxima int
     * @param cantConos int
     */
    public RobotJugador2(Mundo m, int fila, int columna, int dirInicial, int cantidadMaxima, int cantConos) {
        super(m, fila, columna, dirInicial, cantidadMaxima, cantConos);
    }

    /**
     * Constructor simple
     * @param m Mundo
     */
    public RobotJugador2(Mundo m) {
        super(m);
    }

    /** Metodo que Guarda un cono y avanza */
    public void guardarConoAvanzar() {
        guardarCono();
        avanzar();
    }

    /**Metodo que invierte la linea de conos
     * @param longitud longitud de la linea*/
    public void invertirLinea(int longitud){
        for(int i = 0; i < longitud - 1; i++ ) {
            guardarConoAvanzar();
            ponerConoAvanzar();
        }
    }

    /** Metodo que invierte la base del Triangulo */
    private void invertirBaseTriangulo(int longitud) {
        invertirLinea(longitud);
        guardarConoAvanzar();
        girar180grados();
    }

    /** Metodo que invierte la segunda parte del Triangulo */
    private void invertirParteTriangulo(int longitud) {
        ponerConoAvanzar();
        invertirLinea(longitud);
        girar180grados();
    }

    /** Metodo que invierte la orientacion del Triangulo
     * @param longitud  longitud del Triangulo*/
    public void invertirTriangulo(int longitud){
        invertirBaseTriangulo(longitud);
        invertirParteTriangulo(longitud);

    }
}
