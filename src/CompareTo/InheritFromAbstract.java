package CompareTo;

import DiverseØvelser.AbstractExample;

public class InheritFromAbstract extends AbstractExample {

    @Override
   public void methodFromAbstractClass(){
       super.methodFromAbstractClass();
   }

    @Override
    public void abstractMethod() {
        System.out.println("yoyo");
    }

    public static void main(String[] args) {
        InheritFromAbstract inheritFromAbstract = new InheritFromAbstract();
        inheritFromAbstract.methodFromAbstractClass();
        inheritFromAbstract.abstractMethod();
        System.out.println(inheritFromAbstract instanceof AbstractExample);
    }
}
