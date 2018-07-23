// reimplement the class in the preceeding example in Java, C# or C++

public class Car {
    string Manufacturer { get; private set; }
    string Model { get; private set; }
    int ModelYear { get; private set; }
    int LicensePlate { get; set; }

    public Car(string manufacturer, string model) {
        this.Manufacturer = manufacturer;
        this.Model = model;
        this.ModelYear = -1
        this.LicensePlate = ""
    }

    public Car(string manufacturer, string model, int modelYear) {
        this(manufacturer, model);
        this.ModelYear = modelYear
    }

    public Car(string manufacturer, string model, string licensePlate) {
        this(manufacturer, model);
        this.LicensePlate = licensePlate
    }

    public Car(string manufacturer, string model, int modelYear, string licensePlate) {
        this(manufacturer, model, modelYear);
        this.LicensePlate = licensePlate
    }
}

//** how much shorter is the Scala class
// with c#/ auto properties this is pretty concise, the scala code is mainly shorter because of the placement of the primary constructor
// readonly, read-write properties are all 1 liners. LicensePlate is actually 1 line more concise since it doesnt need a variable and function
// I would imagine this is much longer in java though, cause you have to implement the getters and setters unless cheat with lombok annotations
