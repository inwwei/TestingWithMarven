package th.ac.kku.Member;

public class Level {
	private Order order;
			//check order more than 4 orders
			//Target orders , ControllOrder , must sent member_id
			//and spend  more than 1000 bath
			
			

			public Level(Order order) {
				this.order = order;
		// TODO Auto-generated constructor stub
	}

	//and within 6 months
			//and sequence in between 1-199 candidates
			public Member up(Member member) {
				// TODO Auto-generated method stub
				if(order.getTargetOrder(member.getId()) >=4) {
					return new Member(member.getId(),"Gold",member.getSpecialPoint()+200);
				}
				return member;
	}

}
