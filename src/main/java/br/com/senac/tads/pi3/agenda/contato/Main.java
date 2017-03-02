/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tads.pi3.agenda.contato;

import br.com.senac.tads.pi3.agenda.dao.ContatoDao;

import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author Vinicius
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        ContatoDao dao = new ContatoDao();
        
        /*List<Contato> minhaLista = Contato.getLista();
        
        for (Contato contato : minhaLista) {
            System.out.println("Nome: "+ contato.getNome());
            System.out.println("Email: "+ contato.getEmail());
            System.out.println("Telefone: "+ contato.getTelefone());
        }*/
        
        Contato contato = new Contato();
        contato.setId(Long.valueOf(4));
        dao.remove(contato);
        }
    }
    
    


