import uni.robot.Mundo;
import uni.robot.*;
/**
 * <p>Title: Mundo de los robots jugadores.</p>
 * <p>Description: Utilizado para la cátedra de Introducción a la Programación I.</p>
 * <p>Company: Universidad Nacional de Itapúa.</p>
 * @author Samuel Alarcon
 * @version 1.0
 */
public class JuegoDelTriangulo {
    public static void main (String[] args) {
        Mundo m = new Mundo("Samuel Alarcon", 15, 15);
        RobotJugador1 juan = new RobotJugador1(m,3,2,Robot.ESTE,20,20);
        RobotJugador2 maria = new RobotJugador2(m,3,2,Robot.ESTE,40,20);
        juan.hacerTriangulo(5);
        maria.invertirTriangulo(5);
    }
}
