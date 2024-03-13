package vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models.Product;
import vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.responsitories.ProductRepository;

@SpringBootTest
class KtpmTuan720058761BichApplicationTests {

	@Autowired
	private ProductRepository productRepository;
	@Test
	void contextLoads() {
		Product product= Product.builder().id(1).name("sonpham").soLuongTon(100).imageURL("abc").build();
		System.out.println(product);
		String a =new Gson().toJson(product,Product.class);
		System.out.println(a);
	}

}
