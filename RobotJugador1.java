import uni.robot.Mundo;
import uni.robot.Robot;
/**
 * <p>Title: Ejercicio RobotJugador1.</p>
 * <p>Description: Utilizado para la cátedra de Introducción a la Programación I.</p>
 * <p>Company: Universidad Nacional de Itapúa.</p>
 * @author Samuel Alarcon
 * @version 1.0
 */
public class RobotJugador1 extends Robot {
    /**
     * Constructor Completo
     * @param m Mundo
     * @param fila int
     * @param columna int
     * @param dirInicial int
     * @param cantidadMaxima int
     * @param cantConos int
     */
    public RobotJugador1(Mundo m, int fila, int columna, int dirInicial, int cantidadMaxima, int cantConos) {
        super(m, fila, columna, dirInicial, cantidadMaxima, cantConos);
    }

    /**
     * Constructor simple
     * @param m Mundo
     */
    public RobotJugador1(Mundo m) {
        super(m);
    }

    /** Metodo para poner un cono y avanzar */
    public void ponerConoAvanzar() {
        ponerCono();
        avanzar();
    }

    /** Metodo para Dibujar una linea de conos con un espacio de diferencia
     * @param longitud longitud en conos de la linea */
    public void dibujarLineaEspaciada(int longitud){
        for(int i = 0; i < longitud; i++ ){
            ponerConoAvanzar();
            avanzar();
        }
    }

    /** Metodo que hace avanzar a la derecha al robot */
    private void avanzarDerecha(){
        girarDerecha();
        avanzar();
    }

    /** Metodo que hace girar en u al robor */
    public void girar180grados() {
        avanzarDerecha();
        avanzarDerecha();
    }

    /** Metodo para avanzar una n cantidad de veces
     * @param longitud  pasos a avanzar*/
    public void avanzar(int longitud) {
        for (int i = 0; i < longitud; i++) {
            avanzar();
        }
    }

    /** Metodos para hacer las partes del Triangulo
     * @param longitud longitud de la linea del triangulo
     * @param n cuanto avanza luego de terminar la linea*/
    private void hacerParteTriangulo(int longitud, int n) {
        dibujarLineaEspaciada(longitud);
        girar180grados();
        avanzar(n);
    }

    /** Metodo que hace el triangulo
     *
     * @param longitud longitud del triangulo
     */
    public void hacerTriangulo(int longitud) {
        hacerParteTriangulo(longitud, 2);
        hacerParteTriangulo(longitud - 1, 0); // n=0 para no avanzar
    }
}