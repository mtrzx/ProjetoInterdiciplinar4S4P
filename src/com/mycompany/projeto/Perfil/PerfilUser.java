/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto.Perfil;

/**
 *
 * @author jovic
 */
public class PerfilUser {
    
    String name, email, agencia, cpf, endress, conta;

    public PerfilUser(String name, String email, String agencia, String cpf, String endress, String conta) {
        this.name = name;
        this.email = email;
        this.agencia = agencia;
        this.cpf = cpf;
        this.endress = endress;
        this.conta = conta;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndress() {
        return endress;
    }
    public void setEndress(String endress) {
        this.endress = endress;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }


    @Override
    public String toString() {
        return "Usuário: " + name + " | Email: " + email + " | Agencia: " + agencia + " | CPF: " + cpf + " | Endereço: " + endress + " | Número da conta: " + conta;
    }
}
