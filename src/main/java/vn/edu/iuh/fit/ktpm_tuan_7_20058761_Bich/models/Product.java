package vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    @Id
    private long id;
    private String name;
    private int soLuongTon;
    private String imageURL;
    @OneToMany(mappedBy = "product")
    private List<OrderDetail_Product> orderProductList;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", soLuongTon=" + soLuongTon +
                ", imageURL='" + imageURL + '\'' +
                ", orderProductList=" + orderProductList +
                '}';
    }
}
