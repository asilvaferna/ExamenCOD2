/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class Lovivido{

    public static void main(String[] args) {
        String nombre;
        String edad;

        int mes, dia, hora, años;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        años = Integer.parseInt(edad);

        calculaMes(años);
        calculaDia(años);
        calculaHora(calculaDia(años));

        JOptionPane.showMessageDialog(null, "Meses: " + calculaMes(años), "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + calculaDia(años), "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + calculaHora(calculaDia(años)), "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    public static int calculaMes(int nAños){
        int nMes = nAños * 12;
        return nMes;
    }
    public static int calculaDia(int nAños){
        int nDia = nAños * 365;
        return nDia;
    }
    public static int calculaHora(int nDia){
        int nHora = nDia * 12;
        return nHora;
    }
}
