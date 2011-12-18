package com.xiiik1a.util

object DepartmentTypeUtil {
  object DepartmentTypes extends Enumeration {
       val Accounting = Value(1, "Accounting")  
       val Development = Value(2, "Development")
  }
  def getDepartmentType(): Enumeration = DepartmentTypes 
      
}
