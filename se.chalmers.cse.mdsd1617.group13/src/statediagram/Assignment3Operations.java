package statediagram;

public class Assignment3Operations {
	private long counter = 0;
	private boolean toggled = false;
	
	public void increaseCounter() {
		if(!toggled){
			counter = (counter+1)%5;
		}
	}
	
	public long getCounter() {
		return counter;
	}
	
	public void toggleCounter() {
		if(toggled) {
			toggled = false;
		} else {
			toggled = true;
		}
	}
	
	public boolean isToggled() {
		return toggled;
	}
}
