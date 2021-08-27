package br.com.zup.edu.sitedeviagens.repository;

import br.com.zup.edu.sitedeviagens.model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  PaisRepository extends JpaRepository<Pais, Long> {

    Pais findFirstByNome(String nome);
}
