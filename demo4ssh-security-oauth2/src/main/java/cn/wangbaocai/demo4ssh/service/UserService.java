package cn.wangbaocai.demo4ssh.service;

import java.util.List;

import cn.wangbaocai.demo4ssh.domain.User;

public interface UserService {
	public void saveUsers(List<User> us);
	public List<User> getAllUsers();
}
