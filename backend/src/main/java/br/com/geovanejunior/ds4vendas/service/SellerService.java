package br.com.geovanejunior.ds4vendas.service;

import br.com.geovanejunior.ds4vendas.dto.SellerDTO;
import br.com.geovanejunior.ds4vendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepo;

    public List<SellerDTO> findAll() {

        final var seller = sellerRepo.findAll();
        return seller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
