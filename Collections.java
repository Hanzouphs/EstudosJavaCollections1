import java.util.*;


public class Collections1 {
    public static void main(String[] args) throws Exception {
       
        List<Double> notas = new ArrayList<>();
        notas.add(0d);
        notas.add(1d);
        notas.add(2d);
        notas.add(3d);
        notas.add(4d);
        notas.add(5d);
        notas.add(6d);
        notas.add(7d);
        notas.add(8d); 
        
        System.out.println(notas);
        System.out.println(" ");
        System.out.println("Posição da nota 5: " + notas.indexOf(0d));
        System.out.println(" ");
        System.out.println("Adicionado 9 na posição 3 lista ");
        notas.add(3, 9d);
        System.out.println(notas);
        System.out.println(" ");
        System.out.println("Substituindo a nota 5 pela nota 11 ");
        notas.set(notas.indexOf(5d), 11d);
        System.out.println(notas);
        System.out.println(" ");
        System.out.println("Checando de a nota 11 existe na lista: " + notas.contains(11d));
        System.out.println(" ");
        System.out.println("verificando a 5 nota adicionada: " + notas.get(6));
        System.out.println(" ");
        System.out.println("Exibindo a nota minima: " + Collections.min(notas));
        System.out.println("Exibindo a nota máxima: " + Collections.max(notas));
        System.out.println(" ");
        Iterator<Double> interator = notas.iterator();
        Double soma = 0d;
        while (interator.hasNext()){
            double next = interator.next();
            soma += next;
        }
        System.out.println("Exibindo a soma dos valores: " + soma);
        System.out.println(" ");
        System.out.println("Exibindo a media dos valores: " + soma/notas.size());
        System.out.println(" ");
        System.out.println("Removendo o 0: ");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println(" ");
        // System.out.println("Removendo o numero na posicao 0: "); 
        // notas.remove(0);
        // Iterator<Double> iterator1 = notas.iterator();
        // System.out.println(notas);
        // while (iterator1.hasNext()){
            //     double next = iterator1.next();
            //     if(next < 7) iterator1.remove(); 
            // }
            // // System.out.println(" ");      
            // System.out.println(notas);
        // System.out.println(" ");      
        // System.out.println("Apagando toda a lista: ");
        // notas.clear();
        // System.out.println(notas);
        // System.out.println(" ");      
        System.out.println("Verifique se a lista esta vazia: " + notas.isEmpty());
        
        
        System.out.println(" ");      
        System.out.println("Adicionando os elementos da list na linkedList: "); 
        LinkedList<Double> notas2 = new LinkedList<>();
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            double next = iterator.next();
            notas2.add(next);
        }
        System.out.println(notas2);
        System.out.println(" ");      
        System.out.println("mostrando o primeiro elemento da linkedList sem remove-lo: "); 
        System.out.println(notas2.peekFirst());
        System.out.println(" ");      
        System.out.println("mostrando o primeiro elemento da e removendo-o: "); 
        System.out.println(notas2.pollFirst());
        System.out.println(" ");      
        System.out.println("mostrando depois de remover o primeiro elemento da lista: "); 
        System.out.println(notas2);
        System.out.println(" ");      
        
    }
    
}
