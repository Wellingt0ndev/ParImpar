/*
 * * Question 1
*Hopper e Joyce precisam fechar o portão do mundo invertido, que está conectado
*a uma máquina abaixo do Shopping de Starcourt. Esse portão possui um segredo e 
*para fechá-lo é preciso responder a seguinte pergunta:
*Qual é a diferença entre a soma dos números ímpares e a soma dos números pares
*de 1 a 1985?
*
*1+3+5+7+9+...+1983 + 1985 - (2+4+6+8...+1982+1984)
*
*Desenvolva um código para que sua saída seja o resultado.
*Você pode usar sua IDE de preferência,
*mas não esqueça de colocar o código abaixo.
 */
package parimpar;

/**
 *
 * @author welli
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumPairNumbers = 0;
        int sumOddNumbers = 0;
        int count;
        int difference;
        for (count = 1; count <= 1985; count++) {
            if (count % 2 == 0) {
                sumPairNumbers += count;
            } else {
                sumOddNumbers += count;
            }
        }
        System.out.println("Par " + sumPairNumbers + " Ímpar " + sumOddNumbers);
        difference = sumOddNumbers - sumPairNumbers;
        System.out.println("A diferença é " + difference);
    }
}
