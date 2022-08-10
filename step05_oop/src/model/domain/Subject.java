package model.domain;

import lombok.*;

public class Subject {
   /**
    *
    */
   @Getter
   @Setter
   private String subject;


   private String name;

   public String getTeacherName() {
      return this.name;
   }
}
