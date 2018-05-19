package br.emprestimo.persistence;

import java.util.ArrayList;
import java.util.List;

import br.emprestimo.modelo.Emprestimo;

public class EmprestimoDAO {
	List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

	public boolean adiciona(Emprestimo umEmprestimo) {
		
		return emprestimos.add(umEmprestimo);
	}

	public Emprestimo consulta(Emprestimo umEmprestimo) {
		for(Emprestimo emprestimo : emprestimos){
			if(emprestimos.contains(umEmprestimo)){
				return emprestimo;
			}
		}
		return null;
	}

}
