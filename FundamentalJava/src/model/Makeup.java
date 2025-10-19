package model;

public class Makeup {
    public int id;
    public String name;
    public String brand;
    public String type;
    public double price;

    public Makeup(int id, String name, String brand, String type, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Nama Produk: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Jenis: " + type);
        System.out.println("Harga: Rp" + price);
    }
}
