package vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order_Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int soLuong;
    @OneToMany(mappedBy = "orderProduct")
    private List<OrderDetail_Product> orderDetailProducts;

    @Override
    public String toString() {
        return "Order_Product{" +
                "id=" + id +
                ", soLuong=" + soLuong +
                '}';
    }
}
