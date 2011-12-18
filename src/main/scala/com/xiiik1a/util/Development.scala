package com.xiiik1a.util

// Need to review again
object Development {

   object Development extends Enumeration {
       val  Design = Value(1,  "Support") 
       val  Development = Value(2,  "Development") 
       val QA = Value(3,  "QA")            
   } 
  
   def getDepartment : Enumeration = Development
  	
 
}
