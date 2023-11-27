package s_11_27;

class PrinterArray{
	private Object[] objs;

	public PrinterArray(Object[] objs) {
		super();
		this.objs = objs;
	}
	public void printArray() 
	{
		for (Object data : objs) {
			System.out.print(data + " ");
		}
	}
}

class PrinterArray2<T extends Number> {
	private T[] objs;

	public PrinterArray2(T[] objs) {
		super();
		this.objs = objs;
	}
	
	public void printArray() 
	{
		for (T data : objs) {
			System.out.print(data + " ");
		}
	}
}
public class ArrayPrint {
	// 배열 요소를 받아서 내용을 출력하는 메소드
	public static void printArray(Object[] str) 
	{
		for (Object data : str) {
			System.out.print(data + " ");
		}
	}
	
	public static <T> void printArray2(T[] str) 
	{
		for (T data : str) {
			System.out.print(data + " ");
		}
	}
	
	public static void main(String[] args) {		
		String[] ary1 = {"abc","def"};
		Integer[] ary2 = {1,2,3,4,5};
		Double[] ary3 = {1.1, 2.2, 3.3};		
		
//		printArray(ary1);
//		System.out.println();
//		printArray(ary2);
//		System.out.println();
//		printArray(ary3);
		
//		new PrinterArray(ary1).printArray();
//		System.out.println();
//		new PrinterArray(ary2).printArray();
//		System.out.println();
//		new PrinterArray(ary3).printArray();
		
//		printArray2(ary1);
//		System.out.println();
//		printArray2(ary2);
//		System.out.println();
//		printArray2(ary3);
		
		PrinterArray2<Double> ary = new PrinterArray2(ary3);
		ary.printArray();
		
	}

}
