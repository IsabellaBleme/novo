/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ManipuladorArquivo {
        private String file;
        
            public  ManipuladorArquivo (String file) {
            this.file = file;
        }
            
        public void ler() throws FileNotFoundException, IOException{
            FileReader f= new FileReader(file);
           BufferedReader readerf = new BufferedReader(f);
            String linha= readerf.readLine();
            while(linha!=null){
                System.out.println(linha);
                linha=readerf.readLine();
            }
            readerf.close();
        }
        public  ArrayList<String> lerParaArrayList() throws FileNotFoundException, IOException{
            FileReader f= new FileReader(file);
            BufferedReader readerf = new BufferedReader(f);
            String linha= readerf.readLine();
            ArrayList<String> linhas = new ArrayList<>();
            while(linha!=null){
                linhas.add(linha);
                linha=readerf.readLine();
            }
            readerf.close();
            
            return linhas;
            
        }
        public void escrever(String linha) throws IOException {
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter fwriter = new BufferedWriter(fw);
            fwriter.write(linha);
            fwriter.close();

        }

        public static void copiar(String origem, String destino) throws FileNotFoundException, IOException {
            ArrayList armazena = new ArrayList<>();
            FileReader f = new FileReader(origem);
            BufferedReader readerf = new BufferedReader(f);
            String linha = readerf.readLine();

            while (linha != null) {
                armazena.add(linha);
                System.out.println(linha);
                linha = readerf.readLine();
            }
            readerf.close();
           


            FileWriter fw = new FileWriter(destino,true);
            BufferedWriter fwriter = new BufferedWriter(fw);
            for (int i = 0; i < armazena.size(); i++) {

                fwriter.write(armazena.get(i) + "\n");

                fwriter.close();

            }
        }
    }

