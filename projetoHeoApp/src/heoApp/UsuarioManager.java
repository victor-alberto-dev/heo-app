/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heoApp;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class UsuarioManager {
    private ArrayList<Usuario> usuarios;

    public UsuarioManager() {
        this.usuarios = new ArrayList<>();
    }

    public boolean adicionarUsuario(Usuario u) {
        for (Usuario existente : usuarios) {
        if (existente.getEmail().equalsIgnoreCase(u.getEmail())) {
                return false;
            }
        }
        usuarios.add(u);
        return true;
    }
    
    public boolean removerUsuario(String email) {
        for (int i = usuarios.size() - 1; i >= 0; i--) {
            if (usuarios.get(i).getEmail().equalsIgnoreCase(email)) {
                usuarios.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Usuario getUsuarioPorEmail(String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return new ArrayList<>(this.usuarios);
    }
    
    public boolean editarUsuario(String emailOriginal, String novoEmail, String novaSenha) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(emailOriginal)) {
                u.setEmail(novoEmail);
                u.setSenha(novaSenha);
                return true;
            }
        }
        return false;
    }
    
    public Usuario autenticar(String email, String senha) {
        for (Usuario u : this.usuarios) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }
    
    //Gravação de Arquivos em CSV
    public void salvarEmCSV(String caminhoArquivo) {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            for (Usuario u : usuarios) {
                writer.append(u.getEmail())
                    .append(",")
                    .append(u.getSenha())
                    .append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void carregarDeCSV(String caminhoArquivo) {
        usuarios.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length == 2) {
                    usuarios.add(new Usuario(dados[0], dados[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
