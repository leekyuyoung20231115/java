package s_11_27;

import java.util.Arrays;

class Rectangle implements Comparable<Rectangle>{
    private int width, height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int findArea() {
        return width * height;
    }

    public String toString() {
        return String.format("사각형[폭=%d, 높이=%d]", width, height);
    }

	@Override
	public int compareTo(Rectangle o) {		
//		return this.findArea() - o.findArea(); // 오름차순
		return o.findArea() - this.findArea(); // 내림차순
	}
}
public class ComparableDemo {

	public static void main(String[] args) {
        Rectangle[] rectangles = { new Rectangle(3, 5),
                new Rectangle(2, 10), new Rectangle(5, 5) };
        
        Arrays.sort(rectangles);

        for (Rectangle r : rectangles)
            System.out.println(r);
	}

}
