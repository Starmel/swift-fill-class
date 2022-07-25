package com.github.starmel.swiftfillclass.services

import com.intellij.openapi.project.Project
import com.github.starmel.swiftfillclass.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
