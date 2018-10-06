package com.webapptemplate.web.test.unitest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.webapptemplate.web.model.Categoria;
import com.webapptemplate.web.service.CategoriaBO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:WebContent/WEB-INF/WebappTemplate-servlet.xml")
public class BasicTest {
	
	@Autowired
	private CategoriaBO categoriaBO;
	
	@Test
    public void tesMethod() {
		try {
			Collection<Categoria> listaCategorias = this.categoriaBO.listCategorias();
			assertNotNull("Retorno de Categorias no NULO", listaCategorias);							
		} catch (Exception e) {
			System.err.println("Excepción durante Consulta de Categorias");
			fail(); 		
		}
    }
}
