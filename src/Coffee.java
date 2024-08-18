public abstract class Coffee {
    public enum Size{TALL,GRANDE,VENTI};
    Size size = Size.TALL;
    String Description = "Just coffee";

    public String getDescription() {
        return Description;
    }
    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
