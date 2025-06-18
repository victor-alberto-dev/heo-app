/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heoApp;

public class Exame extends Registro{
    private String nomeMedico;

    public Exame(String nome, String dataExame) {
        super(nome, dataExame);
    }

    @Override
    public void exibir() {
        System.out.println("Exame: " + getNome() + " | Data: " + getData() + " | Médico: " + nomeMedico);
    }
    
     @Override
    public String toCsv() {
        return "Exame;" + getNome() + ";" + getData() + ";" + nomeMedico;
    }
}
