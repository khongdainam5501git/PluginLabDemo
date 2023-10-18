package com.example.myplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages
import java.awt.TextField
import java.io.File
import java.io.FileWriter

class NotePlugin : AnAction() {

    private var counter = 1

    override fun actionPerformed(e: AnActionEvent) {
        val textField = TextField()
        val content = Messages.showInputDialog(textField, "Enter your note:", "My Action", Messages.getInformationIcon())

        val file = File("C:\\Users\\khong\\Documents\\NotePlugin\\Note\\note${counter}.txt")
        val writer = FileWriter(file)

        content?.let { writer.write(it) }
        writer.close()

        counter++
    }

}
