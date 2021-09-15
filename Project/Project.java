// Create a Project class that has the fields of name and description (attributes and fields)
public class Project {
    private String name;
    private String description;
    private String initialCost;
    //Create an instance method called elevatorPitch that will return the name and description separated by a colon
    public String elevatorPitch() {
        return this.name + ": " + this.description;
    }
    //Create constructors; Overload the constructor method in three different ways.
    //1
    public Project (){  
        this.name = "Please provide a name.";
        this.description = "Please provide a description.";
    }
    //2
    public Project(String name){
        this.name = name;
        this.description = "Please provide a description.";

    }
    //3
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Create getter and setters for each field
    //getter
    public String getName() {
        return this.name;
    }
    //getter
    public String getDescription() {
        return this.description;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }
    //setter
    public void setDescription(String description) {
        this.description = description;
    }

    //Optional Challenge!
    
    //Add an additional initialCost member variable that is of type double and has both getters and setters
    //getter
    public String getInitialCost() {
        return this.initialCost;
    }
    //setter
    public void setInitialCost(String initialCost) {
        this.initialCost = initialCost;
    }

}

