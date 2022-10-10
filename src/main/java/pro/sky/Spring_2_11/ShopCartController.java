package pro.sky.Spring_2_11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopCartController {
    private final ShopCartService shopCartService;
    public ShopCartController(ShopCartService shopCartService) {
        this.shopCartService = shopCartService;
    }

    @GetMapping("/add")
    public Integer addId(@RequestParam("id") Integer idItem) {
        return shopCartService.addIdItem(idItem);
    }

    @GetMapping("/get")
    public List<Integer> getAll() {
        return shopCartService.getAllIdItem();
    }


}
