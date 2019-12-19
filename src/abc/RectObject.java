package abc;

public class RectObject {

	public int value;

	public RectObject() {
		value = 0;
	}

	public RectObject(RectObject obj) {
		value = obj.value;
	}

	public boolean equals(Object inobj) {
		RectObject obj = (RectObject) inobj;
		if (obj.value == value) {
			return true;
		}
		return false;
	}
}
