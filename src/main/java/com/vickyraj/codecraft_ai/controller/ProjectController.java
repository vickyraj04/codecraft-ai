package com.vickyraj.codecraft_ai.controller;

import com.vickyraj.codecraft_ai.dto.project.ProjectRequest;
import com.vickyraj.codecraft_ai.dto.project.ProjectResponse;
import com.vickyraj.codecraft_ai.dto.project.ProjectSummaryResponse;
import com.vickyraj.codecraft_ai.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects(){
        Long userid = 1L;
        return ResponseEntity.ok(projectService.getUserProjects(userid));
    }

    @GetMapping("/{Id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjectById(id, userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request,userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id,@RequestBody ProjectRequest request){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request, userId));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<ProjectResponse> deleteProject(@PathVariable Long id){
        Long userId = 1L;
        projectService.softDelete(id, userId);
        return ResponseEntity.noContent().build();
    }
}
