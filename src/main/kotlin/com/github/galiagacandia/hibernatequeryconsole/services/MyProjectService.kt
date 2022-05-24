package com.github.galiagacandia.hibernatequeryconsole.services

import com.intellij.openapi.project.Project
import com.github.galiagacandia.hibernatequeryconsole.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
