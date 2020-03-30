import java.util.*;

public class Show implements Comparable <Show>{

	private String name;
	private TVShow showType;

	public String getName() {
		return name;
	}

	public TVShow getShowType() {
		return showType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShowType(TVShow showType) {
		this.showType = showType;
	}

	public Show(String name, TVShow showType) {
		this.name = name;
		this.showType = showType;
	}

	public Show(String name) {
		this(name, TVShow.DEFAULT_SHOWTYPE);

	}

	public String toString() {
		String s = "Name : " + name;
		s += "\n\nType : " + showType;
		return s;
	}
	
	public static boolean isSameType(Show show1, Show show2) {
		if(show1.showType.equals(show2.getShowType())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Show) {
			Show otherShow = (Show) obj;
			
			boolean sameName, sameType;
			
			if(this.getName().equalsIgnoreCase(otherShow.getName())) {
				sameName = true;
			} else {
				sameName = false;
			}
			
			if(this.getShowType().equals(otherShow.getShowType())) {
				sameType = true;
			} else {
				sameType = false;
			}
			
			return sameName && sameType;
		} else {
			return false;
		}
	}

	
	@Override
	public int compareTo(Show newShow) {
		if(this.name.equalsIgnoreCase(newShow.getName())) {
			return this.getName().compareTo(newShow.getName());
		} else if (this.name.equalsIgnoreCase(newShow.getName())) {
			return 1;
		} else {
			return -1;
		}
	}

	public int getTargetedAge() {
		// TODO Auto-generated method stub
		return 0;
	}

}
