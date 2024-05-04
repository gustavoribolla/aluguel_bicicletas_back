package br.Insper.AluguelDeBicicletas.Aluguel;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Entity
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime dataInicio;

    private long duracaoViagem;

    @Column(nullable = false)
    private String origem;

    private String destino;

    private double kmPercorridos;

    @Column(nullable = false)
    private double precoTotal;

    private String status;

    @Column(nullable = false)
    private Integer idBicicleta;

    public Aluguel() {
    }

    public Aluguel(LocalDateTime dataInicio, String origem, String destino, double kmPercorridos, double precoTotal, String status, long duracaoViagem) {
        this.dataInicio = dataInicio;
        this.duracaoViagem = duracaoViagem;
        this.origem = origem;
        this.destino = destino;
        this.kmPercorridos = kmPercorridos;
        this.precoTotal = precoTotal;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public long getDuracaoViagem() {
        return duracaoViagem;
    }

    public void setDuracaoViagem(long duracaoViagem) {
        this.duracaoViagem = duracaoViagem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getKmPercorridos() {
        return kmPercorridos;
    }

    public void setKmPercorridos(double kmPercorridos) {
        this.kmPercorridos = kmPercorridos;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getIdBicliceta() {
        return idBicicleta;
    }

    public void setIdBicliceta(Integer idBicliceta) {
        this.idBicicleta = idBicliceta;
    }
}