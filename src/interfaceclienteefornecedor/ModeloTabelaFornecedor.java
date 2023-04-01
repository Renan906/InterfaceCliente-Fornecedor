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
public class ModeloTabelaFornecedor extends AbstractTableModel {
    
    private static final int COLUNA_NOME = 0;
    private static final int COLUNA_TELEFONE = 1;
    private static final int COLUNA_EMAIL = 2;
    private static final int COLUNA_CNPJ = 3;
    
    private String[] colunas = new String[]{"Nome", "Telefone", "E-mail", "CNPJ"};
    private ArrayList<Fornecedor> fornecedores;
    
    public ModeloTabelaFornecedor(){
        this.fornecedores = new ArrayList<Fornecedor>();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public int getRowCount(){
        return fornecedores.size();
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
        Fornecedor fornecedor = fornecedores.get(row);
        switch(col){
            case COLUNA_NOME:
                return fornecedor.obterNome();
            case COLUNA_TELEFONE:
                return fornecedor.obterTelefone();
            case COLUNA_EMAIL:
                return fornecedor.obterEmail();
            case COLUNA_CNPJ:
                return fornecedor.obterCnpj();
        }
        return"";
    }
    
    @Override
    public void setValueAt(Object aValue, int row, int column){
        Fornecedor fornecedor = fornecedores.get(row);
        switch(column){
            case COLUNA_NOME:
                fornecedor.atualizarNome(aValue.toString());
                break;
            case COLUNA_TELEFONE:
                fornecedor.atualizarTelefone(aValue.toString());
                break;
            case COLUNA_EMAIL:
                fornecedor.atualizarEmail(aValue.toString());
                break;
            case COLUNA_CNPJ:
                fornecedor.atualizarCnpj(aValue.toString());
                break;
        }
    }
    
    public Fornecedor obterFornecedor(int indice){
        return fornecedores.get(indice);
    }
    public void incluirFornecedor(Fornecedor fornecedor){
        fornecedores.add(fornecedor);
        int ultimo = getRowCount()-1;
        fireTableRowsInserted(ultimo, ultimo);
    }
    public void atualizarFornecedor(int indice, Fornecedor fornecedor){
        fornecedores.set(indice, fornecedor);
        fireTableRowsUpdated(indice, indice);
    }
    public void excluirFornecedor(int indice){
        fornecedores.remove(indice);
        fireTableRowsDeleted(indice, indice);
    }  
}
 
    

