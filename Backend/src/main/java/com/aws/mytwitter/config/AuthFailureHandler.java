package com.aws.mytwitter.config;

import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

/**Custom Failure Handler to user enters handle Invalid Login credentials.
 * @author RajashekharGoud
 *
 */
@Component
public class AuthFailureHandler extends SimpleUrlAuthenticationFailureHandler{

}
