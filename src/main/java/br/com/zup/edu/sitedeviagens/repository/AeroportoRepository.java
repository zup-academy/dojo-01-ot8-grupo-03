package br.com.zup.edu.sitedeviagens.repository;

import br.com.zup.edu.sitedeviagens.model.Aeroporto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AeroportoRepository extends JpaRepository<Aeroporto, Long> {
    Aeroporto findFirstByNome(String pais);
}
