package designpattern.creational.builder.car.test;

// Product
public class Car {

	private final String model;
	private final String color;
	private final String engine;
	private final boolean hasSunroof;

	private Car(Builder builder) {
		this.model = builder.model;
		this.color = builder.color;
		this.engine = builder.engine;
		this.hasSunroof = builder.hasSunroof;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getEngine() {
		return engine;
	}

	public boolean isHasSunroof() {
		return hasSunroof;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", engine=" + engine + ", hasSunroof=" + hasSunroof + "]";
	}

	public static class Builder {

		private final String model;
		private final String color;
		private String engine;
		private boolean hasSunroof;

		public Builder(String model, String color) {
			this.model = model;
			this.color = color;
		}

		public Builder engine(String engine) {
			this.engine = engine;
			return this;
		}

		public Builder hasSunroof(boolean hasSunroof) {
			this.hasSunroof = hasSunroof;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
	}
}
