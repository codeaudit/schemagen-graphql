package com.bretpatterson.schemagen.graphql.annotations;

import com.bretpatterson.schemagen.graphql.datafetchers.IDataFetcher;
import com.bretpatterson.schemagen.graphql.datafetchers.IMethodDataFetcher;
import com.bretpatterson.schemagen.graphql.datafetchers.DefaultMethodDataFetcher;
import com.bretpatterson.schemagen.graphql.utils.AnnotationUtils;
import graphql.schema.DataFetcher;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Methods annotated with this method will be processed as field queries and be
 * configured with the specified datafetcher or {@link DefaultMethodDataFetcher} by default.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface GraphQLQuery {

	/**
	 * This name of the field exposed as a query.
	 * @return
	 */
	String name() default AnnotationUtils.DEFAULT_NULL;

	/**
	 * The data fetcher to use for this field. Defaults to {@link DefaultMethodDataFetcher}
	 * @return
	 */
	Class dataFetcher() default AnnotationUtils.DEFAULT_NULL_CLASS.class;
}
