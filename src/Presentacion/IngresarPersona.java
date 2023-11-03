package Presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel plnPrincipal;
    private JLabel lblCodigo;
    private JTextField txtCodigo;
    private JLabel txtNombre;
    private JLabel lblApellido;
    private JTextField textField1;
    private JTextField txtApellido;
    private JButton btnGuardar;
    private JLabel lblIdioma;
    private JComboBox cmbIdioma;

    public IngresarPersona (){
        this.setContentPane(plnPrincipal);
        this.setSize(400, 300);

        this.setVisible (true);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String Idioma = cmbIdioma.getSelectedItem().toString();

                String mensaje = "Tusatos son :  " + " \n "+
                        "Codigo: " + codigo + "\n " +
                        "Nombre: " + nombre + " \n " +
                        "Apellido " + apellido ;
                JOptionPane.showMessageDialog(btnGuardar,  "Hola");
            }
        });
    }
}
