/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
