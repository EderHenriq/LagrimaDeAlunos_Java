package com.restaurante.rest.Model;

import com.restaurante.rest.Enum.PedidoStatus;
import jakarta.persistence.*;

@Entity
@Table (name = "pedidos_tbl")

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private Double preco;

    private PedidoStatus pedidoStatus;

    public Pedido() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
