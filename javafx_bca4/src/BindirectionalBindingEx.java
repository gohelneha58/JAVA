import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
public class BindirectionalBindingEx 
{
   public static void main(String[] args)
   {
       StringProperty propertyA = new SimpleStringProperty("hello");
       StringProperty propertyB = new SimpleStringProperty();
       propertyA.bindBidirectional(propertyB);
       propertyA.set("newValue");
       System.out.println("propertyA:" +propertyA.get());
       System.out.println("propertyB:" +propertyB.get());
       propertyB.set("another value");
       System.out.println("propertyA:" +propertyA.get());
       System.out.println("propertyB:" +propertyB.get());
   }
}

