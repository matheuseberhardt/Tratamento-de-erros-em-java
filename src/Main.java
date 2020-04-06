import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {

        int numero;

        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO QUALQUER "));
            JOptionPane.showMessageDialog(null, "o numero foi " + numero);

        }
        catch ( Exception erro)  {
            JOptionPane.showMessageDialog (null, "valor digitado invalido" + erro);

        } finally {
            JOptionPane.showMessageDialog(null, "Fim");
        }


    }


}
