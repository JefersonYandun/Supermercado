/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.supermercado;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.util.Random;



    
    

    public class Flujo3 extends javax.swing.JFrame {
    
     private Queue<JLabel> fila1;
    private Queue<JLabel> fila2;
    private Queue<JLabel> fila3;
    private JLabel clienteActual;
    private Timer timer;
    private ArrayList<Timer> timers;

    
    public Flujo3() {
        initComponents();
        fila1 = new LinkedList<>();
        fila2 = new LinkedList<>();
        fila3 = new LinkedList<>();
        clienteActual = null;
        timers = new ArrayList<>();
        
        // Cargar imágenes en los JLabel
        
        try {
            ImageIcon wallpaper = new ImageIcon("C:\\Users\\JEFERSON\\OneDrive\\Documentos\\Z NetBeansProjects\\Supermercado\\Supermercado\\src\\main\\java\\imagenes\\tienda.jpg");
            Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLblTienda.getWidth(), jLblTienda.getHeight(),
                    Image.SCALE_DEFAULT));
            jLblTienda.setIcon(icono);
            this.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            String imagePath = "C:\\Users\\JEFERSON\\OneDrive\\Documentos\\Z NetBeansProjects\\Supermercado\\Supermercado\\src\\main\\java\\imagenes\\persona.jpg";
            ImageIcon wallpaper = new ImageIcon(imagePath);
            Image scaledImage = wallpaper.getImage().getScaledInstance(jLblClienteSaliendo.getWidth(), jLblClienteSaliendo.getHeight(), Image.SCALE_DEFAULT);
            Icon icono = new ImageIcon(scaledImage);
    
            JLabel[] labels = {
                jLblClienteSaliendo, jLblPosicion1Fila1, jLblPosicion2Fila1, jLblPosicion3Fila1, jLblPosicion1Fila2,
                jLblPosicion2Fila2, jLblPosicion3Fila2, jLblPosicion1Fila3, jLblPosicion2Fila3, jLblPosicion3Fila3,
            };
    
            for (JLabel label : labels) {
                label.setIcon(icono);
                label.repaint();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        timer = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jBtnIniciarActionPerformed(e);
            }
        });

        Timer stopTimer = new Timer(600000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });
        stopTimer.setRepeats(false);
        stopTimer.start();
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
        jBtnIniciar = new javax.swing.JButton();
        jLblPosicion1Fila1 = new javax.swing.JLabel();
        jLblPosicion2Fila1 = new javax.swing.JLabel();
        jLblPosicion3Fila1 = new javax.swing.JLabel();
        jLblPosicion1Fila2 = new javax.swing.JLabel();
        jLblPosicion2Fila2 = new javax.swing.JLabel();
        jLblPosicion3Fila2 = new javax.swing.JLabel();
        jLblPosicion1Fila3 = new javax.swing.JLabel();
        jLblPosicion2Fila3 = new javax.swing.JLabel();
        jLblPosicion3Fila3 = new javax.swing.JLabel();
        jLblClienteSaliendo = new javax.swing.JLabel();
        jLblTienda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtnIniciar.setText("INIICIAR");
        jBtnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(jBtnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLblPosicion1Fila1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.jpg"))); // NOI18N
        jPanel1.add(jLblPosicion1Fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 60, 70));
        jPanel1.add(jLblPosicion2Fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 20, 30));
        jPanel1.add(jLblPosicion3Fila1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 20, 30));
        jPanel1.add(jLblPosicion1Fila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 20, 30));
        jPanel1.add(jLblPosicion2Fila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 20, 30));
        jPanel1.add(jLblPosicion3Fila2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 20, 30));

        jLblPosicion1Fila3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.jpg"))); // NOI18N
        jPanel1.add(jLblPosicion1Fila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 60, 70));
        jPanel1.add(jLblPosicion2Fila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 20, 30));
        jPanel1.add(jLblPosicion3Fila3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 20, 30));
        jPanel1.add(jLblClienteSaliendo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 20, 30));

        jLblTienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tienda.jpg"))); // NOI18N
        jLblTienda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jPanel1.add(jLblTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 400, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void jBtnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIniciarActionPerformed
         timer.start();
    JLabel nuevoCliente = new JLabel();
    nuevoCliente.setIcon(jLblPosicion1Fila1.getIcon());
    nuevoCliente.setBounds(jLblPosicion1Fila1.getBounds());

    int filaMenosClientes = obtenerFilaMenosClientes();
    if (filaMenosClientes == 1) {
        fila1.offer(nuevoCliente);
    } else if (filaMenosClientes == 2) {
        fila2.offer(nuevoCliente);
    } else {
        fila3.offer(nuevoCliente);
    }

    actualizarFilas();

    if (clienteActual == null) {
        atenderCliente();
    }
}


private int obtenerFilaMenosClientes() {
    int fila1Size = fila1.size();
    int fila2Size = fila2.size();
    int fila3Size = fila3.size();

    if (fila1Size <= fila2Size && fila1Size <= fila3Size) {
        return 1;
    } else if (fila2Size <= fila1Size && fila2Size <= fila3Size) {
        return 2;
    } else {
        return 3;
    }
}
private void atenderCliente() {
    if (clienteActual == null) {
        Queue<JLabel>[] filas = new Queue[]{fila1, fila2, fila3};

        // Buscar cualquier cliente de cualquier fila que esté en la primera posición
        for (Queue<JLabel> fila : filas) {
            if (!fila.isEmpty() && fila.peek().isVisible()) {
                clienteActual = fila.poll();
                atenderClienteEnFila(clienteActual);
                break; // Salir del bucle una vez que se atienda a un cliente
            }
        }
    }
}

private void atenderClienteEnFila(JLabel cliente) {
    moverFilas();
    jLblClienteSaliendo.setVisible(false);
    cliente.setVisible(true);
    Timer atencionTimer = new Timer(getRandomAtencionTime(), new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            cliente.setVisible(false);
            jLblClienteSaliendo.setVisible(true);
            Timer salirTimer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jLblClienteSaliendo.setVisible(false);
                    clienteActual = null;
                    atenderCliente();
                    timer.restart();
                }
            });
            salirTimer.setRepeats(false);
            salirTimer.start();
        }
    });
    atencionTimer.setRepeats(false);
    atencionTimer.start();
}




private void moverFilas() {
        Queue<JLabel> tempFila1 = new LinkedList<>(fila1);
        Queue<JLabel> tempFila2 = new LinkedList<>(fila2);
        Queue<JLabel> tempFila3 = new LinkedList<>(fila3);

        fila1.clear();
        fila2.clear();
        fila3.clear();

        if (!tempFila1.isEmpty()) {
            fila1.offer(tempFila1.poll());
        }
        if (!tempFila1.isEmpty()) {
            fila1.offer(tempFila1.poll());
        }
        if (!tempFila1.isEmpty()) {
            fila1.offer(tempFila1.poll());
        }

        if (!tempFila2.isEmpty()) {
            fila2.offer(tempFila2.poll());
        }
        if (!tempFila2.isEmpty()) {
            fila2.offer(tempFila2.poll());
        }
        if (!tempFila2.isEmpty()) {
            fila2.offer(tempFila2.poll());
        }

        if (!tempFila3.isEmpty()) {
            fila3.offer(tempFila3.poll());
        }
        if (!tempFila3.isEmpty()) {
            fila3.offer(tempFila3.poll());
        }
        if (!tempFila3.isEmpty()) {
            fila3.offer(tempFila3.poll());
        }

        actualizarFilas();
}





private void actualizarFilas() {
        int fila1Size = fila1.size();
        int fila2Size = fila2.size();
        int fila3Size = fila3.size();

        jLblPosicion1Fila1.setVisible(fila1Size >= 1);
        jLblPosicion2Fila1.setVisible(fila1Size >= 2);
        jLblPosicion3Fila1.setVisible(fila1Size >= 3);

        jLblPosicion1Fila2.setVisible(fila2Size >= 1);
        jLblPosicion2Fila2.setVisible(fila2Size >= 2);
        jLblPosicion3Fila2.setVisible(fila2Size >= 3);

        jLblPosicion1Fila3.setVisible(fila3Size >= 1);
        jLblPosicion2Fila3.setVisible(fila3Size >= 2);
        jLblPosicion3Fila3.setVisible(fila3Size >= 3);
}

private int getRandomAtencionTime() {
    Random rand = new Random();
    return rand.nextInt(7001) + 7000; // Entre 7 y 13 segundos en milisegundos
    }//GEN-LAST:event_jBtnIniciarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Flujo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flujo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flujo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flujo3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flujo3().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnIniciar;
    private javax.swing.JLabel jLblClienteSaliendo;
    private javax.swing.JLabel jLblPosicion1Fila1;
    private javax.swing.JLabel jLblPosicion1Fila2;
    private javax.swing.JLabel jLblPosicion1Fila3;
    private javax.swing.JLabel jLblPosicion2Fila1;
    private javax.swing.JLabel jLblPosicion2Fila2;
    private javax.swing.JLabel jLblPosicion2Fila3;
    private javax.swing.JLabel jLblPosicion3Fila1;
    private javax.swing.JLabel jLblPosicion3Fila2;
    private javax.swing.JLabel jLblPosicion3Fila3;
    private javax.swing.JLabel jLblTienda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

