public class itemNotFoundException extends Throwable {
    public itemNotFoundException(String itemName) {
        System.out.println();
        super(itemName);
    }
}
