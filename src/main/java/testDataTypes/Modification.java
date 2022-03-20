package testDataTypes;

import java.util.List;

public class Modification {
	private int available;
	private List<ModificationItem> list = null;

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public List<ModificationItem> getList() {
		return list;
	}

	public void setList(List<ModificationItem> list) {
		this.list = list;
	}



}
