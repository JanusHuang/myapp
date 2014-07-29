package com.janus.myapp.frame.core.converter;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{

    @Override
    public Date convert(String source) {
        try {
           return DateUtils.parseDate(source, "yyyy-MM-dd","yyyy-MM-dd hh:mm:ss");
        } catch (ParseException e) {
            LoggerFactory.getLogger(this.getClass()).error(e.getMessage(),e);
            return null;
        }
    }
    
}
