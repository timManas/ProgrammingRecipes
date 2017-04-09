package DesignPatterns.Creational.Prototype;

/**
 * Created by timmanas on 2017-04-08.
 */
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return this.type;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String newId){
        this.id = newId;
    }

    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }
}
