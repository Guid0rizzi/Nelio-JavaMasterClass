package Section2.ListIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Aldo");
        list.add("Max");
        list.add("Raissa");
        list.add("Roberto");
        list.add("Carina");
        list.add("Leonardo");
        list.add("Leticia");
        list.add("Lucas");
        list.add(0, "Anna");//Colocar em uma posição especifica da List, nesse casso, na posição 0 e vou adicionar a Anna
        System.out.println(list.size()); // ver o tamanho da lista
        list.remove("Bob");//reomove por comparação de valor
        list.remove(1); // remove por posição
        System.out.println("------------------------");
        for (String name: list){
            System.out.println(name);
        }
        System.out.println("------------------------");
        list.removeIf(x -> x.charAt(0) == 'R'); // por predicado, remove comparando algo, no caso vai remover todos com a inical R
        for (String name:list){
            System.out.println(name);
        }
        System.out.println("------------------------");
        System.out.println("Index of Leonardo: "+list.indexOf("Leonardo"));// acha o indice onde esta o Leonardo
        System.out.println("---------filtro de nomes por iniciais----------");
        //preciso fazer uma lista nova
        List<String> result = list.stream().filter(x -> x.charAt(0) =='L').collect(Collectors.toList()); //fazer o filtro
        System.out.println(result);
        System.out.println("---------filtro de indices por iniciais----------");
        String name= list.stream().filter(x -> x.charAt(0) =='L').findFirst().orElse(null);// se eu não encontrar ele vai me retornar nullo
        System.out.println("primeiro nome com a inical L: "+name);
    }

}
