
package estadisticas_jugadores;


public class Arquero extends Jugador {
    private int atajadas_realizadas;

    public Arquero(String nom, int num_dor, int rut, int gol_marca) {
        super(nom, num_dor, rut, gol_marca);
    }
    
    
    @Override
    public void valoracion_general(){
        this.valoracion_general=valoracion_goles+(atajadas_realizadas*5);
    }
    
    
    
     public int getAtajadas(){
        return this.atajadas_realizadas;
    }
    public void setAtajadas(int ataj){
        this.atajadas_realizadas=ataj;
    }
    public void addAtajadas(){
        this.atajadas_realizadas++;
    }
}
