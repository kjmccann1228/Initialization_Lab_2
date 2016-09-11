/**
 * Created by kurtmccann on 9/11/16.
 */
public class ColorfulThing {

//    Color color = new Color;
//
//    public ColorfulThing(Color col)
//    {
//        this.color = col;
//    }


    public enum Color {
        GOLD,
        SILVER,
        BRONZE
    }

        private Color color;

        //constructor
        public ColorfulThing(Color col)
        {
            this.color = col;
        }

        public Color getColor()
        {
            return this.color;
        }

}


