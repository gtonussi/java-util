package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArray {
	
	public static void main(String[] args) {
		
//		//generics
//		ArrayList<Conta> lista = new ArrayList<Conta>();
//		
//		Conta cc = new ContaCorrente(22, 11);
//        lista.add(cc);
//
//        Conta cc2 = new ContaCorrente(22, 22);
//        lista.add(cc2);
//        
//        System.out.println("Tamanho: " + lista.size());
//        
//        Conta ref = lista.get(0);
//        
//        System.out.println(ref.getNumero());
//        
//        lista.remove(0);
//        
//        System.out.println("Tamanho: " + lista.size());
//        
//        Conta cc3 = new ContaCorrente(22, 311);
//        lista.add(cc3);
//
//        Conta cc4 = new ContaCorrente(22, 322);
//        lista.add(cc4);
//        
//        for(int i = 0; i < lista.size(); i++) {
//        	Object oRef = lista.get(i);
//        	System.out.println(oRef);
//        }
//        
//        System.out.println("--------------");
//        
//        for(Conta conta : lista) {
//        	System.out.println(conta);
//        }
//		
//	}
		
		//Generics
        List<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(22, 22);
        boolean existe = lista.contains(cc3);

        System.out.println("Já existe? " + existe);

        for(Conta conta : lista) {
            System.out.println(conta);
        }

	}
}

