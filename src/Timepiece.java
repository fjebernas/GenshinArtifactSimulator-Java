public class Timepiece extends Artifact {
    public Timepiece() {
        super();
        super.type = "Timepiece";
        super.mainStat = super.RollAStat();
        AddMainStatValue(mainStat);
    }

    @Override
    protected void AddMainStatValue(String _mainStat) {
        super.substatsDict.get(_mainStat)[0] += 1500;
    }
}
