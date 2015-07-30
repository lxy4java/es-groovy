package org.elasticsearch.plugin.lxy
import static org.elasticsearch.rest.RestRequest.Method.POST;

import org.elasticsearch.client.Client;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.rest.RestChannel;
import org.elasticsearch.rest.RestController;


import org.elasticsearch.rest.BaseRestHandler;
import org.elasticsearch.rest.RestRequest;

class ESUpdateAction extends BaseRestHandler {

	@Inject
	public ESUpdateAction(Settings settings, RestController controller, Client client) {
		super(settings, controller, client);
		controller.registerHandler(POST, "/{index}/{type}/_xyupdate", this);
	}

	@Override
	public void handleRequest(final RestRequest request, final RestChannel channel, final Client client) throws Exception {
	
		
		}
}
