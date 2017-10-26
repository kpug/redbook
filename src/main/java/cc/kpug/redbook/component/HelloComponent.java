package cc.kpug.redbook.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * User: before30 
 * Date: 2017. 10. 26.
 * Time: PM 8:52
 */
@Component
@RequiredArgsConstructor
public class HelloComponent {
	public Mono<ServerResponse> hello(ServerRequest request) {

		return ServerResponse.ok().body(Mono.just("world"), String.class);
	}
}
