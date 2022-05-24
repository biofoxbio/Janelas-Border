package Janelas_01;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.JTextArea;
        import javax.swing.JOptionPane;
                
        public class Janela extends JFrame{
             private JTextArea label;
             private JLabel texto;
             
        
       public Janela (String nome, int larg, int alt, String txt){
       
            
            setTitle (nome);
            setSize (larg, alt);
            setLocation(300, 300 );
            setVisible (true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            texto = new JLabel(txt);
            this.add(texto);
            
       
       }
            public static void main(String[] args) {
                 Janela janela = new Janela(JOptionPane.showInputDialog(null,"Pesonalize a barra da sua janela"),
                         Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a largura")),
                         Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a Altura da sua Janela")),
                         JOptionPane.showInputDialog(null , "Digite o nome da sua Janela!!"));
            }
     
    }

    
