/**
 * 
 */
package com.sampleproperties;

/**
 * @author Nagarjuna Yadav K
 *
 */
public class Fruit {
    
	private String name ="not Set";
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Fruit() {}
	
	public String talkYourSelf(){
		return name;
	}

}
