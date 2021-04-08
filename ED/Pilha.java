package PILHAS;


public class Pilha{

    public Object[] pilha;
    public int posicaoPilha;
 
    public Pilha(int tamanho) {
        this.posicaoPilha = -1;
        this.pilha = new Object[tamanho];
    }

    // verifica se a pilha esta vazia
    public boolean is_empty() {
       
        if (this.posicaoPilha < 0) {
            return true;
        }
        return false;
    }

    // retorna o valor que esta no topo da fila
    public Object top() {

        if (this.is_empty()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }

    // retorna um valor da pilha
    public Object pop() {
    
        if (is_empty()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
    
    // adiciona um valor a pilha
    public void push(Object valor) {
    
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
 
 }
