package com.hilton.restjax.service;

import com.hilton.restjax.controller.request.SoldadoEditRequest;
import com.hilton.restjax.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {
    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Hilton");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flecha");
        return soldado;
    }
    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {
    }
    public List<Soldado> buscarSoldados(){
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("098765431242");
        soldado1.setNome("joao");
        soldado1.setRaca("humano");
        soldado1.setArma("facão");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("12345678909");
        soldado2.setNome("marcelo");
        soldado2.setRaca("humano");
        soldado2.setArma("metralhadora");

        return Arrays.asList(soldado1,soldado2);
    }
}
