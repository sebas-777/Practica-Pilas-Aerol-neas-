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
public class PilaAvion {
NodoPasajeros cabeza;
public PilaAvion(){
cabeza = null;
}
public void NuevoPasajero(String m, String f){
NodoPasajeros q;
q = new NodoPasajeros(m,f);
if (cabeza == null) {
cabeza=q;
}else
{
q.asignarPointer(cabeza);
cabeza=q;
}
}

public String Pasajeros(){
NodoPasajeros p;
p = cabeza;
String Cadena =" ";

while (p != null) {
Cadena += "\nPasajero: " + p.obtenerNombre()+ "   Silla: " + p.obtenerSilla();
p=p.obtenerPointer();
}
return Cadena;
}

public int sumaNodoPas(){
NodoPasajeros p;
p = cabeza;
int total = 0;
while (p != null){
p = p.obtenerPointer();
total ++;
}
return total;
}
public void SalidaPasajeros(){
NodoPasajeros p;
p = cabeza;
if (p!= null){
JOptionPane.showMessageDialog(null, "El pasajero " + p.obtenerNombre() + " de la silla " 
        + p.obtenerSilla() + " puede Salir ");
cabeza = p.obtenerPointer();
}
else {
 JOptionPane.showMessageDialog(null, "No hay mas pasajeros en el avion ");
}

}
}

