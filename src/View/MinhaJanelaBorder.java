
package View;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanelaBorder extends JFrame {
    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public MinhaJanelaBorder() {
        super("Janela 2.0");
        
    }

    public void init() {
        
        texto = new JLabel("Mensagem");
        salvar = new JButton("Salvar");
        cancelar = new JButton("cancelar");

        this.getContentPane().add(texto, BorderLayout.CENTER);
        this.getContentPane().add(salvar, BorderLayout.WEST);
        this.getContentPane().add(cancelar, BorderLayout.EAST);
        
        setSize(300, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        MinhaJanelaGrid janela = new MinhaJanelaGrid();
        janela.init();
    }

}

    

