/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tads.pi3.agenda.forms;

import br.com.senac.tads.pi3.agenda.contato.Contato;
import br.com.senac.tads.pi3.agenda.dao.ContatoDao;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Vinicius
 */
public class tabela extends javax.swing.JFrame {

    //Colocando a lista na tabela
    DefaultTableModel tmContato = new DefaultTableModel(null, new String[]{"Nome", "Email", "Telefone"});
    List<Contato> contatos;
    ListSelectionModel lsmContato;

    public tabela() {
        initComponents();
        desabilitaDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jbNovo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jtPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabela.setModel(tmContato);
        jTabela.setColumnSelectionAllowed(true);
        jTabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        lsmContato = jTabela.getSelectionModel();
        lsmContato.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    jTabelaLinhaSelecionada(jTabela);
                }
            }
        });

        jScrollPane1.setViewportView(jTabela);
        jTabela.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("E-mail:");

        jbNovo.setText("NOVO");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jButton2.setText("ALTERAR");

        jbExcluir.setText("EXCLUIR");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setText("SALVAR");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jButton5.setText("SAIR");

        jbPesquisar.setText("PESQUISAR");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbExcluir)
                                .addGap(10, 10, 10)
                                .addComponent(jbSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                    .addComponent(jtTelefone))
                                .addGap(139, 139, 139)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtPesquisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbPesquisar)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jButton5)
                    .addComponent(jButton2)
                    .addComponent(jbNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPesquisar)
                    .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        habilitaDados();
        jtNome.setText("");
        jtTelefone.setText("");
        jtEmail.setText("");
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        // se verificaDados for true ele cadastra
        if (verificaDados()) {
            try {
                cadastro();
            } catch (SQLException ex) {
                Logger.getLogger(tabela.class.getName()).log(Level.SEVERE, null, ex);
            }
            desabilitaDados();
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        try {
            listarContatos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no campo de pesquisa" + ex);
        }

    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        try {
            excluirContato();
            mostraPesquisa(contatos);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro no botão de exluir" + ex);
        }

    }//GEN-LAST:event_jbExcluirActionPerformed

    public void excluirContato() throws SQLException {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este contato?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {
            ContatoDao dao = new ContatoDao();
            dao.remove(contatos.get(jTabela.getSelectedRow()));
            mostraPesquisa(contatos);
        }

    }

    public void listarContatos() throws SQLException {
        ContatoDao dao = new ContatoDao();
        contatos = dao.getLista("%" + jtPesquisa.getText() + "%");//pesquisa do nome
        mostraPesquisa(contatos);
    }

    public void cadastro() throws SQLException {
    try{    
        Contato c1 = new Contato();
        c1.setNome(jtNome.getText());
        c1.setTelefone(jtTelefone.getText());
        c1.setEmail(jtEmail.getText());
        ContatoDao dao = new ContatoDao();
        dao.adiciona(c1);
    } catch (SQLExecption ex){
        JOptionPane.showMessageDialog(null, "Erro no metodo cadastro!" + ex);
    }
    }

    public void desabilitaDados() {
        jtNome.setEditable(false);
        jtEmail.setEditable(false);
        jtTelefone.setEditable(false);
    }

    public void habilitaDados() {
        jtNome.setEditable(true);
        jtEmail.setEditable(true);
        jtTelefone.setEditable(true);
    }

    public boolean verificaDados() {
        //se campo Nome e Email não estiverem preenchidos ele não salva
        if (!jtNome.getText().equals("") && !jtEmail.getText().equals("")) {

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Campos Nome ou Email não preenchidos!");
            return false;
        }
    }

    private void jTabelaLinhaSelecionada(JTable tabela) {
        if (jTabela.getSelectedRow() != -1) {
            jtNome.setText(contatos.get(tabela.getSelectedRow()).getNome());
            jtEmail.setText(contatos.get(tabela.getSelectedRow()).getEmail());
            jtTelefone.setText(contatos.get(tabela.getSelectedRow()).getTelefone());
        } else {
            //quando apagar mostrar em branco
            jtNome.setText("");
            jtEmail.setText("");
            jtTelefone.setText("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabela;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesquisa;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables

    private void mostraPesquisa(List<Contato> contatos) {
        //while vai pegar as linhas selecionadas que forem maiores que zero e apagara
        while (tmContato.getRowCount() > 0) {
            tmContato.removeRow(0);
        }
        if (contatos.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum contato cadastrado");
        } else {
            String[] linha = new String[]{null, null, null};
            for (int i = 0; i < contatos.size(); i++) {
                tmContato.addRow(linha);
                tmContato.setValueAt(contatos.get(i).getNome(), i, 0);// campo 1
                tmContato.addRow(linha);
                tmContato.setValueAt(contatos.get(i).getEmail(), i, 1);// campo 2
                tmContato.addRow(linha);
                tmContato.setValueAt(contatos.get(i).getTelefone(), i, 2);// campo 3
            }
        }
    }
}
