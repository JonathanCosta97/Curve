/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.telas;

import br.com.DAO.produtoDAO;
import br.com.DAO.usuarioDAO;
import br.com.Tables.ProdutoTableModel;
import br.com.modelo.Produtos;
import br.com.modelo.Usuarios;
import javax.swing.JOptionPane;

public class Painel_Principal extends javax.swing.JFrame {
    
    Usuarios u = new Usuarios();
    usuarioDAO udao = new usuarioDAO();
    
     Produtos produtos = new Produtos();
     produtoDAO pdao = new produtoDAO();
 
    
    public Painel_Principal() {
        initComponents();
        exibirProdutos();
        
    }
    
    public void exibirProdutos(){
        
        produtoDAO dao = new produtoDAO();
        ProdutoTableModel model = new ProdutoTableModel(dao.listarProdutos());
        tblProdutos.setModel(model);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Barra_Lateral = new javax.swing.JPanel();
        btnCadastrarProduto = new javax.swing.JLabel();
        btnRemoverProduto = new javax.swing.JLabel();
        btnEditarProduto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        boas_vindas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnSair = new javax.swing.JLabel();
        btnConfig = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Painel Principal");
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\Logo2.png")); // NOI18N

        Barra_Lateral.setBackground(new java.awt.Color(255, 255, 255));
        Barra_Lateral.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(232, 138, 69), 2, true));

        btnCadastrarProduto.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\icons\\Cadastrar Produto.png")); // NOI18N
        btnCadastrarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarProdutoMouseClicked(evt);
            }
        });

        btnRemoverProduto.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\icons\\Remover Produto.png")); // NOI18N
        btnRemoverProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverProdutoMouseClicked(evt);
            }
        });

        btnEditarProduto.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\icons\\Editar Produto.png")); // NOI18N
        btnEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarProdutoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Barra_LateralLayout = new javax.swing.GroupLayout(Barra_Lateral);
        Barra_Lateral.setLayout(Barra_LateralLayout);
        Barra_LateralLayout.setHorizontalGroup(
            Barra_LateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_LateralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemoverProduto)
                .addGap(20, 20, 20))
            .addGroup(Barra_LateralLayout.createSequentialGroup()
                .addGroup(Barra_LateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Barra_LateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrarProduto))
                    .addGroup(Barra_LateralLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Barra_LateralLayout.setVerticalGroup(
            Barra_LateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_LateralLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnCadastrarProduto)
                .addGap(47, 47, 47)
                .addComponent(btnRemoverProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnEditarProduto)
                .addGap(19, 19, 19))
        );

        jPanel1.setBackground(new java.awt.Color(231, 203, 182));

        boas_vindas.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        boas_vindas.setText("Bem - Vindo Usuario");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Sistema de Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boas_vindas)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(boas_vindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

        tblProdutos.setAutoCreateRowSorter(true);
        tblProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "N° Barra", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        tblProdutos.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tblProdutos.setRowHeight(30);
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setResizable(false);
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblProdutos.getColumnModel().getColumn(3).setResizable(false);
            tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        btnSair.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\icons\\sair.png")); // NOI18N
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        btnConfig.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\icons\\configurações.png")); // NOI18N
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });

        btnAtualizar.setIcon(new javax.swing.ImageIcon("E:\\Documentos\\Photoshop CC\\UI Design\\Desktop\\Curve\\icons\\Refresh.png")); // NOI18N
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Barra_Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar)
                        .addGap(26, 26, 26)
                        .addComponent(btnConfig)
                        .addGap(27, 27, 27)
                        .addComponent(btnSair)
                        .addGap(18, 18, 18))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSair)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAtualizar)
                                .addComponent(btnConfig))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Barra_Lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        JOptionPane.showMessageDialog(null, "Função indisponivel no momento.!");
    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseClicked
       exibirProdutos();
    }//GEN-LAST:event_btnAtualizarMouseClicked

    private void btnCadastrarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoMouseClicked
        Cad_Produto cp = new Cad_Produto();
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarProdutoMouseClicked

    private void btnRemoverProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverProdutoMouseClicked
        
        int linha = tblProdutos.getSelectedRow();
        
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para Excluir.");
        
        }else if(JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o dado da tabela ?","Excluir", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION){
            
            produtos = pdao.pesquisarProdutoID((int) tblProdutos.getValueAt(linha, 0));
            pdao.deletarProduto(produtos);
            exibirProdutos();
            JOptionPane.showMessageDialog(null, "Produto excluido com Sucesso!");
        }
        
    }//GEN-LAST:event_btnRemoverProdutoMouseClicked

    private void btnEditarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProdutoMouseClicked
        
        int linha = tblProdutos.getSelectedRow();
        
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para Editar.");
            
        }else {
            
            produtos = pdao.pesquisarProdutoID((int) tblProdutos.getValueAt(linha, 0));
            Cad_Produto cp = new Cad_Produto();
            cp.p = produtos;
            cp.atualizarCampos();
            cp.setVisible(true);
            dispose();
        }
            
    }//GEN-LAST:event_btnEditarProdutoMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel_Principal().setVisible(false);
               
            }
        });
    }
    
     public void recuperarNomeUsuario(String nome){
         boas_vindas.setText("Bem - Vindo "+nome);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_Lateral;
    private javax.swing.JLabel boas_vindas;
    private javax.swing.JLabel btnAtualizar;
    private javax.swing.JLabel btnCadastrarProduto;
    private javax.swing.JLabel btnConfig;
    private javax.swing.JLabel btnEditarProduto;
    private javax.swing.JLabel btnRemoverProduto;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables

    /**
     * @param nomeUsario the nomeUsario to set
     */
   

    void setNomeUsario(Usuarios usuarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
