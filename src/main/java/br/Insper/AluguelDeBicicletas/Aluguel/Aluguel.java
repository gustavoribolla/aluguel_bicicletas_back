package br.Insper.AluguelDeBicicletas.Aluguel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.text.DateFormat;
import java.time.LocalDateTime;

@Entity
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime dataInicio;

    private LocalDateTime duracaoViagem;

    private String Origem;

    private String Destino;

    private double KmPercorridos;

    private double precoTotal;

    private String status;

    private

    public Aluguel() {
    }

    public Aluguel(LocalDateTime dataInicio, String origem, String destino, double kmPercorridos, double precoTotal, String status) {
        this.dataInicio = dataInicio;
        this.duracaoViagem = LocalDateTime.now() - dataInicio;
        this.Origem = origem;
        this.Destino = destino;
        KmPercorridos = kmPercorridos;
        this.precoTotal = precoTotal;
        this.status = status;
    }
}



