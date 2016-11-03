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
  public class CadastroClientes<P> extends Livro{

    private ArrayList<Object> lista = new ArrayList<>();

    String  nome, dataSaida, dataEntrada, telefone, endereco, data;
    P matricula;
    int saida, dia, mes, ano, alerta;

    public CadastroClientes( P matricula) {
        if ( matricula!=null) {
            this.matricula = matricula;
        } else {
            System.out.println("Cadastro inválido!");

        }

    }
    public void setNome(String nome){
        if(nome.length()>0){
            this.nome=nome;
        }
    }

    public P getMatricula() {
        return this.matricula;
    }

    public String getNomeC() {
        return this.nome;
    }

    public CadastroClientes(int dia, int mes, int ano) {

        if (dia <= 29 && mes >= 1 && mes <= 12 && ano >= 2016) {
            this.data = dia + "/" + mes + "/" + ano;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            if (!this.data.equals(null)) {
                System.out.println("Hoje é: " + this.data + "?\t\t\t Digite sim para confirmar");
            }
        } else {
            System.out.println("Data inválida!");
        }
    }

    public String getData() {
        return this.data;
    }

    public void setDataEntrada(int dia, int mes, int ano) {
        saida = dia + 20;
        if (dia <= 29 && mes >= 1 && mes <= 12 && ano >= 2016) {
            if (saida > 30) {
                dia = saida - 30;
                mes += 1;
                if (mes > 12) {
                    ano += 1;
                }
                dataSaida = dia + "/" + mes + "/" + ano;
            } else {
                dataEntrada = dia + "/" + mes + "/" + ano;
                dataSaida = dataEntrada;
            }
        } else {
            System.out.println("Data inválida!");
        }
        if (this.dia > dia || this.mes > mes || this.ano > ano) {
            System.out.println("--------Livro atrasado!--------------");
            alerta = 1;

        }
    }

    public String getDataEntrada() {
        return this.dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setTelefone(String tel) {
        if (tel.length() > 8) {
            this.telefone = tel;
        } else {
            System.out.println("Telefone invalido");
        }
    }

    public void setEndereco(String end) {
        if (end.length() > 5) {
            this.endereco = end;
        } else {
            System.out.println("Endereço invalido!");
        }
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void entrada(Livro c) {
        if (alerta != 1) {
            System.out.println(c.getNome());
            System.out.println(c.getAutor());
            System.out.println(c.getCodigo());

            System.out.println("Data de entrada:" + this.dataEntrada);
            if (quantidade > 0) {
                quantidade--;
                System.out.println("Quantidade disponivel:"+quantidade);
            } else {
                System.out.println("Exemplares indisponíveis");
            }

        } else {
            System.out.println("Devolução atrasada!");
        }
    }

    public void controleEmprestimo(Livro c) {
        if (alerta == 1) {
            lista.add(getNomeC());
            lista.add(getMatricula());
            lista.add(getCodigo());
            lista.add(getNome());
            lista.add(getAutor());

        } else {
            System.out.println("Nome :" + this.nome);
            System.out.println("Matricula:" + this.matricula);
            System.out.println("\t\t\t\t--------Contato-----------");
            System.out.println("Telefone:" + getTelefone());
            System.out.println("Endereço:" + getEndereco());
            System.out.println("\t\t\t\t\t\t\t\t---------Devolução----------");
            System.out.println("Data de entrada:");
            entrada(c);
            System.out.println("Previsão de saída:" + this.dataSaida);
        }

    }

    public void atrasado() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("---------Atrasados-----------------\n" + lista.get(i)+"\n\n");
        }
    }
}  

