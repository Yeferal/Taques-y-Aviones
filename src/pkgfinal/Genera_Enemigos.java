
package pkgfinal;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Genera_Enemigos {

    //Tamanu=yo 3 para crear los enemigos
    Enemigo [] rev = new Enemigo[3];

    int probabilidad;

    //Para cada batalla se deben de generar 3 enemigos
    // se inicializan los datos de cada vehiculo
    public Genera_Enemigos(){
        probabilidad=100;
        rev[0]= new Enemigo(60,5);
        rev[1]= new Enemigo(70,5);
        rev[2]= new Enemigo(75,5);
        
        rev[0].vehh = new ImageIcon("src/imagen/Enemigos/en1.jpg");
        rev[0].veht = new ImageIcon(rev[0].vehh.getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH));
        
        rev[1].vehh = new ImageIcon("src/imagen/Enemigos/en2.png");
        rev[1].veht = new ImageIcon(rev[1].vehh.getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH));
        
        rev[2].vehh = new ImageIcon("src/imagen/Enemigos/en3.jpg");
        rev[2].veht = new ImageIcon(rev[2].vehh.getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH));
    }

}
