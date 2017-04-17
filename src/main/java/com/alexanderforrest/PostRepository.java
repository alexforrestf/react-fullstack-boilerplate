package com.alexanderforrest;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Alex on 17/04/2017.
 */
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
