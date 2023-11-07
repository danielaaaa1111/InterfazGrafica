package Presentacion;

import javax.swing.*;

public class VentanaPrincipal  extends JFrame {

    private void  inicializarMenu(){
     JMenuBar barraMenu = new JMenuBar();

     JMenu menuPersonas = new JMenu( "personas");

     barraMenu.add(menuPersonas);
    }

    public VentanaPrincipal (){
        inicializarMenu();

        this.setSize(100 ,800);
        this.setVisible(true);
    }
}
