/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Aluno
 */
class CadastroFuncionarios {
   String nome, senha, telefone, matricula;
   int cont=320;
   public void getCadastroFuncionarios (){
      matricula="0000";
      
      senha="0000";
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String mat) {    
        this.matricula =cont+"F"+mat;
        cont++;
    }
    
    
   
   
}
