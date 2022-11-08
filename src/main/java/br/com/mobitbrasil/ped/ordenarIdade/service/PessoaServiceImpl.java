package br.com.mobitbrasil.ped.ordenarIdade.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.mobitbrasil.ped.ordenarIdade.entity.Pessoa;

@Service
public class PessoaServiceImpl implements IPessoaService{

	/**
     * Realizar a ordenação da listagem de pessoas utilizando o atributo idade de @Pessoa
     *
     * @param pessoas - Lista de pessoas
     *
     * @return
     */
	@Override
	public List<Pessoa> ordenar(List<Pessoa> pessoas) {
		Collections.sort(pessoas);
		return pessoas;
	}

}
