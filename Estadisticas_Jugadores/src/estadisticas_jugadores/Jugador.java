
package estadisticas_jugadores;


public abstract class Jugador {
    
    //atributos
    protected String nombre;
    protected int numero_dorsal;
    protected int rut;
    protected int goles_marcados;
    protected int valoracion_goles;
    protected int valoracion_general;
    public Jugador(String nom,int num_dor,int rut, int gol_marca){
        this.nombre=nom;
        this.goles_marcados=gol_marca;
        this.rut=rut;
        this.numero_dorsal=num_dor;
    }
    
    //metodos
    public void valoracion_goles(int goles){
        this.valoracion_goles=goles*30;
        
    }
    public void valoracion_general(){
        
    }
    public void gol(){
        this.goles_marcados++;
        
    }
   public void setDorsal(int dors){
        this.numero_dorsal=dors;
    }
    public void setNombre(int nom){
        this.numero_dorsal=nom;
}
}
