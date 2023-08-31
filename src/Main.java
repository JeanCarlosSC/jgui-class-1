import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Componentes básicos de la interfaz gráfica");

        JPanel pIzquierdo = new JPanel();
        pIzquierdo.setBounds(0, 0, 853, 720); // coordenadas y tamaño
        pIzquierdo.setBackground(Color.BLUE);
        pIzquierdo.setLayout(null);
        ventana.add(pIzquierdo);

        JPanel pDerecho = new JPanel();
        pDerecho.setBounds(853, 0, 427, 720);
        pDerecho.setBackground(Color.WHITE);
        pDerecho.setLayout(null);
        ventana.add(pDerecho);

        JLabel iTituloApp = new JLabel("Login de usuario");
        iTituloApp.setBounds(350, 20, 220, 30);
        iTituloApp.setForeground(Color.WHITE);
        pIzquierdo.add(iTituloApp);

        JLabel lEslogan = new JLabel("Te ayudamos con todo"); // etiqueta de texto
        lEslogan.setBounds(138, 110, 150, 20);
        lEslogan.setForeground(Color.DARK_GRAY); // cambiar el color de la fuente
        lEslogan.setHorizontalAlignment(JLabel.CENTER); // centrar con respecto al ancho
        pDerecho.add(lEslogan);

        JLabel lTituloLogin = new JLabel("Registra tus datos");
        lTituloLogin.setBounds(138, 140, 150, 30);
        lTituloLogin.setForeground(Color.DARK_GRAY); // cambiar el color de la fuente
        lTituloLogin.setHorizontalAlignment(JLabel.CENTER);
        pDerecho.add(lTituloLogin);

        JLabel lNotificaciones = new JLabel("¿Recibir Notificaciones?");
        lNotificaciones.setBounds(138, 370, 150, 20);
        lNotificaciones.setForeground(Color.DARK_GRAY);
        lNotificaciones.setHorizontalAlignment(JLabel.CENTER);
        pDerecho.add(lNotificaciones);

        JTextField tNombreUsuario = new JTextField("Nombre de usuario");
        tNombreUsuario.setBounds(80, 200, 260, 40);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE); // Color de la línea que parpadea
        tNombreUsuario.setHorizontalAlignment(JTextField.CENTER);
        pDerecho.add(tNombreUsuario);

        JPasswordField tClaveUsuario = new JPasswordField("Clave usuario");
        tClaveUsuario.setBounds(80, 250, 260, 40);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(JPasswordField.CENTER);
        pDerecho.add(tClaveUsuario);

        JComboBox<String> tipoUsuario = new JComboBox<>();
        tipoUsuario.addItem("Cliente");
        tipoUsuario.addItem("Cajero");
        tipoUsuario.addItem("Administrador");
        tipoUsuario.setBounds(120, 300, 180, 30);
        pDerecho.add(tipoUsuario);

        JRadioButton checkNo = new JRadioButton("No");
        checkNo.setBounds(170, 400, 40, 40);
        checkNo.setFocusable(false);
        checkNo.setBackground(Color.WHITE);
        pDerecho.add(checkNo);

        JRadioButton checkSi = new JRadioButton("Si");
        checkSi.setBounds(220, 400, 40, 40);
        checkSi.setFocusable(false);
        checkSi.setBackground(Color.WHITE);
        pDerecho.add(checkSi);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(checkNo);
        grupo.add(checkSi);

        JButton bEntrar = new JButton("Entrar");
        bEntrar.setBounds(110,490, 200, 40);
        bEntrar.setFocusable(false);
        bEntrar.setBackground(Color.BLUE);
        bEntrar.setForeground(Color.white);
        pDerecho.add(bEntrar);

        ventana.setSize(1280, 720); // tamaño
        ventana.setLayout(null); // layout null
        ventana.setLocationRelativeTo(null); // centrar ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        ventana.setVisible(true); // hacer ventana visible
    }
}