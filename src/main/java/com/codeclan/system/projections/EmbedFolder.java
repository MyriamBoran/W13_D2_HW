package com.codeclan.system.projections;

import com.codeclan.system.models.File;
import com.codeclan.system.models.Folder;
import com.codeclan.system.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.nio.file.Files;
import java.util.ArrayList;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}