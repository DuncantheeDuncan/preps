package sidepractice.crowedquest;


class Plant {
}

class Tree extends Plant {
}

class Vegetable extends Plant {
}

public class Plants {
    public static void main(String[] args) {



        Plant plant = new Tree();
        Vegetable vegetable = (Vegetable)plant;




    }
}
