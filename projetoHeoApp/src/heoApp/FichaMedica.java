/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heoApp;

public class FichaMedica {
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String altura;
    private String peso;
    private String tipoSanguineo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
         return "Nome: " + this.nome + ", Nascimento: " + this.dataNascimento +
               ", Sexo: " + this.sexo + ", Altura: " + this.altura + ", Peso: " + this.peso +
               ", Tipo Sanguíneo: " + this.tipoSanguineo;
    }
    
    public String toCsv() {
        return "Ficha;" + nome + ";" + dataNascimento + ";" + sexo + ";" + altura + ";" + peso + ";" + tipoSanguineo;
    }
    
}
