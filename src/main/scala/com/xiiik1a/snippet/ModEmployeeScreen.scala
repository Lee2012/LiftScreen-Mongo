package com.xiiik1a
package snippet

//import scala.xml.{NodeSeq,Text}

import net.liftweb.http.{LiftScreen, S}
import model.{Employee}

object ModEmployeeScreen extends LiftScreen {  
    object employee extends ScreenVar(Employee.createRecord)
    addFields(() => employee.is)
    def finish() {	
        employee.is.save
    	S.notice("An employee just updated!")
    }
} 


