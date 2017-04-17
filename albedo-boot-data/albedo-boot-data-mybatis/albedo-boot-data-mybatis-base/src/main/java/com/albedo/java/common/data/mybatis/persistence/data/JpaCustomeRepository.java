package com.albedo.java.common.data.mybatis.persistence.data;

import com.albedo.java.common.data.mybatis.persistence.GeneralEntity;
import com.albedo.java.util.domain.Combo;
import com.albedo.java.util.domain.ComboData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Map;

public interface JpaCustomeRepository<T extends GeneralEntity> {

	T findBasicOne(Map<String, Object> paramsMap, String... columns);

	List<T> findBasicAll(Map<String, Object> paramsMap, String... columns);

	List<T> findBasicAll(Sort sort, Map<String, Object> paramsMap, String... columns);

	Page<T> findBasicAll(Pageable pageable, Map<String, Object> paramsMap, String... columns);

	Long countBasicAll(Map<String, Object> paramsMap);

    boolean doCheckByProperty(T entity);

	boolean doCheckByPK(T entity);

    List<ComboData> findJson(Combo item);
}