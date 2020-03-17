package Atividade;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTeste {
	Pais pais, copia;
	static int id = 0;

	
	@Befone
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, "Itália", 60665551, 301338);
		copia = new Pais(id, "Itália", 60665551, 301338);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}

	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Pais fixture = new Pais(10, "Canadá", 37242571, 9984670);
		Pais novo = new Pais(3, null, 0, 0);
		novo.carregar();
		assertEquals("teste carregar", novo.getId(), fixture.getId());
	}

	
	@Test
	public void test01Criar() {
		System.out.println("criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("teste criar", pais.getId(), copia.getId());
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(9999990);
		copia.setPopulacao(9999990);
		pais.atualizar();
		pais.carregar();
		assertEquals("teste atualizar", pais.getId(), copia.getId());
	}

	
	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("teste excluir", pais.getId(), copia.getId());
	}
	
	/*@Test
	public void test04MaiorPopulacacao() {
		System.out.println("maior populacao");
		Pais pais = new Pais(9, "China", 1379302771, 9596961 );
		Pais novo = new Pais();
		novo = novo.maiorPopulacao();
		assertEquals("teste maior populacao", pais.getId(), novo.getId());
	}
	
	@Test
	public void test05MenorArea() {
		System.out.println("menor area");
		Pais copia = new Pais(29, "Uruguai", 3351016, 176215 );
		Pais novo = new Pais();
		novo = novo.menorArea();
		assertEquals("Teste de menor área", copia.getId(), novo.getId());
	
	}
	
	@Test 
	public void test06VetorTresPaises()
	{
	System.out.println("vetor tres paises");
	
	
	
	
	
	}
	
	
	*/
   
   
   
   
}