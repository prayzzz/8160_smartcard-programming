package presentation;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Created by Patrick on 22.06.2015.
 */
public class MainModel
{
    private StringProperty name = new SimpleStringProperty();
    private StringProperty carId = new SimpleStringProperty();
    private ObjectProperty<LocalDate> birthDate = new SimpleObjectProperty<>();
    private StringProperty safePin = new SimpleStringProperty();


    public String getName()
    {
        return name.get();
    }

    public StringProperty nameProperty()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name.set(name);
    }

    public String getCarId()
    {
        return carId.get();
    }

    public StringProperty carIdProperty()
    {
        return carId;
    }

    public void setCarId(String carId)
    {
        this.carId.set(carId);
    }

    public LocalDate getBirthDate()
    {
        return birthDate.get();
    }

    public ObjectProperty<LocalDate> birthDateProperty()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate.set(birthDate);
    }

    public String getSafePin()
    {
        return safePin.get();
    }

    public StringProperty safePinProperty()
    {
        return safePin;
    }

    public void setSafePin(String safePin)
    {
        this.safePin.set(safePin);
    }
}
