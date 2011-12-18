package com.xiiik1a.model


import _root_.net.liftweb.record.field._
import _root_.net.liftweb.common._
//import net.liftweb.record.{MegaProtoUser,MetaMegaProtoUser}
import net.liftweb.mongodb.record.field.{ObjectIdPk}

import com.xiiik1a.lib._

    object User extends User with MetaMegaProtoUser[User] {
      override def screenWrap = Full(<lift:surround with="default" at="content">
          <lift:bind /></lift:surround>)
 
      override def fieldOrder = List(email, password)
      override def skipEmailValidation = true
      
    }
  
    class User private() extends MegaProtoUser[User] {
      def meta = User 
    }