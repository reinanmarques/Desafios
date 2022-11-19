package desafiosBeeCrowd;

/*
 *  Solicitaram para que você construisse um programa simples 
 *  de criptografia. Este programa deve possibilitar enviar mensagens
 *  codificadas sem que alguém consiga lê-las. O processo é muito simples.
 *  
 *  São feitas três passadas em todo o texto.Na primeira passada, somente 
 *  caracteres que sejam letras minúsculas e maiúsculas devem ser deslocadas
 *  3 posições para a direita, segundo a tabela ASCII: letra 'a' deve virar
 *  letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente.
 *  Na segunda passada, a linha deverá ser invertida. Na terceira e última 
 *  passada, todo e qualquer caractere a partir da metade em diante (truncada)
 *  devem ser deslocados uma posição para a esquerda na tabela ASCII.
 *  Neste caso, 'b' vira 'a' e 'a' vira '`'.Por exemplo, se a entrada for 
 *  “Texto #3”, o primeiro processamento sobre esta entrada deverá produzir 
 *  “Wh{wr #3”. O resultado do segundo processamento inverte os caracteres e 
 *  produz “3# rw{hW”. Por último, com o deslocamento dos caracteres da metade
 *  em diante, o resultado final deve ser “3# rvzgV”.
 */

// Nesse desafio foi necessario me basear pela tabela ASCII(voçê consegue 
// olhar essa tabela na internet)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Criptogtafia {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("d:");
        String nome = input.nextLine();

        List<Integer> listaDeIntFinal = new ArrayList<>();                      
        List<Integer> listaDeInt = nome.chars()                      
        .boxed()                      
        .collect(Collectors.toList()); 
        
        for (Integer integer :listaDeInt) {
            boolean condicao = integer >= 65 && 
            integer <=90 || integer >= 97 && integer <= 122; 
            if(condicao){
                listaDeIntFinal.add(integer + 3);
            }else{
            	listaDeIntFinal.add(integer );
            	
            }
        }
        Collections.reverse(listaDeIntFinal);
        String msg = "";
        for (Integer integer : listaDeIntFinal) {
        	boolean s =listaDeIntFinal.size()/2 <= listaDeIntFinal.indexOf(integer);
        	if(s) {
        			integer-=1;
        	}
            msg = msg + Character.toString(integer);
        }
        System.out.println(msg);
        input.close();
    }}

