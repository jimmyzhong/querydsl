/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.dml;

import javax.annotation.Nullable;

import com.mysema.query.types.Path;

/**
 * Parent interface for InsertClause and UpdateCluase
 * 
 * @author tiwe
 *
 * @param <C>
 */
public interface StoreClause<C extends StoreClause<C>> extends DMLClause<C>{
    
    /**
     * Add a value binding
     *
     * @param <T>
     * @param path path to be updated
     * @param value value to set
     * @return
     */
    <T> C set(Path<T> path, @Nullable T value);


}