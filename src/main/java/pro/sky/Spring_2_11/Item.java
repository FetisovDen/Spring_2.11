package pro.sky.Spring_2_11;


import java.util.Objects;

public class Item {
    private int idItem;

    public Item(int idItem) {
        this.idItem = idItem;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return getIdItem() == item.getIdItem();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdItem());
    }

    @Override
    public String toString() {
        return "ShopCart:" +
                "idItem=" + idItem;
    }
}
