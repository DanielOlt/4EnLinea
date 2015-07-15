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
public class Cuadricula {
    
    private byte[][] cuadricula;
    
    public Cuadricula(){
        cuadricula=new byte[6][7];
    }
    
    public byte[][] getCuadricula(){
        return cuadricula;
        
    }
    
    public boolean insertarFicha(byte fila, byte columna, byte color){
        
        if(celdaVacia(fila,columna)){
            cuadricula[fila][columna] = color;
            return true;
        }
        else
            return false;
        
    }
    
    private boolean celdaVacia(byte fila, byte columna){
        return cuadricula[fila][columna]==0;
        
    }
    
    public byte ultimaVacia(byte columna){
        int i=5;
        boolean band=true;
        byte pos=0;
        while(i>=0&&band){
            if(cuadricula[i][columna]==0){
                pos= (byte) i;
                band=false;
            
            }
            i--;                     
        }
        return pos;     
        
        
    }
    
}
