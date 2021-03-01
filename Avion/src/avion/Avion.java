/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

/**
 *
 * @author Shebas
 */
import javax.swing.JOptionPane;
public class Avion {
public static void main(String[] args) {
int opcion;
PilaAvion Lista = new PilaAvion();
do{
opcion = Integer.parseInt(JOptionPane.showInputDialog
("*** Aerolineas El Zancudo *** \n\n " + "Menu de opciones \n" +
"1. Registar ingreso pasajeros \n"+
"2. Contabilizar pasajeros \n"+
"3. Listar Pasajeros en el avion\n"+
"4. Indicar el pasajero a salir del avion \n"+
"5. salir"));

switch (opcion){
case 1:
String m = (JOptionPane.showInputDialog(null, "Ingrese el nombre del pasajero"));
String f = (JOptionPane.showInputDialog(null, "Ingrese el numero de la silla"));
Lista.NuevoPasajero(m,f);
break;
case 2:
JOptionPane.showMessageDialog(null, "En el avion hay: " + Lista.sumaNodoPas() + " Pasajeros ");
break;
case 3:
JOptionPane.showMessageDialog(null, "Lista de pasajeros en el avion " + Lista.Pasajeros());
break;
case 4:
Lista.SalidaPasajeros();
break;
}
} while (opcion != 5);
}
}
