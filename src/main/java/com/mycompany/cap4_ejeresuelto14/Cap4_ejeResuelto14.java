package com.mycompany.cap4_ejeresuelto14;
import java.util.Scanner;
public class Cap4_ejeResuelto14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int VD1,VD2,VD3,SALAR,TOTVEN;
        float PORVEN,SALAR1,SALAR2,SALAR3;
        
        System.out.println("dame las ventas del departamento 1");
        VD1 = entrada.nextInt();
        System.out.println("dame las ventas del departamento 2");
        VD2 = entrada.nextInt();
        System.out.println("dame las ventas del departamento 3");
        VD3 = entrada.nextInt();
        System.out.println("dame salario de los vendedores");
        SALAR = entrada.nextInt();
        TOTVEN = VD1+VD2+VD3;
        PORVEN =(float) 0.3*TOTVEN;
        
        if (VD1 > PORVEN){
            SALAR1 =(float) (SALAR+(0.2* SALAR));
        }else{
            SALAR1 = SALAR;
        }
        if (VD2 > PORVEN){
            SALAR2 = (float)(SALAR+(0.2*SALAR));
        }else{
            SALAR2 = SALAR;
        }
        if (VD3 > PORVEN){
            SALAR3 = (float) (SALAR+(0.2*SALAR));
        }else{
            SALAR3 = SALAR;
        }
        System.out.println("SALARIO VENDEDORES DEPTO. 1: "+ SALAR1+"\n"+ " SALARIO VENDEDORES DEPTO. 2: "+ SALAR2 +"\n"+ "SALARIO VENDEDORES DEPTO. 3: "+ SALAR3);
    }
}
