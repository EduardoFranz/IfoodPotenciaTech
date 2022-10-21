public class MinhaClasse {
    
    //Estrutura de um método - Chamando um método
    public static void main(String[] args) {
        String primeiroNome = "Eduardo";
        String segundoNome = "Franz";

        String nomeCompleto = nomecompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomecompleto (String primeiroNome, String segundoNome) {
        //concat = concatenar 
        // + = concatenar
        return "Resutaldo do método" + primeiroNome.concat("").concat(segundoNome);
    }
}
