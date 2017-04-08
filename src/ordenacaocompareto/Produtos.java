
package ordenacaocompareto;

import java.util.Objects;


public class Produtos implements Comparable <Produtos>{
    
    private String ID;
    private String nome;
    private Double preco;

    public Produtos(String ID, String nome, double preco) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
    }

    public Produtos() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produtos other = (Produtos) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Produtos outroObjeto) {

        return this.ID.compareTo(outroObjeto.getID());
    }

    @Override
    public String toString() {
        return "\nID: " + this.ID
                + "\nNome: " + this.nome
                + "\nPreco: " + this.preco;
}
    
    
}
