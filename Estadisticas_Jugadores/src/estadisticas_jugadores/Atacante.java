
package estadisticas_jugadores;

public class Atacante extends JugadorCampo{
    
    
    public Atacante(String nom, int num_dor, int rut, int gol_marca, int pases_realizados_con_exito, int numero_balones_recuperados) {
        super(nom, num_dor, rut, gol_marca, pases_realizados_con_exito, numero_balones_recuperados);
    }
    
    @Override
    public void valoracion_general(){
       
        this.valoracion_general=valoracion_goles+(pases_realizados_con_exito*2)+(numero_balones_recuperados*3);
    }
    
}
