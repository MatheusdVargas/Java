import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
public class UsandoJFRAME {
    public static void main(String[] args) {
        JFrame minhaJanela = new JFrame("Nova Janela");
        
        minhaJanela.setSize(300, 300);
        minhaJanela.getContentPane().setBackground(Color.red);
        minhaJanela.setResizable(false);
        minhaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel();
        painel.setSize(150, 150);
        painel.setBackground(Color.green);
        
        minhaJanela.setLayout(null);
        minhaJanela.add(painel);
        minhaJanela.setVisible(true);
         
    }
    
}
