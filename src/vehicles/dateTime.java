package vehicles;

public class dateTime{
    private int date;
    private int month;
    private int year;
    private double time;

    public dateTime(int date, int month, int year, double time) {
		super();
		this.date = date;
		this.month = month;
		this.year = year;
		this.time = time;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public dateTime() {
        super();
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}


