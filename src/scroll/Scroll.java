
package scroll;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class Scroll extends JFrame{                     
            
    public Scroll() {     
        //Duda Como limitar el tamaño de la ventana para que pueda ser más largo el scroll
        //Creo ventana
        JFrame ventana = new JFrame();         
        //Pa que no siga corriendo y no se canse
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Scroll
        JScrollPane scroll = new JScrollPane();
        //Panel de dibujo
        JLabel etiqueta = new JLabel();  
        //Direccion imagen
        Icon imagen = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\Scroll\\src\\scroll\\ini.jpg");                                
        //Al panel le inserto la imagen
        etiqueta.setIcon(imagen);      
        //A la ventana le agrego el scroll
        ventana.getContentPane().add(scroll);
        scroll.setViewportView(etiqueta);
        ventana.pack();
        ventana.setVisible(true);
    }                   
    public static void main(String[] args) {
        Scroll as = new Scroll();        
    }
    
}
