/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas.entidade;

/**
 *
 * @author kramer
 */
public class Movimentacao {

    int id;
    int tipo;
    int categoria;
    String data = "current_timestamp";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getPago() {
        return pago;
    }

    public void setPago(char pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return "Movimentacao{" + "id=" + id + ", tipo=" + tipo + ", categoria=" + categoria + ", data=" + data + ", valor=" + valor + ", descricao=" + descricao + ", pago=" + pago + '}';
    }

    public Movimentacao(int id, int tipo, int categoria, double valor, String descricao, char pago) {
        this.id = id;
        this.tipo = tipo;
        this.categoria = categoria;
        this.valor = valor;
        this.descricao = descricao;
        this.pago = pago;
    }

    public Movimentacao(int id, int tipo, int categoria, double valor, char pago) {
        this.id = id;
        this.tipo = tipo;
        this.categoria = categoria;
        this.valor = valor;
        this.pago = pago;
    }

    public Movimentacao() {
    }
    double valor;
    String descricao;
    char pago;
}
