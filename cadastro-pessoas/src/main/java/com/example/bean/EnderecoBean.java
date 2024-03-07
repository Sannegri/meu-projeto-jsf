package com.example.bean;

import java.io.Serializable;

import javax.inject.Inject;

import com.example.model.Endereco;
import com.example.service.EnderecoService;

import java.util.List;

public class EnderecoBean implements Serializable {
    private Endereco endereco;
    private List<Endereco> enderecos;

    @Inject
    private EnderecoService enderecoService;

    public void init() {
        endereco = new Endereco();
        enderecos = enderecoService.listarEnderecos();
    }

    public void salvar() {
        enderecoService.salvarEndereco(endereco);
        init();
    }

    public void excluir(Long enderecoId) {
        enderecoService.excluirEndereco(enderecoId);
        init();
    }
}
