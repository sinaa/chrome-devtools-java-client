package com.github.kklisura.cdt.protocol.types.page;

/*-
 * #%L
 * cdt-java-client
 * %%
 * Copyright (C) 2018 - 2021 Kenan Klisura
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.fasterxml.jackson.annotation.JsonProperty;

/** List of not restored reasons for back-forward cache. */
public enum BackForwardCacheNotRestoredReason {
  @JsonProperty("NotMainFrame")
  NOT_MAIN_FRAME,
  @JsonProperty("BackForwardCacheDisabled")
  BACK_FORWARD_CACHE_DISABLED,
  @JsonProperty("RelatedActiveContentsExist")
  RELATED_ACTIVE_CONTENTS_EXIST,
  @JsonProperty("HTTPStatusNotOK")
  HTTP_STATUS_NOT_OK,
  @JsonProperty("SchemeNotHTTPOrHTTPS")
  SCHEME_NOT_HTTP_OR_HTTPS,
  @JsonProperty("Loading")
  LOADING,
  @JsonProperty("WasGrantedMediaAccess")
  WAS_GRANTED_MEDIA_ACCESS,
  @JsonProperty("DisableForRenderFrameHostCalled")
  DISABLE_FOR_RENDER_FRAME_HOST_CALLED,
  @JsonProperty("DomainNotAllowed")
  DOMAIN_NOT_ALLOWED,
  @JsonProperty("HTTPMethodNotGET")
  HTTP_METHOD_NOT_GET,
  @JsonProperty("SubframeIsNavigating")
  SUBFRAME_IS_NAVIGATING,
  @JsonProperty("Timeout")
  TIMEOUT,
  @JsonProperty("CacheLimit")
  CACHE_LIMIT,
  @JsonProperty("JavaScriptExecution")
  JAVA_SCRIPT_EXECUTION,
  @JsonProperty("RendererProcessKilled")
  RENDERER_PROCESS_KILLED,
  @JsonProperty("RendererProcessCrashed")
  RENDERER_PROCESS_CRASHED,
  @JsonProperty("GrantedMediaStreamAccess")
  GRANTED_MEDIA_STREAM_ACCESS,
  @JsonProperty("SchedulerTrackedFeatureUsed")
  SCHEDULER_TRACKED_FEATURE_USED,
  @JsonProperty("ConflictingBrowsingInstance")
  CONFLICTING_BROWSING_INSTANCE,
  @JsonProperty("CacheFlushed")
  CACHE_FLUSHED,
  @JsonProperty("ServiceWorkerVersionActivation")
  SERVICE_WORKER_VERSION_ACTIVATION,
  @JsonProperty("SessionRestored")
  SESSION_RESTORED,
  @JsonProperty("ServiceWorkerPostMessage")
  SERVICE_WORKER_POST_MESSAGE,
  @JsonProperty("EnteredBackForwardCacheBeforeServiceWorkerHostAdded")
  ENTERED_BACK_FORWARD_CACHE_BEFORE_SERVICE_WORKER_HOST_ADDED,
  @JsonProperty("RenderFrameHostReused_SameSite")
  RENDER_FRAME_HOST_REUSED_SAME_SITE,
  @JsonProperty("RenderFrameHostReused_CrossSite")
  RENDER_FRAME_HOST_REUSED_CROSS_SITE,
  @JsonProperty("ServiceWorkerClaim")
  SERVICE_WORKER_CLAIM,
  @JsonProperty("IgnoreEventAndEvict")
  IGNORE_EVENT_AND_EVICT,
  @JsonProperty("HaveInnerContents")
  HAVE_INNER_CONTENTS,
  @JsonProperty("TimeoutPuttingInCache")
  TIMEOUT_PUTTING_IN_CACHE,
  @JsonProperty("BackForwardCacheDisabledByLowMemory")
  BACK_FORWARD_CACHE_DISABLED_BY_LOW_MEMORY,
  @JsonProperty("BackForwardCacheDisabledByCommandLine")
  BACK_FORWARD_CACHE_DISABLED_BY_COMMAND_LINE,
  @JsonProperty("NetworkRequestDatapipeDrainedAsBytesConsumer")
  NETWORK_REQUEST_DATAPIPE_DRAINED_AS_BYTES_CONSUMER,
  @JsonProperty("NetworkRequestRedirected")
  NETWORK_REQUEST_REDIRECTED,
  @JsonProperty("NetworkRequestTimeout")
  NETWORK_REQUEST_TIMEOUT,
  @JsonProperty("NetworkExceedsBufferLimit")
  NETWORK_EXCEEDS_BUFFER_LIMIT,
  @JsonProperty("NavigationCancelledWhileRestoring")
  NAVIGATION_CANCELLED_WHILE_RESTORING,
  @JsonProperty("NotMostRecentNavigationEntry")
  NOT_MOST_RECENT_NAVIGATION_ENTRY,
  @JsonProperty("BackForwardCacheDisabledForPrerender")
  BACK_FORWARD_CACHE_DISABLED_FOR_PRERENDER,
  @JsonProperty("UserAgentOverrideDiffers")
  USER_AGENT_OVERRIDE_DIFFERS,
  @JsonProperty("ForegroundCacheLimit")
  FOREGROUND_CACHE_LIMIT,
  @JsonProperty("BrowsingInstanceNotSwapped")
  BROWSING_INSTANCE_NOT_SWAPPED,
  @JsonProperty("BackForwardCacheDisabledForDelegate")
  BACK_FORWARD_CACHE_DISABLED_FOR_DELEGATE,
  @JsonProperty("OptInUnloadHeaderNotPresent")
  OPT_IN_UNLOAD_HEADER_NOT_PRESENT,
  @JsonProperty("UnloadHandlerExistsInMainFrame")
  UNLOAD_HANDLER_EXISTS_IN_MAIN_FRAME,
  @JsonProperty("UnloadHandlerExistsInSubFrame")
  UNLOAD_HANDLER_EXISTS_IN_SUB_FRAME,
  @JsonProperty("ServiceWorkerUnregistration")
  SERVICE_WORKER_UNREGISTRATION,
  @JsonProperty("WebSocket")
  WEB_SOCKET,
  @JsonProperty("WebRTC")
  WEB_RTC,
  @JsonProperty("MainResourceHasCacheControlNoStore")
  MAIN_RESOURCE_HAS_CACHE_CONTROL_NO_STORE,
  @JsonProperty("MainResourceHasCacheControlNoCache")
  MAIN_RESOURCE_HAS_CACHE_CONTROL_NO_CACHE,
  @JsonProperty("SubresourceHasCacheControlNoStore")
  SUBRESOURCE_HAS_CACHE_CONTROL_NO_STORE,
  @JsonProperty("SubresourceHasCacheControlNoCache")
  SUBRESOURCE_HAS_CACHE_CONTROL_NO_CACHE,
  @JsonProperty("ContainsPlugins")
  CONTAINS_PLUGINS,
  @JsonProperty("DocumentLoaded")
  DOCUMENT_LOADED,
  @JsonProperty("DedicatedWorkerOrWorklet")
  DEDICATED_WORKER_OR_WORKLET,
  @JsonProperty("OutstandingNetworkRequestOthers")
  OUTSTANDING_NETWORK_REQUEST_OTHERS,
  @JsonProperty("OutstandingIndexedDBTransaction")
  OUTSTANDING_INDEXED_DB_TRANSACTION,
  @JsonProperty("RequestedGeolocationPermission")
  REQUESTED_GEOLOCATION_PERMISSION,
  @JsonProperty("RequestedNotificationsPermission")
  REQUESTED_NOTIFICATIONS_PERMISSION,
  @JsonProperty("RequestedMIDIPermission")
  REQUESTED_MIDI_PERMISSION,
  @JsonProperty("RequestedAudioCapturePermission")
  REQUESTED_AUDIO_CAPTURE_PERMISSION,
  @JsonProperty("RequestedVideoCapturePermission")
  REQUESTED_VIDEO_CAPTURE_PERMISSION,
  @JsonProperty("RequestedBackForwardCacheBlockedSensors")
  REQUESTED_BACK_FORWARD_CACHE_BLOCKED_SENSORS,
  @JsonProperty("RequestedBackgroundWorkPermission")
  REQUESTED_BACKGROUND_WORK_PERMISSION,
  @JsonProperty("BroadcastChannel")
  BROADCAST_CHANNEL,
  @JsonProperty("IndexedDBConnection")
  INDEXED_DB_CONNECTION,
  @JsonProperty("WebXR")
  WEB_XR,
  @JsonProperty("SharedWorker")
  SHARED_WORKER,
  @JsonProperty("WebLocks")
  WEB_LOCKS,
  @JsonProperty("WebHID")
  WEB_HID,
  @JsonProperty("WebShare")
  WEB_SHARE,
  @JsonProperty("RequestedStorageAccessGrant")
  REQUESTED_STORAGE_ACCESS_GRANT,
  @JsonProperty("WebNfc")
  WEB_NFC,
  @JsonProperty("WebFileSystem")
  WEB_FILE_SYSTEM,
  @JsonProperty("OutstandingNetworkRequestFetch")
  OUTSTANDING_NETWORK_REQUEST_FETCH,
  @JsonProperty("OutstandingNetworkRequestXHR")
  OUTSTANDING_NETWORK_REQUEST_XHR,
  @JsonProperty("AppBanner")
  APP_BANNER,
  @JsonProperty("Printing")
  PRINTING,
  @JsonProperty("WebDatabase")
  WEB_DATABASE,
  @JsonProperty("PictureInPicture")
  PICTURE_IN_PICTURE,
  @JsonProperty("Portal")
  PORTAL,
  @JsonProperty("SpeechRecognizer")
  SPEECH_RECOGNIZER,
  @JsonProperty("IdleManager")
  IDLE_MANAGER,
  @JsonProperty("PaymentManager")
  PAYMENT_MANAGER,
  @JsonProperty("SpeechSynthesis")
  SPEECH_SYNTHESIS,
  @JsonProperty("KeyboardLock")
  KEYBOARD_LOCK,
  @JsonProperty("WebOTPService")
  WEB_OTP_SERVICE,
  @JsonProperty("OutstandingNetworkRequestDirectSocket")
  OUTSTANDING_NETWORK_REQUEST_DIRECT_SOCKET,
  @JsonProperty("IsolatedWorldScript")
  ISOLATED_WORLD_SCRIPT,
  @JsonProperty("InjectedStyleSheet")
  INJECTED_STYLE_SHEET,
  @JsonProperty("MediaSessionImplOnServiceCreated")
  MEDIA_SESSION_IMPL_ON_SERVICE_CREATED,
  @JsonProperty("Unknown")
  UNKNOWN
}
