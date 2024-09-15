package designpatterns.builderpattern;

public class ProductTest {

    public static void main(String[] args) {
        //UseCase 1: only mandatory fields
        Product product1 = new Product.ProductBuilder("Apple Macbook pro", 1000).build();
        System.out.println(product1); //Product{name='Apple Macbook pro', price=1000.0, description='null', category='null', discount=0.0, freeShipping=false, stock=0}

        System.out.println(product1.getCategory()); //null

        //UC2: mandatory+optional fields
        Product product2 = new Product.ProductBuilder("Samsung Monitor", 500)
                .setCategory("Electronics")
                .setDescription("This is 17 inches monitor")
                .setDiscount(10)
                .setFreeShipping(false)
                .setStock(50)
                .build();

        System.out.println(product2);
        //Product{name='Samsung Monitor', price=500.0, description='This is 17 inches monitor', category='Electronics', discount=10.0, freeShipping=false, stock=50}

        //updating discount
        product2.setDiscount(5);
        System.out.println(product2);
        //Product{name='Samsung Monitor', price=500.0, description='This is 17 inches monitor', category='Electronics', discount=5.0, freeShipping=false, stock=50}

        System.out.println(product2.getCategory());//Electronics

        //UC3:
        Product product3 = new Product.ProductBuilder("Tshirt Nike", 250)
                .setCategory("Fashion")
                .setFreeShipping(true)
                .setStock(100)
                .build();

        System.out.println(product3);
        //Product{name='Tshirt Nike', price=250.0, description='null', category='Fashion', discount=0.0, freeShipping=true, stock=100}

        product3.setDescription("Black color M size formal tShirt");
        System.out.println(product3);
        //Product{name='Tshirt Nike', price=250.0, description='Black color M size formal tShirt', category='Fashion', discount=0.0, freeShipping=true, stock=100}

    }

}
