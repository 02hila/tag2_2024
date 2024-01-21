import java.util.ArrayList;

/**
 * @author cr7h
 *
 */
public class SharedData 
{
	/**
	 * 
	 */
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array
	 * @param b
	 */
	public SharedData(int[] array, int b) {
		
		this.array =new ArrayList<>();
		this.b = b;
	}

	/**
	 * @return
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return
	 */
	public ArrayList<Integer> getArray()  
	{
		return array;
	}

	/**
	 * @return
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**ىؤلىلبى
	 * @param flag  ابابابؤاؤ
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
