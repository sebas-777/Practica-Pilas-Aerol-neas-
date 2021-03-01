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

public class NodoPasajeros {
public String Nombre;
public String Silla;
public NodoPasajeros Apuntador;

public NodoPasajeros(String m, String f){
Nombre = m;
Silla = f;
Apuntador = null;
}
public String obtenerNombre(){
return Nombre;
}
public String obtenerSilla(){
return Silla;
}
public NodoPasajeros obtenerPointer(){
return Apuntador;
}
public void asignarPointer(NodoPasajeros x){
Apuntador = x;
}
}
