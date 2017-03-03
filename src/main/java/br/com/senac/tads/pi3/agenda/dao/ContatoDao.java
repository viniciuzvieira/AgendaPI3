/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tads.pi3.agenda.dao;

import br.com.senac.tads.pi3.agenda.contato.Contato;
import br.com.senac.tads.pi3.agenda.db.CriaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Vinicius
 */
public class ContatoDao {
    
    private Connection conexao;
    
    public ContatoDao() throws SQLException{
        this.conexao = CriaConexao.getConexao(); //cria conexao para o contato
    }
    
    public void adiciona(Contato c1) throws SQLException{
        String sql = "insert into contato(Nome, DataDeNascimento, Email, Telefone)"+
                "values (?,?,?,?)";
        //prepara conexao, execusao do java para o sql
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        //seta os valores
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getData());
        stmt.setString(3, c1.getEmail());
        stmt.setString(4, c1.getTelefone());
        //executa
        stmt.execute();
        stmt.close();
    }
    
    public List<Contato> getLista(String nome) throws SQLException{
        String sql = "select * from contato where nome like ?";
        //faz a string dentro do sql
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();
        
        List<Contato> minhaLista= new ArrayList<Contato>();
        
        //enquanto existe proximo, adicione
        while(rs.next()){
            Contato c1 = new Contato();
            c1.setNome(rs.getString("Nome"));
            c1.setData(rs.getString("DataDeNascimento"));
            c1.setEmail(rs.getString("Email"));
            c1.setTelefone(rs.getString("Telefone"));
            minhaLista.add(c1);
        }
        
        rs.close();
        stmt.close();
        return minhaLista;
    }
    
    public void altera(Contato c1) throws SQLException{
        String sql = "update contato set Nome=?, DataDeNascimento=?, Email=?, Telefone=?, DataAtualiza = NOW() where id=?"; 
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        //seta os valores
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getData());
        stmt.setString(3, c1.getEmail());
        stmt.setString(4, c1.getTelefone());
        stmt.setLong(6, c1.getId()); //pega ID
        //executa
        stmt.execute();
        stmt.close();
        
    }
    
    public void remove(Contato c1) throws SQLException{
        String sql = "delete from contato where id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setLong(1, c1.getId());
        stmt.execute();
        stmt.close();
    }

    
}

