package com.example.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.example.model.Pessoa;
import com.example.repository.PessoaRepository;

@Stateless
public class PessoaService {
    @Inject
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.listarPessoas();
    }

    public void salvarPessoa(Pessoa pessoa) {
        pessoaRepository.salvarPessoa(pessoa);
    }

    public void excluirPessoa(Long pessoaId) {
        pessoaRepository.excluirPessoa(pessoaId);
    }
}

