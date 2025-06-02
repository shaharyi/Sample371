package matkonet2Exercise;

public class ReportCard {
	private String stuName; 
	private Subject[] subArray; 
    
    
    public ReportCard(String name, int num)
    {
    	stuName = name;
    	subArray = new Subject[num];
    }
    
    public double average() 
    {
    	int count=0;
    	int sum=0;
    	for(int i=0;i<subArray.length;i++)
    	{
    		count++;
    		sum += subArray[i].getGrade();
    	}
    	return (double)sum / count;
    }

    
    public Boolean isExcellent() 
    {
    	return average() >= 85;
    }

    
	public String getStuName() {
		return stuName;
	}

}
