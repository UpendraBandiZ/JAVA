package perimeter_quiz;

import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int numOfPoints=0;
        for(Point temp:s.getPoints())
            numOfPoints+=1;


        return numOfPoints;
    }

    public double getAverageLength(Shape s) {
        // Put code here

        return getPerimeter(s)/getNumPoints(s);
    }

    public double getLargestSide(Shape s) {
        // Put code here
        double largestLength=0.0;
        Point lastPoint=s.getLastPoint();
        for(Point temp:s.getPoints()){
            double distance=lastPoint.distance(temp);
            if(distance>largestLength)
                largestLength=distance;
            lastPoint=temp;
        }
        return largestLength;
    }

    public double getLargestX(Shape s) {
        // Put code here
        Point lastPoint=s.getLastPoint();
        double largestX=lastPoint.getX();
        for(Point temp:s.getPoints()){
            double X=temp.getX();
            if(X>largestX)
                largestX=X;
            lastPoint=temp;
        }
        return largestX;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        DirectoryResource directoryResource=new DirectoryResource();
        double largestPerimeter=0.0;
        for (File f:directoryResource.selectedFiles())
        {
            FileResource fileResource = new FileResource(f);
            Shape shape = new Shape(fileResource);
            double perimeter=getPerimeter(shape);
            if (perimeter>largestPerimeter)
                largestPerimeter=perimeter;
        }
        return largestPerimeter;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;
        double largestParimeter=0.0;
        DirectoryResource directoryResource=new DirectoryResource();
        for(File file:directoryResource.selectedFiles())
        {
            FileResource fileResource=new FileResource(file);
            Shape shape=new Shape(fileResource);
            if(getPerimeter(shape)>largestParimeter){
                temp=file;
            }
        }
           // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);

        System.out.println("perimeter = " + length);
        System.out.println("number of points ="+getNumPoints(s));
        System.out.println("average length ="+getAverageLength(s));
        System.out.println("largest side length="+getLargestSide(s));
        System.out.println("largest X="+getLargestX(s));

    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
        System.out.println("Largest Perimeter among multiple lines="+getLargestPerimeterMultipleFiles());

    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        System.out.println("file with largest perimeter "+getFileWithLargestPerimeter());

    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        pr.testPerimeterMultipleFiles();
        pr.testFileWithLargestPerimeter();
    }
}
