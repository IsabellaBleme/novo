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
import javax.swing.JTextField;

public class ManipuladorArquivo extends CadastroFuncionarios {

    private String file="C:\\Users\\Aluno\\Desktop\\a.txt";

  

    public boolean ler(JTextField jTextFieldCODIGO, JTextField jTextFieldSENHA) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(file);
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        int con=1;
        while (linha != null) {
            System.out.println(linha);
            linha = readerf.readLine();
            String armazena[] = linha.split(";");
            if (jTextFieldCODIGO.equals(armazena[1]) && jTextFieldSENHA.equals(armazena[2])) {
                con = 0;
            }
        }
        readerf.close();
        if (cont == 0) {
            return true;
        } else {
            return false;
        
        }
        
    }
    
      public boolean lerLivro(JTextField jTextFieldNome1,JTextField jTextFieldCodigo2, JTextField jTextFieldMatricula1) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(file);
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        int con = 0;
        while (linha != null) {
            System.out.println(linha);
            linha = readerf.readLine();
            String armazena[] = linha.split(";");
            if (jTextFieldNome1.equals(armazena[0])&&jTextFieldCodigo2.equals(armazena[1]) && jTextFieldMatricula1.equals(armazena[2])) {
                con = 1;
            }
        }
        readerf.close();
        if (cont == 1) {
            return true;
        } else {
            return false;
        
        }}

    public ArrayList<String> lerParaArrayList() throws FileNotFoundException, IOException {
        FileReader f = new FileReader(file);
        BufferedReader readerf = new BufferedReader(f);
        String linha = readerf.readLine();
        ArrayList<String> linhas = new ArrayList<>();
        while (linha != null) {
            linhas.add(linha);
            linha = readerf.readLine();
        }
        readerf.close();

        return linhas;

    }

    public void escrever(String linha) throws IOException {
        FileWriter fw = new FileWriter(file, true);
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

        FileWriter fw = new FileWriter(destino, true);
        BufferedWriter fwriter = new BufferedWriter(fw);
        for (int i = 0; i < armazena.size(); i++) {

            fwriter.write(armazena.get(i) + "\n");

            fwriter.close();

        }
    }

}
