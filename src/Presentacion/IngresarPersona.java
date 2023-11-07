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
    private JCheckBox chbTerminos;
    private JLabel lblGenero;
    private JRadioButton rbtFemenio;
    private JRadioButton rbtMasculino;
    private JRadioButton rbtOtro;
    private JRadioButton rbtNoindica;

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
                String aceptoTerminos = (chbTerminos.isSelected()== true)? "si" : "no";
                String genero = ( rbtMasculino.isSelected())? "Masculino":
                        (rbtFemenio.isSelected())? "Femenino":
                         (rbtOtro.isSelected())? "Otro":
                         (rbtNoindica.isSelected())? "No indica": "";

                String mensaje = "Tusatos son :  " + " \n "+
                        "Codigo: " + codigo + "\n " +
                        "Nombre: " + nombre + " \n " +
                        "Apellido " + apellido + " \n "+
                        "Idioma : " + Idioma + " \n "+
                        "Genero : " + genero + " \n "+
                        "Acepto terminos : " + aceptoTerminos;



                JOptionPane.showMessageDialog(btnGuardar,  "Hola");
            }
        });
    }
}
