package javarush.java_core_2.level3.lecture11.task12;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i - 1);
            second = items.get(i);
            second.pull(first);
        }
    }

    public interface RepkaItem {
        public String getNamePadezh();
    }
}
