package com.example.demo.User;

import java.util.ArrayList;
import java.util.List;

public class Accounts
{
	public static final String Acounts = null;

	public static List<User> accountList = new ArrayList<User>();
	public User getAccount(String name) {
		for (User ac : accountList) {
			if (ac.userName.equals(name)) {
				return ac;
			}
		}
		return null;
	};

	public void addaccount(User newaccount)
	{
		accountList.add(newaccount);
	};

}
