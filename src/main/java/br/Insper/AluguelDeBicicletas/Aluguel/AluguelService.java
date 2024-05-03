package br.Insper.AluguelDeBicicletas.Aluguel;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    public Aluguel inicializarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Aluguel finalizarAluguel(Integer id, Aluguel infosFinais) {
        Optional<Aluguel> op = aluguelRepository.findById(id);
        if (op.isPresent()) {
            Aluguel aluguelAtualizado = op.get();
            aluguelAtualizado.setStatus("Finalizado");
            aluguelAtualizado.setDestino(infosFinais.getDestino());
            aluguelAtualizado.setDuracaoViagem(ChronoUnit.MINUTES.between(aluguelAtualizado.getDataInicio(), LocalDateTime.now()));
            aluguelAtualizado.setKmPercorridos(infosFinais.getKmPercorridos());

            return aluguelRepository.save(aluguelAtualizado);
        }
        else{
            throw new RuntimeException("Aluguel não encontrado");
        }
    }

    public Aluguel excluirAluguel(Integer id) {
        Optional<Aluguel> op = aluguelRepository.findById(id);
        if (op.isPresent()) {
            Aluguel aluguel = op.get();
            aluguelRepository.delete(aluguel);
            return aluguel;
        }
        else{
            throw new RuntimeException("Aluguel não encontrado");
        }
    }

    public List<Aluguel> aluguelPorBicicleta(Integer idBicicleta) {
        return aluguelRepository.findByBicicleta(idBicicleta);
    }
}