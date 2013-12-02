/*
 * (C) Copyright 2013 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 */
package com.kurento.kmf.media;

import java.util.Map;

import com.kurento.kmf.media.params.MediaParam;

public interface MediaMixer extends MediaObject {

	MediaElement createEndpoint();

	MediaElement createEndpoint(Map<String, MediaParam> params);

	void createEndpoint(final Continuation<MediaElement> cont);

	void createEndpoint(Map<String, MediaParam> params,
			final Continuation<MediaElement> cont);

	public interface MediaMixerBuilder extends
			MediaObjectBuilder<MediaMixerBuilder, MediaMixer> {

	}

}
