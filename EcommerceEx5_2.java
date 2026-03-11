import Ecommerce.*;

class EcommerceEx5_2
{
    public static void main(String[] args)
    {
        Product p = new Product("Laptop",50000);
        Customer c = new Customer("Mahesh");
        Order o = new Order();

        p.displayProduct();
        c.displayCustomer();

        double total = o.calculateTotal(50000,2);

        System.out.println("Total Cost: " + total);
    }
}
