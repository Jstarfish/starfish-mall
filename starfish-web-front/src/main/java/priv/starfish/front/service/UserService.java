package priv.starfish.front.service;


import priv.starfish.pojo.TbUser;

public interface UserService {

	TbUser getUserByToken(String token);
}
