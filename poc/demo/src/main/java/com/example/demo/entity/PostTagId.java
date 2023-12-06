package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostTagId
    implements Serializable {
 
    @Column(name = "post_id")
    private Long postId;
 
    @Column(name = "tag_id")
    private Long tagId;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        PostTagId that = (PostTagId) o;
        return Objects.equals(postId, that.postId) &&
               Objects.equals(tagId, that.tagId);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(postId, tagId);
    }
 
    //Getters omitted for brevity
 
   
}
