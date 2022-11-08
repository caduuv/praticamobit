package br.com.mobitbrasil.ped.ordenarIdade.service;

import java.util.List;

import br.com.mobitbrasil.ped.ordenarIdade.entity.Pessoa;

public interface IPessoaService {
	 public List<Pessoa> ordenar(List<Pessoa> pessoas);
}
