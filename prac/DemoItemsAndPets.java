public class DemoItemsAndPets {

    public static void main(String[] args){
        ItemSold leash = new ItemSold(1,"dog leash",12.0);
        PetSold dog = new PetSold(2,"black keplie puppy", 320.0,
                true,true,false);

        System.out.println("item " + leash.getDescription() + " invoice " + leash.getInvoiceNumber()
                + " price $"+ leash.getPrice());

        System.out.println("pet " + dog.getDescription() + " invoice " + dog.getInvoiceNumber()
                + " price $"+ dog.getPrice());
    }
}
