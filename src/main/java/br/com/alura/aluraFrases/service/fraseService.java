package br.com.alura.aluraFrases.service;

import br.com.alura.aluraFrases.dto.FraseDTO;
import br.com.alura.aluraFrases.model.Frase;
import br.com.alura.aluraFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class fraseService {
    @Autowired
    FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster());
    }
}
