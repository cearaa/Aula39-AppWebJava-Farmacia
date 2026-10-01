package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.util.ArrayList;

//Pacote de regra de negócios, Business Object.
//Validações

public class RemedioBO {
    private RemedioDAO remedioDAO;

    public ArrayList<RemedioTO> findAll() {
        remedioDAO = new RemedioDAO();
        // aqui se implementa as regras de negócios
        return remedioDAO.findAll();
    }

}

