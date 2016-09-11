/**
 * Created by kurtmccann on 9/11/16.
 */
public class ThingContainer {

   //Member variables
    ColorfulThing[] ctArr;                              //ASK TARIQ 1     //Changed1
//    ColorfulThing[] ctArr = new ColorfulThing[size];    //Change1
    int nextNullIndex = 0;

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
        for(int i = 0; i < this.ctArr.length ; i++)
        {
            if(this.checkIfIndexNull(i))
            {
                ctArr[i] = ct;
                nextNullIndex++;
                return;
            }
        }
        System.out.println("Container is full!");
    }


    public void printTC()
    {
        for(int i = 0; i<this.ctArr.length; i++)
        {
            if(ctArr[i] == null)
            {
                System.out.println("Index " + i + " contains NULL");
            }
            else
            {
                System.out.println("Index " + i + " contains " + ctArr[i].getColor());
            }
        }
    }

    public ColorfulThing pop()
    {
        ColorfulThing popped;
        for(int i=0 ; i < ctArr.length ; i++)
        {
            if(ctArr[i] == null)
            {
                popped = this.ctArr[i-1];
                this.ctArr[i - 1] = null;
                nextNullIndex--;
                return popped;
            }
        }
        popped = this.ctArr[ctArr.length-1];
        this.ctArr[ctArr.length - 1] = null;
        return popped;
    }

    public ColorfulThing remove(ColorfulThing.Color col)
    {
        ColorfulThing toRemove = null;
//        System.out.println("TO REMOVE SHOULD BE NULL.  IT IS: " + toRemove);
        for(int i=0 ; i < ctArr.length ; i++)
        {
            if(ctArr[i].getColor().equals(col))
            {
                toRemove = ctArr[i];
                ctArr[i] = null;
//                nextNullIndex--;
                consolidate(i);
                return toRemove;
            }
        }
        return toRemove;
    }

    public ColorfulThing remove(ColorfulThing thing)
    {
        ColorfulThing toRemove = null;
        for(int i=0 ; i < ctArr.length ; i++)
        {
            if(ctArr[i].equals(thing))
            {
                toRemove = ctArr[i];
                ctArr[i] = null;
//                nextNullIndex--;
                consolidate(i);
                return toRemove;
            }
        }
        return toRemove;
    }

    public void consolidate(int gapIndex)
    {
        if(nextNullIndex == ctArr.length) /* Array is full */
        {
            for(int i = gapIndex ; i < ctArr.length -1; i++)
            {
                ctArr[i] = ctArr[i+1];
                ctArr[ctArr.length-1] = null;
            }
        }
        else
        {
            for (int i = gapIndex ; i < nextNullIndex +1 ; i++)
            {
                ctArr[i] = ctArr[i+1];
            }
        }
    }
}
