package server;

import java.util.List;

import hiber.input;


public interface re_ser {
	void save(input obj);
	 List<input>getAllInputs();
	 input getInputById(int id);
	 void updateinput(input obj);
	 void deleteinput(int id);
	
}
