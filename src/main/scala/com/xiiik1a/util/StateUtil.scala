package com.xiiik1a.util

object StateUtil {
    object States extends Enumeration {
       val Alabama = Value(1, "Alabama")  
       val Alaska = Value(2, "Alaska")
       val Arizona = Value(3,  "Arizona")
       val Arkansas = Value(4, "Arkansas")
       val California = Value(5, "California")
       val Colorado = Value(6, "Colorado")
       val Connecticut = Value(7, "Connecticut")
       val Delaware = Value(8, "Delaware")
       val Florida = Value(9, "Florida")
       val Georgia = Value(10, "Georgia")
       val Hawaii = Value(11, "Hawaii")
       val Idaho = Value(12, "Idaho")
       val Illinois = Value(13, "Illinois")
       val Indiana = Value(14, "Indiana")
       val Iowa = Value(15, "Iowa")
       val Kansas = Value(16, "Kansas")
       val Kenturkey = Value(17, "Kenturkey")
       val Louisiana = Value(18, "Louisiana")
       val Maine = Value(19,  "Maine")
       val Maryland = Value(20, "Maryland")
       val Massachusetts = Value(21, "Massachusetts")
       val Michigan = Value(22, "Michigan")
       val Minnesota = Value(23, "Minnesota")
       val Mississippi = Value(24,"Mississippi")
       val Missouri = Value(25, "Missouri")
       val Montana = Value(26, "Montana")
       val Nebraska = Value(27, "Nebraska")
       val Nevada = Value(28, "Neveda")
       val New_Hampshire = Value(29, "New Hampshire")
       val New_Jersey = Value(30, "New Jersey")
       val New_Mexico = Value(31, "New Mexico")
       val New_York = Value(32, "New York")
       val North_Carolina = Value(33, "North Carolina")
       val North_Dakota = Value(34,"North Dakota")
       val Ohio = Value(35, "Ohio")
       val Oklahoma = Value(36, "Oklahoma")
       val Oregon = Value(37, "Oregon")
       val Pennsylvania = Value(38, "Pennsylvania")
       val Rode_Island = Value(39, "Rode Island")
       val South_Carolina = Value(40, "South Carolina")
       val South_Dakota = Value(41, "South Dakota")
       val Tennessee = Value(42, "Tennessee")
       val Texas = Value(43, "Texas")
       val Utah = Value(44, "Utah")
       val Vermont = Value(45, "Vermont")
       val Virginia = Value(46, "Virginia")
       val Washington = Value(47, "Washington")
       val West_Virginia = Value(48, "West Virginia")
       val Wisconsin = Value(49, "Wisconsin")
       val Wyoming = Value(50, "Wyoming")
       val Others = Value(51, "Others..")             
   }
    
   def getStateList(): Enumeration = States
}
