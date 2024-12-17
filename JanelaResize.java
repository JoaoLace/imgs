import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class JanelaResize {
    private JButton btnSlcFile;
    private String filePath;

    public JFrame janelaResize() {
        JFrame janela = new JFrame("Resize Imagem");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setLocation(150, 50);
        janela.setResizable(false);
        janela.getContentPane().setBackground(new Color(180, 180, 180));
        janela.setLayout(new GridLayout(2, 2));

        btnSlcFile = new JButton("Selecionar Img");
        btnSlcFile.setBackground(Color.green);

        janela.add(btnSlcFile);

        btnSlcFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Images", "jpg", "gif");
                chooser.setFileFilter(filter);
                int returnVal = chooser.showOpenDialog(janela);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    filePath = chooser.getSelectedFile().getAbsolutePath();
                    System.out.println(filePath);

                    // Criar um JLabel para exibir o caminho do arquivo
                    JLabel label = new JLabel("Arquivo selecionado: " + filePath, SwingConstants.CENTER);
                    label.setFont(new Font("Arial", Font.BOLD, 16));

                    // Adicionar o JLabel no layout da janela
                    janela.add(label);

                    // Atualizar a janela para refletir as mudanças
                    janela.revalidate();
                    janela.repaint();
                }
            }
        });

        return janela;
    }

    public static void main(String[] args) {
        JanelaResize janela = new JanelaResize();
        janela.janelaResize().setVisible(true);
    }
}
