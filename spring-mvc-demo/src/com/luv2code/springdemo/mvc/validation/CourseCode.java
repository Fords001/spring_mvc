package com.luv2code.springdemo.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//contains business rules,validation logic
@Constraint(validatedBy = CourseCodeConstraintValidator. class)
// it shows us that you can use this annotation on methods or fields
@Target({ElementType.METHOD,ElementType.FIELD})
//run it during runtime
@Retention(RetentionPolicy.RUNTIME)
/*The @ symbol means an annotation type definition.
That means it is not really an interface, but rather a new annotation type -
- to be used as a function modifier, such as @override.
@interface is used to create your own (custom) Java annotations.
 Annotations are defined in their own file, just like a Java class or interface
*/
public @interface CourseCode {
	
	//define default course code
	public String value() default "RUS";
	// define default error message
	public String message() default "must start with RUS";
	
	//define default groups
    // just empty collection
	public Class <?>[]groups()default{}; 
	//define default payloads
	//payload can give you additional info  about error messages that happened
	
	public Class <? extends Payload>[] payload() default{};

}
