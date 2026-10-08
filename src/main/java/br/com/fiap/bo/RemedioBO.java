package br.com.fiap.bo;

import br.com.fiap.dao.RemedioDAO;
import br.com.fiap.to.RemedioTO;

import java.time.LocalDate;
import java.util.ArrayList;

public class RemedioBO {
    private RemedioDAO remedioDAO;
    public ArrayList <RemedioTO> findAll(){
        remedioDAO = new RemedioDAO();
        // aqui se implementa as regras de negocios
        return remedioDAO.findAll();
    }

    public RemedioTO findByCodigo(Long codigo){
        remedioDAO = new RemedioDAO();
        // aqui se implementa as regras de negocios
        return remedioDAO.findByCodigo(codigo);
    }

    public RemedioTO save(RemedioTO remedio){
        remedioDAO = new RemedioDAO();
        //aqui se implementa a regra de negocios
        return remedioDAO.save(remedio);
    }
}
