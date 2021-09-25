/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoriaseleccion;


public class Convocados {

 
    private String id;
    private String numeroCamiseta;
    private String nombre;
    private String apellido;
    private String edad;
    private String posicion;
    private String equipoProcedencia;

       public Convocados() {
    }
       
       
    public String getId() {
        
        
        
        return id;
    }

    public void setId(String id) {
        
        if (id==null){
            System.out.println("Registro no existe");
        }else{
        this.id = id;
        }
    }   

    public String getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(String numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipoProcedencia() {
        return equipoProcedencia;
    }

    public void setEquipoProcedencia(String equipoProcedencia) {
        this.equipoProcedencia = equipoProcedencia;
    }
       
    
       
    
    
}
