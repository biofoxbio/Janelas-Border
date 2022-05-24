
package View;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MinhaJanelaFlow extends JFrame {
    private JLabel texto;
    private JButton salvar;
    private  JButton cancelar;
    
    public MinhaJanelaFlow() {
        super ("Janela 2.0");
        this.getContentPane().setLayout(new FlowLayout());
    }
    
    public void init(){
        setSize(500, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        texto = new JLabel("Mensagem");
        salvar = new JButton("Salvar");
        cancelar = new JButton ("cancelar");
        
        this.add(texto);
        this.add(salvar);
        this.add(cancelar);
    }
    
    public static void main(String[] args) {
        MinhaJanelaFlow janela = new MinhaJanelaFlow();
        janela.init();  
    }
    
}
