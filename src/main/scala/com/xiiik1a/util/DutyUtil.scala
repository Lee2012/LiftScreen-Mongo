package com.xiiik1a.util

import net.liftweb.common.{Full, Box}

object DutyUtil {
  
  def getDutyList(departmentType : Box[Int]): Enumeration = {
  		departmentType match {
  		  case Full(dType) =>
  		     dType match {
  		   		case 1 => Accounting.getDepartment
  		  	 	case 2 => Development.getDepartment
  		  	 	
        	}
         case _ =>  Accounting.getDepartment
       }   
  }
  	    
  	
  		
 
}
