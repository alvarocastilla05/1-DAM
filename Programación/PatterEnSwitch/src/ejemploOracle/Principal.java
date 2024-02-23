package ejemploOracle;

public class Principal {

    static void test(Object obj) {
        switch (obj) {
            case Character c -> {
                if (c.charValue() == 7) {
                    System.out.println("Ding!");
                }
                System.out.println("Character, value " + c.charValue());
            }
            case Integer i ->
                System.out.println("Integer: " + i);  
            default ->
                throw new IllegalStateException("Invalid argument"); 
        }
    }

}


