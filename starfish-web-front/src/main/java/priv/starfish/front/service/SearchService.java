package priv.starfish.front.service;


import priv.starfish.front.pojo.SearchResult;

public interface SearchService {

	SearchResult search(String queryString, int page);
}
