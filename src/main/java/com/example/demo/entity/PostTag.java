package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

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

	private static final long serialVersionUID = 6526027721714612094L;

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
}