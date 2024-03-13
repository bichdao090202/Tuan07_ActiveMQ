package vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.responsitories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}