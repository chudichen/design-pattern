package com.michael.caching;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Michael Chu
 * @since 2019-08-06 14:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount {

    private String userId;
    private String userName;
    private String additionalInfo;
}
