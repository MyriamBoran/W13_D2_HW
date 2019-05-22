package com.codeclan.system.components;

import com.codeclan.system.models.File;
import com.codeclan.system.models.Folder;
import com.codeclan.system.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.system.repository.FileRepository;
import com.codeclan.system.repository.FolderRepository;
import com.codeclan.system.repository.UserRepository;

@Component
    public class DataLoader implements ApplicationRunner {

        @Autowired
        FileRepository fileRepository;

        @Autowired
        UserRepository userRepository;

        @Autowired
        FolderRepository folderRepository;

        public DataLoader() {
        }

        public void run(ApplicationArguments args) {

            User clara = new User("Clara");
            userRepository.save(clara);

            User bob = new User("Bob");
            userRepository.save(bob);

            Folder code = new Folder("code", clara);
            folderRepository.save(code);

            Folder writingExercise = new Folder("writingExercise", bob);
            folderRepository.save(writingExercise);

            File javaExercise = new File("javaExercise", ".java", 2, code);
            fileRepository.save(javaExercise);

            File textPoem = new File("Poem", "txt", 1, writingExercise);
            fileRepository.save(textPoem);
        }

    }
