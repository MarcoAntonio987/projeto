
package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import dao.PaisDAO;
import model.Pais;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaisTest {

	@Test
	public void test00Carregar() {
		System.out.println("Carregar país");
		System.out.println(PaisDAO.carregar(1));
		System.out.println(PaisDAO.carregar(2));
		System.out.println(PaisDAO.carregar(3));
	}

	@Test
	public void test01Criar() {
		System.out.println("Criar país");
		PaisDAO.criar("China", 1379302771, 9596961);
		System.out.println(PaisDAO.carregar(6));
		
	}

	@Test
	public void test02Atualizar() {
		System.out.println("Atualizar país");
		PaisDAO.atualizar("Uruguai", "3351016", "1762515");
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test03Excluir() {
		System.out.println("Excluir país");
		PaisDAO.excluir(18);
		System.out.println(PaisDAO.carregar(6));
	}

	@Test
	public void test04PaisMaisHab() {
		System.out.println("Busca do país mais habitado");
		System.out.println(PaisDAO.buscaPaisMaisHab());
	}
	
	@Test
	public void test05PaisMenor() {
		System.out.println("Busca do país menor");
		System.out.println(PaisDAO.buscaPaisMenor());
	}
	
	@Test
	public void test06Vetor() {
		System.out.println("Vetor 3 países");
		Pais[] vetor = PaisDAO.Vetor();
		for (Pais pais : vetor) {
			System.out.println(pais);
		}
	}
}
