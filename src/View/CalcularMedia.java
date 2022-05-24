
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcularMedia extends JFrame {
    private JLabel lblNome;
    private JLabel lblPP;
    private JLabel lblPR;
    private JLabel lblPJ;
    private JLabel lblTR;


    private JTextField txtNome;
    private JTextField txtPP;
    private JTextField txtPR;
    private JTextField txtPJ;
    private JTextField txtTR;
    
    private JLabel lblNOta;
    private JLabel lblResultado;
    
    private JButton calcular;
     
    
    public CalcularMedia(){
        super ("Media");
        this.getContentPane().setLayout(null);
     }
    public void init(){
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    lblNome = new JLabel("Nome" );
    lblPP = new JLabel("Prova parcial");
    lblPR = new JLabel("Prova regimental");
    lblPJ = new JLabel("Projeto");
    lblTR = new JLabel("Trabalho");
    
    lblNOta = new JLabel(" A nota do aluno " );
    lblResultado = new JLabel("Situacao ");  
    
    txtNome = new JTextField();
    txtPP = new JTextField();
    txtPR = new JTextField();
    txtPJ = new JTextField();
    txtTR = new JTextField();
    
    calcular = new JButton();
    calcular.setBounds(90, 30, 120, 30);
    
    lblNome.setBounds(90, 30, 120, 30);
    lblPP.setBounds(90, 70, 120, 30);
    lblPR.setBounds(90, 110, 120, 30);
    lblPJ.setBounds(90, 150, 120, 30);
    lblTR.setBounds(90, 190, 120, 30);
    
    lblNOta.setBounds(90, 70, 30, 120);
    lblResultado.setBounds(90, 70, 30, 120);
   
    txtNome.setBounds(90, 70, 120, 30);
    txtPP.setBounds(90, 70, 120, 30);
    txtPR.setBounds(90, 110, 120, 30);
    txtPJ.setBounds(90, 150, 120, 30);
    txtTR.setBounds(90, 190, 120, 30);
    
    this.add(calcular);
    this.add(lblNome);
    this.add(lblPP);
    this.add(lblPR);
    this.add(lblPJ);
    this.add(lblTR);
    
    this.add(lblNOta);
    this.add(lblResultado);
    
    this.add(txtNome);
    this.add(txtPP);
    this.add(txtPR);
    this.add(txtPJ);
    this.add(txtTR);
    
    
    }
    public static void main(String[]args ){
            
    
    }
}

















