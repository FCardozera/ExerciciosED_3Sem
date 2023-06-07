package exercicios.marco2.trabalhoT2;

public class Pilha {
    private Object[] pilha;
    private int numElementos;

    public Pilha(int tamanhoPilha) {
        this.pilha = new Object[tamanhoPilha];
        this.numElementos = 0;
    }

    public boolean push(Object info) {
        if (this.numElementos == pilha.length) {
            System.out.println("Stack overflow");
            return false;
        }
        this.pilha[this.numElementos] = info;
        this.numElementos++;
        return true;
    }

    public Object pop() {
        Object info = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        info = this.pilha[numElementos-1];
        this.pilha[numElementos - 1] = null;
        this.numElementos--;
        return info;
    }

    public boolean isEmpty() {
        if (this.numElementos == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return numElementos;
    }

    public Object top() {
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        return this.pilha[numElementos - 1];
    }

    // Exercício 03 - Método de impressão de pilha
    public String toString() {
        String retorno = "";

        if (numElementos == 0) {
            return "Lista Vazia!";
        }
        for (int i = 0; i < numElementos; i++) {
            retorno += "[" + this.pilha[i] + "] ";
        }
        return retorno;
    }

    // Exercício 01 - Função de verificar se palavra é palíndromo - PILHA DEVE ESTAR VAZIA
    public boolean verificaPalindromo(String palavra) {
        if (this.isEmpty()) {
            String aux = "";
            //Monta a pilha com a palavra
            for (int i = 0; i < palavra.length(); i++) {
                this.push(palavra.charAt(i));
                System.out.println(this.toString()); // Mostra o estado atual da pilha
            }
            // Desmonta a pilha colocando os valores em ums String auxiliar que será utilizada para comparação
            for (int i = 0; i < palavra.length(); i++) {
                aux += this.pop();
                System.out.println(this.toString()); // Mostra o estado atual da pilha
            }
            //verifica se o auxiliar é igual a palavra parâmetro
            if (palavra.equals(aux)) {
                return true;
            }
            return false;
        } else {
            System.out.println("Pilha deve estar vazia para realizar essa verificação");
            return false;
        }
    }
}
