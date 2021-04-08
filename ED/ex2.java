package PILHAS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex2 {
    public static void main(String args[]){
        
        // ENTRADA DO USUARIO
        double[] entrada = pega_entrada(); 
        Pilha A = new Pilha(entrada.length);
        Pilha B = new Pilha(entrada.length);
        int i = 0;

        while(i < entrada.length){
            if(A.is_empty()){
                A.push(entrada[i]);
                while(!B.is_empty()){
                    A.push(B.pop());
                }
                i++;
            }
            else if(entrada[i] > (double) A.top()){
                B.push(A.pop());
            }
            else if(entrada[i] <= (double) A.top()){
                A.push(entrada[i]);
                while(!B.is_empty()){
                    A.push(B.pop());
                }
                i++;
            }
        }
        while (!A.is_empty()){
            System.out.println(A.pop());// DESIMPILHA OS VALORES NA SAIDA
        }
         
    } 
    static double[] pega_entrada(){
        Scanner s_entrada = new Scanner(System.in);
        String entrada;
        String[] valores;
        
        int i = 0;
        System.out.print("Digite uma sequencia numerica( SEPARE OS VALORES POR ','): ");
        entrada = s_entrada.next();
        valores = entrada.split(",");
        double[] saida = new double[valores.length];
        while(i < valores.length){
            saida[i] = Double.parseDouble(valores[i]);
            i++;
        }
        return saida;
    }
        
}
