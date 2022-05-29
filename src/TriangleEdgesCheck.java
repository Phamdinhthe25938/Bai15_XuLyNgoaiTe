public class TriangleEdgesCheck {
    public void checkTriangleEdges (double a,double b,double c)
        throws  TriangleEdgesException{
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Error: not invalid!");
        } else {
            System.out.println("Triangle is valid!");
        }
    }
    }
