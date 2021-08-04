package com.github.damith014.intellijidea.services

import com.github.damith014.intellijidea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
