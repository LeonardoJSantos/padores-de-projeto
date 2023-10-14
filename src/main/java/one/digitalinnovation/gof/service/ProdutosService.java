package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Produtos;

public interface ProdutosService {
    Iterable<Produtos> buscarTodos();

    Produtos buscarPorId(Long id);

    void inserir(Produtos produtos);

    void atualizar(Long id, Produtos produtos);

    void deletar(Long id);

    }

