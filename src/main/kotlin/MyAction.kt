package com.example.myplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import org.apache.tools.ant.taskdefs.email.Message

class MyAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog("Privet", "My Action", Messages.getInformationIcon())
    }

}
