package com.codeclan.system.projections;

import com.codeclan.system.models.File;
import com.codeclan.system.models.Folder;
import com.codeclan.system.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
    String getTitle();
    ArrayList<File> getFiles();
    User getUser();
}

