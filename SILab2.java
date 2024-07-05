import java.util.List;

class Item {
    String name;
    String barcode; //numerical
    int price;
    float discount;

    public Item(String name, String code, int price, float discount) {
        this.name = name;
        this.barcode = code;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    public int getPrice() {
        return price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode(String code) {
        this.barcode = code;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}


public class SILab2 {
    public static boolean checkCart(List<Item> allItems, int payment){
        if (allItems == null){
            throw new RuntimeException("allItems list can't be null!");
        }

        float sum = 0;

        for (Item item : allItems){
            if (item.getName() == null || item.getName().length() == 0){
                item.setName("unknown");
            }
            if (item.getBarcode() != null){
                if (!item.getBarcode().matches("\\d+")) {
                    throw new RuntimeException("Invalid character in item barcode!");
                }
                if (item.getDiscount() > 0){
                    sum += item.getPrice() * item.getDiscount();
                } else {
                    sum += item.getPrice();
                }
            } else {
                throw new RuntimeException("No barcode!");
            }
            if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0'){
                sum -= 30;
            }
        }
        return sum <= payment;
    }
}

