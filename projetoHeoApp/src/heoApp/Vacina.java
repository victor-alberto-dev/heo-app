/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heoApp;

public class Vacina extends Registro{
    public Vacina(String nome, String dataDose) {
        super(nome, dataDose);
    }

    @Override
    public void exibir() {
        System.out.println("Vacina: " + getNome() + " | Data da dose: " + getData());
    }
    
    @Override
    public String toCsv() {
        return "Vacina;" + getNome() + ";" + getData();
    }
}
