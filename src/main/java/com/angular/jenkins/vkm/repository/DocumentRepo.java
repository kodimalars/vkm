package com.angular.jenkins.vkm.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.angular.jenkins.vkm.model.Document;

@Repository
public interface DocumentRepo extends JpaRepository<Document, Integer>
{
	List<Document> findByPath(String path);

	List<Document> findByPathContaining(String path);

	List<Document> findByNameStartsWith(String path);

	/*
	 * IsStartingWith, StartingWith, StartsWith, IsEndingWith, EndingWith,
	 * EndsWith, IsNotContaining, NotContaining, NotContains, IsContaining,
	 * Containing, Contains
	 */

	@Query("select d.name from Document d where d.name = ?1")
	List<Document> findByName(String name, Sort sort);

	@Query(name = "Document.findByName", value = "select d.name from Documents d where d.name = ?1", nativeQuery = true)
	void getByName(String name);

	@Query(value = "select * from Document d where d.name = :name", nativeQuery = true)
	Document getDocumentByName(@Param("name") String name);

	@Query(name = "Document.findBySize", value = "select * from  Document where size >= ?1 and size <= ?2 group by id,size", nativeQuery = true)
	List<Document> findAllDocumentBySizeRangeAndGroupBy(int size1, int size2, Pageable pageable);

	@Modifying
	@Query(value = "update Document set  path = ?1 where name=?2", nativeQuery = true)
	void updateByDocPath(String path, String nameee);

}
