package br.com.geovanejunior.ds4vendas.service;

import br.com.geovanejunior.ds4vendas.entities.Sale;
import br.com.geovanejunior.ds4vendas.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepo;

    public List<Sale> findAll() {

        final var sale = saleRepo.findAll();
        return saleRepo.findAll();
    }
}
