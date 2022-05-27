package br.com.senaibrasilia.projetofinal.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.dao.CategoriaDao;
import br.com.senaibrasilia.projetofinal.dao.ProdutoDao;
import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;

public class Principal {
	
	
    private static void cadastrarProduto() {
        Categoria jogos = new Categoria("Jogos");
        Produto jogo = new Produto("The Last of Us pt2", "aventura, ação, terror", new BigDecimal("200"), jogos );
       
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDAO = new ProdutoDao(em);
        CategoriaDao categoriaDao = new CategoriaDao(em);
       
        em.getTransaction().begin();
       
        categoriaDao.cadastrar(jogos);
        produtoDAO.cadastrar(jogo);
       
        em.getTransaction().commit();
        em.close();
    }
    public static void main(String[] args) {
       
    	cadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDao produtoDao = new ProdutoDao(em);
       
        Produto p = produtoDao.buscarPorId(1l);
        System.out.println(p.getPreço());
       
        List<Produto> todos = produtoDao.buscarPorNomeDaCategoria("Jogos");
        todos.forEach(p2 -> System.out.println(p.getNome()));
        
        System.out.println("Pronto!");
    } 
}
