package br.com.geovanejunior.ds4vendas.controller;

import br.com.geovanejunior.ds4vendas.dto.SellerDTO;
import br.com.geovanejunior.ds4vendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerServ;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll() {

        final var sellerDTO = sellerServ.findAll();

        return ResponseEntity.ok(sellerDTO);
    }
}
