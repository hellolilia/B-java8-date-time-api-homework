package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    if (date.isAfter(LocalDate.of(year,5,1))) {
      LocalDate laborDay = LocalDate.of(year+1,5,1);
      return laborDay.getDayOfYear() + date.lengthOfYear() - date.getDayOfYear();
    } else {
      LocalDate laborDay = LocalDate.of(year,5,1);
      return laborDay.getDayOfYear() - date.getDayOfYear();
    }

  }
}
