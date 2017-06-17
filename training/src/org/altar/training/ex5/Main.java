package org.altar.training.ex5;

public class Main {

	public static void main(String[] args) {
		SpaceAge spaceAge = new SpaceAge(1112565306);
		double age = 0;
		for(Planet p : Planet.values()){
			age = spaceAge.ageOnPlanet(p);
			System.out.printf("Age on planet %s is %.2f", p, age);
			System.out.println();
		}
	}

}

class SpaceAge {
	private static final double EARTH_YEARS_IN_SECONDS = 365.25 * 24 * 60 * 60;
	private final double seconds;

	public SpaceAge(double seconds) {
		this.seconds = seconds;
	}

	private double getSeconds() {
		return this.seconds;
	}

	public double ageOnPlanet(Planet p){
		return (this.getSeconds() / (EARTH_YEARS_IN_SECONDS * p.op()));
	}
}

enum Planet {
	EARTH(1), 
	MERCURY(0.2408467), 
	VENUS(0.61519726), 
	MARS(1.8808158), 
	JUPITER(11.862615), 
	SATURN(29.447498), 
	URANUS(84.016846), 
	NEPTUNE(164.79132);

	private final double op;

	Planet(double op) {
		this.op = op;
	}

	public final double op() {
		return this.op;
	}

}
