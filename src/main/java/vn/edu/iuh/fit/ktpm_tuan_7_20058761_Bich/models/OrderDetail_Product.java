package vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetail_Product {
    @Id
    @ManyToOne
    private Order_Product orderProduct;
    @Id
    @ManyToOne
    private Product product;
    private int soLuongMua;
}
