package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Produtos;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("Produtos")
public class ProdutosRestController {



        @Autowired
        private ProdutosService produtosService;

        @GetMapping
        public ResponseEntity<Iterable<Produtos>> buscarTodos() {
            return ResponseEntity.ok(produtosService.buscarTodos());
        }

        @GetMapping("/{id}")
        public ResponseEntity<Produtos> buscarPorId(@PathVariable Long id) {
            return ResponseEntity.ok(produtosService.buscarPorId(id));
        }

        @PostMapping
        public ResponseEntity<Produtos> inserir(@RequestBody Produtos produtos) {
            produtosService.inserir(produtos);
            return ResponseEntity.ok(produtos);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Produtos> atualizar(@PathVariable Long id, @RequestBody Produtos produtos) {
            produtosService.atualizar(id, produtos);
            return ResponseEntity.ok(produtos);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deletar(@PathVariable Long id) {
            produtosService.deletar(id);
            return ResponseEntity.ok().build();
        }
}
