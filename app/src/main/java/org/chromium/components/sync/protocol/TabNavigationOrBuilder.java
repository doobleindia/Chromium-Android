// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: session_specifics.proto

package org.chromium.components.sync.protocol;

public interface TabNavigationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sync_pb.TabNavigation)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The index in the NavigationController. If this is -1, it means this
   * TabNavigation is bogus.
   * optional int32 index = 1 [default = -1];  // obsolete.
   * The virtual URL, when nonempty, will override the actual URL of the page
   * when we display it to the user.
   * </pre>
   *
   * <code>optional string virtual_url = 2;</code>
   */
  boolean hasVirtualUrl();
  /**
   * <pre>
   * The index in the NavigationController. If this is -1, it means this
   * TabNavigation is bogus.
   * optional int32 index = 1 [default = -1];  // obsolete.
   * The virtual URL, when nonempty, will override the actual URL of the page
   * when we display it to the user.
   * </pre>
   *
   * <code>optional string virtual_url = 2;</code>
   */
  java.lang.String getVirtualUrl();
  /**
   * <pre>
   * The index in the NavigationController. If this is -1, it means this
   * TabNavigation is bogus.
   * optional int32 index = 1 [default = -1];  // obsolete.
   * The virtual URL, when nonempty, will override the actual URL of the page
   * when we display it to the user.
   * </pre>
   *
   * <code>optional string virtual_url = 2;</code>
   */
  com.google.protobuf.ByteString
      getVirtualUrlBytes();

  /**
   * <pre>
   * The referring URL, which can be empty.
   * </pre>
   *
   * <code>optional string referrer = 3;</code>
   */
  boolean hasReferrer();
  /**
   * <pre>
   * The referring URL, which can be empty.
   * </pre>
   *
   * <code>optional string referrer = 3;</code>
   */
  java.lang.String getReferrer();
  /**
   * <pre>
   * The referring URL, which can be empty.
   * </pre>
   *
   * <code>optional string referrer = 3;</code>
   */
  com.google.protobuf.ByteString
      getReferrerBytes();

  /**
   * <pre>
   * The title of the page.
   * </pre>
   *
   * <code>optional string title = 4;</code>
   */
  boolean hasTitle();
  /**
   * <pre>
   * The title of the page.
   * </pre>
   *
   * <code>optional string title = 4;</code>
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * The title of the page.
   * </pre>
   *
   * <code>optional string title = 4;</code>
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * Content state is an opaque blob created by WebKit that represents the
   * state of the page. This includes form entries and scroll position for each
   * frame.
   * optional string state = 5;  // obsolete.
   * The core transition type.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.PageTransition page_transition = 6 [default = LINK];</code>
   */
  boolean hasPageTransition();
  /**
   * <pre>
   * Content state is an opaque blob created by WebKit that represents the
   * state of the page. This includes form entries and scroll position for each
   * frame.
   * optional string state = 5;  // obsolete.
   * The core transition type.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.PageTransition page_transition = 6 [default = LINK];</code>
   */
  org.chromium.components.sync.protocol.SyncEnums.PageTransition getPageTransition();

  /**
   * <pre>
   * If this transition was triggered by a redirect, the redirect type.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.PageTransitionRedirectType redirect_type = 7;</code>
   */
  boolean hasRedirectType();
  /**
   * <pre>
   * If this transition was triggered by a redirect, the redirect type.
   * </pre>
   *
   * <code>optional .sync_pb.SyncEnums.PageTransitionRedirectType redirect_type = 7;</code>
   */
  org.chromium.components.sync.protocol.SyncEnums.PageTransitionRedirectType getRedirectType();

  /**
   * <pre>
   * The unique navigation id (within this client).
   * </pre>
   *
   * <code>optional int32 unique_id = 8;</code>
   */
  boolean hasUniqueId();
  /**
   * <pre>
   * The unique navigation id (within this client).
   * </pre>
   *
   * <code>optional int32 unique_id = 8;</code>
   */
  int getUniqueId();

  /**
   * <pre>
   * Timestamp for when this navigation last occurred (in client time).
   * If the user goes back/forward in history the timestamp may refresh.
   * </pre>
   *
   * <code>optional int64 timestamp_msec = 9;</code>
   */
  boolean hasTimestampMsec();
  /**
   * <pre>
   * Timestamp for when this navigation last occurred (in client time).
   * If the user goes back/forward in history the timestamp may refresh.
   * </pre>
   *
   * <code>optional int64 timestamp_msec = 9;</code>
   */
  long getTimestampMsec();

  /**
   * <pre>
   * User used the Forward or Back button to navigate among browsing history.
   * </pre>
   *
   * <code>optional bool navigation_forward_back = 10;</code>
   */
  boolean hasNavigationForwardBack();
  /**
   * <pre>
   * User used the Forward or Back button to navigate among browsing history.
   * </pre>
   *
   * <code>optional bool navigation_forward_back = 10;</code>
   */
  boolean getNavigationForwardBack();

  /**
   * <pre>
   * User used the address bar to trigger this navigation.
   * </pre>
   *
   * <code>optional bool navigation_from_address_bar = 11;</code>
   */
  boolean hasNavigationFromAddressBar();
  /**
   * <pre>
   * User used the address bar to trigger this navigation.
   * </pre>
   *
   * <code>optional bool navigation_from_address_bar = 11;</code>
   */
  boolean getNavigationFromAddressBar();

  /**
   * <pre>
   * User is navigating to the home page.
   * </pre>
   *
   * <code>optional bool navigation_home_page = 12;</code>
   */
  boolean hasNavigationHomePage();
  /**
   * <pre>
   * User is navigating to the home page.
   * </pre>
   *
   * <code>optional bool navigation_home_page = 12;</code>
   */
  boolean getNavigationHomePage();

  /**
   * <pre>
   * The beginning of a navigation chain.
   * </pre>
   *
   * <code>optional bool navigation_chain_start = 13;</code>
   */
  boolean hasNavigationChainStart();
  /**
   * <pre>
   * The beginning of a navigation chain.
   * </pre>
   *
   * <code>optional bool navigation_chain_start = 13;</code>
   */
  boolean getNavigationChainStart();

  /**
   * <pre>
   * The last transition in a redirect chain.
   * </pre>
   *
   * <code>optional bool navigation_chain_end = 14;</code>
   */
  boolean hasNavigationChainEnd();
  /**
   * <pre>
   * The last transition in a redirect chain.
   * </pre>
   *
   * <code>optional bool navigation_chain_end = 14;</code>
   */
  boolean getNavigationChainEnd();

  /**
   * <pre>
   * The id for this navigation, which is globally unique with high
   * probability.
   * </pre>
   *
   * <code>optional int64 global_id = 15;</code>
   */
  boolean hasGlobalId();
  /**
   * <pre>
   * The id for this navigation, which is globally unique with high
   * probability.
   * </pre>
   *
   * <code>optional int64 global_id = 15;</code>
   */
  long getGlobalId();

  /**
   * <pre>
   * Search terms extracted from the URL.
   * </pre>
   *
   * <code>optional string search_terms = 16 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasSearchTerms();
  /**
   * <pre>
   * Search terms extracted from the URL.
   * </pre>
   *
   * <code>optional string search_terms = 16 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getSearchTerms();
  /**
   * <pre>
   * Search terms extracted from the URL.
   * </pre>
   *
   * <code>optional string search_terms = 16 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSearchTermsBytes();

  /**
   * <pre>
   * The favicon url associated with this page.
   * </pre>
   *
   * <code>optional string favicon_url = 17;</code>
   */
  boolean hasFaviconUrl();
  /**
   * <pre>
   * The favicon url associated with this page.
   * </pre>
   *
   * <code>optional string favicon_url = 17;</code>
   */
  java.lang.String getFaviconUrl();
  /**
   * <pre>
   * The favicon url associated with this page.
   * </pre>
   *
   * <code>optional string favicon_url = 17;</code>
   */
  com.google.protobuf.ByteString
      getFaviconUrlBytes();

  /**
   * <pre>
   * Whether access to the URL was allowed or blocked.
   * </pre>
   *
   * <code>optional .sync_pb.TabNavigation.BlockedState blocked_state = 18 [default = STATE_ALLOWED];</code>
   */
  boolean hasBlockedState();
  /**
   * <pre>
   * Whether access to the URL was allowed or blocked.
   * </pre>
   *
   * <code>optional .sync_pb.TabNavigation.BlockedState blocked_state = 18 [default = STATE_ALLOWED];</code>
   */
  org.chromium.components.sync.protocol.TabNavigation.BlockedState getBlockedState();

  /**
   * <pre>
   * A list of category identifiers for the URL.
   * </pre>
   *
   * <code>repeated string content_pack_categories = 19;</code>
   */
  java.util.List<String>
      getContentPackCategoriesList();
  /**
   * <pre>
   * A list of category identifiers for the URL.
   * </pre>
   *
   * <code>repeated string content_pack_categories = 19;</code>
   */
  int getContentPackCategoriesCount();
  /**
   * <pre>
   * A list of category identifiers for the URL.
   * </pre>
   *
   * <code>repeated string content_pack_categories = 19;</code>
   */
  java.lang.String getContentPackCategories(int index);
  /**
   * <pre>
   * A list of category identifiers for the URL.
   * </pre>
   *
   * <code>repeated string content_pack_categories = 19;</code>
   */
  com.google.protobuf.ByteString
      getContentPackCategoriesBytes(int index);

  /**
   * <pre>
   * The status code from the last navigation.
   * </pre>
   *
   * <code>optional int32 http_status_code = 20;</code>
   */
  boolean hasHttpStatusCode();
  /**
   * <pre>
   * The status code from the last navigation.
   * </pre>
   *
   * <code>optional int32 http_status_code = 20;</code>
   */
  int getHttpStatusCode();

  /**
   * <pre>
   * Referrer policy. Old, broken value. Deprecated in M61.
   * </pre>
   *
   * <code>optional int32 obsolete_referrer_policy = 21 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean hasObsoleteReferrerPolicy();
  /**
   * <pre>
   * Referrer policy. Old, broken value. Deprecated in M61.
   * </pre>
   *
   * <code>optional int32 obsolete_referrer_policy = 21 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getObsoleteReferrerPolicy();

  /**
   * <pre>
   * True if created from restored navigation entry that hasn't been loaded.
   * </pre>
   *
   * <code>optional bool is_restored = 22;</code>
   */
  boolean hasIsRestored();
  /**
   * <pre>
   * True if created from restored navigation entry that hasn't been loaded.
   * </pre>
   *
   * <code>optional bool is_restored = 22;</code>
   */
  boolean getIsRestored();

  /**
   * <pre>
   * The chain of redirections for this navigation, from the original URL
   * through the last URL that redirected.
   * </pre>
   *
   * <code>repeated .sync_pb.NavigationRedirect navigation_redirect = 23;</code>
   */
  java.util.List<org.chromium.components.sync.protocol.NavigationRedirect> 
      getNavigationRedirectList();
  /**
   * <pre>
   * The chain of redirections for this navigation, from the original URL
   * through the last URL that redirected.
   * </pre>
   *
   * <code>repeated .sync_pb.NavigationRedirect navigation_redirect = 23;</code>
   */
  org.chromium.components.sync.protocol.NavigationRedirect getNavigationRedirect(int index);
  /**
   * <pre>
   * The chain of redirections for this navigation, from the original URL
   * through the last URL that redirected.
   * </pre>
   *
   * <code>repeated .sync_pb.NavigationRedirect navigation_redirect = 23;</code>
   */
  int getNavigationRedirectCount();

  /**
   * <pre>
   * Normally not present.
   * The last URL traversed when different from the virtual_url.
   * </pre>
   *
   * <code>optional string last_navigation_redirect_url = 24;</code>
   */
  boolean hasLastNavigationRedirectUrl();
  /**
   * <pre>
   * Normally not present.
   * The last URL traversed when different from the virtual_url.
   * </pre>
   *
   * <code>optional string last_navigation_redirect_url = 24;</code>
   */
  java.lang.String getLastNavigationRedirectUrl();
  /**
   * <pre>
   * Normally not present.
   * The last URL traversed when different from the virtual_url.
   * </pre>
   *
   * <code>optional string last_navigation_redirect_url = 24;</code>
   */
  com.google.protobuf.ByteString
      getLastNavigationRedirectUrlBytes();

  /**
   * <pre>
   * Correct referrer policy. Valid enums are defined in
   * third_party/WebKit/public/platform/WebReferrerPolicy.h.
   * </pre>
   *
   * <code>optional int32 correct_referrer_policy = 25 [default = 1];</code>
   */
  boolean hasCorrectReferrerPolicy();
  /**
   * <pre>
   * Correct referrer policy. Valid enums are defined in
   * third_party/WebKit/public/platform/WebReferrerPolicy.h.
   * </pre>
   *
   * <code>optional int32 correct_referrer_policy = 25 [default = 1];</code>
   */
  int getCorrectReferrerPolicy();

  /**
   * <pre>
   * Whether the Password Manager saw a password field on the page.
   * </pre>
   *
   * <code>optional .sync_pb.TabNavigation.PasswordState password_state = 26;</code>
   */
  boolean hasPasswordState();
  /**
   * <pre>
   * Whether the Password Manager saw a password field on the page.
   * </pre>
   *
   * <code>optional .sync_pb.TabNavigation.PasswordState password_state = 26;</code>
   */
  org.chromium.components.sync.protocol.TabNavigation.PasswordState getPasswordState();

  /**
   * <pre>
   * The id for the task associated with this navigation, which is globally
   * unique with high probability.
   * Similar with global_id, but used to identify a navigation in Chrome Tasks,
   * so navigations of a page have the same task_id if one is the first visit of
   * the page, and others are its back/forward visits.
   * </pre>
   *
   * <code>optional int64 task_id = 27;</code>
   */
  boolean hasTaskId();
  /**
   * <pre>
   * The id for the task associated with this navigation, which is globally
   * unique with high probability.
   * Similar with global_id, but used to identify a navigation in Chrome Tasks,
   * so navigations of a page have the same task_id if one is the first visit of
   * the page, and others are its back/forward visits.
   * </pre>
   *
   * <code>optional int64 task_id = 27;</code>
   */
  long getTaskId();

  /**
   * <pre>
   * Task ids of all ancestor navigations, which can be from other tabs, from
   * root to parent. We define navigation A is parent of navigation B if page of
   * B is got by clicking a link on page of A. This relationship is used to
   * define a Chrome Task as a tree rooted by a navigation.
   * </pre>
   *
   * <code>repeated int64 ancestor_task_id = 28;</code>
   */
  java.util.List<java.lang.Long> getAncestorTaskIdList();
  /**
   * <pre>
   * Task ids of all ancestor navigations, which can be from other tabs, from
   * root to parent. We define navigation A is parent of navigation B if page of
   * B is got by clicking a link on page of A. This relationship is used to
   * define a Chrome Task as a tree rooted by a navigation.
   * </pre>
   *
   * <code>repeated int64 ancestor_task_id = 28;</code>
   */
  int getAncestorTaskIdCount();
  /**
   * <pre>
   * Task ids of all ancestor navigations, which can be from other tabs, from
   * root to parent. We define navigation A is parent of navigation B if page of
   * B is got by clicking a link on page of A. This relationship is used to
   * define a Chrome Task as a tree rooted by a navigation.
   * </pre>
   *
   * <code>repeated int64 ancestor_task_id = 28;</code>
   */
  long getAncestorTaskId(int index);

  /**
   * <pre>
   * When a history entry is replaced (e.g. history.replaceState()), this
   * contains some information about the entry prior to being replaced. Even if
   * an entry is replaced multiple times, it represents data prior to the
   * *first* replace.
   * </pre>
   *
   * <code>optional .sync_pb.ReplacedNavigation replaced_navigation = 29;</code>
   */
  boolean hasReplacedNavigation();
  /**
   * <pre>
   * When a history entry is replaced (e.g. history.replaceState()), this
   * contains some information about the entry prior to being replaced. Even if
   * an entry is replaced multiple times, it represents data prior to the
   * *first* replace.
   * </pre>
   *
   * <code>optional .sync_pb.ReplacedNavigation replaced_navigation = 29;</code>
   */
  org.chromium.components.sync.protocol.ReplacedNavigation getReplacedNavigation();

  /**
   * <pre>
   * The page language as determined by its textual content. An ISO 639 language
   * code (two letters, except for Chinese where a localization is necessary).
   * </pre>
   *
   * <code>optional string page_language = 30;</code>
   */
  boolean hasPageLanguage();
  /**
   * <pre>
   * The page language as determined by its textual content. An ISO 639 language
   * code (two letters, except for Chinese where a localization is necessary).
   * </pre>
   *
   * <code>optional string page_language = 30;</code>
   */
  java.lang.String getPageLanguage();
  /**
   * <pre>
   * The page language as determined by its textual content. An ISO 639 language
   * code (two letters, except for Chinese where a localization is necessary).
   * </pre>
   *
   * <code>optional string page_language = 30;</code>
   */
  com.google.protobuf.ByteString
      getPageLanguageBytes();
}
