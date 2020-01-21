package th.ac.kku.Member;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LevelTest {
	@Test
	public void
	memberShouldUpLevelToGoldMemberWhenSwquenceIs99() {
		Member member = new Member(600201,"Silver",90);
		Order order = new Order();
		Level level = new Level(order);
		Member newMember = level.up(member);
		
		 assertEquals(newMember.getLevel(),"Gold");
		 assertEquals(newMember.getSpecialPoint(),290);
		 
		 
	}

}
