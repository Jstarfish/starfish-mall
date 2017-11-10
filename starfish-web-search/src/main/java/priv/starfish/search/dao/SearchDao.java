package priv.starfish.search.dao;

import org.apache.solr.client.solrj.SolrQuery;

import priv.starfish.search.pojo.SearchResult;

public interface SearchDao {

	SearchResult search(SolrQuery query) throws Exception;
}
