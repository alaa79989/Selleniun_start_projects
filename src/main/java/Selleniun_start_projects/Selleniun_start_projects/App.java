package Selleniun_start_projects.Selleniun_start_projects;
/**
 * Hello world!
 * @param <ClassifyTriangle>
 *
 */
public class App<ClassifyTriangle> 
{
	public class TriangleClassifier {
	    private isIsosceles isIsosceles;
	    private isTriangle isTriangle;
	    private isEquilateral isEquilateral;

	    public TriangleClassifier(isIsosceles isIsosceles, isTriangle isTriangle, isEquilateral isEquilateral) {
	        this.isIsosceles = isIsosceles;
	        this.isTriangle = isTriangle;
	        this.isEquilateral = isEquilateral;
	    }

	    public String classifyTriangle(ClassifyTriangle type, int a, int b, int c) {
	        if (!isTriangle.test(a, b, c)) {
	            return "Not a triangle";
	        }
	        switch (type) {
	            case IS_EQUILATERAL:
	                return isEquilateral.toString();
	            case isIsosceles:
	                return isIsosceles.toString();
	            default:
	                return isTriangle.toString();
	        }
	    }
	}

    public static class isEquilateral {
        public static Boolean test(int a, int b, int c) {
            return a + b > c && a + c > b && b + c > a && a == b && b == c;
        }
    }

    public class isIsosceles {
        public Boolean test(int a, int b, int c) {
            return (a == b || b == c || a == c) && !(a == b && b == c);
        }
    }

    public class isTriangle{
        public Boolean test(int a, int b, int c) {
            return a != b && b != c && a != c;
        }
    }
}
