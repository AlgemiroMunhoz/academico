package poo.interfacces;

public class TesteException {

    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
        novaFrase = frase.toUpperCase();
        }catch (NullPointerException ex) {
        System.out.println("Erro: Frase Nula !\n usando uma frase nula");
        frase = "Estou aprendendo";
        novaFrase = frase.toUpperCase();
        }catch (IllegalArgumentException ex){
        System.out.println("Argumento Inválido");   
        } 
        }

        String novaMsg = null;
        String msgCaixaAlta = caixaAlta(novaMsg);
        try {
            msgCaixaAlta = caixaAlta(novaMsg);
        } catch (NullPointerException ex) {
            novaMsg = "Nova frase...";
            //TODO: handle exception
            msgCaixaAlta = caixaAlta(novaMsg);
            e.prin
        }
        System.out.println("Msg Caixa Alta: " + msgCaixaAlta);

        public static String caixaAlta(String msg) throws NullPointerException{
            return msg.toUpperCase();

        }
    }
}


