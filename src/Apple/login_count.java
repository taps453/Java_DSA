package Apple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class login_count {
	public static void main(String[] args) {

		List<String> logs = Arrays.asList("u1 LOGIN", "u2 LOGOUT", "u1 LOGIN", "u3 LOGIN", "u1 LOGOUT", "u2 LOGIN");
		Map<String, Integer> count = new HashMap<String, Integer>();

		for (String log : logs) {
			String[] part = log.split(" ");
			String user = part[0];
			String action = part[1];

			if (action.equals("LOGIN")) {
				if (count.containsKey(user)) {
					count.put(user, count.get(user) + 1);
				} else {
					count.put(user, 1);
				}
			}
		}
		System.out.println(count);
	}
}
