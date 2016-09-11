/**
 * Created by kurtmccann on 9/11/16.
 */
public class ThingContainer {
    ColorfulThing[] ctArr;                              //ASK TARIQ 1     //Changed1
//    ColorfulThing[] ctArr = new ColorfulThing[size];    //Change1

    //CONSTRUCTOR
    public ThingContainer(int size)
    {
      this.ctArr = new ColorfulThing[size];           // ASK TARIQ 1
//        this.size = size;                           //Change1
    }

    public boolean checkIfIndexNull(int index)
    {
        if(this.ctArr[index] == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void add(ColorfulThing ct)
    {
        boolean caw = false;
        for(int i = 0; i < this.ctArr.length ; i++)
        {
            if(this.checkIfIndexNull(i))
            {
                ctArr[i] = ct;
                return;
            }
        }
        System.out.println("Container is full!");
    }


    public void printTC()
    {
        for(int i = 0; i<this.ctArr.length; i++)
        {
            System.out.println("Index " + i + " contains " + ctArr[i].getColor());
        }
    }


}
