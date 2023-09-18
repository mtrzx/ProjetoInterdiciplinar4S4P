package projetointer;

import ConnectionFromSQL.VIEW.TelaLogin;
import com.bulenkov.darcula.DarculaLaf;
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ProjetoInter {

    public static void main(String[] args) {
        TelaLogin objtelalogin = new TelaLogin();
        
        objtelalogin.setVisible(true);
        
    }
}
