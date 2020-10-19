interface Product{
    public void display();
}

class ProductConcerete implements Product{

    public void display(){
        System.out.println("Displaying product");
    }

}


class ProductFactory{

    public Product createProduct(){
        return new ProductConcerete();
    }

}


//------------------------------------------Main method-------------------------------

//curentl its factory method pattern
//if we were having two mehtods in Productfactory createProductA() & createProductB() then its abstract factory method
//Consider these product A and product B are UI elements for mac or windows
//ProductFactory might implements another interface but not required

class FactoryDesignP{
    public static void main(String... args){

        ProductFactory pf = new ProductFactory();
        Product p = pf.createProduct();
        p.display();


    }
}
