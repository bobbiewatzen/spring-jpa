package com.jsun.site;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Validated
public interface GenericRepository<I extends Serializable, E extends Serializable> {
	@NotNull
	Iterable<E> getAll();
	
	E get(@NotNull I id);
	
	void add(@NotNull E entity);
	
	void update(@NotNull E entity);
	
	void delete(@NotNull E entity);
	
	void deleteById(@NotNull I id);
}
