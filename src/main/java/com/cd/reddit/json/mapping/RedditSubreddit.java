/*
Copyright 2013 Cory Dissinger

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
*/

package com.cd.reddit.json.mapping;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Implements the Java bean version of the JSON found <a href="https://github.com/reddit/reddit/wiki/JSON#more">here</a>.
 * 
 * @author <a href="https://github.com/reddit/reddit/wiki/JSON#subreddit">Cory Dissinger</a>
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RedditSubreddit extends RedditType{
	private int accountsActive;
	private int commentScoreHideMins;	
	private String description;	
	private boolean over18;
	private long subscribers;	
	private String title;
	private String url;
	
	public int getAccountsActive() {
		return accountsActive;
	}
	public void setAccountsActive(int accountsActive) {
		this.accountsActive = accountsActive;
	}
	public int getCommentScoreHideMins() {
		return commentScoreHideMins;
	}
	public void setCommentScoreHideMins(int commentScoreHideMins) {
		this.commentScoreHideMins = commentScoreHideMins;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isOver18() {
		return over18;
	}
	public void setOver18(boolean over18) {
		this.over18 = over18;
	}
	public long getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(long subscribers) {
		this.subscribers = subscribers;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * The 'url' JSON attribute is '/r/subreddit-name', so for the use case where we just want
	 * to get the subreddit name we can call this helper method.
	 * 
	 * @return The string representing just the subreddit name
	 */
	public String getSubredditName(){
		return url.substring(3, url.length() - 1);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RedditSubreddit [accountsActive=");
		builder.append(accountsActive);
		builder.append(", commentScoreHideMins=");
		builder.append(commentScoreHideMins);
		builder.append(", description=");
		builder.append(description);
		builder.append(", over18=");
		builder.append(over18);
		builder.append(", subscribers=");
		builder.append(subscribers);
		builder.append(", title=");
		builder.append(title);
		builder.append(", url=");
		builder.append(url);
		builder.append("]");
		return builder.toString();
	}	
}
