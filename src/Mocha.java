public class Mocha extends  CoffeeDecorator{
    public Mocha(Coffee coffee) {
        this.coffee=coffee;
    }

    @Override
    public double cost() {
        if(coffee.getSize()==Size.TALL){
            return coffee.cost()+5;
        }else if(coffee.getSize()==Size.GRANDE){
            return coffee.cost()+2;
        } else {
            return coffee.cost() +1;
        }
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" with added mocha";
    }
}
