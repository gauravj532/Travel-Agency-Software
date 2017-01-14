
public class CarList implements java.io.Serializable {
    
    Car cr[]=new Car[1000];
    int ncar;
    public CarList()
    {
        for(int i=0;i<1000;i++)
            cr[i]=new Car();
        ncar=1;
    }
}
