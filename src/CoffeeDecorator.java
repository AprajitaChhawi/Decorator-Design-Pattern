public abstract class CoffeeDecorator extends Coffee{
    Coffee coffee;

    @Override
    public  abstract String getDescription();

    @Override
    public Size getSize() {
        return coffee.getSize();
    }
}
