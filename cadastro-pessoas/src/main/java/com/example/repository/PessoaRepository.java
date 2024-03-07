package com.example.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.model.Pessoa;

import java.util.List;

@Stateless
public class PessoaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Pessoa> listarPessoas() {
        return entityManager.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
    }

    public void salvarPessoa(Pessoa pessoa) {
        entityManager.persist(pessoa);
    }

    public void excluirPessoa(Long pessoaId) {
        Pessoa pessoa = entityManager.find(Pessoa.class, pessoaId);
        if (pessoa != null) {
            entityManager.remove(pessoa);
        }
    }

}
