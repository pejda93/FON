package rentacar.ui.form.logedin;

import rentacar.domain.CarModel;
import rentacar.domain.ContractsModel;
import rentacar.domain.UserModel;
import rentacar.domain.response.LoginResponseModel;
import rentacar.repository.ContractRepository;
import rentacar.repository.impl.ContractRepositoryImpl;

import rentacar.repository.impl.UserRepositoryImpl;
import rentacar.ui.form.profile.ChangePassword;
import rentacar.ui.session.MySession;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import rentacar.ui.form.MainForm;
import rentacar.ui.form.Rented.RentedCarsForm;
import rentacar.ui.form.car.AddCar;
import rentacar.ui.form.car.CarSearchForm;
import rentacar.ui.form.car.UpdateCar;
import rentacar.ui.form.contracts.ContractsForm;

/**
 *
 * @author mlade
 */
public class MainLogedInForm extends javax.swing.JFrame {

    LoginResponseModel logedin = MySession.getInstance().getLoginUser();
    boolean admin = new UserRepositoryImpl().isAdmin(Integer.parseInt(logedin.getUserId()));
    HashMap<CarModel, ContractsModel> cars;

    /**
     * Creates new form MainForm
     */
    public MainLogedInForm() {
        initComponents();
        
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        populateTableUsersCars();
        
        jmAdminTools.setVisible(admin);

        btnDelete.setVisible(false);// Dok se ne implementira metoda za brisanje ugovora
        btnDelete.setEnabled(false);
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
        tblUsersCars = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProfile = new javax.swing.JMenu();
        jmChangePassword = new javax.swing.JMenuItem();
        jmSignOut = new javax.swing.JMenuItem();
        jmCars = new javax.swing.JMenu();
        jmCarsSearch = new javax.swing.JMenuItem();
        jmOccupation = new javax.swing.JMenuItem();
        jmAdminTools = new javax.swing.JMenu();
        jmAddNewCar = new javax.swing.JMenuItem();
        jmUpdateCar = new javax.swing.JMenuItem();
        jmAllContracts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Rented cars"));

        tblUsersCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Make", "Model", "Start date", "End date", "Total price", "Approved"
            }
        ));
        tblUsersCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsersCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsersCars);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jmProfile.setText("Profile");

        jmChangePassword.setText("Change Password");
        jmChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmChangePasswordActionPerformed(evt);
            }
        });
        jmProfile.add(jmChangePassword);

        jmSignOut.setText("Sign out");
        jmSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSignOutActionPerformed(evt);
            }
        });
        jmProfile.add(jmSignOut);

        jMenuBar1.add(jmProfile);

        jmCars.setText("Cars");

        jmCarsSearch.setText("Search");
        jmCarsSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCarsSearchActionPerformed(evt);
            }
        });
        jmCars.add(jmCarsSearch);

        jmOccupation.setText("Car Occupancy Calendar");
        jmOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOccupationActionPerformed(evt);
            }
        });
        jmCars.add(jmOccupation);

        jMenuBar1.add(jmCars);

        jmAdminTools.setText("Admin tools");

        jmAddNewCar.setText("Add new car");
        jmAddNewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAddNewCarActionPerformed(evt);
            }
        });
        jmAdminTools.add(jmAddNewCar);

        jmUpdateCar.setText("Update car");
        jmUpdateCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUpdateCarActionPerformed(evt);
            }
        });
        jmAdminTools.add(jmUpdateCar);

        jmAllContracts.setText("All contracts");
        jmAllContracts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAllContractsActionPerformed(evt);
            }
        });
        jmAdminTools.add(jmAllContracts);

        jMenuBar1.add(jmAdminTools);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSignOutActionPerformed
        MySession logedin = MySession.getInstance();
        logedin.signOut();

        dispose();

        JFrame MainForm = new MainForm();
        MainForm.setVisible(true);

    }//GEN-LAST:event_jmSignOutActionPerformed

    private void jmCarsSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCarsSearchActionPerformed
         new CarSearchForm(this, true).setVisible(true);
    }//GEN-LAST:event_jmCarsSearchActionPerformed

    private void jmChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmChangePasswordActionPerformed
        new ChangePassword(this,true).setVisible(true);
    }//GEN-LAST:event_jmChangePasswordActionPerformed

    private void jmOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOccupationActionPerformed
        new RentedCarsForm(this,true).setVisible(true);
    }//GEN-LAST:event_jmOccupationActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblUsersCars.getSelectedRow();

        int contractId = (int) cars.values().toArray()[selectedRow];

        //TODO napisi metodu u ContractRepositoryImpl koja ce brisati ugovor sa odredjenim id-em.

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblUsersCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsersCarsMouseClicked
        //btnDelete.setEnabled(true);

    }//GEN-LAST:event_tblUsersCarsMouseClicked

    private void jmAddNewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAddNewCarActionPerformed
        new AddCar(this, true).setVisible(true);
    }//GEN-LAST:event_jmAddNewCarActionPerformed

    private void jmUpdateCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUpdateCarActionPerformed
        new UpdateCar(this,true).setVisible(true);
    }//GEN-LAST:event_jmUpdateCarActionPerformed

    private void jmAllContractsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAllContractsActionPerformed
        

        new ContractsForm(this, true).setVisible(true);
    }//GEN-LAST:event_jmAllContractsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmAddNewCar;
    private javax.swing.JMenu jmAdminTools;
    private javax.swing.JMenuItem jmAllContracts;
    private javax.swing.JMenu jmCars;
    private javax.swing.JMenuItem jmCarsSearch;
    private javax.swing.JMenuItem jmChangePassword;
    private javax.swing.JMenuItem jmOccupation;
    private javax.swing.JMenu jmProfile;
    private javax.swing.JMenuItem jmSignOut;
    private javax.swing.JMenuItem jmUpdateCar;
    private javax.swing.JTable tblUsersCars;
    // End of variables declaration//GEN-END:variables

    private void populateTableUsersCars() {


        ContractRepository contractRepository = new ContractRepositoryImpl();
        cars = contractRepository.getAllUserContractsForUser(logedin.getUserId());

        DefaultTableModel dtm = (DefaultTableModel) tblUsersCars.getModel();

        for (Map.Entry<CarModel, ContractsModel> entry :
                cars.entrySet()) {

            CarModel car = entry.getKey();
            ContractsModel contract = entry.getValue();

            Object[] rowData = {car.getMake(), car.getModel(), contract.getStart_date(), contract.getEnd_date(), contract.getTotal_price(), contract.isApproved()};
            dtm.addRow(rowData);
        }
    }
}
