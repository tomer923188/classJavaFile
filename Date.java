public class Date
{
    private int day;
    private int month;
    private int year;

    // (day 1-31, month 1-12, year not negative 4 digits)
    public Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date(Date other) {
    	this.day = other.day;
    	this.month = other.month;
    	this.year = other.year;
    }
    //returns the year
    public int getYear()
    {
        return this.year;
    }
    //returns the month
    public int getMonth()
    {
        return this.month;
    }
    //returns the day
    public int getDay()
    {
        return this.day;
    }
    //sets the year
    public void setYear(int yearToSet)
    {
        this.year = yearToSet;
    }
    //sets the month
    public void setMonth(int monthToSet)
    {
        this.month = monthToSet;
    }
    //sets the day
    public void setDay(int dayToSet)
    {
        this.day = dayToSet;
    }
    //check if it's the same
    public boolean isTheSame(Date other) {
    	if (this.getDay() == other.getDay() && this.getMonth() == other.getMonth() && this.getYear() == other.getYear()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    // Returns a positive number if this date is later than other
    public int compareTo(Date other)
    {
        if (this.year != other.year)
            return this.year - other.year;
        if (this.month != other.month)
            return this.month - other.month;
        return this.day - other.day;
    }

    // Format: day.month.year
    public String toString()
    {
        return this.day + "." + this.month + "." + this.year;
    }
}