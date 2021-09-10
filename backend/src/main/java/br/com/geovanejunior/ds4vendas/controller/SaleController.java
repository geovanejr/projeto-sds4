package br.com.geovanejunior.ds4vendas.controller;

import br.com.geovanejunior.ds4vendas.dto.SaleDTO;
import br.com.geovanejunior.ds4vendas.dto.SellerDTO;
import br.com.geovanejunior.ds4vendas.service.SaleService;
import br.com.geovanejunior.ds4vendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService saleServ;

    @GetMapping
    public ResponseEntity<List<SaleDTO>> findAll() {

        final var saleDTO = saleServ.findAll();

        return ResponseEntity.ok(saleDTO);
    }

    @GetMapping(value="/pagina")
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {

        final var saleDTO = saleServ.findPageAll(pageable);

        return ResponseEntity.ok(saleDTO);
    }
}
