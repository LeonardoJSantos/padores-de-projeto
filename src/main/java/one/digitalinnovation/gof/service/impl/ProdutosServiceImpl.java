package one.digitalinnovation.gof.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Produtos; // Alterar de Cliente para Produto
import one.digitalinnovation.gof.model.Produtosrepository; // Alterar de ClienteRepository para ProdutoRepository
import one.digitalinnovation.gof.model.Endereco; // Alterar de Endereco para Produto
import one.digitalinnovation.gof.model.EnderecoRepository; // Alterar de EnderecoRepository para ProdutoRepository
import one.digitalinnovation.gof.service.ProdutosService; // Alterar de ClienteService para ProdutoService
import one.digitalinnovation.gof.service.ViaCepService;

@Service
public abstract class ProdutosServiceImpl implements ProdutosService { 

    @Autowired
    private Produtosrepository produtoRepository; 
    @Autowired
    private Produtosrepository produtosrepository; 

    @Override
    public Iterable<Produtos> buscarTodos() { 
        return produtoRepository.findAll();
    }

    @Override
    public Produtos buscarPorId(Long id) { 
        return produtoRepository.findById(String.valueOf(id)).orElse(null);
    }



    @Override
    public void atualizar(Long id, Produtos produtos) { // Alterar de Cliente para Produto
        // Atualizar Produto por ID, caso exista:
        Produtos produtoBd = produtosrepository.findById(String.valueOf(id)).orElse(null);
        if (produtoBd != null) {
            salvarProduto(produtos); // Alterar o nome do método
        }
    }

    private void salvarProduto(Produtos produtos) {
    }

    @Override
    public void deletar(Long id) { // Alterar de Cliente para Produto
        produtosrepository.deleteById(String.valueOf(id));
    }


}
