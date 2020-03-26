package com.martynascepas.ppmtool.services;

import com.martynascepas.ppmtool.domain.Project;
import com.martynascepas.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;


    public Project saveOrUpdateProject(Project project){

        //Logic

        return projectRepository.save(project);
    }
}
