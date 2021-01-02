package abstractFactory;

import com.sun.tools.javac.util.Pair;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HotDrinkMachine {
    private final List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws Exception {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("abstractFactory").getSubTypesOf(HotDrinkFactory.class);
        for (Class<? extends HotDrinkFactory> type : types) {
            Pair<String, HotDrinkFactory> factory = new Pair<>(
                type.getSimpleName().replace("Factory", ""),
                type.getDeclaredConstructor().newInstance()
            );
            namedFactories.add(factory);
        }
    }

    public HotDrink makeDrink() {
        System.out.println("Available drinks:");
        for (int index = 0; index < namedFactories.size(); index++) {
            Pair<String, HotDrinkFactory> item = namedFactories.get(index);

            System.out.println("" + index + ": " + item.fst);
        }

        Scanner reader = new Scanner(System.in);
        int i = reader.nextInt();
        int amount;
        if (i >= 0 && i < namedFactories.size()) {
            System.out.println("Specify amount: ");
            amount = reader.nextInt();
            return namedFactories.get(i).snd.prepare(amount);
        }
        return null;

    }
}
