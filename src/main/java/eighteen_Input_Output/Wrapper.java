package eighteen_Input_Output;

import java.util.List;
import java.util.Locale;

public class Wrapper {

public class TableInterfaceWrapper implements TableInterface {
 private TableInterface tableInterface;
 public TableInterfaceWrapper(TableInterface name)
 {
     this.tableInterface = name;
 }
    @Override
    public void setModel(List rows) {
        System.out.println(rows.size());
        tableInterface.setModel(rows);
    }

    @Override
    public String getHeaderText() {
        return tableInterface.getHeaderText().toUpperCase(Locale.ROOT);
    }

    @Override
    public void setHeaderText(String newHeaderText) {
tableInterface.setHeaderText(newHeaderText);
    }
}

public interface TableInterface {
    void setModel(List rows);

    String getHeaderText();

    void setHeaderText(String newHeaderText);
}

    public static void main(String[] args) {
    }
}
