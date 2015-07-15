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
import java.util.Arrays;

public class Tester {
    
    static byte[]linea = new byte[4];
    static Cuadricula cd = new Cuadricula();
    static GameEngine ge = new GameEngine(cd);
    
    static void fillCuadricula(){
        
        
        for(int i=0;i<6;i++)
            for(int j=0;j<7;j++){
                byte color = (byte) (new java.util.Random().nextInt(2)+1);
                cd.insertarFicha((byte)i, (byte)j,color);
            }
        
    }
    
    static void imprimir(){
        for(int i=0;i<6;i++)
                System.out.println(Arrays.toString(cd.getCuadricula()[i]));         
        
        
    
    }
    
    
    
    public static void main(String[] args){
        fillCuadricula();
        imprimir();
        //System.out.println("Horizontal----------------------------------------------------");
        //System.out.println("" + ge.checarHorizontal((byte)1));
        //System.out.println("" + ge.checarHorizontal((byte)2));
        //System.out.println("Vertical----------------------------------------------------");
        //System.out.println("" + ge.checarVertical((byte)1));
        //System.out.println("" + ge.checarVertical((byte)2));
        //System.out.println("Diagonal----------------------------------------------------");
        //System.out.println("" + ge.checarDiagonal((byte)1));
        //System.out.println("" + ge.checarDiagonal((byte) 2));
        //System.out.println("Inv Diagonal----------------------------------------------------");
        //System.out.println(""+ge.invDiagonalPrin((byte)1));
        //System.out.println(""+ge.invDiagonalPrin((byte)2));
        //System.out.println("-----------------------------------------------------------------");
        System.out.println("Inversa Diagonal Inferior----------------------------------------");
        System.out.println(""+ge.invDiagonalInf((byte)1));
        System.out.println(""+ge.invDiagonalInf((byte)2));
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Inversa Diagonal Superior----------------------------------------");
        System.out.println(""+ge.invDiagonalSup((byte)1));
        System.out.println(""+ge.invDiagonalSup((byte)2));
        System.exit(0);
        
        
    }
    
}
