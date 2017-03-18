package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String cadVerdadero;
    private String cadFalso;
    
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cadVerdadero, String cadFalso) {
        this.cadVerdadero = cadVerdadero;
        this.cadFalso = cadFalso;
    }
        
    public String getCad(){
        return cad;
    }

    public String getCadVerdadero() {
        return cadVerdadero;
    }
    
    public String getCadFalso(){
        return cadFalso;
    }
}
