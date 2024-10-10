import javax.swing.JOptionPane;

public class Dialog {

    public static void main(String[] args) {
        // dialog sempre le string
        String resposta = JOptionPane.showInputDialog(null, "Digite algo","Pergunta", JOptionPane.INFORMATION_MESSAGE);
         
        System.out.println("Digitado: " + resposta);
    }
    
}
