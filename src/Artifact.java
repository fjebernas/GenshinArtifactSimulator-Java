import java.text.MessageFormat;
import java.util.*;

public class Artifact {
    protected String type;
    protected String mainStat;

    private Random rnd = new Random();

    protected Map<String, int[]> substatsDict = new HashMap<>(){
        {
            put("Attack", new int[]{0,0});
            put("Defense", new int[]{0,0});
            put("HP", new int[]{0,0});
            put("Luck", new int[]{0,0});
        }
    };

    public Artifact() {
        for (int i = 0; i < 5; i++) {
            UpgradeSubstat(RollAStat());
        }
    }

    private void UpgradeSubstat(String _substat) {
        substatsDict.get(_substat)[0] += 250;
        substatsDict.get(_substat)[1]++;
    }

    protected String RollAStat() {
        List<String> keys = new ArrayList<String>(substatsDict.keySet());
        return keys.get(rnd.nextInt(0, keys.size()));
    }

    protected void AddMainStatValue() {
        // virtual method
    }

    protected void AddMainStatValue(String _mainStat) {
        // virtual method
    }

    public void PrintDetails() {
        if (this instanceof Timepiece || this instanceof Goblet || this instanceof Crown) {
            System.out.println("Artifact type: " + type + "     **Main stat: " + mainStat + "**" + "\n");
        } else {
            System.out.println("Artifact type: " + type);
        }

        for (Map.Entry<String, int[]> s: substatsDict.entrySet()) {
            String substat = s.getKey();
            String substatVal = String.valueOf(s.getValue()[0]);
            String substatUpgradesCount = String.valueOf(s.getValue()[1]);
            System.out.println(MessageFormat.format("{0}: {1}       Upgraded {2} times",substat, substatVal, substatUpgradesCount));
        }
        System.out.print("\n\n");
    }
}
