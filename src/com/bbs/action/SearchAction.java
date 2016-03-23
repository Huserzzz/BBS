package com.bbs.action;

import java.util.List;

import com.bbs.biz.PostBiz;
import com.bbs.model.Post;

public class SearchAction extends BaseAction{
	private String keywords;
	private PostBiz postBiz;
	

	public void setPostBiz(PostBiz postBiz) {
		this.postBiz = postBiz;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	@Override
	public String execute() throws Exception {
		List<Post> posts = postBiz.searchPosts(keywords);
		getRequest().put("posts", posts);
		return SUCCESS;
	}

}