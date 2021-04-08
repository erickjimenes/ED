package PILHAS;
import PILHAS.Pilha;

public class ex1 {

   public static void main(String args[]) {
      String palavra = "ANA"; // PALAVRA UTILIZADA
      Pilha palindromo = cria_pilha(palavra); //CRIA UMA PILHA CONTENDO CARACTERES
      Pilha aux = cria_pilha(palavra); //CRIA UMA PILHA CONTENDO CARACTERES
      Pilha saida = new Pilha(palavra.length()); //CRIA UMA PILHA VAZIA
      Object letra;
      Object letra_saida ;

      while (!aux.is_empty()){
         saida.push(aux.pop()); // DESIMPILHA OS VALORES NA SAIDA
      }
      
      while (!saida.is_empty()){
         letra = palindromo.pop(); // ATRIBUI O TOPO DA PILHA A UMA VARIAVEL
         letra_saida = saida.pop(); // ATRIBUI O TOPO DA PILHA A UMA VARIAVEL
         if(!(letra == letra_saida)) break; // VERIFICA SE OS DOIS VALORES SAO IGUAIS
      }

      if (palindromo.top() == null){
         System.out.println("\n [É UM PALIMDROMO]");
      }
      else{
         System.out.println("\n [NÃO É UM PALIMDROMO]");
      }
   }
   // INSERE OS CARACTERES NA PILHA
   static Pilha cria_pilha(String text){
       char[] caracters = text.toCharArray();
       Pilha pilha = new Pilha(caracters.length);
       for(int i = 0; i < caracters.length; i ++){
          pilha.push(caracters[i]);
       }
       return pilha;
   }  

}

