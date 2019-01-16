package designPatterns.decoration.starbuzzWithSize.cafe;

public abstract class Beverage {
	//size enum
	public enum Size {
		TALL, GRANDE, VENTI
	};

	// default size = TALL
	Size size = Size.TALL;
	public String description = "제목 없음";

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
		
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
