public class StringParts{
    /**
     * Created by Elí.Arizpe on 10/03/2020
     * Clase que castea un String e imprimes sus valores en partes
     */
    public static void main(String []args){
        String rawInput = "Bread$$##12.5$$##10";
        String[] parts = rawInput.split("\\$\\$\\#\\#");
        String name = parts[0];
        Double price = Double.valueOf(parts[1]);
        Integer quantity = Integer.valueOf(parts[2]);
        System.out.println("Item Name: "+name);
        System.out.println("Item Price: "+price);
        System.out.println("Item Quantity: "+quantity);
    }
}