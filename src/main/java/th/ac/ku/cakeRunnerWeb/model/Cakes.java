package th.ac.ku.cakeRunnerWeb.model;

import java.util.UUID;

public class Cakes {

    private UUID id;
    private String name;
    private int weight;
    private int price;
    private int amount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public Cakes (UUID id ,String name , int weight, int price, int amount){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "{" +
                id +
                "->" + name +
                "->" + weight +
                "->" + price +
                "->" + amount ;
    }
}