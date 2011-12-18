package com.xiiik1a.util

object  Accounting {
   object Accounting extends Enumeration {
      val AP = Value(1, "AP")                                  
      val AR = Value(2, "AR")     
      val Expense = Value(3, "Expense")              
   }
   def getDepartment : Enumeration = Accounting
}
