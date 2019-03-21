
package main;


import br.com.DAO.produtoDAO;
import br.com.modelo.Produtos;
import br.com.modelo.Usuarios;


public class main {
    public static void main(String[] args) {
        
      
        Produtos p = new Produtos();
        produtoDAO pdao = new produtoDAO();
     
        Produtos produtoEncontrado = pdao.pesquisarProdutoID(6);
        produtoEncontrado.setPreco(150);
        pdao.atualizar(produtoEncontrado);
        
        
        
    }
    
}
