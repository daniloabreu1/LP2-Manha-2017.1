
import javax.swing.JOptionPane;

public class Caixas {

    public static void main(String[] args) {
       // String nome;
       // nome = JOptionPane.showInputDialog("Digite um nome","Escreva aui");
        //int n;
        //float f;
        //n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        //f = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero"));
        String op;
        String[] s={"Maçã","pera","uva","goiaba"};
        op = (String) JOptionPane.showInputDialog(null, "Escolha a fruta", "Título", JOptionPane.QUESTION_MESSAGE, null, s, s[0]);
        JOptionPane.showMessageDialog(null, "Inteiro: "+op, "Título da Janela", JOptionPane.WARNING_MESSAGE);

        System.exit(0);
    }

}
