
package visao;

import dao.AlunoDAO;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import modelo.Aluno;
import modelo.TabelaAlunoModel;

public class JanelaTabelaAluno extends javax.swing.JFrame {

    public JanelaTabelaAluno() {
        modelo = new TabelaAlunoModel();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bAtualizar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bInserir = new javax.swing.JButton();
        bPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfN1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfN2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        bAtt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        mCor = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Alunos");
        setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setBackground(new java.awt.Color(240, 240, 240));
        jTable1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jTable1.setModel(modelo);
        jTable1.setToolTipText("");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bAtualizar.setMnemonic('u');
        bAtualizar.setText("Atualizar dado de um Aluno");
        bAtualizar.setToolTipText("Clique na tabela o campo que deseja atualizar.");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bRemover.setMnemonic('r');
        bRemover.setText("Remover Aluno");
        bRemover.setToolTipText("Clique aqui para remover.");
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bInserir.setMnemonic('a');
        bInserir.setText("Adicionar Aluno");
        bInserir.setToolTipText("Clique aqui para adicionar.");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        bPesquisar.setMnemonic('p');
        bPesquisar.setText("Pesquisar");
        bPesquisar.setToolTipText("Clique aqui para pesquisar.");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");
        jLabel1.setToolTipText("Digite o nome do Aluno que deseja atualizar");

        jLabel2.setText("Nota 1:");
        jLabel2.setToolTipText("Digite a Nota 1 do aluno que deseja atualizar.");

        jLabel3.setText("Nota 2:");
        jLabel3.setToolTipText("Digite a nota 2 do aluno que deseja atualizar.");

        bAtt.setMnemonic('t');
        bAtt.setText("Atualizar Tabela");
        bAtt.setToolTipText("Clique aqui para atualizar a tabela.");
        bAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAttActionPerformed(evt);
            }
        });

        jLabel4.setText("Id:");

        jLabel5.setText("Alunos já cadastrados no sistema:");

        jButton1.setMnemonic('s');
        jButton1.setText("Sair");
        jButton1.setToolTipText("Clique aqui para sair do sistema.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mCor.setText("Mudar Cor");
        mCor.setToolTipText("Clique aqui para mudar a cor da janela.");
        mCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCorActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Escolha a cor da Janela");
        jMenuItem1.setToolTipText("Selecione a cor desejada clicando aqui.");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mCor.add(jMenuItem1);

        jMenuBar1.add(mCor);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bAtt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(bRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bInserir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfN1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfN2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(bInserir)
                .addGap(11, 11, 11)
                .addComponent(bRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPesquisar)
                .addGap(7, 7, 7)
                .addComponent(bAtt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        TableModel modeloTabela = jTable1.getModel();
        tfId.setText(modelo.getValueAt(linha, 0).toString());
        tfNome.setText(modelo.getValueAt(linha, 1).toString());
        tfN1.setText(modelo.getValueAt(linha, 2).toString());
        tfN2.setText(modelo.getValueAt(linha, 3).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        Aluno aluno = new Aluno();
        AlunoDAO aDAO = new AlunoDAO();
        int linha = jTable1.getSelectedRow();
        TableModel modeloTabela = jTable1.getModel();
        aluno.setId(Integer.parseInt(modelo.getValueAt(linha,0).toString()));
        aluno.setNome(tfNome.getText());
        aluno.setId(Integer.parseInt(tfId.getText()));
        aluno.setN1(Integer.parseInt(tfN1.getText()));
        aluno.setN2(Integer.parseInt(tfN2.getText()));
        aDAO.atualizar(aluno);
        modelo.AtualizarTabela();
        jTable1.setRowSelectionInterval(linha, linha); 
        modelo.fireTableDataChanged();
        limparCampos();
    }//GEN-LAST:event_bAtualizarActionPerformed
    private void limparCampos(){
        tfNome.setText("");
        tfN1.setText("");
        tfN2.setText("");
        tfNome.requestFocus();
    }
    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        JanelaAdd jan1 = new JanelaAdd();
        jan1.setLocationRelativeTo(null);
        jan1.setVisible(true);
    }//GEN-LAST:event_bInserirActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        JanelaRemove jan2 = new JanelaRemove();
        jan2.setLocationRelativeTo(null);
        jan2.setVisible(true);
    }//GEN-LAST:event_bRemoverActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        JanelaPesquisaNome janPesq = new JanelaPesquisaNome();
        janPesq.setLocationRelativeTo(null);
        janPesq.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAttActionPerformed
        modelo.AtualizarTabela();
    }//GEN-LAST:event_bAttActionPerformed

    private void mCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCorActionPerformed
        
    }//GEN-LAST:event_mCorActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Color cor = JColorChooser.showDialog(null, "Escolha a cor de fundo da janela", this.getContentPane().getBackground());
        this.getContentPane().setBackground(cor);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaTabelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaTabelaAluno().setVisible(true);
            }
        });
    }
    
    private TabelaAlunoModel modelo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtt;
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bInserir;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu mCor;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfN1;
    private javax.swing.JTextField tfN2;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
