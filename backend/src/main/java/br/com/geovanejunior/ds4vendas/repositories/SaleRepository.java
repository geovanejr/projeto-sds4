package br.com.geovanejunior.ds4vendas.repositories;

import br.com.geovanejunior.ds4vendas.dto.SaleSumDTO;
import br.com.geovanejunior.ds4vendas.dto.SaleSuccessDTO;
import br.com.geovanejunior.ds4vendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("Select new br.com.geovanejunior.ds4vendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
            " FROM Sale AS obj " +
            " GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("Select new br.com.geovanejunior.ds4vendas.dto.SaleSuccessDTO(" +
            " obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
            " FROM Sale AS obj " +
            " GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
