public class Product {
    private double productCost;
    private int productQuantity;
    private String productName;


public Product (double cost, int quantity, String name){
    this.productCost = cost;
    this.productQuantity = quantity;
    this.productName = name;
}

public void totalCost(){
    if (productQuantity < 1){
        System.out.println("You do not have any products to calculate");
    }else{
        double sum = productCost * productQuantity;
        System.out.println("Total cost: $" + sum);
    }
}

public void printProduct(){
    System.out.println(productName +  " costs $" + productCost + " each and " +productQuantity + " units were purchased.");
    }   
}

