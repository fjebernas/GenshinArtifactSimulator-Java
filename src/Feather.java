public class Feather extends Artifact {
    public Feather() {
        super();
        super.type = "Feather";
        this.AddMainStatValue();
    }

    @Override
    protected void AddMainStatValue() {
        super.substatsDict.get("Attack")[0] += 1000;
    }
}
