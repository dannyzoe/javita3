


package sf.Nomin.controller;


public class Trabajador {
    
    private int id;
    private String nombre;
     private int horasLaborales;
     private float sueldoBase;

     public Trabajador(){}
    
    public Trabajador(int id, String nombre, int horasLaborales, float sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.horasLaborales = horasLaborales;
        this.sueldoBase = sueldoBase;
    }
   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasLaborales() {
        return horasLaborales;
    }

    public void setHorasLaborales(int horasLaborales) {
        this.horasLaborales = horasLaborales;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
     
    
}
