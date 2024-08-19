package rentacar.ui.form.Rented;

import com.toedter.calendar.IDateEvaluator;
import rentacar.domain.CarModel;
import rentacar.domain.ContractsModel;
import rentacar.domain.response.LoginResponseModel;
import rentacar.domain.response.RegisterResponseModel;
import rentacar.repository.CarRepository;
import rentacar.repository.impl.CarRepositoryImpl;
import rentacar.repository.impl.ContractRepositoryImpl;
import rentacar.ui.form.Rented.RentedCarsForm;
import rentacar.ui.session.MySession;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author mlade
 */
public class NewRent extends javax.swing.JDialog {

    LoginResponseModel logedin = MySession.getInstance().getLoginUser();
    int id;
    CarRepository carRepository = new CarRepositoryImpl();
    CarModel car;

    LocalDate startDate;
    LocalDate endDate;
    double price;
    

    /**
     * Creates new form NewRent
     */
    public NewRent(java.awt.Frame parent, boolean modal, int id, LocalDate startDate, LocalDate endDate) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
        this.startDate=startDate;
        this.endDate=endDate;
        car = carRepository.getCar(id);
        populateFields();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchByMake = new javax.swing.JTextField();
        lblMake = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        txtSearchByPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtSearchByYear = new javax.swing.JTextField();
        txtSearchByModel = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblDoors = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtDoors = new javax.swing.JTextField();
        txtPower = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        lblPower = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        lblAutomatic = new javax.swing.JLabel();
        lblFuel = new javax.swing.JLabel();
        txtAutomatic = new javax.swing.JTextField();
        txtFuel = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        btnRent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtSearchByMake.setEditable(false);

        lblMake.setText("Make:");

        lblYear.setText("Year:");

        txtSearchByPrice.setEditable(false);

        lblPrice.setText("Price:");

        txtSearchByYear.setEditable(false);

        txtSearchByModel.setEditable(false);

        lblModel.setText("Model:");

        lblColor.setText("Color:");

        lblDoors.setText("Doors:");

        txtColor.setEditable(false);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtDoors.setEditable(false);

        txtPower.setEditable(false);

        txtSize.setEditable(false);
        txtSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSizeActionPerformed(evt);
            }
        });

        lblPower.setText("Power:");

        lblSize.setText("Size:");

        lblAutomatic.setText("Automatic");

        lblFuel.setText("Fuel:");

        txtAutomatic.setEditable(false);
        txtAutomatic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutomaticActionPerformed(evt);
            }
        });

        txtFuel.setEditable(false);

        lblStartDate.setText("Start Date:");

        lblEndDate.setText("End Date:");

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

        btnRent.setText("Rent");
        btnRent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMake)
                    .addComponent(lblPrice)
                    .addComponent(lblStartDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchByMake, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchByPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModel)
                            .addComponent(lblYear)))
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEndDate)
                        .addGap(18, 18, 18)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRent))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSearchByModel, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtSearchByYear, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDoors)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDoors, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtColor))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPower)
                            .addComponent(lblSize))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPower, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtSize))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFuel)
                            .addComponent(lblAutomatic))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFuel, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtAutomatic))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMake)
                        .addComponent(txtSearchByMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblModel)
                        .addComponent(txtSearchByModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblColor)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSize)
                        .addComponent(lblAutomatic)
                        .addComponent(txtAutomatic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtSearchByPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYear)
                            .addComponent(txtSearchByYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoors)
                            .addComponent(txtDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPower)
                            .addComponent(lblFuel)
                            .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblStartDate)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndDate)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRent)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSizeActionPerformed

    private void txtAutomaticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutomaticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutomaticActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void btnRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentActionPerformed
        int results = JOptionPane.showConfirmDialog(this, "Da li zelite da iznajmite auto?", "Iznajmi auto", JOptionPane.YES_NO_OPTION);
        
        if (results == 0) { //Yes
            ContractsModel contractsModel = new ContractsModel(Integer.parseInt(MySession.getInstance().getLoginUser().getUserId()),car.getCar_id(),startDate,endDate,price,true,false);
            ContractRepositoryImpl contract = new ContractRepositoryImpl();
            RegisterResponseModel rrm = contract.add(contractsModel);

            JOptionPane.showMessageDialog(this, rrm.getMessage());
        }else{ //No
            
        }
    }//GEN-LAST:event_btnRentActionPerformed

    private void populateFields() {
        txtAutomatic.setText(String.valueOf(car.isAutomatic()));
        txtColor.setText(car.getColor());
        txtDoors.setText(String.valueOf(car.getDoors()));
        txtFuel.setText(car.getFuel());
        txtPower.setText(String.valueOf(car.getPower()));
        txtSearchByMake.setText(car.getMake());
        txtSearchByModel.setText(car.getModel());

        txtSearchByYear.setText(String.valueOf(car.getYear()));
        txtSize.setText(car.getSize());
        txtStartDate.setText(startDate.toString());
        txtEndDate.setText(endDate.toString());

        int days = (int) startDate.until(endDate, ChronoUnit.DAYS);
        price = car.getPrice()*days;

        txtSearchByPrice.setText(String.valueOf(price));


        
    }

    





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRent;
    private javax.swing.JLabel lblAutomatic;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDoors;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtAutomatic;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtDoors;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JTextField txtPower;
    private javax.swing.JTextField txtSearchByMake;
    private javax.swing.JTextField txtSearchByModel;
    private javax.swing.JTextField txtSearchByPrice;
    private javax.swing.JTextField txtSearchByYear;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}