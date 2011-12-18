package com.xiiik1a.model


import net.liftweb.common.{Box,Empty, Full}

import net.liftweb.record.field.{StringField, EnumField}
import net.liftweb.mongodb.record.field.{ObjectIdPk}
import net.liftweb.mongodb.record.{MongoRecord, MongoMetaRecord}
import org.bson.types.ObjectId


import com.mongodb._
//import net.liftweb.json.JsonDSL._
import com.xiiik1a.util.{DepartmentTypeUtil, StateUtil}


class Department private() extends MongoRecord[Department] with ObjectIdPk[Department] {
  def meta = Department
  
  object specialty extends EnumField(this, DepartmentTypeUtil.getDepartmentType)
  object state extends EnumField(this, StateUtil.States)
  object city extends StringField(this,32)
  
}

object Department extends Department with MongoMetaRecord[Department] { 
   def findById (id : ObjectId) : List[Department] = 
   {
      val qry = QueryBuilder.start("_id").is(id).get
      Department.findAll(qry)
   }
   
  // def findAll () : List[Department] =  Department.findAll()
}

