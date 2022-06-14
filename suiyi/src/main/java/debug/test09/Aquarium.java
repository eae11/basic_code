package debug.test09;

import java.util.ArrayList;
import java.util.Arrays;

class Aquarium {
    private ArrayList<Fish> fish;

    /*
    *
    * 在这段代码中，我们有一个实例变量 ( fish)，它被打印了两次。变量的 getterfish采用延迟初始化，这意味着对象仅在第一次需要时才被初始化。

现在 iffish已经被初始化了（假设我们在line n1），并且我们想要查看该initFish方法怎么办？(fish == null)只有在评估为时才会执行此方法true。

在这个简单的例子中，我们可以在方法中放置一个断点并重新启动会话。但是，在更复杂的情况下，您可能会发现重新启动会话并执行导致特定状态的所有步骤非常不方便。现在让我们学习更聪明的方法。*/
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        System.out.println(aquarium.getFish());
        // fish has already been initialized
        System.out.println(aquarium.getFish()); // line n1
    }

    private ArrayList<Fish> getFish() {
        if (fish == null) initFish();
        return fish;
    }

    private void initFish() {
        fish = new ArrayList<>(Arrays.asList(
                new Fish("Bubbles"),
                new Fish("Calypso"),
                new Fish("Dory")
        ));
    }
}

class Fish {
    private final String name;

    Fish(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}