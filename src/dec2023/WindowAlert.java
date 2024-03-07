package dec2023;

import java.awt.Window;

public class WindowAlert extends Window {
	private String state;
public WindowAlert(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	System.out.println(Window.getWindows().toString());;
}

@Override
public String toString() {
	return "WindowAlert [state=" + state + "]";
}
}
