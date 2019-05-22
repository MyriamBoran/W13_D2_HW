package com.codeclan.system;

import com.codeclan.system.models.File;
import com.codeclan.system.models.Folder;
import com.codeclan.system.models.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.codeclan.system.repository.FileRepository;
import com.codeclan.system.repository.FolderRepository;
import com.codeclan.system.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFolderUserAndFile(){
		User mary = new User("Mary");
		userRepository.save(mary);

		Folder folder1 = new Folder("javaExercise", mary);
		folderRepository.save(folder1);

		File file1 = new File("codeEx", ".java", 30, folder1);
		fileRepository.save(file1);
	}

}
