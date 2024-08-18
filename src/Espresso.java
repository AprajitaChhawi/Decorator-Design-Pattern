public class Espresso extends Coffee{

    public Espresso(Size size) {
        this.size = size;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " espresso";
    }

    @Override
    public double cost() {
        double cost =30.0;
        if(getSize()==Size.TALL){
            cost = cost+10.00;
        }else if(getSize()==Size.GRANDE){
            cost = cost+5.00;
        } else {
            cost = cost+3.00;
        }
        return cost;
    }

    @Override
    public Size getSize() {
        return super.getSize();
    }
}
