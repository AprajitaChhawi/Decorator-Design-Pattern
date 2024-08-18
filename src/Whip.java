public class Whip extends CoffeeDecorator{
    public Whip(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" and added whip";
    }

    @Override
    public double cost() {
        if(coffee.getSize()==Size.TALL){
            return coffee.cost()+10;
        }else if(coffee.getSize()==Size.GRANDE){
            return coffee.cost()+20;
        } else {
            return coffee.cost() + 5;
        }
    }

}
