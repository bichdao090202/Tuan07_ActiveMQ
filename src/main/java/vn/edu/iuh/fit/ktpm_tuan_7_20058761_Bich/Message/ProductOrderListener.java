package vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.Message;

import com.google.gson.Gson;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models.Order_Product;
import vn.edu.iuh.fit.ktpm_tuan_7_20058761_Bich.models.Product;

@Component
public class ProductOrderListener {
    @JmsListener(destination = "order_products")
    public void receiveMessage(final Message jsonMessage) throws JMSException {
        String messageData = null;
        String response = null;
        if (jsonMessage instanceof TextMessage) {
            Product convertedObject = new Gson().fromJson(((TextMessage) jsonMessage).getText(), Product.class);
            System.out.println(convertedObject);
        }
        //1. read message data
        //2. ==> decode
        //3. check for quantity
        //4. make order or reject
        //5. send email
    }
}
