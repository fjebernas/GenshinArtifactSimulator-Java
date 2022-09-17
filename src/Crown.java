public class Crown extends Artifact {
    public Crown() {
        super();
        super.type = "Crown";
        super.mainStat = super.RollAStat();
        AddMainStatValue(mainStat);
    }

    @Override
    protected void AddMainStatValue(String _mainStat) {
        super.substatsDict.get(_mainStat)[0] += 1500;
    }
}
