package ch10;

public class BirthDay {

	// 필드값을 직접 변경하지 않고 메소드를 사용하여 값을 변경하는것이 좋다.
	// 접근 제한을 가함으로써 객체를 사용할때 오류를 막을 수 있고
	// 디버깅 하기도 편기 때문에 private를 사용하는것이 좋다.
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		} else {
			isValid = true;
			this.month = month;
		}
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		if (isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일");
		} else {
			System.out.println("유요하지 않는 날짜입니다.");
		}
	}
	
	public boolean getIsValid() {
		return isValid;
	}
	
}
