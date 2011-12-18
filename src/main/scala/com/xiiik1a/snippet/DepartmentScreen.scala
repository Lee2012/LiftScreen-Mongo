package com.xiiik1a
package snippet

import scala.xml.{NodeSeq,Text}

import net.liftweb.http.{LiftScreen, S}

import model.{Department}

object DepartmentScreen extends LiftScreen {
 
    object department extends ScreenVar(Department.createRecord)
    override def screenTop =
    <b1> Add/Miodify a Department </b1>
   
    addFields(() => department.is)
   
    def finish() {
       department.is.save
       S.notice(" A department just updated!")       
    }
} 


