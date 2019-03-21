/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.DAO;

import br.com.modelo.Usuarios;
import br.com.util.HibernateUtil;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class usuarioDAO {

    Session session;
    Transaction transaction;

    public usuarioDAO() {

        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
    }

    public void salvarDados(Usuarios u) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(u);
            transaction.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível executar essa operação" + u
                    + ". Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            session.close();
        }
    }

    public Usuarios autenticarUsuario(String email, String senha) {
        session = HibernateUtil.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        Usuarios usuarios = (Usuarios) session.createCriteria(Usuarios.class).add(Restrictions.eq("email", email)).
                add(Restrictions.eq("senha", senha)).uniqueResult();

        return usuarios;
    }

}
