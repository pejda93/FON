package rentacar.ui.form.contracts;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rentacar.domain.CarModel;
import rentacar.domain.ContractsModel;
import rentacar.domain.request.CarSearchModel;
import rentacar.repository.CarRepository;
import rentacar.repository.impl.CarRepositoryImpl;
import rentacar.repository.impl.ContractRepositoryImpl;
import rentacar.repository.impl.UserRepositoryImpl;

/**
 *
 * @author mlade
 */
public class ContractsForm extends javax.swing.JDialog {

    public LocalDate startDate = null;
    public LocalDate endDate = null;

    ContractRepositoryImpl contractRepository = new ContractRepositoryImpl();
    List<ContractsModel> allContracts = contractRepository.getAllContracts();
    List<ContractsModel> allPendingContracts = contractRepository.getAllPendingContracts();
    List<ContractsModel> list = null;

    CarRepositoryImpl carRepository = new CarRepositoryImpl();
    UserRepositoryImpl userRepository = new UserRepositoryImpl();

    /**
     * Creates new form ContractsForm
     */
    public ContractsForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        //list = allContracts;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblContracts = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        lblApproved = new javax.swing.JLabel();
        cmbApproved = new javax.swing.JComboBox<>();
        btnApproveAll = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("All contracts");

        tblContracts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Car ID", "Start date", "End date", "Total price", "Approved"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblContracts);

        btnSearch.setText("Search:");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        lblApproved.setText("Approved");

        cmbApproved.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", " " }));
        cmbApproved.setSelectedIndex(1);
        cmbApproved.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnApproveAll.setText("Approve all");
        btnApproveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAllActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblApproved)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbApproved, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApproveAll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApprove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(lblApproved)
                    .addComponent(cmbApproved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApproveAll)
                    .addComponent(btnApprove)
                    .addComponent(btnDelete))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
       

        
        populateTable();

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        int selectedRow = tblContracts.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Niste izabrali ugovor");
            return;
        }

        int id = list.get(selectedRow).getContract_id();

        int results = JOptionPane.showConfirmDialog(this, "Da li zelite da odobrite iznajmljivanje auta?", "Iznajmljivanje automobila", JOptionPane.YES_NO_OPTION);

        if (results == 0) { //Yes
            
            contractRepository.ContractApproval(true, String.valueOf(id));

            JOptionPane.showMessageDialog(this, "Contract ID = "+id+" je appruvan");
        }else{ //No

        }
        
        
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnApproveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAllActionPerformed
        
        
        int results = JOptionPane.showConfirmDialog(this, "Da li zelite da odobrite iznajmljivanje svih auta?", "Iznajmljivanje automobila", JOptionPane.YES_NO_OPTION);

        if (results == 0) { //Yes
            
            contractRepository.ApproveAllContracts();

            JOptionPane.showMessageDialog(this, "Svi ugovori su appruvani");
        }else{ //No

        }
        
        populateTable();
    }//GEN-LAST:event_btnApproveAllActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblContracts.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Niste izabrali ugovor");
            return;
        }

        int id = list.get(selectedRow).getContract_id();

        int results = JOptionPane.showConfirmDialog(this, "Da li zelite da izbrisetze iznajmljivanje auta?", "Iznajmljivanje automobila", JOptionPane.YES_NO_OPTION);

        if (results == 0) { //Yes

            contractRepository.ContractApproval(false, String.valueOf(id));

            JOptionPane.showMessageDialog(this, "Contract ID = "+id+" je izbrisan");
        }else{ //No

        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnApproveAll;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbApproved;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApproved;
    private javax.swing.JTable tblContracts;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblContracts.getModel();
        dtm.setRowCount(0);
        
        List<ContractsModel> allContracts = contractRepository.getAllContracts();
        List<ContractsModel> allPendingContracts = contractRepository.getAllPendingContracts();
        
        String approvedText = String.valueOf(cmbApproved.getSelectedItem());
        
        if (approvedText.equals("No")){
            list = allPendingContracts;
        }else{
            list = allContracts;
        }

        for (ContractsModel contract
                : list) {

            String approved = String.valueOf(contract.isApproved());

            if (approved.equals("true")) {
                approved = "Yes";
            } else if (approved.equals("false")) {
                approved = "No";
            } else {
                approved = null;
            }

            Object[] rowData = {contract.getUser_id(), contract.getCar_id(), contract.getStart_date(), contract.getEnd_date(), contract.getTotal_price(), approved};
            dtm.addRow(rowData);
        }
    }
}