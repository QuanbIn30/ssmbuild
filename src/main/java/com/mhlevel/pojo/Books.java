package com.mhlevel.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author superquanbin@gmail.com
 * @date 2020-08-03 17:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private int bookID;

    private String bookName;

    private int bookCounts;

    private String detail;


}
