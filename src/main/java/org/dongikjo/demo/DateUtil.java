/**
 * Dependency Library
 * - commons-io:2.11.0
 * 
 * @author jodongik
 *
 */
package org.dongikjo.demo;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Component;

@Component
public class DateUtil {
	public String yyyyMMddHHmmss() {
		return DateFormatUtils.format(DateUtils.toCalendar(new Date()), "yyyy-MM-dd HH:mm:ss");
	}

}
