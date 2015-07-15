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

public class GameEngine {
    
    private byte[][] cpCuadricula;    
    public GameEngine(Cuadricula c){
        cpCuadricula = c.getCuadricula();
    }
    public boolean checarVertical(byte color){
        int fichas=0;
        boolean resp=false;
        String linea="";
        for(int c=0;c<7;c++){
            for(int f=0;f<6;f++){
                if(cpCuadricula[f][c]==color){
                    linea+="["+f+","+c+"] ";
                    fichas++;
                    
                    if(fichas>=4){
                        System.out.println(linea);
                        resp=true;
                        break;
                    }
                        
                }
                else{
                    fichas=0;
                    linea="";
                }
            }
            fichas=0;
            if(resp)
                break;
            
        }
        
        return resp;
    }
    public  boolean checarHorizontal(byte color){
        int fichas=0;
        boolean resp=false;
        String linea="";
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                if(cpCuadricula[i][j]==color){
                    linea+="["+i+","+j+"] ";
                    fichas++;
                    
                    if(fichas>=4){
                        System.out.println(linea);
                        resp=true;
                        break;
                    }
                    
                }
                else{
                    linea="";
                    fichas=0;               
                }
            }
            fichas=0;
            if(resp)
                break;
            
        }
        return resp;
    }
    private boolean diagonalPrin(byte color){
        int fichas=0;
        boolean resp=false;
        for(int i=0;i<6;i++){
            if(cpCuadricula[i][i]==color){
                fichas++;
                if(fichas>=4){
                    resp=true;
                    break;
                }
            }
            else{
                fichas=0;
            }
                
        }
        return resp;
    }
    private boolean diagonalInf(byte color){
        int fichas=0;
        boolean resp=false;
        for(int c=1;c<=2;c++){
            for(int i=c;i<6;i++){
                if(cpCuadricula[i][i-1]==color){
                    fichas++;
                    if(fichas>=4){
                        resp=true;
                        break;
                    }
                }else{
                    fichas=0;
                }
                    
            }
            fichas=0;
        }       
        
        return resp;
    }
    private boolean diagonalSup(byte color){
        boolean resp=false;
        int fichas=0;
        for(int c=0;c<3;c++){
            int j=c+1;
            for(int i=0;i<(6-c);i++){
                if(cpCuadricula[i][j++]==color){
                    fichas++;
                    if(fichas>=4){
                        resp=true;                        
                        break;
                    }
                    
                }else{
                    fichas=0;
                }
            }
            fichas=0;
            
        }
        return resp;
    }
    public boolean invDiagonalPrin(byte color){
        boolean resp=false;
        int fichas=0;
        for(int i=5;i>=0;i--){
            if(cpCuadricula[i][5-i]==color){
                fichas++;
                if(fichas>=4){
                    
                    resp=true;
                    break;
                }
                
                
            }else
                fichas=0;
            
        }
        return resp;
    }
    public boolean invDiagonalInf(byte color){
        boolean resp =false;
        int fichas = 0;
        for(int veces=0;veces<3;veces++){
            int c=6;
            for(int i=veces;i<6;i++){
                if(cpCuadricula[i][c--]==color){
                    fichas++;
                    if(fichas>=4){
                        resp=true;                        
                        break;
                    }
                }
                else{
                    fichas=0;
                }
            }
            fichas=0;
            if(resp)
                break;
            
            //System.out.println();
        }

        return resp;        
    }
    public boolean invDiagonalSup(byte color){
        int fichas=0;
        boolean resp = false;
        
        for(int i=0;i<2;i++){
            int c=3+i;
            for(int j=0;j<=3+i;j++){
                if(cpCuadricula[j][c--]==color){
                    fichas++;                    
                    if(fichas>=4){
                        resp=true;
                        break;
                    }
                }else
                    fichas=0;
                //System.out.print("["+j+","+c--+"] ");
                    
            }
            fichas=0;
            if(resp){
                break;
            }
            //System.out.println();
        }
        return resp;
    }
    public boolean checarDiagonal(byte color){
        return diagonalPrin(color)||diagonalInf(color)||diagonalSup(color);        
    }
    public boolean ComprobarGanador(byte color){
        return checarDiagonal(color)||checarVertical(color)||checarHorizontal(color)||invDiagonalPrin(color)||invDiagonalInf(color)||invDiagonalSup(color);
    }
    
}
