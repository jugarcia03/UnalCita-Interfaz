/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa;

import java.util.Vector;

/**
 *
 * @author SEBASTIAN
 */
public class Usuario {
    private String nick;
    private String contraseña;
    private String facultad;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public static int verificarUsuarioNuevo(String usuario){
    Vector lista= mostrar();
    Usuario obj;
    for(int i=0; i < lista.size();i++){
        obj = (Usuario) lista.elementAt(i);
        if(obj.getNick().equalsIgnoreCase(usuario)){
            return i;
        }
    }
    return -1; 
    }
    
   
 public static int verificarFacultad(String facultad){
 Vector lista = mostrar();
 Usuario obj;
 for(int i=0; i < lista.size();i++){
        obj = (Usuario) lista.elementAt(i);
        if(obj.getFacultad().equals(facultad)){
            return i;
        }
 }
    return -1; 
    }
 
        
    public static int verificarLogueo(String usuario, String contraseña){
        Vector lista = mostrar();
        return 0;
    }

public static Vector mostrar (){
return ListaUsuario.mostrar();
}

}
    







    

