public class Inverte {
    public static void main(String[] args) {
        String original = "TargetSistemas";
        System.out.println("Original: " + original);

        char[] caracteres = original.toCharArray(); 
        int tamanho = caracteres.length; 

        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        String invertida = new String(caracteres);
        System.out.println("Invertido: " + invertida);
    }
}
