/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heoApp;

import java.util.ArrayList;

public class RegistroManager {
    private ArrayList<Vacina> vacinas;
    private ArrayList<Exame> exames;
    private ArrayList<Medico> medicos;
    private FichaMedica fichaMedica;

    public RegistroManager() {
        this.vacinas = new ArrayList<>();
        this.exames = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.fichaMedica = null;
    }
    
    // VACINAS
    public void adicionarVacina(Vacina v) {
        vacinas.add(v);
    }
    
    public void removerVacina(int index) {
        if (index >= 0 && index < vacinas.size()) {
            vacinas.remove(index);
        }
    }
    
    public ArrayList<Vacina> getVacinas() {
        return new ArrayList<>(vacinas);
    }
    
    public boolean editarVacina(String nomeOriginal, String novoNome, String novaData) {
        for (Vacina v : vacinas) {
            if (v.getNome().equalsIgnoreCase(nomeOriginal)) {
                v.setNome(novoNome);
                v.setData(novaData);
                return true;
            }
        }
        return false;
    }
    
    // EXAMES
    public void adicionarExame(Exame e) {
        exames.add(e);
    }

    public void removerExame(int index) {
        if (index >= 0 && index < exames.size()) {
            exames.remove(index);
        }
    }

    public ArrayList<Exame> getExames() {
        return new ArrayList<>(exames);
    }
    
    public boolean editarExame(String nomeOriginal, String novoNome, String novaData) {
        for (Exame e : exames) {
            if (e.getNome().equalsIgnoreCase(nomeOriginal)) {
                e.setNome(novoNome);
                e.setData(novaData);
                return true;
            }
        }
        return false;
    }
    
    // MÉDICOS
    public void adicionarMedico(Medico m) {
        medicos.add(m);
    }

    public void removerMedico(int index) {
        if (index >= 0 && index < medicos.size()) {
            medicos.remove(index);
        }
    }

    public ArrayList<Medico> getMedicos() {
        return new ArrayList<>(medicos);
    }
    
    public boolean editarMedico(String nomeOriginal, String novoNome, String novaEspecialidade) {
        for (Medico m : medicos) {
            if (m.getNome().equalsIgnoreCase(nomeOriginal)) {
                m.setNome(novoNome);
                m.setEspecialidade(novaEspecialidade);
                return true;
            }
        }
        return false;
    }

    // FICHA MÉDICA
    public void setFichaMedica(FichaMedica ficha) {
        this.fichaMedica = ficha;
    }

    public FichaMedica getFichaMedica() {
        return fichaMedica;
    }
    
    public void limparTodos() {
        vacinas.clear();
        exames.clear();
        medicos.clear();
        fichaMedica = null;
    }
}
