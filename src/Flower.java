public class Flower extends Artifact {
    public Flower() {
        super();
        super.type = "Flower";
        this.AddMainStatValue();
    }

    @Override
    protected void AddMainStatValue() {
        super.substatsDict.get("HP")[0] += 2500;
    }
}
