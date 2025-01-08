package com.alura.foroHub.domain.topico;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ITopicoRepsoitory extends JpaRepository<Topico, Long> {


    @Query("SELECT t.status FROM Topico t WHERE t.id = :idTopico")
    boolean findStatusById(Long idTopico);

}
