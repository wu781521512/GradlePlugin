package com.example.gradleplugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class CheckImagePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("测试插件发布")
    }
}
