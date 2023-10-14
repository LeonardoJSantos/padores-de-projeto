package one.digitalinnovation.gof.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
public class Compras {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String produtos;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdutos() {
        return produtos;
    }

    public void setNome(String produtos) {
        this.produtos = produtos;
    }


    private List<Produtos> produtosNoCarrinho;

    public Compras() {
        produtosNoCarrinho = new ArrayList<>();
    }

    public void inserirProduto(Produtos produto) {
        produtosNoCarrinho.add(produto);
    }

    public void retirarProduto(Produtos produto) {
        produtosNoCarrinho.remove(produto);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Produtos produto : produtosNoCarrinho) {
            valorTotal += produto.getValorProduto();
        }
        return valorTotal;
    }
}
