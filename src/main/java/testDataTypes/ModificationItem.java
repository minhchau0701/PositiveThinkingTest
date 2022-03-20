package testDataTypes;

import java.util.List;

public class ModificationItem {
    private String group;
    private List<String> value;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }
}
