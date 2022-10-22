public class Products {
    public Products(int id, String name, int unitPrice, String details){
        this.id=id;



    }
    public void addToCart(Products products){
        System.out.println("Ürün Sepete Eklendi"+ products.name);
    }

}


