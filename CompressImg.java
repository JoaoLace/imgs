import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.FileWriter;

public class CompressImg {
    public static void main(String[] args) {
        try {
            // Ler imagem de arquivo
            File input = new File("entrada.jpg");
            BufferedImage image = ImageIO.read(input);

            // Processar imagem para escala de cinza
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    int RGB = image.getRGB(x, y);
            
                    // Extrair os componentes RGB
                    int r = (RGB >> 16) & 0xFF;
                    int g = (RGB >> 8) & 0xFF;
                    int b = RGB & 0xFF;
            
                    // Converter cada componente para sua representação binária (em 8 bits)
                    String redBinary = String.format("%8s", Integer.toBinaryString(r)).replace(' ', '0');
                    String greenBinary = String.format("%8s", Integer.toBinaryString(g)).replace(' ', '0');
                    String blueBinary = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0');
            
                    // Imprimir a representação binária dos componentes
                    System.out.println("Red: " + redBinary);
                    System.out.println("Green: " + greenBinary);
                    System.out.println("Blue: " + blueBinary);
                }
            }
            
            

            // Salvar imagem processada em arquivo
            File output = new File(System.getProperty("user.home") + "/Desktop/saida.jpg");

            ImageIO.write(image, "jpg", output);

            System.out.println("Imagem manipulada e salva com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
