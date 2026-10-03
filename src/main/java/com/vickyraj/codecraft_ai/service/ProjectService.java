package com.vickyraj.codecraft_ai.service;

import com.vickyraj.codecraft_ai.dto.project.ProjectRequest;
import com.vickyraj.codecraft_ai.dto.project.ProjectResponse;
import com.vickyraj.codecraft_ai.dto.project.ProjectSummaryResponse;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects(Long userId);

    ProjectResponse getUserProjectById(Long id, Long userId);

    ProjectResponse createProject(ProjectRequest request, Long userId);

    ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    void softDelete(Long id, Long userId);

}
