package test16;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class ReadOnlyTest {
	public static void main(String[] args) {
		ReadOnlyIntegerWrapper idWrapper = new ReadOnlyIntegerWrapper(100);
		ReadOnlyIntegerProperty id = idWrapper.getReadOnlyProperty();
		System.out.println("idWrapper:" + idWrapper.get());
		System.out.println("id:" + id.get());
		idWrapper.set(666);
		System.out.println("idWrapper:" + idWrapper.get());
		System.out.println("id:" + id.get());
	}

}
