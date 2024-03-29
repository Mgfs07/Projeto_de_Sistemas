/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhoprojetosistema;

import com.mycompany.trabalhoprojetosistema.domain.Aeronave;
import com.mycompany.trabalhoprojetosistema.domain.Dropdown;
import com.mycompany.trabalhoprojetosistema.domain.Fabricante;
import com.mycompany.trabalhoprojetosistema.repository.AeronaveRepository;
import com.mycompany.trabalhoprojetosistema.repository.FabricanteRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author basis
 */
public class Principal extends javax.swing.JFrame {

    private FabricanteRepository fabricanteRepository = new FabricanteRepository();
    private AeronaveRepository aeronaveRepository = new AeronaveRepository();

    /**
     * Creates new form Principal
     */
    public Principal() throws SQLException {
        initComponents();
        buscarFabricantes();
        buscarAeronaves();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textNomeFabricante4 = new javax.swing.JTextField();
        comboBoxPaisorigem4 = new javax.swing.JComboBox<>();
        salvarFabricante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFabricante = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panelAeronave = new javax.swing.JPanel();
        nomeAeronave = new javax.swing.JLabel();
        fabricante = new javax.swing.JLabel();
        textNomeAeronave = new javax.swing.JTextField();
        comboFabricante = new javax.swing.JComboBox<>();
        panelAeronaveDetalhe = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        spinnerCarga = new javax.swing.JSpinner();
        spinnerPassageiro = new javax.swing.JSpinner();
        spinnerAutonomia = new javax.swing.JSpinner();
        SalvarAeronave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAeronave = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Fabricante"));

        jLabel9.setText("Nome do Fabricante");

        jLabel10.setText("Pais de Origem");

        comboBoxPaisorigem4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alemanha", "Argentina", "Brasil", "Canadá", "Chéquia", "China", "Espanha", "Estados Unidos", "França", "Índia", "Itália", "Japão", "México", "Países Baixos", "Reino Unido", "Rússia", "Suécia" }));
        comboBoxPaisorigem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxPaisorigem4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textNomeFabricante4)
                    .addComponent(comboBoxPaisorigem4, 0, 217, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textNomeFabricante4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboBoxPaisorigem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        salvarFabricante.setText("Salvar");
        salvarFabricante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    salvarFabricanteMouseClicked(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        tableFabricante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fabricante", "Pais "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableFabricante);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvarFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvarFabricante)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Fabricante", jPanel7);

        panelAeronave.setBorder(javax.swing.BorderFactory.createTitledBorder("Aeronave"));

        nomeAeronave.setText("Nome");

        fabricante.setText("Fabricante");

        javax.swing.GroupLayout panelAeronaveLayout = new javax.swing.GroupLayout(panelAeronave);
        panelAeronave.setLayout(panelAeronaveLayout);
        panelAeronaveLayout.setHorizontalGroup(
            panelAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAeronaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fabricante)
                    .addComponent(nomeAeronave))
                .addGap(18, 18, 18)
                .addGroup(panelAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textNomeAeronave)
                    .addComponent(comboFabricante, 0, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAeronaveLayout.setVerticalGroup(
            panelAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAeronaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeAeronave)
                    .addComponent(textNomeAeronave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAeronaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fabricante)
                    .addComponent(comboFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAeronaveDetalhe.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhe"));

        jLabel11.setText("Passageiros");

        jLabel12.setText("Carga");

        jLabel13.setText("Autonomia");

        javax.swing.GroupLayout panelAeronaveDetalheLayout = new javax.swing.GroupLayout(panelAeronaveDetalhe);
        panelAeronaveDetalhe.setLayout(panelAeronaveDetalheLayout);
        panelAeronaveDetalheLayout.setHorizontalGroup(
            panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAeronaveDetalheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(26, 26, 26)
                .addGroup(panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelAeronaveDetalheLayout.setVerticalGroup(
            panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAeronaveDetalheLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spinnerPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(spinnerCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelAeronaveDetalheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(spinnerAutonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        SalvarAeronave.setText("Salvar");
        SalvarAeronave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    SalvarAeronaveActionPerformed(evt);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        tableAeronave.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Aeronave", "Fabricante", "Passageiros", "Qtd Carga", "Autonomia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableAeronave);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(panelAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelAeronaveDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SalvarAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelAeronave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAeronaveDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalvarAeronave)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Aeronave", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxPaisorigem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxPaisorigem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxPaisorigem4ActionPerformed

    private void salvarFabricanteMouseClicked(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_salvarFabricanteMouseClicked
        Fabricante fabricante = new Fabricante();
        String nome = textNomeFabricante4.getText();
        String pais = comboBoxPaisorigem4.getSelectedItem().toString();
        fabricante.setNome(nome);
        fabricante.setPaisOrigem(pais);
        fabricanteRepository.salvar(fabricante);
        buscarFabricantes();
    }//GEN-LAST:event_salvarFabricanteMouseClicked

    private void SalvarAeronaveActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_SalvarAeronaveActionPerformed
        Aeronave aeronave = new Aeronave();
        aeronave.setNome(nomeAeronave.getText());
        aeronave.setQtdPassageiro(Integer.parseInt(spinnerPassageiro.getValue().toString()));
        aeronave.setQtdCarga(Integer.parseInt(spinnerCarga.getValue().toString()));
        aeronave.setQtdAutonomia(Integer.parseInt(spinnerAutonomia.getValue().toString()));
        aeronave.setIdFabricante(idFabricante.get(comboFabricante.getSelectedIndex()));
        aeronaveRepository.salvar(aeronave);
        buscarAeronaves();
        // TODO add your handling code here:


    }//GEN-LAST:event_SalvarAeronaveActionPerformed


    private void buscarFabricantes() throws SQLException {
        List<Fabricante> list = fabricanteRepository.buscarTodos();
        DefaultTableModel tabela = (DefaultTableModel) tableFabricante.getModel();
        tabela.getDataVector().removeAllElements();
        for(Fabricante p : list){
            tabela.addRow(new Object[]{p.getNome(), p.getPaisOrigem(), p.getId()});
        }

        buscarDropdownFabricantes();
    }

    private void buscarAeronaves() throws SQLException {
        List<Aeronave> list = aeronaveRepository.buscarTodos();
        DefaultTableModel tabela = (DefaultTableModel) tableAeronave.getModel();
        tabela.getDataVector().removeAllElements();
        for(Aeronave p : list){
            tabela.addRow(new Object[]{p.getNome(), p.getFabricante().getNome(),
                    p.getQtdPassageiro(), p.getQtdCarga(), p.getQtdAutonomia(), p.getId()});
        }

        buscarDropdownFabricantes();
    }

    Vector<Integer> idFabricante = new Vector<>();

    private void buscarDropdownFabricantes() throws SQLException {
        List<Dropdown> list = fabricanteRepository.buscarDropdown();
        for(Dropdown p : list){
            idFabricante.addElement(p.getValue());
            comboFabricante.addItem(p.getLabel());
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ConexaoBancoDados.connect();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarAeronave;
    private javax.swing.JComboBox<String> comboBoxPaisorigem4;
    private javax.swing.JComboBox<String> comboFabricante;
    private javax.swing.JLabel fabricante;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel nomeAeronave;
    private javax.swing.JPanel panelAeronave;
    private javax.swing.JPanel panelAeronaveDetalhe;
    private javax.swing.JButton salvarFabricante;
    private javax.swing.JSpinner spinnerAutonomia;
    private javax.swing.JSpinner spinnerCarga;
    private javax.swing.JSpinner spinnerPassageiro;
    private javax.swing.JTable tableAeronave;
    private javax.swing.JTable tableFabricante;
    private javax.swing.JTextField textNomeAeronave;
    private javax.swing.JTextField textNomeFabricante4;
    // End of variables declaration//GEN-END:variables
}
