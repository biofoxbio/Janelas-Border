package View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MinhaJanelaNull extends JFrame {

    private JLabel texto;
    private JButton salvar;
    private JButton cancelar;

    public MinhaJanelaNull() {
        super("Janela 2.0");

    }

    public void init() {

        texto = new JLabel("Mensagem");
        salvar = new JButton("Salvar");
        cancelar = new JButton("cancelar");

        texto.setBounds(90, 30, 80, 30);
        salvar.setBounds(20, 70, 100, 30);
        cancelar.setBounds(130, 70, 100, 30);

        
        this.getContentPane().add(texto);
        this.getContentPane().add(salvar);
        this.getContentPane().add(cancelar);
        
        setSize(300, 400);
        setVisible(true);
    }

 

}
