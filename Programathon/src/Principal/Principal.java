
package Principal;

/**
 *
 * @author PC
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Properties;

public class Principal extends javax.swing.JFrame {
    
    JButton nuevo = new JButton();
    JButton guardar = new JButton();
    JButton abrir = new JButton();
    JButton ejecutar = new JButton();
    JButton escenario = new JButton();
    JButton personaje= new JButton();
    public static Properties property= new Properties();
     
    public Principal() {
    
    super ("Programathon");
     
     setLocation(20,0);
     setSize(1024,700);
     setLayout(null);
     
    System.out.println(getProperty("red"));
    //Color color = new Color(Integer.parseInt(getProperty("red")),Integer.parseInt(getProperty("green")),Integer.parseInt(getProperty("blue")));
     
     //getContentPane().setBackground(color);
    //Imagen de fondo
   // setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\Desktop\\Programathon\\programathon\\Programathon\\src\\Principal\\Escenarios\\ciudad.png")));
    
    changeImage(nuevo, "Simbolos/nuevo.png");
    nuevo.setBounds(80,20,140, 180);
    changeImage(guardar, "Simbolos/guardar.png");
    guardar.setBounds(220,20,140, 180);
    changeImage(abrir, "Simbolos/abrir_proyecto.png");
    abrir.setBounds(360,20,140, 180);
    changeImage(ejecutar, "Simbolos/reproducir.png");
    ejecutar.setBounds(500, 20, 140, 180);
    changeImage(escenario, "Simbolos/agregar-cambiar escenario.png");
    escenario.setBounds(640, 20, 140, 180);
    changeImage(personaje, "Simbolos/agregar personaje.png");
    personaje.setBounds(780, 20, 140, 180);
    
    add(nuevo);   
    add(guardar);
    add(abrir);
    add(ejecutar);
    add(escenario);
    add(personaje);
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

    n.setIcon(new ImageIcon(img.getScaledInstance(100, 130, 1)));
    }catch(IOException ex)
    {
    }
    }
    
    public String getProperty(String name)
    {
        String value="";
        try{
            property.load(new FileInputStream("config.properties"));
            value=property.getProperty(name);
            
        }
        catch(IOException ex)
        {
        }
    return value;
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
