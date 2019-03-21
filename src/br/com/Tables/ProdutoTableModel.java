
package br.com.Tables;

import br.com.modelo.Produtos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ProdutoTableModel extends AbstractTableModel{
    
    List<Produtos> produto = new ArrayList<Produtos>();
    private String[] colunas = {"ID","Nome","N° Barra","Preço"};

    public ProdutoTableModel(List<Produtos> produto){
        this.produto.addAll(produto);
    }
    
    @Override
    public int getRowCount() {
       return produto.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        List<Produtos> produtoList = new ArrayList<Produtos>();
        produtoList.addAll(produto);
        
        Produtos produtos = produtoList.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return produtos.getId();
            
            case 1:
                return produtos.getNome();
                
            case 2:
                return produtos.getCodBarra();
            
            case 3:
                return produtos.getPreco();
        }
        return  null;
    }
    
    public String getColumnName(int index){
        
        switch(index){
            
            case 0:
                return colunas[0];
            
            case 1:
                return colunas[1];
                
            case 2:
                return colunas[2];
                
            case 3:
                return colunas[3];
        }
        
        return null;
    }
}
