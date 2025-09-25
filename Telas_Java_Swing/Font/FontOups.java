
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.*;
public class FontOups {
    private Font Fonte;
    private File CaminhoArquivo;
    private int Tamanho;
    public FontOups(String Caminho, int Tamanho){
        this.CaminhoArquivo = new File(Caminho);
        this.Tamanho = Tamanho;
        try{
        this.Fonte = Font.createFont(Font.TRUETYPE_FONT, this.CaminhoArquivo);
        this.Fonte = Fonte.deriveFont(Font.BOLD, this.Tamanho);
        
        } catch(FontFormatException e){
            this.Fonte = new Font("Arial", Font.BOLD, 20);
        }catch(IOException e){
            this.Fonte = new Font("Arial", Font.BOLD, 20);
        }
    }

    public Font getFonte(){
        return Fonte;
    }
}
