package sidepractice.crowedquest.CastingAndInheritanceIntro;
class Plant {
}

class Tree extends Plant {
}

class Vegetablee extends Plant {
	void me(){
	System.out.println("working in me");	
	}
}

public class Plants {
    public static void main(String[] args) {
        // Plant plant = new Tree();   // lin  14
        // Tree newTree = plant;       // line 15

        Plant p = new Tree();
        Plant bb = new Plant();
         Tree  t = (Tree) p;
         System.out.println("working!!");

         // another example!!

         Tree tree = new Tree();

         Plant plant = tree;

         




    }
}