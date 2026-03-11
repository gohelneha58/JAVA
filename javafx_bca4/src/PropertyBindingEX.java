import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
public class PropertyBindingEX 
{
   public static void main(String[] args)
   {
       StringProperty propertyA = new SimpleStringProperty("hello");
       StringProperty propertyB = new SimpleStringProperty();
       propertyB.bind(propertyA);
       System.out.println(propertyB.get());
       propertyA.set("goodbye");
       System.out.println(propertyB.get());
   }
}
