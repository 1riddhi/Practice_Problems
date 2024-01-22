import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Product {
  
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

public class CsvProductTotal {
    public static void main(String[] args) {
        String path = "product.csv";

        List<Product> list=new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
           
            String line="";

            while ((line = reader.readLine()) != null) {
                
                //System.out.println(line);
                String[] arr=line.split(",");

                System.out.print(Arrays.toString(arr));
                list.add(new Product(arr[0],Double.parseDouble(arr[1]),Integer.parseInt(arr[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double total=list.stream().mapToDouble(Product::getTotal).sum();

        System.out.println("total value = "+total);


    }
}
