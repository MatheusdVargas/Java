import javax.swing.JOptionPane;

public class UsandoGUIs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Teste de mensagem");
        
        JOptionPane.showMessageDialog(null, "AVISO IMPORTANTEl",
                 "Minha Mensgadme legal", JOptionPane.WARNING_MESSAGE);
        
         JOptionPane.showMessageDialog(null, "Erro",
                 "Minha Mensgadme legal", JOptionPane.ERROR_MESSAGE);
         
         
    }
    
}
