/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceclienteefornecedor;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Renan Rezende
 */
public class ModeloTabelaCliente extends  AbstractTableModel   {
    
    private static final int COLUNA_NOME = 0;
    private static final int COLUNA_TELEFONE = 1;
    private static final int COLUNA_EMAIL = 2;
    private static final int COLUNA_CPF = 3;
    
    private String[] colunas = new String[]{"Nome", "Telefone", "E-mail", "CPF"};
    private ArrayList<Cliente> clientes;
    
    public ModeloTabelaCliente(){
        this.clientes = new ArrayList<Cliente>();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public int getRowCount(){
        return clientes.size();
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return colunas[columnIndex];
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
}
    
    @Override
    public Object getValueAt(int row, int col){
        Cliente cliente = clientes.get(row);
        switch(col){
            case COLUNA_NOME:
                return cliente.obterNome();
            case COLUNA_TELEFONE:
                return cliente.obterTelefone();
            case COLUNA_EMAIL:
                return cliente.obterEmail();
            case COLUNA_CPF:
                return cliente.obterCpf();
        }
        return"";
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column){
        Cliente cliente = clientes.get(row);
        switch(column){
            case COLUNA_NOME:
                cliente.atualizarNome(aValue.toString());
                break;
            case COLUNA_TELEFONE:
                cliente.atualizarTelefone(aValue.toString());
                break;
            case COLUNA_EMAIL:
                cliente.atualizarEmail(aValue.toString());
                break;
            case COLUNA_CPF:
                cliente.atualizarCpf(aValue.toString());
                break;
        }
    }
    
    public Cliente obterCliente(int indice){
        return clientes.get(indice);
    }
    public void incluirCliente(Cliente cliente){
        clientes.add(cliente);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
    }
    public void atualizarCliente(int indice, Cliente cliente){
        clientes.set(indice, cliente);
        fireTableRowsUpdated(indice, indice);
    }
    public void excluirCliente(int indice){
        clientes.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }  
}

    

