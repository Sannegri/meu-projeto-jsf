package com.example.bean;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.example.model.Pessoa;
import com.example.service.PessoaService;

public class PessoaBean implements Serializable {
    private Pessoa pessoa;
    private List<Pessoa> pessoas;

    @Inject
    private PessoaService pessoaService;

    public void init() {
        pessoa = new Pessoa();
        pessoas = pessoaService.listarPessoas();
    }

    public void salvar() {
        pessoaService.salvarPessoa(pessoa);
        init();
    }

    public void excluir(Long pessoaId) {
        pessoaService.excluirPessoa(pessoaId);
        init();
    }
}
