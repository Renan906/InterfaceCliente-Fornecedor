/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceclienteefornecedor;

/**
 *
 * @author Renan Rezende
 */
public class Fornecedor {
    
    private String nome;
    private String telefone;
    private String email;
    private String cnpj;
    
    public String obterNome(){
        return nome;
    }
    public String obterTelefone(){
        return telefone;
    }
    public String obterEmail(){
        return email;
    }
    public String obterCnpj(){
        return cnpj;
    }
    public void atualizarNome(String nome){
        this.nome = nome;
}
    public void atualizarTelefone(String telefone){
        this.telefone = telefone;
}
    public void atualizarEmail(String email){
        this.email = email;
}
    public void atualizarCnpj(String cpf){
        this.cnpj = cnpj;
    }
}
    
    

