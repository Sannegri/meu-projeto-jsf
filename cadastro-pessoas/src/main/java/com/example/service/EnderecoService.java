package com.example.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.example.model.Endereco;
import com.example.repository.EnderecoRepository;

@Stateless
public class EnderecoService {
    
	@Inject
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listarEnderecos() {
        return enderecoRepository.listarEnderecos();
    }

    public void salvarEndereco(Endereco endereco) {
        enderecoRepository.salvarEndereco(endereco);
    }

    public void excluirEndereco(Long enderecoId) {
        enderecoRepository.excluirEndereco(enderecoId);
    }
}

