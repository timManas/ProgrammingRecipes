package DesignPatterns.Behavioural.MVC;

/**
 * Created by timmanas on 2017-04-18.
 */
public class MVCDesignPattern {

    public static void main( String [] args) {
        System.out.println("::: MVC Design Pattern :::");

        Student model = getStudentInformationFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Erin");
        controller.updateView();

    }

    private static Student getStudentInformationFromDatabase() {
        Student student = new Student("Tim", "06951789");
        return student;
    }

}


/**

 Model View Controller

 What ?
 - Behavioural
 - More of an architecture as opposed to a design pattern
 - Create components which are independent from each other
 - Model (Object)   - Represents an object carrying data
   View             - Visualization of the data
   Controller       - Controls data flow from the model object to the view whenever data changes

 Why ?
 - All three components are independent of each other and can be changed without affecting the other components

 Notes
 - The view can provide a visual interface
 - The controller receives user inputs and makes calls to model objects


 Good example
 - Image a photographer with his camera in a studio taking phots of a box
 - The box is the model which does not know of the photographer or the camera
 - The photographer is the controller
 - The camera is the view


 References
 https://www.tutorialspoint.com/design_pattern/mvc_pattern.htm

 */