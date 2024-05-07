package br.Insper.AluguelDeBicicletas.Aluguel;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {

    List<Aluguel> findByBicicleta(Integer bicicleta);
    List<Aluguel> findByStatus(String status);

}