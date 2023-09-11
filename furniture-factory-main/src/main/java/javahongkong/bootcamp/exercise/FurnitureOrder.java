package javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.ordersOfFurnitures = new HashMap<>();
    }

    HashMap<Furniture, Integer> ordersOfFurnitures = new HashMap<>(); 
   

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        this.ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        float total = 0.0f;
        for (Furniture i : ordersOfFurnitures.keySet()) {
           // i.cost();
            //ordersOfFurnitures.get(i);
            total += ordersOfFurnitures.get(i) * i.cost();
        }

        return total;//
    }

    public int getTypeCount(Furniture type) {
        if(!ordersOfFurnitures.containsKey(type)){
            return 0;
        }
        // TODO: Complete the method
        return ordersOfFurnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if(!ordersOfFurnitures.containsKey(type)){
            return 0.0f;
        }
        

        return ordersOfFurnitures.get(type) * type.cost();
        
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        int count =0;
        for(Furniture i :ordersOfFurnitures.keySet())
        count += ordersOfFurnitures.get(i);
        
        // int count1 = 0;
        // for(Integer i : ordersOfFurnitures.values())
        // count1 += i;

        return count;
    }

    public static void main(String[] args) {
        FurnitureOrder i = new FurnitureOrder();
        i.addToOrder(Furniture.CHAIR, 1);
        i.addToOrder(Furniture.COUCH, 1);
        i.addToOrder(Furniture.TABLE, 1);
        i.addToOrder(Furniture.TABLE, 2);

        System.out.println(i.ordersOfFurnitures.keySet());
        System.out.println(i.ordersOfFurnitures.keySet());

    }
}