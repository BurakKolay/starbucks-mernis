package com.starbucks.starbucks.adapter;

//----------------------------------------------------
//
// Generated by www.easywsdl.com
// Version: 7.0.2.0
//
// Created by Quasar Development 
//
//----------------------------------------------------

import java.util.Date;


public interface EDUDateTimeConverter
{
    java.util.Date convertDateTime(String strDate);
    java.util.Date convertTime(String strDate);
    java.util.Date convertDate(String strDate);
    String convertDuration(String value);
    String getStringFromDateTime(Date value);
    String getStringFromDate(Date value);
    String getStringFromTime(Date value);
    String getStringFromDuration(String value);
}