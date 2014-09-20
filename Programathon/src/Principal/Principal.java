
package Principal;

/**
 *
 * @author PC
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Principal extends javax.swing.JFrame {
    
    JButton nuevo = new JButton();
    JButton guardar = new JButton();
    JButton abrir = new JButton();
    JButton ejecutar = new JButton();
    JButton escenario = new JButton();
    JButton personaje= new JButton();
    
    public Principal() {
    
    super ("Programathon");
     
     setLocation(20,0);
     setSize(1024,700);
     setLayout(null);
     
    //Imagen de fondo
   // setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\Programathon\\programathon\\Programathon\\src\\Principal\\Escenarios\\ciudad.png")));
    
    changeImage(nuevo, "Simbolos/nuevo.png");
    nuevo.setBounds(20,20,160, 200);
    changeImage(guardar, "Simbolos/guardar.png");
    guardar.setBounds(200,20,160,200);
    changeImage(abrir, "Simbolos/abrir_proyecto.png");
    abrir.setBounds(380,20,160,200);
    changeImage(ejecutar, "Simbolos/reproducir.png");
    ejecutar.setBounds(560, 20, 160, 200);
    changeImage(escenario, "Simbolos/agregar-cambiar escenario.png");
    escenario.setBounds(740, 20, 160, 200);
    changeImage(personaje, "Simbolos/agregar personaje.png");
    personaje.setBounds(920, 20, 160, 200);
    
    add(nuevo);   
    add(guardar);
    add(abrir);
    add(ejecutar);
    add(escenario);
    add(personaje);
    /*initComponents();
        
    setTitle("Programathon");
    setSize(1024, 700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
   // setLayout(new BorderLayout());
   // setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\Programathon\\programathon\\Programathon\\src\\Principal\\Escenarios\\ciudad.png")));
  //  setLayout(new FlowLayout());
  
    nuevo.setText("Nuevo proyecto");
    nuevo.setBounds(0, 0, 50, 50);

   // getContentPane().add(nuevo);
   
// getContentPane().add(nuevo, java.awt.BorderLayout.PAGE_END);
    
    add(nuevo);
    nuevo.setVisible(true);
    */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para cambiar la imagen de los botones
    public void changeImage(JButton n, String image)
    {
        try{
    Image img = ImageIO.read(getClass().getResource(image));
    
    n.setIcon(new ImageIcon(img));
    }catch(IOException ex)
    {
    }
    }
    
    public void cargarbotones()
    {
    
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
    // End of variables declaration//GEN-END:variables
}
