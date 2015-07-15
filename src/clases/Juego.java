/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Daniel
 */
public class Juego {
    
    private GameEngine motor;
    private Cuadricula cuadricula;
    private Jugador jugador1;
    private Jugador jugador2;
    
    public Juego(String player1,String player2){
        
        cuadricula = new Cuadricula();
        motor = new GameEngine(cuadricula);
        jugador1 = new Jugador(player1);
        jugador2 = new Jugador(player2);
        
    }
    
}
