import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaIncial {
    private JButton btnComprimirImg, btnDescomprimirImg, btnResizeImg, btnFilterImg;

    public JFrame janelaIncial() {
        JFrame janela = new JFrame("Janela Inicial");
        janela.setSize(1200, 900);          
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        janela.setLocation(150, 50);        
        janela.setResizable(false);        
        janela.getContentPane().setBackground(new Color(180, 180, 180)); 
        janela.setLayout(new GridLayout(2,2));


        btnComprimirImg = new JButton("Comprimir Imagem");
        btnDescomprimirImg = new JButton("Descomprimir Imagem");
        btnResizeImg = new JButton("Resize Imagem");
        btnFilterImg = new JButton("Filtros Imagem");

        janela.add(btnComprimirImg);
        janela.add(btnDescomprimirImg);
        janela.add(btnResizeImg);
        janela.add(btnFilterImg);

        btnResizeImg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e ){
                JanelaResize JanelaResize = new JanelaResize();
                JFrame janelaResize = JanelaResize.janelaResize();

                janelaResize.setVisible(true);
            }
        });


        return janela;
    }
}
