package org.dongikjo.demo;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class JuminNoValidator implements ConstraintValidator<JuminNo, CharSequence> {

	@Override
	public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
		if(value instanceof String) {
			return isJuminNo((String)value);
		}
		return isJuminNo(value.toString());
	}
	
	private boolean isJuminNo(String value) {
		if(value == null || value.length() != 14) return false;
		boolean ok = false;

		int key = 11;
		int checkSum = 0;
		int reg = value.charAt(value.length() - 1) - 48;
		int checkReg = 0;

		int[] weight = {2,3,4,5,6,7,8,9,2,3,4,5};

		value = value.replace("-", "");	
		value = value.substring(0, value.length() - 1);
		
		for(int i = 0 ; i < weight.length ; i++) {
			checkSum += (value.charAt(i) - 48) * weight[i];
		}

        checkReg = key - (checkSum%key);

	    if(checkReg == 10) {
		   checkReg = 0;
	    } else if(checkReg == 11) {
	    	checkReg = 1;
	    }

	    if(checkReg == reg) {
		   ok = true;
	    }

		return ok;
	}

}
