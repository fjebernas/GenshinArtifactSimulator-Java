public class Goblet extends Artifact {
    public Goblet() {
        super();
        super.type = "Goblet";
        super.mainStat = super.RollAStat();
        AddMainStatValue(mainStat);
    }

    @Override
    protected void AddMainStatValue(String _mainStat) {
        super.substatsDict.get(_mainStat)[0] += 1500;
    }
}
