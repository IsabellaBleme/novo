/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author aluno
 */
public class Livro<T> {

    String nome, autor;
    T codigo;
    protected int quantidade;

    public void setCodigo(T c) {
        if (c!=null) {
            this.codigo = c;
        }
    }

    public T getCodigo() {
        return this.codigo;
    }

    public void setQuantidade(int q) {
        if (q > 0) {
            quantidade = q;
        } else {
            System.out.println("Quantidade inválida!");
        }
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setNome(String n) {
        if (n.length() > 0) {
            this.nome = n;
        } else {
            System.out.println("Nome invalido!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setAutor(String a) {
        if (a.length() > 0) {
            this.autor = a;
        } else {
            System.out.println("Autor invalido!");
        }
    }

    public String getAutor() {
        return this.autor;
    }
    public void pegarLivro(String codigo){
        
    }
}
