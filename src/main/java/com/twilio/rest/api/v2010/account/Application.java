/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Application extends Resource {
    private static final long serialVersionUID = 30273898590025L;

    /**
     * Create a ApplicationCreator to execute create.
     * 
     * @param pathAccountSid The account_sid
     * @param friendlyName Human readable description of this resource
     * @return ApplicationCreator capable of executing the create
     */
    public static ApplicationCreator creator(final String pathAccountSid, 
                                             final String friendlyName) {
        return new ApplicationCreator(pathAccountSid, friendlyName);
    }

    /**
     * Create a ApplicationCreator to execute create.
     * 
     * @param friendlyName Human readable description of this resource
     * @return ApplicationCreator capable of executing the create
     */
    public static ApplicationCreator creator(final String friendlyName) {
        return new ApplicationCreator(friendlyName);
    }

    /**
     * Create a ApplicationDeleter to execute delete.
     * 
     * @param pathAccountSid The account_sid
     * @param pathSid The application sid to delete
     * @return ApplicationDeleter capable of executing the delete
     */
    public static ApplicationDeleter deleter(final String pathAccountSid, 
                                             final String pathSid) {
        return new ApplicationDeleter(pathAccountSid, pathSid);
    }

    /**
     * Create a ApplicationDeleter to execute delete.
     * 
     * @param pathSid The application sid to delete
     * @return ApplicationDeleter capable of executing the delete
     */
    public static ApplicationDeleter deleter(final String pathSid) {
        return new ApplicationDeleter(pathSid);
    }

    /**
     * Create a ApplicationFetcher to execute fetch.
     * 
     * @param pathAccountSid The account_sid
     * @param pathSid Fetch by unique Application Sid
     * @return ApplicationFetcher capable of executing the fetch
     */
    public static ApplicationFetcher fetcher(final String pathAccountSid, 
                                             final String pathSid) {
        return new ApplicationFetcher(pathAccountSid, pathSid);
    }

    /**
     * Create a ApplicationFetcher to execute fetch.
     * 
     * @param pathSid Fetch by unique Application Sid
     * @return ApplicationFetcher capable of executing the fetch
     */
    public static ApplicationFetcher fetcher(final String pathSid) {
        return new ApplicationFetcher(pathSid);
    }

    /**
     * Create a ApplicationReader to execute read.
     * 
     * @param pathAccountSid The account_sid
     * @return ApplicationReader capable of executing the read
     */
    public static ApplicationReader reader(final String pathAccountSid) {
        return new ApplicationReader(pathAccountSid);
    }

    /**
     * Create a ApplicationReader to execute read.
     * 
     * @return ApplicationReader capable of executing the read
     */
    public static ApplicationReader reader() {
        return new ApplicationReader();
    }

    /**
     * Create a ApplicationUpdater to execute update.
     * 
     * @param pathAccountSid The account_sid
     * @param pathSid The sid
     * @return ApplicationUpdater capable of executing the update
     */
    public static ApplicationUpdater updater(final String pathAccountSid, 
                                             final String pathSid) {
        return new ApplicationUpdater(pathAccountSid, pathSid);
    }

    /**
     * Create a ApplicationUpdater to execute update.
     * 
     * @param pathSid The sid
     * @return ApplicationUpdater capable of executing the update
     */
    public static ApplicationUpdater updater(final String pathSid) {
        return new ApplicationUpdater(pathSid);
    }

    /**
     * Converts a JSON String into a Application object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Application object represented by the provided JSON
     */
    public static Application fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Application.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Application object using the provided
     * ObjectMapper.
     * 
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Application object represented by the provided JSON
     */
    public static Application fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Application.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountSid;
    private final String apiVersion;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final String friendlyName;
    private final URI messageStatusCallback;
    private final String sid;
    private final HttpMethod smsFallbackMethod;
    private final URI smsFallbackUrl;
    private final HttpMethod smsMethod;
    private final URI smsStatusCallback;
    private final URI smsUrl;
    private final URI statusCallback;
    private final HttpMethod statusCallbackMethod;
    private final String uri;
    private final Boolean voiceCallerIdLookup;
    private final HttpMethod voiceFallbackMethod;
    private final URI voiceFallbackUrl;
    private final HttpMethod voiceMethod;
    private final URI voiceUrl;

    @JsonCreator
    private Application(@JsonProperty("account_sid")
                        final String accountSid, 
                        @JsonProperty("api_version")
                        final String apiVersion, 
                        @JsonProperty("date_created")
                        final String dateCreated, 
                        @JsonProperty("date_updated")
                        final String dateUpdated, 
                        @JsonProperty("friendly_name")
                        final String friendlyName, 
                        @JsonProperty("message_status_callback")
                        final URI messageStatusCallback, 
                        @JsonProperty("sid")
                        final String sid, 
                        @JsonProperty("sms_fallback_method")
                        final HttpMethod smsFallbackMethod, 
                        @JsonProperty("sms_fallback_url")
                        final URI smsFallbackUrl, 
                        @JsonProperty("sms_method")
                        final HttpMethod smsMethod, 
                        @JsonProperty("sms_status_callback")
                        final URI smsStatusCallback, 
                        @JsonProperty("sms_url")
                        final URI smsUrl, 
                        @JsonProperty("status_callback")
                        final URI statusCallback, 
                        @JsonProperty("status_callback_method")
                        final HttpMethod statusCallbackMethod, 
                        @JsonProperty("uri")
                        final String uri, 
                        @JsonProperty("voice_caller_id_lookup")
                        final Boolean voiceCallerIdLookup, 
                        @JsonProperty("voice_fallback_method")
                        final HttpMethod voiceFallbackMethod, 
                        @JsonProperty("voice_fallback_url")
                        final URI voiceFallbackUrl, 
                        @JsonProperty("voice_method")
                        final HttpMethod voiceMethod, 
                        @JsonProperty("voice_url")
                        final URI voiceUrl) {
        this.accountSid = accountSid;
        this.apiVersion = apiVersion;
        this.dateCreated = DateConverter.rfc2822DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.rfc2822DateTimeFromString(dateUpdated);
        this.friendlyName = friendlyName;
        this.messageStatusCallback = messageStatusCallback;
        this.sid = sid;
        this.smsFallbackMethod = smsFallbackMethod;
        this.smsFallbackUrl = smsFallbackUrl;
        this.smsMethod = smsMethod;
        this.smsStatusCallback = smsStatusCallback;
        this.smsUrl = smsUrl;
        this.statusCallback = statusCallback;
        this.statusCallbackMethod = statusCallbackMethod;
        this.uri = uri;
        this.voiceCallerIdLookup = voiceCallerIdLookup;
        this.voiceFallbackMethod = voiceFallbackMethod;
        this.voiceFallbackUrl = voiceFallbackUrl;
        this.voiceMethod = voiceMethod;
        this.voiceUrl = voiceUrl;
    }

    /**
     * Returns The A string that uniquely identifies this resource.
     * 
     * @return A string that uniquely identifies this resource
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The The API version to use.
     * 
     * @return The API version to use
     */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * Returns The Date this resource was created.
     * 
     * @return Date this resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The Date this resource was last updated.
     * 
     * @return Date this resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The Human readable description of this resource.
     * 
     * @return Human readable description of this resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The URL to make requests to with status updates.
     * 
     * @return URL to make requests to with status updates
     */
    public final URI getMessageStatusCallback() {
        return this.messageStatusCallback;
    }

    /**
     * Returns The A string that uniquely identifies this resource.
     * 
     * @return A string that uniquely identifies this resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The HTTP method to use with sms_fallback_method.
     * 
     * @return HTTP method to use with sms_fallback_method
     */
    public final HttpMethod getSmsFallbackMethod() {
        return this.smsFallbackMethod;
    }

    /**
     * Returns The Fallback URL if there's an error parsing TwiML.
     * 
     * @return Fallback URL if there's an error parsing TwiML
     */
    public final URI getSmsFallbackUrl() {
        return this.smsFallbackUrl;
    }

    /**
     * Returns The HTTP method to use with sms_url.
     * 
     * @return HTTP method to use with sms_url
     */
    public final HttpMethod getSmsMethod() {
        return this.smsMethod;
    }

    /**
     * Returns The URL Twilio with request with status updates.
     * 
     * @return URL Twilio with request with status updates
     */
    public final URI getSmsStatusCallback() {
        return this.smsStatusCallback;
    }

    /**
     * Returns The URL Twilio will request when receiving an SMS.
     * 
     * @return URL Twilio will request when receiving an SMS
     */
    public final URI getSmsUrl() {
        return this.smsUrl;
    }

    /**
     * Returns The URL to hit with status updates.
     * 
     * @return URL to hit with status updates
     */
    public final URI getStatusCallback() {
        return this.statusCallback;
    }

    /**
     * Returns The HTTP method to use with the status callback.
     * 
     * @return HTTP method to use with the status callback
     */
    public final HttpMethod getStatusCallbackMethod() {
        return this.statusCallbackMethod;
    }

    /**
     * Returns The URI for this resource.
     * 
     * @return URI for this resource
     */
    public final String getUri() {
        return this.uri;
    }

    /**
     * Returns The True or False.
     * 
     * @return True or False
     */
    public final Boolean getVoiceCallerIdLookup() {
        return this.voiceCallerIdLookup;
    }

    /**
     * Returns The HTTP method to use with the fallback url.
     * 
     * @return HTTP method to use with the fallback url
     */
    public final HttpMethod getVoiceFallbackMethod() {
        return this.voiceFallbackMethod;
    }

    /**
     * Returns The Fallback URL.
     * 
     * @return Fallback URL
     */
    public final URI getVoiceFallbackUrl() {
        return this.voiceFallbackUrl;
    }

    /**
     * Returns The HTTP method to use with the URL.
     * 
     * @return HTTP method to use with the URL
     */
    public final HttpMethod getVoiceMethod() {
        return this.voiceMethod;
    }

    /**
     * Returns The URL Twilio will make requests to when relieving a call.
     * 
     * @return URL Twilio will make requests to when relieving a call
     */
    public final URI getVoiceUrl() {
        return this.voiceUrl;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Application other = (Application) o;

        return Objects.equals(accountSid, other.accountSid) && 
               Objects.equals(apiVersion, other.apiVersion) && 
               Objects.equals(dateCreated, other.dateCreated) && 
               Objects.equals(dateUpdated, other.dateUpdated) && 
               Objects.equals(friendlyName, other.friendlyName) && 
               Objects.equals(messageStatusCallback, other.messageStatusCallback) && 
               Objects.equals(sid, other.sid) && 
               Objects.equals(smsFallbackMethod, other.smsFallbackMethod) && 
               Objects.equals(smsFallbackUrl, other.smsFallbackUrl) && 
               Objects.equals(smsMethod, other.smsMethod) && 
               Objects.equals(smsStatusCallback, other.smsStatusCallback) && 
               Objects.equals(smsUrl, other.smsUrl) && 
               Objects.equals(statusCallback, other.statusCallback) && 
               Objects.equals(statusCallbackMethod, other.statusCallbackMethod) && 
               Objects.equals(uri, other.uri) && 
               Objects.equals(voiceCallerIdLookup, other.voiceCallerIdLookup) && 
               Objects.equals(voiceFallbackMethod, other.voiceFallbackMethod) && 
               Objects.equals(voiceFallbackUrl, other.voiceFallbackUrl) && 
               Objects.equals(voiceMethod, other.voiceMethod) && 
               Objects.equals(voiceUrl, other.voiceUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid,
                            apiVersion,
                            dateCreated,
                            dateUpdated,
                            friendlyName,
                            messageStatusCallback,
                            sid,
                            smsFallbackMethod,
                            smsFallbackUrl,
                            smsMethod,
                            smsStatusCallback,
                            smsUrl,
                            statusCallback,
                            statusCallbackMethod,
                            uri,
                            voiceCallerIdLookup,
                            voiceFallbackMethod,
                            voiceFallbackUrl,
                            voiceMethod,
                            voiceUrl);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("accountSid", accountSid)
                          .add("apiVersion", apiVersion)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("friendlyName", friendlyName)
                          .add("messageStatusCallback", messageStatusCallback)
                          .add("sid", sid)
                          .add("smsFallbackMethod", smsFallbackMethod)
                          .add("smsFallbackUrl", smsFallbackUrl)
                          .add("smsMethod", smsMethod)
                          .add("smsStatusCallback", smsStatusCallback)
                          .add("smsUrl", smsUrl)
                          .add("statusCallback", statusCallback)
                          .add("statusCallbackMethod", statusCallbackMethod)
                          .add("uri", uri)
                          .add("voiceCallerIdLookup", voiceCallerIdLookup)
                          .add("voiceFallbackMethod", voiceFallbackMethod)
                          .add("voiceFallbackUrl", voiceFallbackUrl)
                          .add("voiceMethod", voiceMethod)
                          .add("voiceUrl", voiceUrl)
                          .toString();
    }
}