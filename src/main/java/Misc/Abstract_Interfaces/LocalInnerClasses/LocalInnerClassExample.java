package Misc.Abstract_Interfaces.LocalInnerClasses;

/**
 * Created by timmanas on 2017-08-21.
 */
public class LocalInnerClassExample {

    //region Members
    public boolean isInsideMethod = false;
    //endregion

    //region Main Method
    public static void main (String [] args) {

        // Example #1: Class Inside a method body
        System.out.println("========== Inside Method Body ==========");
        LocalInnerClassExample example = new LocalInnerClassExample();
        example.getValue();


        // Example #2: Class Inside an If/Else statement
        System.out.println("\n========== Inside If/Else Statement ==========");
        if(!example.isInsideMethod) {

            class InnerClass_IFBlock {          // Cannot define public, private or protected here

                private String type;

                public InnerClass_IFBlock() {
                    this.type = "IFElse_InnerClass";
                }

                public String getType() {return type;}
                public void setType(String type) { this.type = type;}
            }

            InnerClass_IFBlock innerClassObject = new InnerClass_IFBlock();
            System.out.println("Type: " + innerClassObject.getType());
            innerClassObject.setType("IFElse_InnerClass_Changed");
            System.out.println("Type: " + innerClassObject.getType());
        }
    }

    //endregion

    //region Helper
    private void getValue() {

        int sum = 100;

        class InnerClass_MethodBlock {           // Cannot declare public, private or protected ...just default

            private String type;

            public InnerClass_MethodBlock() {
                this.type = "Method_InnerClass";
            }

            public String getType() {return type;}

            public void setType(String type) {this.type = type;}
        }

        // The inner Class needs to be instantiated in the same block as it is created
        InnerClass_MethodBlock innerClassObject = new InnerClass_MethodBlock();
        System.out.println("Type: " + innerClassObject.getType());

        innerClassObject.setType("Method_InnerClass_Changed");
        System.out.println("Type: " + innerClassObject.getType());

    }
    //endregion

}

/**

 Local Inner Classes

 What ?
 - Local Inner Classes are classes inside a block ..ie Method body, For / While Loops, if/else ...etc
 - They belong to the block they are enclosed in
 - Cannot have access modifiers
 - Can be marked as final or abstract
 - Must be instantiated in the block they are defined in ... they cannot be instantiated outside their respective block
 - Can extend abstract classes or implement an interfaces (which makes sense)


 Why ?

 Notes
 - Inner Classes cannot be declared static
 - Scope of the encapsulating method needs to be public ...otherwise you wont be able to use the Inner Class

 References
 http://www.geeksforgeeks.org/local-inner-class-java/


 */
