package models;

import java.io.Serializable;

public class room implements Serializable{
    private String typeOfRoom;
    private int amount;
    private int price;


    public room(){}
    public room(String typeOfRoom,int amount,int price){
        this.typeOfRoom=typeOfRoom;
        this.amount=amount;
        this.price=price;
    }

    public int getAmount() {
        return amount;
    }
    public int getPrice() {
        return price;
    }
    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Type: "+this.typeOfRoom+" amount: "+this.amount+" Costs: "+this.price+" per night";
    }
}
