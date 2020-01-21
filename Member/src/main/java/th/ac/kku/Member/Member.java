package th.ac.kku.Member;

public class Member {
	private final int id;
	private final String level;
	private final int specialPoint;

	public Member(int id,String level, int specialPoint) {
		this.id = id;
		this.level = level;
		this.specialPoint = specialPoint;
		// TODO Auto-generated constructor stub
	}

	

	public String getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}

	public int getSpecialPoint() {
		// TODO Auto-generated method stub
		return this.specialPoint;
	}



	public int getId() {
		return id;
	}

}
