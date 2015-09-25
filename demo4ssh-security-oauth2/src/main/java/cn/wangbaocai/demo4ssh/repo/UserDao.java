package cn.wangbaocai.demo4ssh.repo;

import java.util.List;

import cn.wangbaocai.demo4ssh.domain.User;

public interface UserDao {
	public int save(User u);
	public List<User> findAll();
}
