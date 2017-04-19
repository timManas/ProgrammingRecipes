package DesignPatterns.Behavioural.MVC;

/**
 * Created by timmanas on 2017-04-18.
 */
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        this.model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentNumber(String number) {
        this.model.setRollNumber(number);
    }

    public String getStudentNumber() {
        return this.model.getRollNumber();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNumber());
    }

}
