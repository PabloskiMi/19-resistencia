/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.rb_Oro.setSelected(true);

    }

    public String[] getColores() {

        String[] colores = new String[4];

        colores[0] = this.cmb_Banda_01.getSelectedItem().toString();
        colores[1] = this.cmb_Banda_02.getSelectedItem().toString();
        colores[2] = this.cmb_Banda_03.getSelectedItem().toString();

        if (this.rb_Oro.isSelected()) {

            colores[3] = "Oro";
            
            this.panel_Color_04.setBackground(new Color(128,128,0));

        } else if (this.rb_Plata.isSelected()) {

            colores[3] = "Plata";
            
            this.panel_Color_04.setBackground(new Color(192,192,192));

        }

        return colores;

    }

    public double getValor(String[] color) {

        double valor;
        int n1 = 0, n2 = 0, n3 = 0;

        switch (color[0]) {
            case "Negro":

                n1 = 0;
                
                this.panel_Color_01.setBackground(Color.BLACK);

                break;
            case "Cafe":
                
                n1 = 1;
                
                this.panel_Color_01.setBackground(new Color(128,0,0));

                break;
            case "Rojo":
                
                n1 = 2;
                
                this.panel_Color_01.setBackground(Color.RED);

                break;
            case "Naranja":

                n1 = 3;
                
                this.panel_Color_01.setBackground(Color.ORANGE);

                break;
            case "Amarillo":

                n1 = 4;
                
                this.panel_Color_01.setBackground(Color.YELLOW);

                break;
            case "Verde":

                n1 = 5;
                
                this.panel_Color_01.setBackground(Color.GREEN);

                break;
            case "Azul":

                n1 = 6;
                
                this.panel_Color_01.setBackground(Color.BLUE);

                break;
            case "Violeta":

                n1 = 7;
                
                this.panel_Color_01.setBackground(new Color(128,0,128));

                break;
            case "Gris":

                n1 = 8;
                
                this.panel_Color_01.setBackground(Color.GRAY);

                break;
            case "Blanco":

                n1 = 9;

                this.panel_Color_01.setBackground(Color.WHITE);
                
                break;

            default:
                JOptionPane.showMessageDialog(null, "Error");
                break;
        }

        switch (color[1]) {
            case "Negro":

                n2 = 0;
                
                this.panel_Color_02.setBackground(Color.BLACK);

                break;
            case "Cafe":
                
                n2 = 1;
                
                this.panel_Color_02.setBackground(new Color(128,0,0));

                break;
            case "Rojo":
                
                n2 = 2;
                
                this.panel_Color_02.setBackground(Color.RED);

                break;
            case "Naranja":

                n2 = 3;
                
                this.panel_Color_02.setBackground(Color.ORANGE);

                break;
            case "Amarillo":

                n2 = 4;
                
                this.panel_Color_02.setBackground(Color.YELLOW);

                break;
            case "Verde":

                n2 = 5;
                
                this.panel_Color_02.setBackground(Color.GREEN);

                break;
            case "Azul":

                n2 = 6;
                
                this.panel_Color_02.setBackground(Color.BLUE);

                break;
            case "Violeta":

                n2 = 7;
                
                this.panel_Color_02.setBackground(new Color(128,0,128));

                break;
            case "Gris":

                n2 = 8;
                
                this.panel_Color_02.setBackground(Color.GRAY);

                break;
            case "Blanco":

                n2 = 9;
                
                this.panel_Color_02.setBackground(Color.WHITE);

                break;

            default:

                JOptionPane.showMessageDialog(null, "Error");
                break;
        }

        switch (color[2]) {
            case "Negro":
                
                n3 = (concatenarNumero(n1, n2)) * 1;
                
                this.panel_Color_03.setBackground(Color.BLACK);

                break;
            case "Cafe":
                
                n3 = (concatenarNumero(n1, n2)) * 10;
                
                this.panel_Color_03.setBackground(new Color(128,0,0));

                break;
            case "Rojo":

                n3 = (concatenarNumero(n1, n2)) * 100;
                
                this.panel_Color_03.setBackground(Color.RED);
                
                break;
            case "Naranja":
                
                n3 = (concatenarNumero(n1, n2)) * 1000;
                
                this.panel_Color_03.setBackground(Color.ORANGE);

                break;
            case "Amarillo":
                
                n3 = (concatenarNumero(n1, n2)) * 10000;
                
                this.panel_Color_03.setBackground(Color.YELLOW);

                break;
            case "Verde":
                
                n3 = (concatenarNumero(n1, n2)) * 100000;
                
                this.panel_Color_03.setBackground(Color.GREEN);

                break;
            case "Azul":
                
                n3 = (concatenarNumero(n1, n2)) * 1000000;
                
                this.panel_Color_03.setBackground(Color.BLUE);

                break;
            case "Violeta":
                
                n3 = (concatenarNumero(n1, n2)) * 10000000;
                
                this.panel_Color_03.setBackground(new Color(128,0,128));

                break;
            case "Gris":
                n3 = (concatenarNumero(n1, n2)) * 100000000;
                
                this.panel_Color_03.setBackground(Color.GRAY);

                break;
            case "Blanco":
                
                n3 = (concatenarNumero(n1, n2)) * 1000000000;
                
                this.panel_Color_03.setBackground(Color.WHITE);

                break;

            default:
                JOptionPane.showMessageDialog(null, "Error");
                break;
        }
        
        return n3;

    }
    
    public int concatenarNumero(int n1, int n2){
        
        int n;
        
        n = Integer.valueOf(String.valueOf(n1) + String.valueOf(n2));
        
        return n;
        
    }

    public double getValorMaximo(double valor, String[] color) {

        double valorMaximo;
        int tolerancia = 0;
        double op;
        
        if (color[3].toString().equals("Oro")) {
            
            tolerancia = 5;
            
        } else {
            
            tolerancia = 10;
            
        }
        
        op = valor * tolerancia/100;
        valorMaximo = op + valor;
        
        return valorMaximo;

    }
    
    public double getValorMinimo(double valor, String[] color){
        
        double valorMinimo;
        int tolerancia = 0;
        double op;
        
        if (color[3].toString().equals("Oro")) {
            
            tolerancia = 5;
            
        } else {
            
            tolerancia = 10;
            
        }
        
        op = valor * tolerancia/100;
        valorMinimo = valor - op;
        
        return valorMinimo;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Color = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_Banda_03 = new javax.swing.JComboBox<>();
        cmb_Banda_01 = new javax.swing.JComboBox<>();
        cmb_Banda_02 = new javax.swing.JComboBox<>();
        rb_Plata = new javax.swing.JRadioButton();
        rb_Oro = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        panel_Color_01 = new javax.swing.JPanel();
        panel_Color_02 = new javax.swing.JPanel();
        panel_Color_03 = new javax.swing.JPanel();
        panel_Color_04 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_ValorMinimo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ValorMaximo = new javax.swing.JTextField();
        btn_Calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Color 1:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setText("Color 2:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setText("Color 4:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        cmb_Banda_03.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jPanel2.add(cmb_Banda_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 142, -1));

        cmb_Banda_01.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jPanel2.add(cmb_Banda_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 142, -1));

        cmb_Banda_02.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jPanel2.add(cmb_Banda_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 142, -1));

        buttonGroup_Color.add(rb_Plata);
        rb_Plata.setText("Plata");
        jPanel2.add(rb_Plata, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        buttonGroup_Color.add(rb_Oro);
        rb_Oro.setText("Oro");
        jPanel2.add(rb_Oro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        jLabel4.setText("Color 3:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 260));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        jPanel1.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 142, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        panel_Color_01.setPreferredSize(new java.awt.Dimension(50, 50));
        panel_Color_01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Color_02.setPreferredSize(new java.awt.Dimension(50, 50));
        panel_Color_02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Color_03.setPreferredSize(new java.awt.Dimension(50, 50));
        panel_Color_03.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Color_04.setPreferredSize(new java.awt.Dimension(50, 50));
        panel_Color_04.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panel_Color_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(panel_Color_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panel_Color_03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panel_Color_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_Color_04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Color_03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Color_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Color_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 390, 100));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Valor Mínimo:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 27, -1, -1));
        jPanel4.add(txt_ValorMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 240, -1));

        jLabel6.setText("Valor Máximo:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel4.add(txt_ValorMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 240, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 390, 130));

        btn_Calcular.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btn_Calcular.setText("CALCULAR");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 740, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        
        double valor;
        String [] colores = new String[4];
        
        colores = getColores();
        valor = getValor(colores);
        
        
        this.txt_ValorMaximo.setText(String.valueOf(getValorMaximo(valor, colores)));
        this.txt_ValorMinimo.setText(String.valueOf(getValorMinimo(valor, colores)));
        
    }//GEN-LAST:event_btn_CalcularActionPerformed

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
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Calcular;
    private javax.swing.ButtonGroup buttonGroup_Color;
    private javax.swing.JComboBox<String> cmb_Banda_01;
    private javax.swing.JComboBox<String> cmb_Banda_02;
    private javax.swing.JComboBox<String> cmb_Banda_03;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panel_Color_01;
    private javax.swing.JPanel panel_Color_02;
    private javax.swing.JPanel panel_Color_03;
    private javax.swing.JPanel panel_Color_04;
    private javax.swing.JRadioButton rb_Oro;
    private javax.swing.JRadioButton rb_Plata;
    private javax.swing.JTextField txt_ValorMaximo;
    private javax.swing.JTextField txt_ValorMinimo;
    // End of variables declaration//GEN-END:variables
}
