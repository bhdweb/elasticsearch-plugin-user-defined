package org.felayman.elasticsearch.plugin.action;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerContextFactory;
import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.*;

import java.io.IOException;

import static org.elasticsearch.rest.RestRequest.Method.GET;

/**
 * @auhthor lei.fang@shijue.me
 * @since . 2017-07-11
 */
public class HelloCatAction extends  BaseRestHandler {


    public HelloCatAction(Settings settings) {
        super(settings);
    }

    @Inject
    public HelloCatAction(Settings settings, RestController controller) {
        super(settings);
        controller.registerHandler(GET, "/_cat/hello", this);

    }

    @Override
    protected RestChannelConsumer prepareRequest(RestRequest request, NodeClient client) throws IOException {
        return channel -> channel.sendResponse(new BytesRestResponse(RestStatus.OK, "welcome to my first plugin"));
    }
}
