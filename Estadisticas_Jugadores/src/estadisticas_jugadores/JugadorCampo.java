/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas_jugadores;


public  abstract class JugadorCampo extends Jugador{
    
    protected int pases_realizados_con_exito;
    protected int numero_balones_recuperados;
    

    public JugadorCampo(String nom, int num_dor, int rut, int gol_marca,int pases_realizados_con_exito,int numero_balones_recuperados) {
        super(nom, num_dor, rut, gol_marca);
        this.numero_balones_recuperados=numero_balones_recuperados;
        this.pases_realizados_con_exito=pases_realizados_con_exito;
        
        
        }
    public void pasesRealizados(){
        this.pases_realizados_con_exito++;
        
    }
    public void balonesRecuperados(){
        this.numero_balones_recuperados++;
        
    }
    
    
   
}
