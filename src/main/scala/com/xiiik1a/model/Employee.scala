package com.xiiik1a.model

import java.math.MathContext
import java.text.SimpleDateFormat

import net.liftweb.record.field.{LongField, StringField, EnumField}
import net.liftweb.mongodb.record.field.{ObjectIdPk, ObjectIdRefField}
import net.liftweb.mongodb.record.{MongoRecord, MongoMetaRecord, MongoId}
import net.liftweb.common.{Box,Empty}
//import net.liftweb.mapper._

import com.mongodb._

import com.xiiik1a.util.{DepartmentTypeUtil, DutyUtil}

class Employee private() extends MongoRecord[Employee] with ObjectIdPk[Employee] {
  def meta = Employee

  object departmentId extends ObjectIdRefField[Employee, Department](this, Department) 
    
  // The name of this member
  object firstName extends StringField(this,16)
  object lastName extends StringField(this,16)
  object specialty extends EnumField(this, DepartmentTypeUtil.getDepartmentType)
  object duty extends EnumField(this,DutyUtil.getDutyList(specialty.toInt))
 
}

object Employee extends Employee with MongoMetaRecord[Employee] { 
}


