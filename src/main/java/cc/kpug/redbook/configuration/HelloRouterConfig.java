package cc.kpug.redbook.configuration;

import cc.kpug.redbook.component.HelloComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * User: before30 
 * Date: 2017. 10. 26.
 * Time: PM 8:51
 */
@Configuration
public class HelloRouterConfig {

	@Bean RouterFunction<ServerResponse> helloRouter(HelloComponent helloComponent) {
		return route(GET("/hello"), helloComponent::hello);
	}
}
