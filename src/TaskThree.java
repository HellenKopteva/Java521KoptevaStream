import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskThree {
//TODO: group product by category, count of product in categories and prices sum
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("apple", ProductCategory.FRUIT, 50));
        products.add(new Product("orange", ProductCategory.FRUIT, 60));
        products.add(new Product("avocado", ProductCategory.VEGETABLES, 75));
        products.add(new Product("tomato", ProductCategory.VEGETABLES, 57));
        products.add(new Product("bread", ProductCategory.BAKERY, 45));
        products.add(new Product("cookie", ProductCategory.BAKERY, 25));
        products.add(new Product("beef", ProductCategory.MEAT, 650));

        Map<ProductCategory, List<Product>> grouptedProducts = products.stream().collect(Collectors.groupingBy(product -> product.getCategory()));
        for (Map.Entry<ProductCategory, List<Product>> groupProduct : grouptedProducts.entrySet()){
            System.out.println(groupProduct.getKey().toString() + " " + groupProduct.getValue().stream().count() + " " + groupProduct.getValue().stream().map(( p -> p.getPrice())).reduce((double)0, (a, b) -> a + b));

        }
        System.out.println(grouptedProducts);

     //   products.stream().collect(Collectors.groupingBy(product -> product.getCategory()));

    }
}
