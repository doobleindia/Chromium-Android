// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_consent_specifics.proto

package org.chromium.components.sync.protocol;

public interface UserConsentSpecificsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.UserConsentSpecifics)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The UI language Chrome is using, represented as the IETF language tag
   * defined in BCP 47. The region subtag is not included when it adds no
   * distinguishing information to the language tag (e.g. both "en-US"
   * and "fr" are correct here).
   * </pre>
   *
   * <code>optional string locale = 4;</code>
   */
  boolean hasLocale();
  /**
   * <pre>
   * The UI language Chrome is using, represented as the IETF language tag
   * defined in BCP 47. The region subtag is not included when it adds no
   * distinguishing information to the language tag (e.g. both "en-US"
   * and "fr" are correct here).
   * </pre>
   *
   * <code>optional string locale = 4;</code>
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * The UI language Chrome is using, represented as the IETF language tag
   * defined in BCP 47. The region subtag is not included when it adds no
   * distinguishing information to the language tag (e.g. both "en-US"
   * and "fr" are correct here).
   * </pre>
   *
   * <code>optional string locale = 4;</code>
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * The local time on the client when the user consent was recorded. The time
   * as measured by client is given in microseconds since Windows epoch. This
   * is needed since user consent recording may happen when a client is
   * offline.
   * </pre>
   *
   * <code>optional int64 client_consent_time_usec = 12;</code>
   */
  boolean hasClientConsentTimeUsec();
  /**
   * <pre>
   * The local time on the client when the user consent was recorded. The time
   * as measured by client is given in microseconds since Windows epoch. This
   * is needed since user consent recording may happen when a client is
   * offline.
   * </pre>
   *
   * <code>optional int64 client_consent_time_usec = 12;</code>
   */
  long getClientConsentTimeUsec();

  /**
   * <code>optional .sync_pb.UserConsentTypes.SyncConsent sync_consent = 7;</code>
   */
  boolean hasSyncConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.SyncConsent sync_consent = 7;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.SyncConsent getSyncConsent();

  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcBackupAndRestoreConsent arc_backup_and_restore_consent = 8;</code>
   */
  boolean hasArcBackupAndRestoreConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcBackupAndRestoreConsent arc_backup_and_restore_consent = 8;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcBackupAndRestoreConsent getArcBackupAndRestoreConsent();

  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcGoogleLocationServiceConsent arc_location_service_consent = 9;</code>
   */
  boolean hasArcLocationServiceConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcGoogleLocationServiceConsent arc_location_service_consent = 9;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcGoogleLocationServiceConsent getArcLocationServiceConsent();

  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcPlayTermsOfServiceConsent arc_play_terms_of_service_consent = 10;</code>
   */
  boolean hasArcPlayTermsOfServiceConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcPlayTermsOfServiceConsent arc_play_terms_of_service_consent = 10;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcPlayTermsOfServiceConsent getArcPlayTermsOfServiceConsent();

  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcMetricsAndUsageConsent arc_metrics_and_usage_consent = 11;</code>
   */
  boolean hasArcMetricsAndUsageConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.ArcMetricsAndUsageConsent arc_metrics_and_usage_consent = 11;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.ArcMetricsAndUsageConsent getArcMetricsAndUsageConsent();

  /**
   * <code>optional .sync_pb.UserConsentTypes.UnifiedConsent unified_consent = 13;</code>
   */
  boolean hasUnifiedConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.UnifiedConsent unified_consent = 13;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.UnifiedConsent getUnifiedConsent();

  /**
   * <code>optional .sync_pb.UserConsentTypes.AssistantActivityControlConsent assistant_activity_control_consent = 14;</code>
   */
  boolean hasAssistantActivityControlConsent();
  /**
   * <code>optional .sync_pb.UserConsentTypes.AssistantActivityControlConsent assistant_activity_control_consent = 14;</code>
   */
  org.chromium.components.sync.protocol.UserConsentTypes.AssistantActivityControlConsent getAssistantActivityControlConsent();

  /**
   * <pre>
   * The account ID of the user who gave the consent. This field is used
   * by UserEventService to distinguish consents from different users,
   * as UserConsent does not get deleted when a user signs out. However,
   * it should be cleared before being sent over the wire, as the UserEvent
   * is sent over an authenticated channel, so this information would be
   * redundant.
   * For semantics and usage of the |account_id| in the signin codebase,
   * see PrimaryAccountManager::GetAuthenticatedAccountId()
   * or AccountInfo::account_id.
   * </pre>
   *
   * <code>optional string account_id = 6;</code>
   */
  boolean hasAccountId();
  /**
   * <pre>
   * The account ID of the user who gave the consent. This field is used
   * by UserEventService to distinguish consents from different users,
   * as UserConsent does not get deleted when a user signs out. However,
   * it should be cleared before being sent over the wire, as the UserEvent
   * is sent over an authenticated channel, so this information would be
   * redundant.
   * For semantics and usage of the |account_id| in the signin codebase,
   * see PrimaryAccountManager::GetAuthenticatedAccountId()
   * or AccountInfo::account_id.
   * </pre>
   *
   * <code>optional string account_id = 6;</code>
   */
  java.lang.String getAccountId();
  /**
   * <pre>
   * The account ID of the user who gave the consent. This field is used
   * by UserEventService to distinguish consents from different users,
   * as UserConsent does not get deleted when a user signs out. However,
   * it should be cleared before being sent over the wire, as the UserEvent
   * is sent over an authenticated channel, so this information would be
   * redundant.
   * For semantics and usage of the |account_id| in the signin codebase,
   * see PrimaryAccountManager::GetAuthenticatedAccountId()
   * or AccountInfo::account_id.
   * </pre>
   *
   * <code>optional string account_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getAccountIdBytes();

  /**
   * <code>optional .sync_pb.UserConsentSpecifics.Feature feature = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasFeature();
  /**
   * <code>optional .sync_pb.UserConsentSpecifics.Feature feature = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.UserConsentSpecifics.Feature getFeature();

  /**
   * <pre>
   * Ids of the strings of the consent text presented to the user.
   * </pre>
   *
   * <code>repeated int32 description_grd_ids = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.List<java.lang.Integer> getDescriptionGrdIdsList();
  /**
   * <pre>
   * Ids of the strings of the consent text presented to the user.
   * </pre>
   *
   * <code>repeated int32 description_grd_ids = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getDescriptionGrdIdsCount();
  /**
   * <pre>
   * Ids of the strings of the consent text presented to the user.
   * </pre>
   *
   * <code>repeated int32 description_grd_ids = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getDescriptionGrdIds(int index);

  /**
   * <pre>
   * Id of the string of the UI element the user clicked when consenting.
   * </pre>
   *
   * <code>optional int32 confirmation_grd_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasConfirmationGrdId();
  /**
   * <pre>
   * Id of the string of the UI element the user clicked when consenting.
   * </pre>
   *
   * <code>optional int32 confirmation_grd_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getConfirmationGrdId();

  /**
   * <pre>
   * Was the consent for |feature| given or not given (denied/revoked)?
   * </pre>
   *
   * <code>optional .sync_pb.UserConsentTypes.ConsentStatus status = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasStatus();
  /**
   * <pre>
   * Was the consent for |feature| given or not given (denied/revoked)?
   * </pre>
   *
   * <code>optional .sync_pb.UserConsentTypes.ConsentStatus status = 5 [deprecated = true];</code>
   */
  @java.lang.Deprecated org.chromium.components.sync.protocol.UserConsentTypes.ConsentStatus getStatus();

  public org.chromium.components.sync.protocol.UserConsentSpecifics.ConsentCase getConsentCase();
}
