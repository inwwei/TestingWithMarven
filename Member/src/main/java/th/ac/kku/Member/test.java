package th.ac.kku.Member;

public class test {
	public static String UpRank(int orderNumber ,int MonthNumber ,int Price ,int PeopleNo ) {
		
		int checkOrder =checkOrder(orderNumber);
		int checkMonth =checkMonth(MonthNumber);
		int checkPrice =checkPrice(Price);
		int checkPeopleNo =checkPeopleNo(PeopleNo);
		
		if(checkOrder != 0) {
			if(checkMonth !=0) {
				if(checkPrice != 0) {
					if(checkPeopleNo != 0) {
						return "Gold";
					}else {
						return "Silver";
					}
				}else {
					return "Silver";
				}
			}else {
				return "Silver";
			}
			
		}else {
			return "Silver";
		} 
		}
		public static int checkOrder(int orderNumber) {
			if(orderNumber >= 4) {
				return orderNumber;
			}
			return 0;
		}

		
		public static int checkMonth(int MonthNumber) {
			if(MonthNumber <= 6 && MonthNumber >0) {
				return MonthNumber;
			}
			return 0;
		}
		
		
		public static int checkPrice(int Price) {
			if(Price >= 1000) {
				return Price;
			}
			return 0;
		}
		
		
		public static int checkPeopleNo(int PeopleNo) {
			if(PeopleNo <= 200 && PeopleNo > 0) {
				return PeopleNo;
			}
			return 0;
		}

}
