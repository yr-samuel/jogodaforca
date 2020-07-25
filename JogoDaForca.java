package jogodaforca;
import java.util.Scanner;
import java.util.ArrayList;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Character> palavraCortada = new ArrayList();
        ArrayList palavraCerta = new ArrayList();
        StringBuilder letrasErradas = new StringBuilder();
        
        int pontuacao = 0;
        
        System.out.println("Digite a palavra: ");
            
        String palavra = ler.nextLine();
  
        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
        }
        for (int i = 0; i < palavra.length(); i++) {
            palavraCortada.add(palavra.charAt(i));    
        }
        
        
        for (int i = 0; i < palavraCortada.size(); i++) {
            palavraCerta.add("_");
        }
        
        while(!palavraCortada.equals(palavraCerta) 
                && pontuacao <5){
            
            System.out.println("Digite uma letra: ");
            char digiteLetra = ler.next().charAt(0);        
            
            
            for (int i = 0; i < palavraCortada.size(); i++) {
                if(((char)digiteLetra == palavraCortada.get(i))){
                    palavraCerta.set(i,digiteLetra);
                }
            }

            if(!palavraCortada.contains(digiteLetra)){
                letrasErradas.append(digiteLetra + " ");
                pontuacao++;
                System.out.println("Pontuação: "+ pontuacao);
                System.out.println(letrasErradas);
            }
            
            System.out.println(palavraCerta);
            
        }            
    }            
}
    

