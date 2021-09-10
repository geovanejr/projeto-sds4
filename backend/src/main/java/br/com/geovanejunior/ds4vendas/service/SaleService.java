package br.com.geovanejunior.ds4vendas.service;

import br.com.geovanejunior.ds4vendas.dto.SaleDTO;
import br.com.geovanejunior.ds4vendas.repositories.SaleRepository;
import br.com.geovanejunior.ds4vendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepo;

    @Autowired
    private SellerRepository sellerRepo;

    public List<SaleDTO> findAll() {

        final var sale = saleRepo.findAll();
        return sale.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Page<SaleDTO> findPageAll(Pageable pageable) {

        sellerRepo.findAll();
        final var sale = saleRepo.findAll(pageable);
        return sale.map(x -> new SaleDTO(x));
    }
}
