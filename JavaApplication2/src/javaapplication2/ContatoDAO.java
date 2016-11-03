/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ContatoDAO {

    public void salvarContato(CadastroClientes c) throws DAOException {
        ManipuladorArquivo m = new ManipuladorArquivo("C:\\Users\\Aluno\\Desktop\\pratica25.txt");
        try {
            m.escrever(c.getNomeC() + ";");
            m.escrever(c.getMatricula() + ";");
            m.escrever(c.getEndereco()+";");
            m.escrever(c.getTelefone() + "\n");
        } catch (Exception ex) {
            throw new DAOException("Erro em salvar");

        }

    }
    
    public void salvarLivro(Livro l) throws DAOException {
        ManipuladorArquivo m = new ManipuladorArquivo("C:\\Users\\Aluno\\Desktop\\pratica26.txt");
        try {
            m.escrever(l.getNome() + ";");
            m.escrever(l.getAutor() + ";");
            m.escrever(l.getCodigo()+";");
            m.escrever(l.getQuantidade()+ "\n");
        } catch (Exception ex) {
            throw new DAOException("Erro em salvar");

        }

    }
    public ArrayList<Livro> getLivros() throws DAOException {
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            ManipuladorArquivo m = new ManipuladorArquivo("C:\\Users\\Aluno\\Desktop\\pratica26.txt");
            ArrayList<String> linhas = m.lerParaArrayList();
            
            for (int i = 0; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                Livro l= new Livro();
                String[] vetor = linha.split(";");
                l.setNome(vetor[0]);
                l.setAutor(vetor[1]);
                l.setCodigo(vetor[2]);
                l.setQuantidade(Integer.parseInt(vetor[3]));
               
                livros.add(l);
            }
            

          
        } catch (Exception ex) {

            throw new DAOException("Erro");
        }

        return livros;
    }
    


    public ArrayList<CadastroClientes> getContatos() throws DAOException {
        ArrayList<CadastroClientes> contatos = new ArrayList<>();
        try {
            ManipuladorArquivo m = new ManipuladorArquivo("C:\\Users\\Aluno\\Desktop\\pratica25.txt");
            ArrayList<String> linhas = m.lerParaArrayList();
            
            for (int i = 0; i < linhas.size(); i++) {
                String linha = linhas.get(i);
                CadastroClientes c= new CadastroClientes();
                String[] vetor = linha.split(";");
                c.setNome(vetor[0]);
                c.setMatricula(vetor[1]);
                c.setEndereco(vetor[2]);
                c.setTelefone(vetor[3]);
               
                contatos.add(c);
            }
            

          
        } catch (Exception ex) {

            throw new DAOException("Erro");
        }

        return contatos;
    }
    
}

