package com.vickyraj.codecraft_ai.entity;

import com.vickyraj.codecraft_ai.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;

    Project project;

    User user;

    ProjectRole role;

    Instant invitedAt;
    Instant acceptedAt;

}
