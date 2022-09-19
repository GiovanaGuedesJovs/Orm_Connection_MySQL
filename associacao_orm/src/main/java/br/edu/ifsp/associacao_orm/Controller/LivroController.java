package br.edu.ifsp.associacao_orm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.associacao_orm.Model.Livro;
import br.edu.ifsp.associacao_orm.Repository.LivroRepository;

@RestController
@CrossOrigin
public class LivroController {
    @Autowired
    LivroRepository repo;

    @GetMapping("/livro")
    public List<Livro> recuperaLivros(){
        return (List<Livro>)repo.findAll();
    }

    @PostMapping("/livro")
    public void salvaLivro(@RequestBody Livro livro){
        repo.save(livro);
    }
}