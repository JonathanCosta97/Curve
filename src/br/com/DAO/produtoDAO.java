/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.modelo.Produtos;
import br.com.util.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class produtoDAO {

    private Session session;
    private Transaction transaction;

    public produtoDAO() {
        this.session = HibernateUtil.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
    }

    public void salvarProduto(Produtos p) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            session.save(p);
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + p
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            session.clear();
        }
    }

    public void deletarProduto(Produtos p) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            session.delete(p);
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + p
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            session.close();
        }
    }

    public void atualizar(Produtos p) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            session.merge(p);
            transaction.commit();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + p
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            session.close();
        }
    }

    public List<Produtos> listarProdutos() {
        List<Produtos> produtos = null;

        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            produtos = session.createCriteria(Produtos.class).list();

        } catch (Exception e) {
            if (this.transaction.isActive()) {
                this.transaction.rollback();
            }
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação"
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return produtos;
    }

    public Produtos pesquisarProdutoID(int id) {
        try {
            this.session = HibernateUtil.getSessionFactory().openSession();
            this.transaction = session.beginTransaction();
            Produtos produtos = (Produtos) session.createCriteria(Produtos.class).add(Restrictions.eq("id", id)).uniqueResult();
            return produtos;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" 
            + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }finally{
           session.close();
        }
        return null;
    }

}
