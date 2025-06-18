/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heoApp;

/**
 *
 * @author victo
 */
public abstract class Registro {
    private String nome;
    private String data;

    public Registro(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Registro{" + "nome=" + nome + ", data=" + data + '}';
    }

    public abstract void exibir();
    public abstract String toCsv();
}
