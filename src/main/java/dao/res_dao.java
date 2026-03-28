package dao;

import java.util.List;

import hiber.input;

public interface res_dao {
	void save(input obj);
	 List<input>getAllInputs();
	 input getInputById(int id);
	 void updateinput(input obj);
	 void deleteinput(int id);
	 List<input> findbynumber(int numb);
	 List<input>getpending();

}
