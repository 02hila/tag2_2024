import java.util.ArrayList;



/**
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
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array =new ArrayList<>();
		this.b = b;
	}

	/**
	 * @return winArray    winArray is boolean array 
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/**
	 * @param winArray      winArray is boolean array 
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**
	 * @return array         array is listArray 
	 */
	public ArrayList<Integer> getArray()  
	{
		return array;
	}

	/**
	 * @return b              b is integer number 
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag           flag is 
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag  
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
