package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "PostTag")
@Table(name = "post_tag")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostTag implements Serializable{
 
    @EmbeddedId
    private PostTagId id;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("postId")
    private Post post;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("tagId")
    private Tag tag;
 
    @Column(name = "created_on")
    private Date createdOn = new Date();
 
    public PostTag(Post post, Tag tag) {
        this.post = post;
        this.tag = tag;
        this.id = new PostTagId(post.getId(), tag.getId());
    }
 
    //Getters and setters omitted for brevity
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
 
        if (o == null || getClass() != o.getClass())
            return false;
 
        PostTag that = (PostTag) o;
        return Objects.equals(post, that.post) &&
               Objects.equals(tag, that.tag);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(post, tag);
    }
}