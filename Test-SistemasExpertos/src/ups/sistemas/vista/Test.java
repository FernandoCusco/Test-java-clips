/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.sistemas.vista;

import CLIPSJNI.Environment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author fernando
 */
public class Test extends javax.swing.JFrame {

    ArrayList<Integer> valores = new ArrayList<>();
    int pregunta = 0;

    private Environment clips;
    

    public Test() {
        initComponents();
        clips = new Environment();
        clips.load("persona.clp");
        clips.load("preguntas.clp");
        clips.reset();
        clips.run();
        buttonGroup1.add(jrbTrue);
        buttonGroup1.add(jrbFalse);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jcbGenero = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVer = new javax.swing.JButton();
        jrbTrue = new javax.swing.JRadioButton();
        jrbFalse = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaPreguntas = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnStart.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/sistemas/image/start.png"))); // NOI18N
        btnStart.setText("Empezar Test");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Apellidos:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Genero:");

        txtNombre.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        txtEdad.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jcbGenero.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jcbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elejir", "Femenino", "Masculino" }));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("DATOS PERSONALES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(399, 399, 399))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnStart)
                        .addGap(153, 153, 153))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnStart)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVer.setBackground(new java.awt.Color(153, 153, 153));
        btnVer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 51, 51));
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ups/sistemas/image/test.png"))); // NOI18N
        btnVer.setText("Ver Resultados");
        btnVer.setBounds(new java.awt.Rectangle(100, 100, 0, 0));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jrbTrue.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jrbTrue.setText("Verdadero");
        jrbTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTrueActionPerformed(evt);
            }
        });

        jrbFalse.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jrbFalse.setText("Falso");
        jrbFalse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFalseActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("TEST DE PERSONALIDAD");

        txaPreguntas.setColumns(20);
        txaPreguntas.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        txaPreguntas.setRows(5);
        jScrollPane2.setViewportView(txaPreguntas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(375, 375, 375))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jrbTrue)
                        .addGap(260, 260, 260)
                        .addComponent(jrbFalse)))
                .addContainerGap(273, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbTrue)
                    .addComponent(jrbFalse))
                .addGap(64, 64, 64)
                .addComponent(btnVer)
                .addGap(63, 63, 63))
        );

        jTabbedPane1.addTab("Test", jPanel2);

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resultados", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        jTabbedPane1.setSelectedIndex(2);
        clips.run();
        leer();
        vaciarFichero();
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String genero = jcbGenero.getSelectedItem().toString();
        clips.eval("(assert (persona (nombre \"" + nombre + "\") (apellidos \"" + apellidos + "\") (edad " + edad + ") (genero \"" + genero + "\")))");
        clips.run();
        txtNombre.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtEdad.setEnabled(false);
        jcbGenero.setEnabled(false);
        btnStart.setEnabled(false);
        jTabbedPane1.setSelectedIndex(1);
        txaPreguntas.setText(questions().get(0));
    }//GEN-LAST:event_btnStartActionPerformed

    private void jrbTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTrueActionPerformed
        // TODO add your handling code here:

        for (int i = 0; i < questions().size(); i++) {
            if (pregunta == i) {
                valores.add(1);
                txaPreguntas.setText(questions().get(i));
            }
        }
        //buttonGroup1.clearSelection();
        System.out.println(pregunta);
        pregunta++;
        if (pregunta == 22) {
            jrbTrue.setEnabled(false);
            jrbFalse.setEnabled(false);
            clips.eval("(assert (preguntas (pr1 " + valores.get(0) + ") (pr2 " + valores.get(1) + ") (pr3 " + valores.get(2) + ") (pr4 " + valores.get(3) + ") (pr5 " + valores.get(4) + ") (pr6 " + valores.get(5) + ") (pr7 " + valores.get(6) + ") (pr8 " + valores.get(7) + ") (pr9 " + valores.get(8) + ") (pr10 " + valores.get(9) + ") (pr11 " + valores.get(10) + ") (pr12 " + valores.get(11) + ") (pr13 " + valores.get(12) + ") (pr14 " + valores.get(13) + ") (pr15 " + valores.get(14) + ") (pr16 " + valores.get(15) + ") (pr17 " + valores.get(16) + ") (pr18 " + valores.get(17) + ") (pr19 " + valores.get(18) + ") (pr20 " + valores.get(19) + ") (pr21 " + valores.get(20) + ")))");
            clips.load("reglas.clp");
            System.out.println(clips.eval("(facts)"));
            //clips.run();
        }
    }//GEN-LAST:event_jrbTrueActionPerformed

    private void jrbFalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFalseActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < questions().size(); i++) {
            if (pregunta == i) {
                valores.add(0);
                txaPreguntas.setText(questions().get(i));
            }
        }
        //buttonGroup1.clearSelection();
        System.out.println(pregunta);
        pregunta++;
        if (pregunta == 22) {
            jrbTrue.setEnabled(false);
            jrbFalse.setEnabled(false);
            //clips.eval("(assert (persona (nombre \"" + nombre + "\") (apellidos \"" + apellidos[0] + "\" \"" + apellidos[1] + "\") (edad " + edad + ") (genero \"" + genero + "\")))");
            clips.eval("(assert (preguntas (pr1 " + valores.get(0) + ") (pr2 " + valores.get(1) + ") (pr3 " + valores.get(2) + ") (pr4 " + valores.get(3) + ") (pr5 " + valores.get(4) + ") (pr6 " + valores.get(5) + ") (pr7 " + valores.get(6) + ") (pr8 " + valores.get(7) + ") (pr9 " + valores.get(8) + ") (pr10 " + valores.get(9) + ") (pr11 " + valores.get(10) + ") (pr12 " + valores.get(11) + ") (pr13 " + valores.get(12) + ") (pr14 " + valores.get(13) + ") (pr15 " + valores.get(14) + ") (pr16 " + valores.get(15) + ") (pr17 " + valores.get(16) + ") (pr18 " + valores.get(17) + ") (pr19 " + valores.get(18) + ") (pr20 " + valores.get(19) + ") (pr21 " + valores.get(20) + ")))");
            clips.load("reglas.clp");
            System.out.println(clips.eval("(facts)"));
            //clips.run();
        }
    }//GEN-LAST:event_jrbFalseActionPerformed

    public ArrayList<String> questions() {
        ArrayList<String> preguntas = new ArrayList<>();
        String pr1 = "1. Mientras descanso continuo pensando en mis problemas de carácter laboral y personal.";
        String pr2 = "2. Me desespera el tener que hacer cola en un supermercado o esperar mesa en un restaurante.";
        String pr3 = " 3. Constantemente se me agarrota la mandíbula y me rechinan los dientes.";
        String pr4 = " 4.No encuentro suficiente tiempo al día para realizar todas las tareas que quiero hacer.";

        String pr5 = " 5. Tengo la necesidad de hacer más tareas en menos tiempo sin dejar margen para algún imprevisto.";
        String pr6 = " 6. Leo documentos o libros interesantes o de alto valor todo lo rápido y acelerado que puedo";
        String pr7 = " 7. No me encuentro cómodo ni satisfecho con mi trabajo.";
        String pr8 = " 8. Me siento impaciente por el ritmo al que ocurren algunos sucesos.";
        String pr9 = " 9. Me gusta conversar sobre temas que me interesan, pero cuando no me gusta un tema hago como\n"
                + "    el que escucha pero en realidad sigo ocupado en mis propios pensamientos.";
        String pr10 = " 10. En mi trabajo me someto a varios momentos complicados  difíciles de cumplir.";
        String pr11 = " 11. Frecuentemente arrastro problemas laborales a mi hogar.";
        String pr12 = " 12. Me angustio al tener que realizar tareas monótonas que son\n"
                + "     necesarias pero que me impiden realizar tareas que\n"
                + "     verdaderamente me interesan.";
        String pr13 = " 13. Tengo tendencia a terminar las frases de las personas que me hablan.";
        String pr14 = " 14. Me esfuerzo por pensar o realizar dos o más cosas a la vez.";
        String pr15 = " 15. Como con prisa y me muevo y ando con rapidez.";
        String pr16 = " 16. En una conversación golpeo la mesa o doy una palmada para\n"
                + "     darle más intensidad o énfasis a un punto de la conversación.";
        String pr17 = " 17. Me irrito cuando el coche que va delante rueda demasiado lento.";
        String pr18 = " 18. Acostumbro a evaluar numéricamente las actividades que\n"
                + "     realizo y la de los demás.";
        String pr19 = " 19. Me siento mal cuando descanso demasiado o no hago nada.";
        String pr20 = " 20. Me altero al observar como otras personas realizan tareas que\n"
                + "     yo puedo hacer en menos tiempo.";
        String pr21 = " 21. Acentúo exageradamente las palabras que considero más\n"
                + "     importantes en una conversación.";
        preguntas.add(pr1);
        preguntas.add(pr2);
        preguntas.add(pr3);
        preguntas.add(pr4);
        preguntas.add(pr5);
        preguntas.add(pr6);
        preguntas.add(pr7);
        preguntas.add(pr8);
        preguntas.add(pr9);
        preguntas.add(pr10);
        preguntas.add(pr11);
        preguntas.add(pr12);
        preguntas.add(pr13);
        preguntas.add(pr14);
        preguntas.add(pr15);
        preguntas.add(pr16);
        preguntas.add(pr17);
        preguntas.add(pr18);
        preguntas.add(pr19);
        preguntas.add(pr20);
        preguntas.add(pr21);
        return preguntas;
    }

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnVer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcbGenero;
    private javax.swing.JRadioButton jrbFalse;
    private javax.swing.JRadioButton jrbTrue;
    private javax.swing.JTextArea txaPreguntas;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void leer() {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File("datos.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                txaResultado.append(linea + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void vaciarFichero() {
        String sFichero = "datos.txt";
        File f = new File(sFichero);
        f.delete();
        try {
            f.createNewFile();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
