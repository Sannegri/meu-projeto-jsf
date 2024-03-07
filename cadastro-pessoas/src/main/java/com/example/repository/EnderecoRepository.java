package com.example.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.model.Endereco;

import java.util.List;

@Stateless
public class EnderecoRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Endereco> listarEnderecos() {
        return entityManager.createQuery("SELECT e FROM Endereco e", Endereco.class).getResultList();
    }

    public void salvarEndereco(Endereco endereco) {
        entityManager.persist(endereco);
    }

    public void excluirEndereco(Long enderecoId) {
        Endereco endereco = entityManager.find(Endereco.class, enderecoId);
        if (endereco != null) {
            entityManager.remove(endereco);
        }
    }

}
