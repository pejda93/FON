package rentacar.ui.form.car;

import javax.swing.JOptionPane;
import rentacar.domain.CarModel;
import rentacar.repository.CarRepository;
import rentacar.repository.impl.CarRepositoryImpl;

/**
 *
 * @author mlade
 */
public class UpdateCarForm extends javax.swing.JDialog {
    int id;
    CarRepository carRepository = new CarRepositoryImpl();
    CarModel car;
    /**
     * Creates new form UpdateCarForm
     */
    public UpdateCarForm(java.awt.Frame parent, boolean modal, int id) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.id = id;
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

        jPanel1 = new javax.swing.JPanel();
        lblLicencePlate = new javax.swing.JLabel();
        txtLicencePlate = new javax.swing.JTextField();
        lblMake = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblEngineCapacity = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        lblLastNameError = new javax.swing.JLabel();
        lblDoor = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        lblPower = new javax.swing.JLabel();
        lblAutomatic = new javax.swing.JLabel();
        lblFuel = new javax.swing.JLabel();
        spnYear = new javax.swing.JSpinner();
        spnEngineCapacity = new javax.swing.JSpinner();
        spnDoors = new javax.swing.JSpinner();
        cmbSize = new javax.swing.JComboBox<>();
        spnPower = new javax.swing.JSpinner();
        cmbAutomatic = new javax.swing.JComboBox<>();
        cmbFuel = new javax.swing.JComboBox<>();
        txtModel = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Car add"));

        lblLicencePlate.setText("Licence plate:");

        lblMake.setText("Make:");

        lblModel.setText("Model:");

        lblYear.setText("Year");

        lblEngineCapacity.setText("Engine capacity:");

        lblColor.setText("Color:");

        txtPrice.setText("0");

        lblPrice.setText("Price:");

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblNameError.setText(" ");

        btnAdd.setText("Update");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblLastNameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLastNameError.setText(" ");

        lblDoor.setText("Door:");

        lblSize.setText("Size:");

        lblPower.setText("Power:");

        lblAutomatic.setText("Automatic:");

        lblFuel.setText("Fuel:");

        spnYear.setModel(new javax.swing.SpinnerNumberModel(2023, 1970, 2023, 1));
        spnYear.setEditor(new javax.swing.JSpinner.NumberEditor(spnYear, "0"));

        spnEngineCapacity.setModel(new javax.swing.SpinnerNumberModel(1600, 600, 7000, 100));

        spnDoors.setModel(new javax.swing.SpinnerNumberModel(5, 2, 6, 1));

        cmbSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "s", "l", "m" }));

        spnPower.setModel(new javax.swing.SpinnerNumberModel(90, 45, 1500, 5));

        cmbAutomatic.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No", " " }));
        cmbAutomatic.setSelectedIndex(2);
        cmbAutomatic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cmbFuel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benzin", "Dizel", "Electric", "TNG" }));

        jLabel1.setText("ID:");

        txtID.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(344, 344, 344))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLicencePlate)
                            .addComponent(lblMake)
                            .addComponent(lblModel)
                            .addComponent(lblYear)
                            .addComponent(lblEngineCapacity)
                            .addComponent(lblColor)
                            .addComponent(lblPrice)
                            .addComponent(lblDoor)
                            .addComponent(lblSize)
                            .addComponent(lblPower)
                            .addComponent(lblAutomatic)
                            .addComponent(lblFuel)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMake)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(70, 70, 70))
                            .addComponent(txtLicencePlate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastNameError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnYear)
                            .addComponent(spnEngineCapacity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnDoors)
                            .addComponent(cmbSize, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnPower)
                            .addComponent(cmbAutomatic, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbFuel, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtID))
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicencePlate)
                    .addComponent(txtLicencePlate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(txtMake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(spnYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEngineCapacity)
                    .addComponent(spnEngineCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColor)
                    .addComponent(lblColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice)
                    .addComponent(lblPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoor)
                    .addComponent(spnDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize)
                    .addComponent(cmbSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPower)
                    .addComponent(spnPower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutomatic)
                    .addComponent(cmbAutomatic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFuel)
                    .addComponent(cmbFuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblNameError)
                .addGap(13, 13, 13)
                .addComponent(btnAdd)
                .addGap(11, 11, 11)
                .addComponent(lblLastNameError)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        boolean valid = true;
        boolean add = false;

        String licencePlate = txtLicencePlate.getText().trim();
        String make = txtMake.getText().trim();
        String model = txtModel.getText().trim();
        int year = (int) spnYear.getValue();
        int engineCapacity = (int) spnEngineCapacity.getValue();
        String color = txtColor.getText().trim();
        double price = Double.parseDouble(txtPrice.getText().trim());
        int doors = (int) spnDoors.getValue();
        String size = (String) cmbSize.getSelectedItem();
        int power = (int) spnPower.getValue();

        String automaticText = String.valueOf(cmbAutomatic.getSelectedItem());
        boolean automatic;
        if (automaticText.equals("Yes")) {
            automatic = true;
        }else if(automaticText.equals("No")){
            automatic = false;
        }else{
            automatic = false;
        }

        String fuel = (String) cmbFuel.getSelectedItem();

        CarModel carUpdate = new CarModel(car.getCar_id(),licencePlate,make,model,color,fuel,null,year,engineCapacity,doors,power,price,size,automatic);
        
        //CarRepositoryImpl cri = new CarRepositoryImpl();

        add = true;

        if (add){
            carRepository.update(carUpdate);

            dispose();

            JOptionPane.showMessageDialog(this, "Успешно промењен ауто!");

        }else {
            JOptionPane.showMessageDialog(this, "Неуспешно промењен!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cmbAutomatic;
    private javax.swing.JComboBox<String> cmbFuel;
    private javax.swing.JComboBox<String> cmbSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutomatic;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblDoor;
    private javax.swing.JLabel lblEngineCapacity;
    private javax.swing.JLabel lblFuel;
    private javax.swing.JLabel lblLastNameError;
    private javax.swing.JLabel lblLicencePlate;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblYear;
    private javax.swing.JSpinner spnDoors;
    private javax.swing.JSpinner spnEngineCapacity;
    private javax.swing.JSpinner spnPower;
    private javax.swing.JSpinner spnYear;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        txtID.setText(String.valueOf(this.id));
        txtLicencePlate.setText(car.getLicence_plate());
        txtMake.setText(car.getMake());
        txtModel.setText(car.getModel());
        spnYear.setValue(car.getYear());
        spnEngineCapacity.setValue(car.getEngine_capacity());
        txtColor.setText(car.getColor());
        txtPrice.setText(String.valueOf(car.getPrice()));
        spnDoors.setValue(car.getDoors());
        cmbSize.setSelectedItem(car.getSize());
        spnPower.setValue(car.getPower());
        
        String automatic = String.valueOf(car.isAutomatic());
        
        if (automatic.equals("true")){
            automatic = "Yes";
        }else{
            automatic = "No";
        }
        
        cmbAutomatic.setSelectedItem(automatic);
        cmbFuel.setSelectedItem(car.getFuel().trim());
        //System.out.println("UpdateCarForm car fuel is "+car.getFuel()+"and selected item is "+cmbFuel.getSelectedItem());
    }
}
