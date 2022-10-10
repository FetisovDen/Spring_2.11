package pro.sky.Spring_2_11;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShopCartService {

    public final List<Integer> shopCartList = new ArrayList<>();

    public Integer addIdItem(Integer idItem) {
        Item item = new Item(idItem);
        shopCartList.add(idItem);
        return item.getIdItem();
    }

    public List<Integer> getAllIdItem() {
        return shopCartList;
    }








}
