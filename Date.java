public class Date {
	private int day, year;
	private Month month;

	public Date(int day, Month month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day, month);
	}

	public void setDay(int day, Month month) {
		if (day < 1 || day > 31)
			throw new IllegalDateException();
		if (month == Month.April || month == Month.June || month == Month.September || month == Month.November) {
			if (day > 30)
				throw new IllegalDateException();
		} else if (month == Month.February) {
			if (day > 28)
				throw new IllegalDateException();
		}
		this.day = day;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public void setYear(int year) {
		if (year > 2022)
			throw new IllegalDateException();
		this.year = year;
	}

	public int getDay() {
		return this.day;
	}

	public Month getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public String getDate() {
		String date = Integer.toString(this.day) + " " + this.month + " " + Integer.toString(this.year);
		return date;
	}
}
